/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c68a4..0x3c6914 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c68a4_0 {
    char field_0;
} st_3c68a4_0;


unsigned long long sub_3c68a4(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    st_3c68a4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3c68a4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_3c6bec();
    if (v4 == a0[5] + a0[4])
        sub_3c73ec(a0);
    v5 = sub_3c6c08(a0);
    *a1 = *a1;
    a0[5] = a0[5] + 1;
    return v5;
}
