/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x419a98..0x419ae0 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_419a98_0 {
    unsigned long long field_0;
} st_419a98_0;


unsigned long long * sub_419a98(st_419a98_0 **a0, unsigned long long *a1)
{
    unsigned long long *v2;  // x0
    unsigned long long *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    if (a0[2] > v2)
    {
        *v2 = *a1;
        v3 = v2 + 1;
    }
    else
    {
        v3 = sub_3fac04(a0);
    }
    a0[1] = v3;
    return (char *)v3 - 8;
}
