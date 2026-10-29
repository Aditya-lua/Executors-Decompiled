/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4448..0xb44e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4448_0 {
    char field_0;
} st_b4448_0;

typedef struct st_b4448_1 {
    unsigned long long field_0;
    unsigned int field_8;
} st_b4448_1;


unsigned long long sub_b4448(unsigned long long *a0, unsigned int a1, unsigned int a2)
{
    st_b4448_1 *v4;  // x10
    unsigned long long v5;  // x19
    unsigned int v6;  // w9
    unsigned long long v7;  // x8
    unsigned long long v8;  // w21
    st_b4448_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_b4448_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a0 + 12 * a0[1];
    v5 = v4->field_0;
    v6 = v5 >> 32;
    if (v4->field_8 + v6 > a1)
    {
        if (a1 - v6 < a2)
            v7 = 0;
        else
            v7 = v5;
        if (v6 < a1)
            v8 = (unsigned int)v7;
        else
            v8 = 0;
        sub_b52f4();
    }
    else
    {
        a0[1] = a0[1] + 1;
        v8 = (unsigned int)v5;
    }
    return v5 & 0xffffffff00000000 | (v5 & 0xffffffff00000000 | v8) & 0xffffffff;
}
