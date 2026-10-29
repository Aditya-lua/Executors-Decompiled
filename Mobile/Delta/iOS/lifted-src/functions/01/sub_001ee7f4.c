/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ee7f4..0x1ee86c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ee7f4_1 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char padding_9[15];
    unsigned long long field_18;
    unsigned long long field_20;
} st_1ee7f4_1;

typedef struct st_1ee7f4_0 {
    char field_0;
} st_1ee7f4_0;


long long sub_1ee7f4(st_1ee7f4_1 *a0)
{
    st_1ee7f4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1ee7f4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_0 != 3)
        return 0;
    if (a0->field_18 != 2)
    {
        if (a0->field_18 != 1)
        {
            return 0;
        }
        else if (a0->field_20 != 2)
        {
            return 0;
        }
    }
    else
    {
        if (a0->field_20 != 1)
            return 0;
    }
    return sub_1ecac4(&a0->field_8);
}
