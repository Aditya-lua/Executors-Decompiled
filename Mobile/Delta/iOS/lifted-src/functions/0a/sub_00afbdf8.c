/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafbdf8..0xafbeac (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afbdf8_0 {
    struct st_afbdf8_0 *field_0;
} st_afbdf8_0;


st_afbdf8_0 ** sub_afbdf8(st_afbdf8_0 **a0, unsigned long long *a1)
{
    st_afbdf8_0 **v3;  // x0
    st_afbdf8_0 **v4;  // x21
    st_afbdf8_0 **v5;  // x22
    st_afbdf8_0 **v6;  // x0
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a1;
    v3 = sub_afb538(0, &v0);
    if (!v3)
        return v3;
    v4 = v3;
    if (sub_9c7b68() != 1035)
    {
        sub_a5a4c8(v4);
        return 0;
    }
    v5 = sub_a5aeb0(v4);
    sub_a5a4c8(v4);
    v6 = v5;
    if (!v6)
        return v6;
    *a1 = v0;
    if (!a0)
        return v6;
    sub_a2a8a4(*a0);
    *a0 = v6;
    return v6;
}
