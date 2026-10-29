/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5e314..0xa5e4c0 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a5e314(unsigned long a0, unsigned int a1, unsigned int a2, unsigned long long a3, long long a4)
{
    unsigned long long v10;  // x0
    unsigned long long v11;  // 4112
    unsigned long long v12;  // x23
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
        sub_a369bc("crypto/evp/pmeth_lib.c", 950, "evp_pkey_ctx_set_md");
        sub_a36abc(6, 147, 0);
        v12 = 0xfffffffe;
    }
    else if (a2)
    {
        sub_a36c8c();
        v10 = sub_a5e6d0(a0, 0xffffffff, a3, a4, 0, a1, 0);
        v11 = arm64g_calculate_condition(0x11, v10 & 0xffffffff, 2, 0);
        if (!(v11 & 1))
        {
            sub_a36cd4();
LABEL_a5e420:
            goto LABEL_a5e4bc;
        }
        else
        {
            v12 = v10;
            sub_a36e70();
            if ((int)v12 >= 1)
            {
                if (*(int *)a0)
                    goto LABEL_a5e420;
                v12 = 1;
            }
        }
    }
    else
    {
        if (a1)
            sub_a50a58(a1);
        sub_a71bbc(sub_a71618("digest"));
        v4 = v0;
        v5 = v1;
        v6 = v2;
        v12 = sub_a5db1c(a0, &v3);
    }
    if (*(long long *)&g_10002b0 == v7)
        return v12;
LABEL_a5e4bc:
    ___stack_chk_fail();
}
