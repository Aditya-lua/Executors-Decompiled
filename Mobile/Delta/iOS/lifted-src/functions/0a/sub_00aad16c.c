/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaad16c..0xaad32c (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aad16c_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_aad16c_0;

extern char g_10002b0;

long long sub_aad16c(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_aad16c_0 *v15;  // x21
    unsigned long v17;  // x21
    unsigned long v18;  // x0
    unsigned long v19;  // x21
    unsigned long v20;  // x0
    unsigned long v21;  // x22
    char *v0;  // [bp-0x158], Other Possible Types: uint128_t
    uint128_t v1;  // [bp-0x148]
    unsigned long long v2;  // [bp-0x138]
    char v3;  // [bp-0x12c]
    unsigned long v4;  // [bp-0x128]
    unsigned long v5;  // [bp-0x120]
    char v6;  // [bp-0x118]
    unsigned long v7;  // [bp-0xf8]
    uint128_t v8;  // [bp-0xf0]
    uint128_t v9;  // [bp-0xe0]
    unsigned long long v10;  // [bp-0xd0]
    char v11;  // [bp-0xc8]
    unsigned long v12;  // [bp-0x48]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v4 = a4;
    v5 = a3;
    v15 = sub_962b90();
    if ((int)sub_ab2260(v15, &v3) < 1)
    {
LABEL_aad260:
        v18 = 0;
    }
    else if (v3 != 6)
    {
        v18 = 2;
    }
    else if (v15->field_20)
    {
        sub_a71bbc(sub_a71670("algorithm-id", &v11, 128), &v11, 128);
        v8 = v0;
        v9 = v1;
        v10 = v2;
        if ((int)sub_a5dc18(v15, &v6) < 1 || (v17 = v7, !v17))
            goto LABEL_aad260;
        if ((!a3 || (v0 = &v11, v18 = sub_9cf6b0(&v5, &v0, v17), v18)) && (!a4 || (v0 = &v11, v18 = sub_9cf6b0(&v4, &v0, v17), v18)))
            goto LABEL_aad300;
    }
    else
    {
        v18 = sub_aac6e8(v15);
        if (v18)
        {
            v19 = v18;
            if (a4)
            {
                v20 = sub_9c7864(v19);
                if (!v20)
                {
LABEL_aad308:
                    goto LABEL_aad31c;
                }
                v21 = v20;
                if (sub_9cf6d4(a4, sub_a99624(912), 16, v21))
                    goto LABEL_aad2e0;
                sub_9c7940(v19);
                v19 = v21;
LABEL_aad31c:
                sub_9c7940(v19);
                v18 = 0;
            }
            else
            {
LABEL_aad2e0:
                if (!sub_9cf6d4(a3, sub_a99624(912), 16, v19))
                    goto LABEL_aad308;
LABEL_aad300:
                v18 = 3;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v12)
        return v18;
    ___stack_chk_fail();
}
