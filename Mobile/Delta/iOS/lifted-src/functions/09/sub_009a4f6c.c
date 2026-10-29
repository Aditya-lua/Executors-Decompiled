/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a4f6c..0x9a5054 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a4f6c_0 {
    char padding_0[24];
    unsigned int field_18;
} st_9a4f6c_0;

typedef struct st_9a4f6c_1 {
    char padding_0[768];
    struct st_9a4f6c_0 *field_300;
} st_9a4f6c_1;

extern char g_10002b0;

unsigned long long sub_9a4f6c(st_9a4f6c_1 *a0, long long a1)
{
    unsigned long long v6;  // w0
    uint128_t v0;  // [bp-0x50]
    uint128_t v1;  // [bp-0x40]
    unsigned int v2;  // [bp-0x30]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v2 = 386007555;
    v0 = 0x9020203852a060608301e302000e8fd;
    v1 = 0x852a0606083016020203852a06060830;
    if ((a0->field_300->field_18 >> 1 & 0x7fff) != 64 || !(sub_962ef0() >> 31 & 1))
    {
        v6 = 2;
    }
    else if (sub_a6ebd4(a1, &v0, 36))
    {
        v6 = 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 2223, "tls_construct_stoc_cryptopro_bug");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        v6 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
