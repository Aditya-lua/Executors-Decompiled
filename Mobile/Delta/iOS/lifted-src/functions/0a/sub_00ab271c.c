/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab271c..0xab2824 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_ab271c(char *a0, unsigned int a1)
{
    unsigned long long v10;  // x0
    uint128_t v0;  // [bp-0xa8]
    uint128_t v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x88]
    char v3;  // [bp-0x78]
    uint128_t v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x30]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (!a0 || !(*a0 & 6))
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_lib.c", 1365, "EVP_PKEY_CTX_set_rsa_keygen_primes");
        sub_a36abc(6, 147, 0);
        v10 = 0xfffffffe;
    }
    else if (sub_a5dadc(a0, "RSA") || sub_a5dadc(a0, "RSA-PSS"))
    {
        sub_a71bbc(sub_a70ed8("primes", &/* unsupported instruction */), &/* unsupported instruction */);
        v4 = v0;
        v5 = v1;
        v6 = v2;
        v10 = sub_a5df54(a0, &v3);
    }
    else
    {
        v10 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v10;
    ___stack_chk_fail();
}
