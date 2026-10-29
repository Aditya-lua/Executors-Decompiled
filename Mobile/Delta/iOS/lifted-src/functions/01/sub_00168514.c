/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x168514..0x168584 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_168514_0 {
    char field_0;
} st_168514_0;


long long sub_168514(long long a0, long long a1, long long a2)
{
    st_168514_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_168514_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return a0;
    while (!sub_1685c8(a2, a0))
    {
        a0 += 16;
        if (a0 == a1)
            return a1;
    }
    return a0;
}
