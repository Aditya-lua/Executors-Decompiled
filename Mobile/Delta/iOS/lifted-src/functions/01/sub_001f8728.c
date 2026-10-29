/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f8728..0x1f87a8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f8728_0 {
    char field_0;
} st_1f8728_0;


unsigned int sub_1f8728(unsigned long long *a0, unsigned int a1, unsigned int a2, unsigned int a3)
{
    unsigned int v2;  // w9
    unsigned int *v3;  // x11
    st_1f8728_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f8728_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return 0;
    v2 = 0;
    while (1)
    {
        v3 = *a0 + a1 * 8 + v2 * 8;
        if (a3 < *v3)
        {
            v2 = 1 | v2 * 2;
            if (a2 <= v2)
                return 0;
        }
        else if (a3 > v3[1])
        {
            v2 = v2 * 2 + 2;
            if (v2 >= a2)
                return 0;
        }
        else
        {
            return 1;
        }
    }
}
