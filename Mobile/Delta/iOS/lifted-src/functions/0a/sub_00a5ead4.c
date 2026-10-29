/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ead4..0xa5ec84 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a5ead4(unsigned int *a0, long long a1, unsigned long long a2)
{
    unsigned long v3;  // x8
    unsigned long long v4;  // x8
    long long v5;  // x1
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0)
    {
        v3 = *a0;
        v4 = *(long long *)&a0[30];
        if (v4 && *(long long *)(v4 + 200))
        {
            v0 = *(long long *)(v4 + 200);
            if (!_strcmp(a1, "digest"))
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/pmeth_lib.c", 1619, "EVP_PKEY_CTX_md");
                sub_a36abc(6, 152, 0);
                return 0;
            }
            goto *((void *)(v0));
        }
        sub_a368c8();
        v5 = 1390;
    }
    else
    {
        sub_a368c8();
        v5 = 1380;
    }
    sub_a369bc("crypto/evp/pmeth_lib.c", v5, "evp_pkey_ctx_ctrl_str_int");
    sub_a36abc(6, 147, 0);
    return 0xfffffffe;
}
