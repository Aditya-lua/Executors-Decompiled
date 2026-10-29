/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa9bbc..0xaa9c70 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa9bbc_0 {
    long long field_0;
    unsigned long long field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_aa9bbc_0;


long long sub_aa9bbc(st_aa9bbc_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x1
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if ((unsigned long long)a1 > a0->field_20 - a0->field_8)
    {
        sub_a368c8();
        sub_a369bc("crypto/rand/rand_pool.c", 359, "ossl_rand_pool_add_begin");
        v8 = 125;
        goto LABEL_aa9c58;
    }
    else
    {
        if (!a0->field_0)
        {
            sub_a368c8();
            sub_a369bc("crypto/rand/rand_pool.c", 364, "ossl_rand_pool_add_begin");
            v8 = 786691;
LABEL_aa9c58:
            sub_a36abc(36, v8, 0);
        }
        else if (sub_aa996c())
        {
            return a0->field_0 + a0->field_8;
        }
        return 0;
    }
}
