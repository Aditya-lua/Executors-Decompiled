/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafbb40..0xafbbfc (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afbb40_0 {
    struct st_afbb40_0 *field_0;
} st_afbb40_0;


st_afbb40_0 ** sub_afbb40(st_afbb40_0 **a0, unsigned long long *a1)
{
    st_afbb40_0 **v3;  // x0
    st_afbb40_0 **v4;  // x21
    unsigned int v5;  // w0
    st_afbb40_0 **v6;  // x22
    st_afbb40_0 **v7;  // x0
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a1;
    v3 = sub_afb538(0, &v0);
    if (!v3)
        return v3;
    v4 = v3;
    v5 = sub_9c7b68();
    if (v5 != 408 && v5 != 1172)
    {
        sub_a5a4c8(v4);
        return 0;
    }
    v6 = sub_a59c2c(v4);
    sub_a5a4c8(v4);
    v7 = v6;
    if (!v7)
        return v7;
    *a1 = v0;
    if (!a0)
        return v7;
    sub_a18c08(*a0);
    *a0 = v7;
    return v7;
}
