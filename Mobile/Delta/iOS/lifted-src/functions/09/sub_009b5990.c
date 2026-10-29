/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b5990..0x9b5a90 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b5990_0 {
    char padding_0[8];
    long long field_8;
} st_9b5990_0;

typedef struct st_9b5990_3 {
    char padding_0[216];
    struct st_9b5990_1 *field_d8;
} st_9b5990_3;

typedef struct st_9b5990_1 {
    char padding_0[16];
    struct st_9b5990_2 *field_10;
} st_9b5990_1;

typedef struct st_9b5990_4 {
    char padding_0[24];
    struct st_9b5990_3 *field_18;
    char padding_20[208];
    unsigned int field_f0;
} st_9b5990_4;

typedef struct st_9b5990_2 {
    unsigned long long field_0;
} st_9b5990_2;


long long sub_9b5990(st_9b5990_4 *a0, st_9b5990_0 *a1)
{
    st_9b5990_4 *v2;  // x19
    unsigned int v3;  // x1
    long long v4;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 0x1154, "tls_process_end_of_early_data");
        v3 = 50;
        v4 = 159;
    }
    else if ((v2->field_f0 >> 1 & 0x7fffffff) != 5)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 0x115a, "tls_process_end_of_early_data");
        v3 = 80;
        v4 = 786691;
    }
    else if (sub_992a0c(&v2[12].padding_20[200]))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 0x1163, "tls_process_end_of_early_data");
        v3 = 10;
        v4 = 182;
    }
    else
    {
        v2->field_f0 = 12;
        v2->field_18->field_d8->field_10();
    }
    sub_9a58a4(v2, v3, v4, 0);
    return 0;
}
