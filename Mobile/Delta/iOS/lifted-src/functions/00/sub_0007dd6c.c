/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7dd6c..0x7de58 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7dd6c_0 {
    char field_0;
} st_7dd6c_0;


unsigned long long sub_7dd6c(char *a0, unsigned long long a1)
{
    unsigned long long v4;  // x20
    unsigned long long v5;  // x8
    unsigned long long v6;  // x9
    unsigned long v7;  // x10
    unsigned long long v8;  // x9
    st_7dd6c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_7dd6c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == 1)
        return 1;
    v4 = a1 & 31;
    if (v4 && sub_7cdfc(a0 + 1, a0, &a0[v4]) != v4 - 1)
        return 0;
    if (32 > a1)
        return 1;
    v5 = 0x101010101010101 * *a0;
    v6 = a1 & 0xffffffffffffffe0;
    v7 = &a0[v4 + 16];
    while (1)
    {
        v8 = v6;
        if (*(long long *)(v7 - 16) != v5)
        {
            return 0;
        }
        else if (*(long long *)(v7 - 8) != v5)
        {
            return 0;
        }
        else if (*(long long *)v7 != v5)
        {
            return 0;
        }
        else if (*(long long *)(v7 + 8) == v5)
        {
            v7 += 32;
            v6 = v8 - 32;
            if (v8 == 32)
                return 1;
        }
        else
        {
            return 0;
        }
    }
}
