/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cedc4..0x3cee04 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cedc4_0 {
    char field_0;
} st_3cedc4_0;


long long sub_3cedc4(st_3cedc4_0 **a0)
{
    char *v2;  // x8
    st_3cedc4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3cedc4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = *a0;
    if (a0[1] <= v2)
        return 0;
    *a0 = v2 + 1;
    return *v2;
}
