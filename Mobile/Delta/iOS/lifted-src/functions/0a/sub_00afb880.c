/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafb880..0xafb914 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afb880_0 {
    struct st_afb880_0 *field_0;
} st_afb880_0;


st_afb880_0 ** sub_afb880(st_afb880_0 **a0, unsigned long long *a1)
{
    st_afb880_0 **v3;  // x0
    st_afb880_0 **v4;  // x22
    st_afb880_0 **v5;  // x0
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a1;
    v3 = sub_afb538(0, &v0);
    if (!v3)
        return v3;
    v4 = sub_a59b4c();
    sub_a5a4c8(v3);
    v5 = v4;
    if (!v5)
        return v5;
    *a1 = v0;
    if (!a0)
        return v5;
    sub_ab1360(*a0);
    *a0 = v5;
    return v5;
}
