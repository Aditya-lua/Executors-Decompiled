/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa9ce4..0xaa9d98 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa9ce4_0 {
    char field_0;
} st_aa9ce4_0;


char * sub_aa9ce4(st_aa9ce4_0 **a0, char *a1, char *i)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char *v8;  // x8
    unsigned long long v9;  // x11
    char *v10;  // x8
    long long v11;  // x19
    long long v12;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (i)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (!*a0)
        {
            v11 = 786691;
            v12 = 426;
            goto LABEL_aa9d58;
        }
        else if (a0[1])
        {
            v8 = 0;
            do
            {
                v9 = &v8[-1 * a0[1] * v8 / a0[1]];
                *(char *)&(*a0)[v9] = *(char *)&(*a0)[v9] ^ *(char *)(a1 + v8);
                v8 += 1;
            } while (i != v8);
            v10 = 1;
        }
        else
        {
            v11 = 142;
            v12 = 431;
LABEL_aa9d58:
            sub_a368c8();
            sub_a369bc("crypto/rand/rand_pool.c", v12, "ossl_rand_pool_adin_mix_in");
            sub_a36abc(36, v11, 0);
            v10 = 0;
        }
        return v10;
    }
    else
    {
        return 1;
    }
}
