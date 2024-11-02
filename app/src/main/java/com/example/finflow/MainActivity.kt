package com.example.finflow

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry

class MainActivity : AppCompatActivity() {
    private lateinit var anyChartView: AnyChartView

    private val months = arrayOf("Jan", "Feb", "Mar")
    private val earnings = intArrayOf(500, 800, 2000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val textView = findViewById<TextView>(R.id.nama)
        val name = "Alex"
        textView.text = "Hi, $name"

        anyChartView = findViewById(R.id.any_chart_view)

        setupColumnChart()
    }

    private fun setupColumnChart() {
        val Column = AnyChart.column()
        val dataEntries = ArrayList<DataEntry>()

        months.forEachIndexed { index, month ->
            dataEntries.add(ValueDataEntry(month, earnings[index]))
        }

        Column.data(dataEntries)
        anyChartView.setChart(Column)
    }
}
