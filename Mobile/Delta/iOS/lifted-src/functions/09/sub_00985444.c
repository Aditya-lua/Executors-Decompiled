/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985444..0x985490 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985444_0 {
    char padding_0[96];
    unsigned int field_60;
} st_985444_0;


st_985444_0 * sub_985444(long long a0, unsigned long a1, unsigned long a2, st_985444_0 **a3)
{
    st_985444_0 *v2;  // x0
    st_985444_0 *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c624f0(a0 + 16);
    if (v2)
    {
        v3 = a2 + (sub_985d88(v2->field_60) & 0xffffffff);
        v2 = 1;
    }
    else
    {
        v3 = 0;
    }
    *a3 = v3;
    return v2;
}
