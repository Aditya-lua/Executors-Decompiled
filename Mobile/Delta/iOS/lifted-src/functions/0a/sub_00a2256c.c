/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2256c..0xa22de4 (2168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned int sub_a2256c(unsigned long a0, long long *a1, unsigned int a2, unsigned int a3)
{
    long long v15;  // x1
    unsigned int i;  // w22
    unsigned int v17;  // w22
    unsigned int v18;  // x0
    char v0;  // [bp-0x190]
    char v1;  // [bp-0x170]
    char v2;  // [bp-0x150]
    uint128_t v3;  // [bp-0x130]
    uint128_t v4;  // [bp-0x120]
    uint128_t v5;  // [bp-0x108]
    uint128_t v6;  // [bp-0xf8]
    char v7;  // [bp-0xe8]
    char v8;  // [bp-0xc8]
    char v9;  // [bp-0xa8]
    char v10;  // [bp-0x88]
    char v11;  // [bp-0x68]
    unsigned long v12;  // [bp-0x48]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    if (sub_a1b4f4())
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_nistz256.c", 1158, "ecp_nistz256_get_affine");
        v15 = 106;
    }
    else
    {
        if (sub_9e42c8(&v2, a1[2], 4) && sub_9e42c8(&v1, a1[3], 4) && sub_9e42c8(&v0, a1[4], 4))
        {
            sub_a20e50(&v5, &v0);
            sub_a20e10(&v11, &v5, &v0);
            sub_a20e50(&v5, &v11);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v10, &v5, &v11);
            sub_a20e50(&v5, &v10);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v9, &v5, &v10);
            sub_a20e50(&v5, &v9);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v8, &v5, &v9);
            sub_a20e50(&v5, &v8);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v7, &v5, &v8);
            sub_a20e50(&v5, &v7);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v5, &v5, &v0);
            i = 128;
            do
            {
                v17 = i;
                sub_a20e50(&v5, &v5);
                i = v17 - 1;
            } while (i);
            sub_a20e10(&v5, &v5, &v7);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v5, &v5, &v7);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v5, &v5, &v8);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v5, &v5, &v9);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v5, &v5, &v10);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v5, &v5, &v11);
            sub_a20e50(&v5, &v5);
            sub_a20e50(&v5, &v5);
            sub_a20e10(&v5, &v5, &v0);
            v3 = v5;
            v4 = v6;
            sub_a20e50(&v11, &v3);
            sub_a20e10(&v10, &v11, &v2);
            if (a2)
            {
                sub_a20dd0(&v8, &v10);
                v18 = sub_9e4320(a2, &v8, 4);
                if (!v18)
                {
                    if (*(long long *)&g_10002b0 == v12)
                        return v18;
                    ___stack_chk_fail();
                }
            }
            if (a3)
            {
                sub_a20e10(&v3, &v3, &v11);
                sub_a20e10(&v9, &v3, &v1);
                sub_a20dd0(&v7, &v9);
                v18 = sub_9e4320(a3, &v7, 4);
                if (!v18)
                {
                    if (*(long long *)&g_10002b0 == v12)
                        return v18;
                    ___stack_chk_fail();
                }
            }
            if (*(long long *)&g_10002b0 == v12)
                return 1;
            ___stack_chk_fail();
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_nistz256.c", 1163, "ecp_nistz256_get_affine");
        v15 = 146;
    }
    sub_a36abc(16, v15, 0);
    if (*(long long *)&g_10002b0 == v12)
        return 0;
    ___stack_chk_fail();
}
