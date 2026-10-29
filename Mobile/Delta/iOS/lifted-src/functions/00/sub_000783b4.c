/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x783b4..0x783f0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_783b4_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[12];
    struct st_783b4_1 *field_18;
    struct st_783b4_1 *field_20;
} st_783b4_0;

typedef struct st_783b4_1 {
    unsigned long long field_0;
} st_783b4_1;


st_783b4_0 * sub_783b4(st_783b4_0 *a0)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10
    unsigned long long *v3;  // x11
    unsigned long long *v4;  // x12
    unsigned long long *v5;  // x11

    v0 = a0->field_8;
    v1 = v0 >> 3;
    v2 = a0->field_0;
    v3 = a0->field_18;
    v4 = a0->field_20;
    *v3 = v2;
    v5 = (char *)v3 + v1;
    if (v4 < v5)
        v5 = v4;
    a0->field_18 = v5;
    a0->field_8 = (unsigned int)v0 & 7;
    a0->field_0 = v2 >> ((char)v1 * 8 & 63);
    return a0;
}
