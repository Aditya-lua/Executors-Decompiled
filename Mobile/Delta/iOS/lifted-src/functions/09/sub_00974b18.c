/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x974b18..0x974d24 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_975fbc;
extern long long g_975fc4;

void* sub_974b18(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, char a5)
{
    void* v2;  // x19
    void* v3;  // x0
    void* v4;  // x0
    void* v5;  // x0
    unsigned int v6;  // w20
    void* v7;  // x21
    void* v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(2400, "ssl/quic/quic_ackm.c", 1050);
    if (!v2)
        return v2;
    *(unsigned long *)&v2[288] = 0xffffffffffffffff;
    *(unsigned long *)&v2[2328] = 0xffffffffffffffff;
    *(unsigned long long *)&v2[8] = 0;
    *(unsigned long long *)&v2[16] = 0;
    *(unsigned long long *)v2 = 0;
    *(unsigned long long *)&v2[32] = 0;
    *(unsigned long long *)&v2[40] = 0;
    v3 = sub_a66520(sub_a66530(&g_975fbc, &g_975fc4), " ", "@", " ", "@");
    *(void* *)&v2[24] = v3;
    if (v3)
    {
        *(unsigned long *)&v2[296] = 0xffffffffffffffff;
        *(unsigned long *)&v2[2336] = 0xffffffffffffffff;
        *(unsigned long long *)&v2[56] = 0;
        *(unsigned long long *)&v2[64] = 0;
        *(unsigned long long *)&v2[48] = 0;
        *(unsigned long long *)&v2[80] = 0;
        *(unsigned long long *)&v2[88] = 0;
        v4 = sub_a66520(sub_a66530(&g_975fbc, &g_975fc4), " ", "@", " ", "@");
        *(void* *)&v2[72] = v4;
        if (v4)
        {
            *(unsigned long *)&v2[304] = 0xffffffffffffffff;
            *(unsigned long *)&v2[2344] = 0xffffffffffffffff;
            *(unsigned long long *)&v2[104] = 0;
            *(unsigned long long *)&v2[112] = 0;
            *(unsigned long long *)&v2[96] = 0;
            *(unsigned long long *)&v2[128] = 0;
            *(unsigned long long *)&v2[0x88] = 0;
            v5 = sub_a66520(sub_a66530(&g_975fbc, &g_975fc4), " ", "@", " ", "@");
            *(void* *)&v2[120] = v5;
            if (v5)
            {
                sub_991a38(v2 + 144);
                *(unsigned long long *)&v2[168] = 0;
                sub_991a38(v2 + 176);
                *(unsigned long long *)&v2[200] = 0;
                sub_991a38(v2 + 208);
                *(unsigned long long *)&v2[232] = 0;
                *(unsigned long *)&v2[240] = a0;
                *(unsigned long *)&v2[248] = a1;
                *(unsigned long *)&v2[0x100] = a2;
                *(unsigned long *)&v2[264] = a3;
                *(unsigned long *)&v2[272] = a4;
                *(char *)&v2[457] = a5;
                *(uint128_t *)&v2[2352] = CONCAT(25000000, 25000000);
                return v2;
            }
            v6 = 2;
        }
        else
        {
            v6 = 1;
        }
        v7 = v2 + v6 * 48;
        sub_a66664(*(long long *)((char *)v7 - 24));
        memset(v7 - 48, 0, 32);
        if (v4)
        {
            v8 = v2 + v6 * 48;
            sub_a66664(*(long long *)((char *)v8 - 72));
            memset(v8 - 96, 0, 32);
        }
    }
    sub_a6c2e4(v2, "ssl/quic/quic_ackm.c", 1080);
    return 0;
}
