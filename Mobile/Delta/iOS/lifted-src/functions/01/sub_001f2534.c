/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f2534..0x1f25ec (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f2534_0 {
    char field_0;
} st_1f2534_0;


unsigned long long * sub_1f2534(unsigned long long *a0)
{
    unsigned long v4;  // x20
    unsigned long v5;  // x21
    unsigned long i;  // x22
    unsigned long long *v7;  // x0
    unsigned long long *v8;  // x23
    st_1f2534_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f2534_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0[1])
        return a0;
    v4 = 0;
    v5 = 0;
    i = 0;
    v7 = a0;
    do
    {
        v8 = *a0 + v4;
        if (v8[3])
        {
            v7 = sub_1f9eb8(a0, i + v8[3]);
            v8[3] = (char *)v7 + v5;
        }
        if (v8[4])
        {
            v7 = sub_1f9eb8(a0, i + v8[4]);
            v8[4] = (char *)v7 + v5;
        }
        i += 1;
        v5 -= 1;
        v4 += 40;
    } while (a0[1] > i);
    return v7;
}
