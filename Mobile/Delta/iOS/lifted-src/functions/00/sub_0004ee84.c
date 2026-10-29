/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ee84..0x4eed8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ee84_1 {
    char padding_0[8];
    struct st_4ee84_1 *field_8;
} st_4ee84_1;

typedef struct st_4ee84_0 {
    char field_0;
} st_4ee84_0;

extern unsigned int g_f00b40;

st_4ee84_1 * sub_4ee84(st_4ee84_1 *a0, st_4ee84_1 *a1)
{
    st_4ee84_1 *v4;  // x0
    st_4ee84_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_4ee84_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1)
    {
        return a0;
    }
    else if ((int)a1->field_8 == g_f00b40)
    {
        v4 = sub_158b8(&a0[1].field_8, a1 + 2);
        if (!v4)
            return v4;
        v4->field_8 = 0;
        return v4;
    }
    else
    {
        return a0;
    }
}
