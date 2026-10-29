/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x436f8..0x43794 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_436f8_0 {
    char field_0;
} st_436f8_0;


unsigned long long * sub_436f8(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long *v2;  // x9
    unsigned long long *v3;  // x12
    unsigned long long v4;  // x11
    unsigned long long v5;  // x8
    unsigned long long v6;  // x15
    unsigned long long *v7;  // x8
    st_436f8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_436f8_0 *v1;  // [bp-0x8]

    v2 = 0;
    v1 = &v0;
    v0 = &v1;
    v3 = a0[1] - 1;
    v4 = *a1;
    v5 = 13787848793156543929 * v4 ^ 13787848793156543929 * v4 >> 31;
    while (1)
    {
        v6 = v5 & v3;
        v7 = *a0 + 48 * v6;
        if (*v7 == a0[3])
        {
            *v7 = v4;
            a0[2] = a0[2] + 1;
            return v7;
        }
        else if (*v7 != v4)
        {
            v2 = (char *)v2 + 1;
            v5 = (char *)v2 + v6;
            if (v2 > v3)
                return 0;
        }
        else
        {
            return v7;
        }
    }
}
