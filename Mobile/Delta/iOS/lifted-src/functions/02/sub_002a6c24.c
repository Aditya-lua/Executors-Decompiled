/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a6c24..0x2a6cb0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a6c24_1 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_2a6c24_1;

typedef struct st_2a6c24_0 {
    char field_0;
} st_2a6c24_0;


long long sub_2a6c24(st_2a6c24_1 *a0, char *a1)
{
    long long v6;  // x8
    st_2a6c24_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2a6c24_0 *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x30]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_8;
    if (v6 == a0->field_10 * 64)
    {
        sub_2aaa60(a0, sub_2aa03c(a0, v6 + 1));
        v6 = a0->field_8;
    }
    a0->field_8 = v6 + 1;
    v2 = a0->field_0 + ((unsigned long long)(v6) >> 6) * 8;
    v3 = 1 << ((char)v6 & 63);
    return sub_3b720(&v2, *a1);
}
