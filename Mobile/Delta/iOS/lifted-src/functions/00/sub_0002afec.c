/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2afec..0x2b078 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2afec_1 {
    long long field_0;
    unsigned long long field_8;
} st_2afec_1;

typedef struct st_2afec_0 {
    char field_0;
} st_2afec_0;


st_2afec_1 * sub_2afec(st_2afec_1 *a0)
{
    unsigned long long v4;  // x19
    long long v5;  // x21
    st_2afec_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_2afec_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_8)
        return a0;
    v4 = 0;
    v5 = a0->field_0;
    while (sub_2a6e0(v5, &a0[1].field_8) & 1)
    {
        v4 += 1;
        v5 += 24;
        if (a0->field_8 == v4)
            break;
    }
    return a0;
}
