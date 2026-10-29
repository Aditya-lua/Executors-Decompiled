/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ae04..0xa5aeb0 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5ae04_0 {
    struct st_a5ae04_0 *field_0;
} st_a5ae04_0;


st_a5ae04_0 ** sub_a5ae04(unsigned int *a0, st_a5ae04_0 **a1)
{
    st_a5ae04_0 **v3;  // x0
    st_a5ae04_0 **v4;  // w21
    st_a5ae04_0 **v5;  // x0
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9c5df4(&v0, *a0);
    if (v3)
        v4 = (st_a5ae04_0 **)*(int *)v3;
    else
        v4 = (st_a5ae04_0 **)0;
    sub_a32e7c(v0);
    if (v4 != a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 925, "evp_pkey_get0_ECX_KEY");
        sub_a36abc(6, 219, 0);
        return 0;
    }
    v5 = sub_c67c9c(a0);
    if (!v5)
        return v5;
    if (!sub_a2a930())
        v5 = 0;
    return v5;
}
