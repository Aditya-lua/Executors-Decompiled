/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a8e0..0x2a968 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a8e0_2 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_2a8e0_2;

typedef struct st_2a8e0_1 {
    struct st_2a8e0_2 *field_0;
    unsigned long long field_8;
} st_2a8e0_1;

typedef struct st_2a8e0_0 {
    char field_0;
} st_2a8e0_0;


st_2a8e0_1 * sub_2a8e0(st_2a8e0_1 *a0)
{
    unsigned long long *v4;  // x20
    unsigned long long v5;  // x21
    unsigned long long v6;  // x22
    unsigned long long v7;  // x23
    unsigned long long v8;  // x22
    st_2a8e0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_2a8e0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = &a0->field_0->field_0;
    v5 = v4[1];
    v6 = 24 + 24 * a0->field_8;
    v7 = a0->field_8 + 1;
    while (1)
    {
        v8 = v6;
        a0->field_8 = v7;
        if (v5 <= v7)
            return a0;
        v6 = v8 + 24;
        v7 += 1;
        if (!(sub_2a6e0(*v4 + v8, v4 + 3) & 1))
            return a0;
    }
}
