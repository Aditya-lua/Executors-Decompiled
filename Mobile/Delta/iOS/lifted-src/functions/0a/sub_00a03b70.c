/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03b70..0xa03c28 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03b70_0 {
    char padding_0[8];
    long long field_8;
} st_a03b70_0;


st_a03b70_0 * sub_a03b70(st_a03b70_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_dlfcn.c", 143, "dlfcn_unload");
        sub_a36abc(37, 0xc0102, 0);
        return 0;
    }
    if ((int)sub_ad69e4(a0->field_8) < 1)
        return 1;
    if (sub_ad692c(a0->field_8))
    {
        _dlclose();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_dlfcn.c", 150, "dlfcn_unload");
        sub_a36abc(37, 104, 0);
        sub_ad68a0(a0->field_8, 0);
        return 0;
    }
    return 1;
}
