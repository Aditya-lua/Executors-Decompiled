/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f7d8..0xa7f878 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7f7d8_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_a7f7d8_0;


unsigned long long sub_a7f7d8(unsigned long a0, long long a1)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x8
    unsigned long long i;  // x8
    st_a7f7d8_0 *v8;  // x9
    unsigned int v9;  // w11
    unsigned long long v10;  // x12
    unsigned int v11;  // w13
    char v12;  // x9
    char *v0;  // [bp-0x28], Other Possible Types: char
    char *v1;  // [bp-0x28]
    char *v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_a6e830(a1, 192, &v0);
    if (!(unsigned int)v5)
        return v5;
    v6 = 0;
    do
    {
        i = v6;
        v8 = a0 + i;
        v9 = v8->field_4;
        v10 = i + 16;
        v11 = v8->field_8;
        v12 = v8->field_c;
        v1 = v0 + 1;
        *v0 = (char)v8->field_0 | (char)v9 * 64;
        v2 = v1 + 1;
        *v1 = (char)v11 * 16 | (char)(v9 >> 2);
        v0 = v2 + 1;
        *v2 = v12 * 4 | (char)(v11 >> 4);
        v6 = v10;
    } while (i < 1008);
    return 1;
}
