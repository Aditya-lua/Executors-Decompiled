/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13e320..0x13e38c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13e320_0 {
    char field_0;
} st_13e320_0;


unsigned long long * sub_13e320(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3)
{
    unsigned long long *iter;  // x8
    unsigned long long *v3;  // x9
    unsigned long long *v4;  // x9
    unsigned long long *v5;  // x0
    unsigned long v6;  // x10
    unsigned long long *v7;  // x0
    st_13e320_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_13e320_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
    {
        return a0;
    }
    else if (a2 != a3)
    {
        iter = a0 + 1;
        v3 = a2 + 1;
        do
        {
            v4 = v3;
            v5 = a0;
            v6 = *(long long *)((char *)iter - 8);
            *(long long *)((char *)iter - 8) = *(long long *)((char *)v4 - 8);
            *(unsigned long *)((char *)v4 - 8) = v6;
            v7 = v5 + 1;
        } while (iter != a1 && (iter += 1, v3 = v4 + 1, a0 = v7, v4 != a3));
        return v5 + 1;
    }
    else
    {
        return a0;
    }
}
