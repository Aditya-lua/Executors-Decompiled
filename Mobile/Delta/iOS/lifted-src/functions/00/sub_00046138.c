/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x46138..0x46278 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_46138_2 {
    long long field_0;
    int field_8;
    char padding_c[1520];
    unsigned int field_5fc;
} st_46138_2;

typedef struct st_46138_0 {
    char field_0;
} st_46138_0;

typedef struct st_46138_1 {
    char padding_0[8];
    unsigned int field_8;
} st_46138_1;

extern unsigned int g_f00b60;
extern unsigned int g_f00b70;

unsigned long long sub_46138(st_46138_2 *a0, st_46138_1 *a1, unsigned long long a2)
{
    unsigned int v6;  // w20
    unsigned int v7;  // w21
    st_46138_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_46138_0 *v1;  // [bp-0x48]
    st_46138_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_46138_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a1 && a1->field_8 == g_f00b70)
    {
        if (a0->field_8 < 2 || sub_4489c(a0) & 1)
        {
            v6 = a0->field_5fc;
            a0->field_5fc = a2;
            sub_3d4b0(a0);
            a0->field_5fc = v6;
            return 1;
        }
    }
    else
    {
        if (a1 && a1->field_8 == g_f00b60)
        {
            v7 = a0->field_5fc;
            a0->field_5fc = a2;
            v3 = &v2;
            v2 = &v3;
            sub_395b0(a0);
            sub_2ad10(a0->field_0, 63, a2, 0, 0);
            a0->field_5fc = v7;
            return 1;
        }
    }
    sub_47e48(a0);
    return 0;
}
