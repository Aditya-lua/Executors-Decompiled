/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb47088..0xb47104 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b47088_0 {
    struct st_b47088_0 *field_0;
} st_b47088_0;


st_b47088_0 ** sub_b47088(unsigned long a0, st_b47088_0 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b47088_0 **v8;  // w0
    st_b47088_0 **v9;  // w0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (*a1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (sub_a6fbc4(a1, "reseed_requests"))
        {
            v8 = (st_b47088_0 **)(unsigned int)sub_a6ffcc();
            if (!v8)
                return v8;
        }
        if (!sub_a6fbc4(a1, "reseed_time_interval"))
            return 1;
        v9 = (st_b47088_0 **)(unsigned int)sub_a70424();
        if (!v9)
            return v9;
        return 1;
    }
    else
    {
        return 1;
    }
}
