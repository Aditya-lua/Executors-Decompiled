/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb389a0..0xb389fc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b389a0_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
} st_b389a0_0;


st_b389a0_0 * sub_b389a0(long long a0, long long a1)
{
    st_b389a0_0 *v2;  // x0
    st_b389a0_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "encoded-pub-key");
    if (v2)
    {
        if (v2->field_8 == 5)
        {
            v3 = sub_9ff3d4(a0, v2->field_10, v2->field_18);
            if (!(unsigned int)v3)
                return v3;
        }
        else
        {
            return 0;
        }
    }
    return 1;
}
