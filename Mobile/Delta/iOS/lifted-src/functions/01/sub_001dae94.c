/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dae94..0x1daf34 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dae94_1 {
    char padding_0[96];
    int field_60;
    char padding_64[44];
    char field_90;
} st_1dae94_1;

typedef struct st_1dae94_0 {
    char field_0;
} st_1dae94_0;

typedef struct st_1dae94_3 {
    unsigned long long field_0;
} st_1dae94_3;

typedef struct st_1dae94_2 {
    char padding_0[288];
    struct st_1dae94_3 *field_120;
} st_1dae94_2;

extern st_1dae94_2 *g_f0d3d8;

void sub_1dae94(unsigned long long a0, st_1dae94_1 *a1)
{
    unsigned long long v4;  // w8
    unsigned long long v5;  // x21
    st_1dae94_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1dae94_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return;
    v4 = a1->field_90;
    if (!v4)
        return;
    v5 = 0;
    while (1)
    {
        if ((&a1->field_60)[v5] >= 1)
            g_f0d3d8->field_120();
        v5 += 1;
        if ((v4 & 0xff) <= v5)
            return;
    }
}
