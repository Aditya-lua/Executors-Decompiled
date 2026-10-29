/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa52fa0..0xa532b8 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a52fa0(char idx, long long a1, char a2)
{
    unsigned long v3;  // x8
    char v4;  // x22
    char v5;  // x0
    int v6;  // w0
    long long v7;  // x0
    char v8;  // x0
    char v10;  // x8
    unsigned int v11;  // w9
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!idx)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/exchange.c", 394, "EVP_PKEY_derive_set_peer_ex");
        sub_a36abc(6, 0xc0102, 0);
        return 0xffffffff;
    }
    if ((char)(*(char *)(idx + 1)) >> 3 & 1 && *(long long *)(idx + 48))
    {
        v3 = *(long long *)(idx + 40);
        if (!*(long long *)(*(long long *)(idx + 40) + 56))
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/exchange.c", 402, "EVP_PKEY_derive_set_peer_ex");
            sub_a36abc(6, 150, 0);
            return 0xfffffffe;
        }
        if (a2)
        {
            v4 = idx;
            v5 = sub_a5d5a8(*(long long *)(idx + 8), a1, *(long long *)(idx + 16));
            if (!v5)
                return 0xffffffff;
            v6 = sub_a5c6f0();
            sub_a5d6b0(v5);
            if (v6 < 1)
                return 0xffffffff;
            v3 = *(long long *)(v4 + 40);
            idx = v4;
        }
        v7 = sub_c4ba8(*(long long *)(idx + 32));
        idx = idx;
        v0 = sub_a55240(*(long long *)(v3 + 24), v7, *(long long *)(idx + 16));
        if (v0)
        {
            v8 = sub_a5a1f8(a1, *(long long *)(idx + 8), &v0, *(long long *)(idx + 16));
            sub_a55830(v0);
            idx = idx;
            if (v8)
                (*(long long *)(*(long long *)(idx + 40) + 56))();
        }
        else
        {
            sub_a55830();
        }
    }
    v10 = *(long long *)(idx + 120);
    if (v10 && (*(long long *)(v10 + 184) || *(long long *)(v10 + 152) || *(long long *)(v10 + 168)) && *(long long *)(v10 + 192))
    {
        v11 = *(int *)idx;
        if (v11 != 0x200 && v11 != 0x400 && v11 != 0x800)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/exchange.c", 462, "EVP_PKEY_derive_set_peer_ex");
            sub_a36abc(6, 151, 0);
            return 0xffffffff;
        }
        (*(long long *)(v10 + 192))();
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/exchange.c", 456, "EVP_PKEY_derive_set_peer_ex");
    sub_a36abc(6, 150, 0);
    return 0xfffffffe;
}
