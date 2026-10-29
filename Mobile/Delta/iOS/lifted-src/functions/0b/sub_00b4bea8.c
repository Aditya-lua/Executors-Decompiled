/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4bea8..0xb4bf3c (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4bea8_0 {
    char padding_0[296];
    struct st_b4bea8_0 *field_128;
} st_b4bea8_0;


st_b4bea8_0 * sub_b4bea8(st_b4bea8_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (sub_a6fbc4(a1, "algorithm-id"))
        {
            a0 = sub_a715c0();
            if (!(unsigned int)a0)
                goto LABEL_b4bf30;
        }
        if ((!sub_a6fbc4(a1, "digest") || (a0 = sub_a71468(), (unsigned int)a0)) && (!sub_a6fbc4(a1, "nonce-type") || (a0 = sub_a70210(), (unsigned int)a0)))
            a0 = 1;
LABEL_b4bf30:
    }
    return (unsigned int)a0;
}
