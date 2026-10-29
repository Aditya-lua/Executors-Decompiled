/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b6634..0x1b6694 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b6634_0 {
    char field_0;
} st_1b6634_0;


long long sub_1b6634(long long a0, long long a1)
{
    st_1b6634_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b6634_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(sub_1c3138() & 1))
        return sub_1b2e44(a0, a1);
    return 1;
}
