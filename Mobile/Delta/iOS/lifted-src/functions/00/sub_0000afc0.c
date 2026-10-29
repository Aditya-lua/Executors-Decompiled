/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc0..0xb080 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afc0_0 {
    char field_0;
} st_afc0_0;


unsigned long long sub_afc0(unsigned long long *a0, long long a1)
{
    unsigned long long v4;  // x22
    unsigned long long v5;  // x0
    unsigned long long v6;  // x23
    unsigned long long v7;  // x25
    unsigned long long v8;  // x21
    st_afc0_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_afc0_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0[2] && !(sub_cdcc(a1, a0 + 3) & 1))
    {
        v4 = a0[1] - 1;
        v5 = sub_af64();
        v6 = 0;
        do
        {
            v7 = v5 & v4;
            v8 = *a0 + v7 * 16;
            if (sub_cdcc(v8, a1) & 1)
                return v8;
        } while (!sub_cdcc(v8, a0 + 3) && (v6 += 1, v5 = v6 + v7, v6 <= v4));
    }
    return 0;
}
