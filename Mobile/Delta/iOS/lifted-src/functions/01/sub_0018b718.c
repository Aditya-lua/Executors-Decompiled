/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18b718..0x18b774 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18b718_0 {
    char padding_0[8];
    long long field_8;
} st_18b718_0;


st_18b718_0 * sub_18b718(st_18b718_0 *a0, st_18b718_0 *a1)
{
    st_18b718_0 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if ((char)a0->field_8 == 1)
    {
        v0 = &a1[2].field_8;
        sub_271a8(&v0);
        a0 = a1 + 1;
    }
    if (a1)
        a0 = sub_4e14(a1, 1, 8);
    return a0;
}
