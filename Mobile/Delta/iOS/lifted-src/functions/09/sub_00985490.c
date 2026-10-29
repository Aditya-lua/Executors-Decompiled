/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985490..0x9854e8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985490_0 {
    char padding_0[96];
    unsigned int field_60;
} st_985490_0;


st_985490_0 * sub_985490(long long a0, unsigned long a1, unsigned long long a2, st_985490_0 **a3)
{
    st_985490_0 *v2;  // x0
    unsigned long long v3;  // x8
    st_985490_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c624f0(a0 + 16);
    if (v2)
    {
        v3 = sub_985d88(v2->field_60) & 0xffffffff;
        v2 = a2 > v3;
        v4 = a2 - v3;
        if (a2 < v3)
            v4 = 0;
    }
    else
    {
        v4 = 0;
    }
    *a3 = v4;
    return v2;
}
