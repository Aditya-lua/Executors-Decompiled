/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98436c..0x9843fc (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98436c_0 {
    char padding_0[104];
    long long field_68;
} st_98436c_0;


st_98436c_0 * sub_98436c(long long a0, st_98436c_0 *a1)
{
    st_98436c_0 *v2;  // x0
    st_98436c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c624f0(a0 + 168, 3, 1);
    if (!v2)
        return v2;
    if ((char)v2->field_68 == 2 && !sub_984fe0(a0 + 168, 3))
        return 0;
    if (!a1 || (char)v2->field_68 != 3)
        return 1;
    v3 = sub_985070(a0 + 168, 3);
    if (!(unsigned int)v3)
        return v3;
    return 1;
}
