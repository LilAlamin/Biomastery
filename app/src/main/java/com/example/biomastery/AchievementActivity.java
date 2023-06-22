package com.example.biomastery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AchievementActivity extends AppCompatActivity {
    CardView cv1, cv2, cv3, cv4, cv5, cv6;
    ImageView bunder, mthr, dokter, bakteri, tigaroda, hedset;
    TextView tbunder, tmthr, tdokter, tbakteri, ttigaroda, thedset;

    TextView dt1, dt2, dt3, dt4, dt5, dt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);
        // gambar 1
        cv1 = findViewById(R.id.cardview1);
        bunder = findViewById(R.id.bunder);
        tbunder = findViewById(R.id.textbunder);
        dt1 = findViewById(R.id.detail1);
        cv1.setBackground(getResources().getDrawable(R.drawable.lincoln));

        //gambar 2

        cv2 = findViewById(R.id.cardview2);
        mthr = findViewById(R.id.mthri);
        tmthr = findViewById(R.id.textmthr);
        dt2 = findViewById(R.id.detail2);
        cv2.setBackground(getResources().getDrawable(R.drawable.lincoln));

        //gambar 3

        cv3 = findViewById(R.id.cardview3);
        cv3.setBackground(getResources().getDrawable(R.drawable.lincoln));

        //gambar 4
        cv4 = findViewById(R.id.cardview4);
        thedset = findViewById(R.id.theadset);
        hedset = findViewById(R.id.hedset);
        dt4 = findViewById(R.id.detail4);
        cv4.setBackground(getResources().getDrawable(R.drawable.lincoln));

        //gambar 5
        cv5 = findViewById(R.id.cardview5);
        dt5 = findViewById(R.id.detail5);
        dokter = findViewById(R.id.dokter);
        tdokter = findViewById(R.id.tdokter);
        cv5.setBackground(getResources().getDrawable(R.drawable.lincoln));

        cv6 = findViewById(R.id.cardview6);
        cv6.setBackground(getResources().getDrawable(R.drawable.lincoln));

        cv1.setOnClickListener(new View.OnClickListener() {
            private static final int DOUBLE_CLICK_COUNT = 2;
            private int clickCount = 0;
            private boolean isToastShown = false; // Variabel untuk melacak apakah Toast sudah ditampilkan sebelumnya
            private Handler handler = new Handler();
            private Runnable resetClickCountRunnable = new Runnable() {
                @Override
                public void run() {
                    clickCount = 0;
                }
            };

            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount == 1) {
                    // Klik Sek Pertama
                    if (!isToastShown) {
                        Toast.makeText(getApplicationContext(), "Anda Berhasil Mendapatkan Achievement", Toast.LENGTH_SHORT).show();
                        isToastShown = true; // Set variabel isToastShown menjadi true setelah Toast ditampilkan
                    }

                    handler.postDelayed(resetClickCountRunnable, 1000);

                    bunder.setVisibility(View.VISIBLE);
                    dt1.setVisibility(View.GONE);
                    tbunder.setVisibility(View.VISIBLE);
                } else if (clickCount == DOUBLE_CLICK_COUNT) {
                    // Double klik terdeteksi
                    bunder.setVisibility(View.GONE);
                    dt1.setVisibility(View.VISIBLE);
                    tbunder.setVisibility(View.GONE);

                    // Reset clickCount
                    clickCount = 0;
                }
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            private static final int DOUBLE_CLICK_COUNT = 2;
            private int clickCount = 0;
            private boolean isToastShown = false; // Variabel untuk melacak apakah Toast sudah ditampilkan sebelumnya
            private Handler handler = new Handler();
            private Runnable resetClickCountRunnable = new Runnable() {
                @Override
                public void run() {
                    clickCount = 0;
                }
            };

            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount == 1) {
                    // Klik Sek Pertama
                    if (!isToastShown) {
                        Toast.makeText(getApplicationContext(), "Anda Berhasil Mendapatkan Achievement", Toast.LENGTH_SHORT).show();
                        isToastShown = true; // Set variabel isToastShown menjadi true setelah Toast ditampilkan
                    }

                    handler.postDelayed(resetClickCountRunnable, 1000);

                    mthr.setVisibility(View.VISIBLE);
                    dt2.setVisibility(View.GONE);
                    tmthr.setVisibility(View.VISIBLE);
                } else if (clickCount == DOUBLE_CLICK_COUNT) {
                    // Double klik terdeteksi
                    mthr.setVisibility(View.GONE);
                    dt2.setVisibility(View.VISIBLE);
                    tmthr.setVisibility(View.GONE);

                    // Reset clickCount
                    clickCount = 0;
                }
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            private static final int DOUBLE_CLICK_COUNT = 2;
            private int clickCount = 0;
            private boolean isToastShown = false; // Variabel untuk melacak apakah Toast sudah ditampilkan sebelumnya
            private Handler handler = new Handler();
            private Runnable resetClickCountRunnable = new Runnable() {
                @Override
                public void run() {
                    clickCount = 0;
                }
            };

            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount == 1) {
                    // Klik Sek Pertama
                    if (!isToastShown) {
                        Toast.makeText(getApplicationContext(), "Anda Berhasil Mendapatkan Achievement", Toast.LENGTH_SHORT).show();
                        isToastShown = true; // Set variabel isToastShown menjadi true setelah Toast ditampilkan
                    }

                    handler.postDelayed(resetClickCountRunnable, 1000);
                } else if (clickCount == DOUBLE_CLICK_COUNT) {
                    // Double klik terdeteksi
                    // Reset clickCount
                    clickCount = 0;

                    // Pindah ke aktivitas lain (ganti dengan intent sesuai kebutuhan Anda)
                    // Intent intent = new Intent(TesActivity.this, LoginActivity.class);
                    // startActivity(intent);
                }
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            private static final int DOUBLE_CLICK_COUNT = 2;
            private int clickCount = 0;
            private boolean isToastShown = false; // Variabel untuk melacak apakah Toast sudah ditampilkan sebelumnya
            private Handler handler = new Handler();
            private Runnable resetClickCountRunnable = new Runnable() {
                @Override
                public void run() {
                    clickCount = 0;
                }
            };

            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount == 1) {
                    // Klik Sek Pertama
                    if (!isToastShown) {
                        Toast.makeText(getApplicationContext(), "Anda Berhasil Mendapatkan Achievement", Toast.LENGTH_SHORT).show();
                        isToastShown = true; // Set variabel isToastShown menjadi true setelah Toast ditampilkan
                    }

                    handler.postDelayed(resetClickCountRunnable, 1000);

                    thedset.setVisibility(View.VISIBLE);
                    dt4.setVisibility(View.GONE);
                    hedset.setVisibility(View.VISIBLE);
                } else if (clickCount == DOUBLE_CLICK_COUNT) {
                    // Double klik terdeteksi
                    thedset.setVisibility(View.GONE);
                    dt4.setVisibility(View.VISIBLE);
                    hedset.setVisibility(View.GONE);

                    // Reset clickCount
                    clickCount = 0;
                }
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            private static final int DOUBLE_CLICK_COUNT = 2;
            private int clickCount = 0;
            private boolean isToastShown = false; // Variabel untuk melacak apakah Toast sudah ditampilkan sebelumnya
            private Handler handler = new Handler();
            private Runnable resetClickCountRunnable = new Runnable() {
                @Override
                public void run() {
                    clickCount = 0;
                }
            };

            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount == 1) {
                    // Klik Sek Pertama
                    if (!isToastShown) {
                        Toast.makeText(getApplicationContext(), "Anda Berhasil Mendapatkan Achievement", Toast.LENGTH_SHORT).show();
                        isToastShown = true; // Set variabel isToastShown menjadi true setelah Toast ditampilkan
                    }

                    handler.postDelayed(resetClickCountRunnable, 1000);

                    dokter.setVisibility(View.VISIBLE);
                    tdokter.setVisibility(View.VISIBLE);
                    dt5.setVisibility(View.GONE);
                } else if (clickCount == DOUBLE_CLICK_COUNT) {
                    // Double klik terdeteksi
                    dokter.setVisibility(View.GONE);
                    tdokter.setVisibility(View.GONE);
                    dt5.setVisibility(View.VISIBLE);

                    // Reset clickCount
                    clickCount = 0;
                }
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            private static final int DOUBLE_CLICK_COUNT = 2;
            private int clickCount = 0;
            private boolean isToastShown = false; // Variabel untuk melacak apakah Toast sudah ditampilkan sebelumnya
            private Handler handler = new Handler();
            private Runnable resetClickCountRunnable = new Runnable() {
                @Override
                public void run() {
                    clickCount = 0;
                }
            };

            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount == 1) {
                    // Klik Sek Pertama
                    if (!isToastShown) {
                        Toast.makeText(getApplicationContext(), "Anda Berhasil Mendapatkan Achievement", Toast.LENGTH_SHORT).show();
                        isToastShown = true; // Set variabel isToastShown menjadi true setelah Toast ditampilkan
                    }

                    handler.postDelayed(resetClickCountRunnable, 250);
                } else if (clickCount == DOUBLE_CLICK_COUNT) {
                    // Double klik terdeteksi
                    // Reset clickCount
                    clickCount = 0;

                    // Pindah ke aktivitas lain (ganti dengan intent sesuai kebutuhan Anda)
                    // Intent intent = new Intent(TesActivity.this, LoginActivity.class);
                    // startActivity(intent);
                }
            }
        });

    }
    private int clickCount = 0;
    private static final int DOUBLE_CLICK_COUNT = 2; // Jumlah klik yang diperlukan untuk dianggap double click
}