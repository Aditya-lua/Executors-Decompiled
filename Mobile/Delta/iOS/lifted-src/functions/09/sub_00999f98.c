/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x999f98..0x99a10c (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e88aa0;
extern unsigned long long g_e88b30;
extern unsigned long long g_e88bc0;
extern unsigned long long g_e88da8;

unsigned long long sub_999f98(unsigned long a0, unsigned long a1, int a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11, unsigned long a12, unsigned long a13, unsigned long a14, unsigned long long a15, unsigned long long a16, unsigned int a17, unsigned long long a18, unsigned long long a19, unsigned long a20, uint128_t a21, unsigned long a22, unsigned long long a23, unsigned long a24, unsigned int a25, uint128_t a26, unsigned long a27, unsigned long long a28, unsigned long long a29)
{
    unsigned long long v11;  // x0
    unsigned long long v12;  // x8
    unsigned long long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x98]
    uint128_t v2;  // [bp-0x90], Other Possible Types: unsigned int
    unsigned long long v3;  // [bp-0x88]
    unsigned long long v4;  // [bp-0x80]
    uint128_t v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x68]
    unsigned long long v7;  // [bp-0x60]
    long long *v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    long long *v10;  // [bp+0xb8]

    v9 = &a8;
    v7 = a29;
    v8 = v10;
    v6 = a28;
    v5 = a26;
    v4 = a23;
    v2 = a21;
    v0 = a18;
    v11 = sub_9987e4();
    if ((unsigned int)v11 != 1)
        return v11;
    if (0x303 < a2)
    {
        switch (a2)
        {
        case 65536:
            v12 = &g_e88da8;
            break;
        case 772:
            v12 = &g_e88b30;
            break;
        default:
            goto LABEL_99a054;
        }
    }
    else if (3 > (unsigned int)(a2 - 769))
    {
        v12 = &g_e88bc0;
    }
    else if (a2 == 0x300)
    {
        v12 = &g_e88aa0;
    }
    else
    {
LABEL_99a054:
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1438, "tls_new_record_layer");
        sub_a36abc(20, 0xc0103, 0);
        sub_998bbc(*v10);
        *v10 = 0;
        return 0xfffffffe;
    }
    *(unsigned long long *)(*v10 + 4416) = v12;
    v3 = a18;
    v4 = a19;
    v2 = a17;
    v0 = a15;
    v1 = a16;
    (*(long long *)*(long long *)(*v10 + 4416))();
}
