/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa9aa0..0xaa9bbc (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_aa9aa0(void* a0, long long a1, unsigned long n, unsigned long a3)
{
    unsigned long long v2;  // x8
    unsigned long v3;  // x9
    unsigned long v4;  // cc_dep1
    unsigned long long v6;  // x9
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned int v11;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long)a0[8];
    v3 = (long long)a0[32] - v2;
    v4 = v3;
    if (n > v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/rand/rand_pool.c", 302, "ossl_rand_pool_add");
        sub_a36abc(36, 106, 0);
        return 0;
    }
    else if (*(long long *)a0)
    {
        if (!n)
            return 1;
        v6 = *(long long *)a0 + v2;
        if (v2 < (unsigned long long)(long long)a0[40])
        {
            v7 = arm64g_calculate_condition(132, v4, n, 0);
            v8 = arm64g_calculate_condition(4, (v7 & 1 ? v6 : 0), (v7 & 1 ? a1 : 0), 0);
            if (v8 & 1)
                goto LABEL_aa9b78;
        }
        else
        {
            v9 = arm64g_calculate_condition(132, v4, n, 0);
            v10 = arm64g_calculate_condition(0, (v9 & 1 ? v6 : 0), (v9 & 1 ? a1 : 0), 0);
            if (v10 & 1)
            {
LABEL_aa9b78:
                sub_a368c8();
                sub_a369bc("crypto/rand/rand_pool.c", 321, "ossl_rand_pool_add");
                sub_a36abc(36, 0xc0103, 0);
                return 0;
            }
        }
        v11 = sub_aa996c();
        if (!v11)
            return v11;
        _memcpy(*(long long *)a0 + (long long)a0[8], a1, n);
        *(unsigned long *)&a0[8] = (long long)a0[8] + n;
        *(unsigned long *)&a0[48] = (long long)a0[48] + a3;
        return 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rand/rand_pool.c", 307, "ossl_rand_pool_add");
        sub_a36abc(36, 0xc0103, 0);
        return 0;
    }
}
