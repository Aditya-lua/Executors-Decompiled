/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf5e90..0xaf65fc (1900 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af5e90_2 {
    char padding_0[32];
    struct st_af5e90_1 *field_20;
    char padding_28[24];
    struct st_af5e90_3 *field_40;
    char padding_48[76];
    unsigned int field_94;
    long long field_98;
    char padding_a0[12];
    unsigned int field_ac;
    unsigned int field_b0;
    char padding_b4[60];
    void* field_f0;
} st_af5e90_2;

typedef struct st_af5e90_1 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    int field_28;
} st_af5e90_1;

typedef struct st_af5e90_3 {
    unsigned long long field_0;
} st_af5e90_3;


unsigned long long sub_af5e90(st_af5e90_2 *a0)
{
    unsigned int v6;  // x22
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = (unsigned int)a0->field_f0;
    if (sub_ad69e4(a0->field_98) != 1 || a0->field_94 != 1)
        goto LABEL_0xaf6408;
    else
        goto LABEL_0xaf5ed4;
}
