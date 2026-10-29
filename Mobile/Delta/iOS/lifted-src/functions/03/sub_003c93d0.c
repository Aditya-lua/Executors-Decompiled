/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c93d0..0x3c945c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c93d0_0 {
    char field_0;
} st_3c93d0_0;


long long sub_3c93d0(long long a0, unsigned long long a1)
{
    unsigned long long i;  // x19
    long long iter;  // x20
    unsigned long long v6;  // x19
    long long v7;  // x0
    st_3c93d0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3c93d0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 < 1)
        return a0;
    i = a1;
    iter = a0 + 18160;
    do
    {
        v6 = i;
        if (*(long long *)(iter - 24))
        {
            _free(*(long long *)(iter - 24));
            *(unsigned long long *)(iter - 32) = 0;
            *(unsigned long long *)(iter - 24) = 0;
        }
        if (*(long long *)(iter - 16))
        {
            _free(*(long long *)(iter - 16));
            *(unsigned long long *)(iter - 16) = 0;
            *(unsigned long long *)iter = 0;
        }
        v7 = *(long long *)(iter - 8);
        if (v7)
        {
            v7 = _free(v7);
            *(unsigned long long *)(iter - 8) = 0;
        }
        iter += 96;
        i = v6 - 1;
    } while (i);
    return v7;
}
