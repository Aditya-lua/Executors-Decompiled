/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb545b8..0xb546a0 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b545b8_0 {
    char padding_0[16];
    unsigned long long field_10;
    long long field_18;
} st_b545b8_0;


st_b545b8_0 * sub_b545b8(unsigned long a0, unsigned long long a1, long long a2)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    unsigned long long v4;  // x0
    long long *v5;  // x20
    unsigned long long v6;  // x0
    unsigned long long v7;  // x8
    st_b545b8_0 *v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    v3 = sub_a2f9e0(v2);
    if (!(a1 >> 1 & 1))
    {
        return 0;
    }
    else if (v3)
    {
        v4 = sub_a6fbc4(a2, "raw-bytes");
        if (!v4)
            return v4;
        v5 = v4;
        v6 = sub_a6bffc(32, "providers/implementations/skeymgmt/generic.c", 47);
        if (!v6)
            return v6;
        *(long long *)v6 = v2;
        *(unsigned int *)(v6 + 8) = 1;
        v7 = sub_a6dac4(v5[2], v5[3], "providers/implementations/skeymgmt/generic.c", 55);
        v8 = v6;
        v8->field_10 = v7;
        if (!v7)
        {
            sub_a6c2e4(0, "providers/implementations/skeymgmt/generic.c", 26);
            sub_a6c2e4(v8, "providers/implementations/skeymgmt/generic.c", 27);
            return 0;
        }
        v8->field_18 = v5[3];
        return v8;
    }
    else
    {
        return 0;
    }
}
