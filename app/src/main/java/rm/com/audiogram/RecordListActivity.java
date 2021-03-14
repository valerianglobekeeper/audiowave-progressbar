package rm.com.audiogram;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import rm.com.audiogram.adapter.RecordListAdapter;
import rm.com.audiogram.entity.Record;

public final class RecordListActivity extends AppCompatActivity {

  private RecyclerView audioList;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_audio_list);

    audioList = findViewById(R.id.audio_list);

    final RecordListAdapter adapter = new RecordListAdapter();
    audioList.setAdapter(adapter);

    adapter.updateData(Record.generateDummyList(50));
  }
}
