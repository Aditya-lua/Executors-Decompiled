/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cecf0..0x3cedc4 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cecf0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_3cecf0_1;

typedef struct st_3cecf0_0 {
    char field_0;
} st_3cecf0_0;


unsigned long long sub_3cecf0(st_3cecf0_1 *a0, unsigned short *a1)
{
    unsigned long v4;  // x9
    unsigned int v5;  // w8
    unsigned int v6;  // w10
    st_3cecf0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3cecf0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (15 >= a0->field_10)
    {
        if (a0->field_8 > a0->field_0)
        {
            sub_3d4760();
        }
        else if (a0->field_14)
        {
            return 0xffffffff;
        }
        else
        {
            a0->field_10 = a0->field_10 + 16;
            a0->field_14 = 1;
            v4 = a0->field_18;
            v5 = a1[v4 & 0x1ff];
            if (!v5)
                return sub_3d14c4();
            v6 = v5 >> 9;
            a0->field_18 = (unsigned int)v4 >> ((char)v6 & 31);
            a0->field_10 = a0->field_10 - v6;
            return v5 & 0x1ff;
        }
    }
    v4 = a0->field_18;
    v5 = a1[v4 & 0x1ff];
    if (!v5)
        return sub_3d14c4();
    v6 = v5 >> 9;
    a0->field_18 = (unsigned int)v4 >> ((char)v6 & 31);
    a0->field_10 = a0->field_10 - v6;
    return v5 & 0x1ff;
}
