/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa9854..0xaa996c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa9854_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    long long field_18;
    long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    unsigned long long field_38;
} st_aa9854_0;


unsigned long long sub_aa9854(st_aa9854_0 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // x22
    long long v9;  // x8
    unsigned long long v10;  // x2
    long long v11;  // x1
    unsigned long long v12;  // x10
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    long long v4;  // [bp-0x40]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a0->field_38 - a0->field_30;
    if (a0->field_38 < a0->field_30)
        v7 = 0;
    if ((unsigned int)a1)
    {
        v8 = 7 + (a1 & 0xffffffff) * v7 >> 3;
        v9 = a0->field_8;
        if (v8 > (unsigned long long)(a0->field_20 - v9))
        {
            sub_a368c8();
            sub_a369bc("crypto/rand/rand_pool.c", 250, "ossl_rand_pool_bytes_needed");
            v3 = a0->field_20;
            v4 = a0->field_8;
            v1 = v7;
            v2 = v8;
            v0 = a1;
            v10 = "entropy_factor=%u, entropy_needed=%zu, bytes_needed=%zu,pool->max_len=%zu, pool->len=%zu";
            v11 = 125;
        }
        else
        {
            v12 = a0->field_18 - v9;
            if (v12 < v8)
                v12 = v8;
            if ((unsigned long long)v9 >= (unsigned long long)a0->field_18)
                v12 = v8;
            if (sub_aa996c())
                return v12;
            a0->field_8 = 0;
            a0->field_20 = 0;
            return 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rand/rand_pool.c", 242, "ossl_rand_pool_bytes_needed");
        v11 = 105;
        v10 = 0;
    }
    sub_a36abc(36, v11, v10);
    return 0;
}
