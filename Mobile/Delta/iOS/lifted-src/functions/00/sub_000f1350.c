/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf1350..0xf13ec (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f1350_1 {
    char padding_0[12];
    unsigned int field_c;
} st_f1350_1;

typedef struct st_f1350_2 {
    char padding_0[88];
    struct st_f1350_1 *field_58;
} st_f1350_2;

typedef struct st_f1350_0 {
    char field_0;
} st_f1350_0;

typedef struct st_f1350_4 {
    unsigned long long field_0;
} st_f1350_4;

typedef struct st_f1350_3 {
    char padding_0[280];
    struct st_f1350_4 *field_118;
} st_f1350_3;

extern st_f1350_3 *g_f0d3d8;

int sub_f1350(st_f1350_2 *a0)
{
    st_f1350_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_f1350_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!sub_f1fb4())
    {
        a0->field_58->field_c = 0;
        a0->field_58 = a0->field_58 + 1;
        return 1;
    }
    g_f0d3d8->field_118();
}
