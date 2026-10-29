/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a82c8..0x2a8424 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a82c8_1 {
    char padding_0[32];
    unsigned long long field_20;
} st_2a82c8_1;

typedef struct st_2a82c8_0 {
    char field_0;
} st_2a82c8_0;

typedef struct st_2a82c8_3 {
    char padding_0[192];
    unsigned long long field_c0;
    char padding_c8[440];
    unsigned long long field_280;
    char padding_288[888];
    unsigned long long field_600;
    char padding_608[216];
    unsigned long long field_6e0;
} st_2a82c8_3;

typedef struct st_2a82c8_4 {
    unsigned long long field_0;
} st_2a82c8_4;

typedef struct st_2a82c8_2 {
    char padding_0[96];
    struct st_2a82c8_3 *field_60;
} st_2a82c8_2;

extern st_2a82c8_2 *g_f0d198;
extern st_2a82c8_4 *g_f0d3d0;

void sub_2a82c8(st_2a82c8_1 *a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long v10;  // x8
    unsigned long long *v11;  // x9
    st_2a82c8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2a82c8_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = a0->field_20 + 496;
    v11 = g_f0d198->field_60;
    if (v11[80] != v10)
    {
        if (v11[24] == v10)
            goto LABEL_2a835c;
LABEL_2a831c:
        if (v11[220] == v10)
            goto LABEL_2a8374;
    }
    else
    {
        v11[80] = 0;
        v11 = g_f0d198->field_60;
        if (v11[24] != v10)
            goto LABEL_2a831c;
LABEL_2a835c:
        v11[24] = 0;
        v11 = g_f0d198->field_60;
        if (v11[220] == v10)
        {
LABEL_2a8374:
            v11[192] = 0;
            g_f0d3d0();
        }
    }
    g_f0d3d0();
}
