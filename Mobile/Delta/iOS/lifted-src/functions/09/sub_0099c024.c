/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c024..0x99c0c8 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c024_1 {
    char padding_0[120];
    long long field_78;
    char padding_80[224];
    unsigned long long field_160;
    char padding_168[928];
    long long field_508;
    char padding_510[1008];
    struct st_99c024_0 *field_900;
} st_99c024_1;

typedef struct st_99c024_0 {
    char padding_0[888];
    unsigned int field_378;
} st_99c024_0;


long long sub_99c024(st_99c024_1 *a0)
{
    unsigned long long v2;  // x8
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_160;
    if ((v2 & 0x1200) == 0x1000)
    {
        v3 = 1211;
    }
    else
    {
        if ((int)a0->field_78 || !(int)a0->field_508 || ((unsigned int)(v2 >> 9) & 1) == (a0->field_900->field_378 & 1))
            return 1;
        v3 = 1220;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions.c", v3, "final_ems");
    sub_9a58a4(a0, 40, 104, 0);
    return 0;
}
