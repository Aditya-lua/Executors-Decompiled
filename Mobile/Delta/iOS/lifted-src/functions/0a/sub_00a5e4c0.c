/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5e4c0..0xa5e690 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned int sub_a5e4c0(unsigned long a0, unsigned int a1, long long a2, unsigned long long a3, long long a4, long long a5, unsigned long long a6)
{
    unsigned long long v10;  // x0
    unsigned long long v11;  // 4112
    unsigned int v12;  // x24
    unsigned long long v13;  // x2
    uint128_t v0;  // [bp-0xc0]
    uint128_t v1;  // [bp-0xb0]
    unsigned long long v2;  // [bp-0xa0]
    char v3;  // [bp-0x98]
    uint128_t v4;  // [bp-0x70]
    uint128_t v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x50]
    unsigned long v7;  // [bp-0x48]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (!a0 || !(*(int *)a0 & (unsigned int)a3))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_lib.c", 997, "evp_pkey_ctx_set1_octet_string");
        sub_a36abc(6, 147, 0);
        v12 = 0xfffffffe;
    }
    else if (a1)
    {
        sub_a36c8c();
        v10 = sub_a5e6d0(a0, 0xffffffff, a3, a4, 0, a5, (int)a6);
        v11 = arm64g_calculate_condition(0x11, v10 & 0xffffffff, 2, 0);
        if (!(v11 & 1))
        {
            sub_a36cd4();
LABEL_a5e600:
            goto LABEL_a5e68c;
        }
        else
        {
            v12 = v10;
            sub_a36e70();
            if ((int)v12 >= 1)
            {
                if (*(int *)a0)
                    goto LABEL_a5e600;
                v12 = 1;
            }
        }
    }
    else if (!(a6 >> 31 & 1))
    {
        v13 = a6 & 0xffffffff;
        sub_a71bbc(sub_a71670(a2, a5, v13), a5, v13);
        v4 = v0;
        v5 = v1;
        v6 = v2;
        v12 = sub_a5db1c(a0, &v3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_lib.c", 1008, "evp_pkey_ctx_set1_octet_string");
        sub_a36abc(6, 0xdd, 0);
        v12 = 0;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v12;
LABEL_a5e68c:
    ___stack_chk_fail();
}
