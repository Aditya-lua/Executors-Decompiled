/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9712d4..0x9713e4 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9712d4(unsigned long a0, unsigned long a1)
{
    void* v2;  // x0
    unsigned long v3;  // x8
    unsigned int v4;  // w9
    unsigned long long v5;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(160, "ssl/quic/cc_newreno.c", 52);
    if (!v2)
        return v5;
    *(unsigned long *)v2 = a0;
    *(unsigned long *)&v2[8] = a1;
    v3 = (long long)v2[48];
    *(unsigned long long *)&v2[48] = 1200;
    *(uint128_t *)&v2[16] = 0x9600000000000002ee0;
    if (v3 >= 1201)
        *(unsigned long long *)&v2[64] = 12000;
    if ((long long)v2[120])
        *(unsigned long long *)(long long)v2[120] = 1200;
    if ((long long)v2[128])
        *(long long *)(long long)v2[128] = (long long)v2[64];
    if ((long long)v2[0x88])
        *(unsigned long long *)(long long)v2[0x88] = 2400;
    if ((long long)v2[144])
        *(long long *)(long long)v2[144] = (long long)v2[56];
    if ((long long)v2[152])
    {
        if ((int)v2[112])
        {
            v4 = 82;
        }
        else if ((unsigned long long)(long long)v2[64] < (unsigned long long)(long long)v2[72])
        {
            v4 = 83;
        }
        else
        {
            v4 = 65;
        }
LABEL_971398:
        *(unsigned int *)(long long)v2[152] = v4;
        goto LABEL_971398;
    }
    *(double *)&v2[32] = 4.2439915824e-314;
    *(unsigned int *)&v2[40] = 3;
    *(uint128_t *)&v2[56] = 0x2ee00000000000000000;
    *(uint128_t *)&v2[72] = 0xffffffffffffffff;
    *(unsigned long long *)&v2[88] = 0;
    *(unsigned int *)&v2[96] = 0;
    *(unsigned long long *)&v2[104] = 0;
    *(unsigned int *)&v2[112] = 0;
    return 0xffffffffffffffff;
}
