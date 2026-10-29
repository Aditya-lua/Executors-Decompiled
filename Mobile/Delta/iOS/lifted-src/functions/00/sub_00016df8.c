/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16df8..0x16e9c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16df8_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_16df8_2;

typedef struct st_16df8_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_16df8_3;

typedef struct st_16df8_1 {
    char padding_0[360];
    char field_168;
    char padding_169[39];
    unsigned long long field_190;
    unsigned long long field_198;
} st_16df8_1;

typedef struct st_16df8_0 {
    char field_0;
} st_16df8_0;


long long sub_16df8(st_16df8_1 *a0, unsigned int a1)
{
    long long v4;  // x8
    long long i;  // x20
    long long v6;  // x22
    st_16df8_3 *v7;  // x21
    st_16df8_2 *v8;  // x0
    st_16df8_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_16df8_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (long long)(a0->field_198 - a0->field_190) >> 3;
    i = a1;
    if ((unsigned long long)v4 > (unsigned long long)i)
    {
        do
        {
            v6 = v4 - 1;
            v7 = *(long long *)(a0->field_190 + v4 * 8 - 8);
            sub_1dd64(&a0->field_168, v7);
            v8 = sub_fb84(&a0->field_168, v7);
            v8->field_8 = v7->field_18;
            v4 = v6;
        } while ((unsigned long long)i < (unsigned long long)v4);
    }
    return sub_20174(&a0->field_190, i);
}
