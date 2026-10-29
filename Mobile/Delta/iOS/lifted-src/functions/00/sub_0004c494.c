/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c494..0x4c57c (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c494_1 {
    unsigned long long field_0;
    struct st_4c494_0 *field_8;
    unsigned long long field_10;
    struct st_4c494_0 *field_18;
    unsigned long long field_20;
    char field_28;
    char field_29;
    char padding_2a[6];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    char field_48;
    char padding_49[15];
    char field_58;
    char padding_59[7];
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    char field_80;
    char padding_81[39];
    unsigned long long field_a8;
    unsigned long long field_b0;
} st_4c494_1;

typedef struct st_4c494_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_4c494_0;

typedef struct st_4c494_2 {
    char field_0;
} st_4c494_2;

extern char g_e677f0;

st_4c494_1 * sub_4c494(st_4c494_1 *a0, st_4c494_0 *a1, unsigned long a2, st_4c494_0 *a3, unsigned long a4, char a5, char a6, unsigned long a7, unsigned long a8, unsigned long a9, unsigned long a10, unsigned long a11)
{
    st_4c494_2 **v0;  // [bp-0x58], Other Possible Types: char
    st_4c494_2 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]

    v3 = &a8;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    a0->field_0 = &g_e677f0;
    a0->field_8 = a1;
    a0->field_10 = a2;
    a0->field_18 = a3;
    a0->field_20 = a4;
    a0->field_28 = a5;
    a0->field_29 = a6;
    a0->field_30 = a7;
    a0->field_38 = a8;
    a0->field_40 = 0;
    a0->field_60 = 0;
    a0->field_68 = 0;
    a0->field_70 = 0;
    memset(&a0->field_48, 0, 0x11);
    a0->field_78 = a9;
    sub_3b8e8(&a0->field_80, &v2, 0);
    a0->field_a8 = a10;
    a0->field_b0 = a11;
    a0->field_58 = !a1->field_10 && !a3->field_10;
    return a0;
}
