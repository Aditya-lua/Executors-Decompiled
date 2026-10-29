/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafba7c..0xafbb40 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afba7c_0 {
    struct st_afba7c_0 *field_0;
} st_afba7c_0;


st_afba7c_0 ** sub_afba7c(st_afba7c_0 **a0, st_afba7c_0 **a1)
{
    st_afba7c_0 **v5;  // x0
    st_afba7c_0 **v6;  // x21
    st_afba7c_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_afba7c_0 **v1;  // [bp-0x40], Other Possible Types: char
    st_afba7c_0 **v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *a1;
    v5 = sub_afb538(0, &v2);
    if (!v5)
        return 0;
    v6 = sub_a5ad88();
    sub_a5a4c8(v5);
    if (v6)
    {
        sub_9ffcc8(v6, &v2, &v1, &v0);
        if (v2 && v1 && v0)
        {
            *a1 = v2;
            if (!a0)
                return v6;
            sub_a01fd4(*a0);
            *a0 = v6;
            return v6;
        }
        sub_a01fd4(v6);
    }
    return 0;
}
