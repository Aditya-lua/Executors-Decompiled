/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2bdc8..0xb2bfa0 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

uint128_t * sub_b2bdc8(uint128_t *a0, uint128_t *a1, uint128_t *a2, long long a3, long long a4)
{
    uint128_t *v17;  // x0
    uint128_t *v18;  // x22
    uint128_t *v19;  // x19
    uint128_t *v20;  // x8
    unsigned int v22;  // w0
    uint128_t *iter;  // x21
    uint128_t *v24;  // w22
    unsigned long n;  // x22
    uint128_t *v0;  // [bp-0x140]
    char *v1;  // [bp-0x134]
    char v2;  // [bp-0x130]
    uint128_t v3;  // [bp-0x108]
    uint128_t v4;  // [bp-0xf8]
    unsigned long v5;  // [bp-0xe8]
    uint128_t v6;  // [bp-0xe0]
    uint128_t v7;  // [bp-0xd0]
    uint128_t v8;  // [bp-0xc0]
    uint128_t v9;  // [bp-0xb0]
    uint128_t v10;  // [bp-0x98]
    uint128_t v11;  // [bp-0x88]
    uint128_t v12;  // [bp-0x78]
    uint128_t v13;  // [bp-0x68]
    unsigned long v14;  // [bp-0x58]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v14 = *(long long *)&g_10002b0;
    v17 = a0;
    if (a1)
    {
        v18 = a2;
        v17 = a0;
        if (a2)
        {
            v1 = (char *)(unsigned int)v18;
            v17 = sub_a3f728();
            if (v17)
            {
                v19 = v17;
                v20 = 64;
                if (v18 < 64)
                    v20 = v18;
                v0 = v20;
                sub_a71bbc(sub_a70ed8(), &v0);
                v3 = v10;
                v4 = v11;
                v5 = v12;
                if (sub_a3f7f0(v19, a0, &v2) == 1 && sub_a3fe10(v19, &v1, 4) == 1 && sub_a3fe10(v19, a3, a4) == 1)
                {
                    v22 = sub_a3ff7c();
                    if (v18 >= 65 && v22 == 1)
                    {
                        *a1 = v10;
                        a1[1] = v11;
                        iter = a1 + 2;
                        v24 = (uint128_t *)((unsigned int)v18 - 32);
                        if (v24 >= 65)
                        {
                            do
                            {
                                v6 = v10;
                                v7 = v11;
                                v8 = v12;
                                v9 = v13;
                                if (!sub_b2bfa0(a0, &v10, 64, &v6))
                                    goto LABEL_b2bf60;
                            } while ((*iter = v10, iter[1] = v11, iter += 2, v24 = (char *)v24 - 32, 64 < v24));
                        }
                        v6 = v10;
                        v7 = v11;
                        v8 = v12;
                        v9 = v13;
                        n = v24;
                        if (sub_b2bfa0(a0, &v10, n, &v6))
                            _memcpy(iter, &v10, n);
                    }
                }
LABEL_b2bf60:
                v17 = sub_a3f73c(v19);
            }
        }
    }
    if (*(long long *)&g_10002b0 == v14)
        return v17;
    ___stack_chk_fail();
}
