/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b50b8..0x8b5150 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b50b8_1 {
    char padding_0[8];
    unsigned long long field_8;
    long long *field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
} st_8b50b8_1;

typedef struct st_8b50b8_0 {
    char field_0;
} st_8b50b8_0;


long long sub_8b50b8(st_8b50b8_1 *a0)
{
    st_8b50b8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_8b50b8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_28)
    {
        sub_8b02f0(a0, 0);
        sub_8af4c4(a0, 0);
    }
    else
    {
        while (a0->field_8 + (char *)a0->field_10 != a0->field_8 * 2)
        {
            sub_4e14(*(long long *)((char *)a0->field_10 - 8), 64, 8);
            sub_10780(a0, (char *)a0->field_10 - 8);
        }
        a0->field_20 = 0;
    }
    return sub_8afa38(a0);
}
