/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e2c40..0x9e2de0 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e2c40_1 {
    unsigned long long field_0;
} st_9e2c40_1;

typedef struct st_9e2c40_0 {
    struct st_9e2c40_1 *field_0;
    unsigned int field_8;
} st_9e2c40_0;


unsigned long long sub_9e2c40(long long a0, long long a1, long long a2, st_9e2c40_0 *a3, long long a4)
{
    unsigned long long v2;  // x24
    unsigned long long v3;  // x0
    unsigned long long v12;  // x14
    unsigned int v13;  // w15
    unsigned int v14;  // w16
    unsigned long long v16;  // 4121
    unsigned long long v17;  // x24
    unsigned long long v18;  // 4123
    int *v4;  // x19
    unsigned long v5;  // x9
    unsigned long long v6;  // w8
    unsigned long long *v7;  // x10
    unsigned int v8;  // w11
    unsigned long v9;  // x9
    unsigned long idx;  // x12
    unsigned long long v11;  // x13
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e46a8(a3);
    v3 = sub_a6bf4c(((long long)(v2 * 0x100000000) >> 63 & 0xfffffffc00000000 | __ROL__(v2, 2) & 0x3fffffffc & 0x3ffffffff) + 4, "crypto/bn/bn_gf2m.c", 467);
    if (!v3)
        return 0;
    v4 = v3;
    if (sub_9e5c70(a3))
    {
        v5 = a3->field_8;
        if ((int)v5 >= 1)
        {
            v6 = 0;
            v7 = a3->field_0;
            v8 = (unsigned int)v5 * 64 - 1;
            do
            {
                v9 = v5;
                idx = v9 - 1;
                v11 = v7[idx];
                if (v11)
                {
                    v12 = 0x8000000000000000;
                    v13 = 0xffffffc0;
                    v14 = v8;
                    do
                    {
                        if (v12 & v11)
                        {
                            if ((int)v2 >= v6)
                                v4[v6] = v14;
                            v6 += 1;
                        }
                        v12 >>= 1;
                        v14 -= 1;
                        v16 = arm64g_calculate_condition(33, v13, 1, 0);
                        v13 += 1;
                    } while (!(v16 & 1));
                }
            } while ((v8 -= 64, v5 = idx, (long long)v9 > 1));
            if (v6 >= 1 && *v4 > 661)
                goto LABEL_9e2d38;
        }
        else
        {
            v6 = 0;
        }
        if (v6 > (int)v2)
        {
            v17 = v6 + 1;
LABEL_9e2d64:
            sub_a368c8();
            sub_a369bc("crypto/bn/bn_gf2m.c", 472, "BN_GF2m_mod_mul");
            sub_a36abc(3, 106, 0);
        }
        else
        {
            v4[v6] = -0x1;
            v17 = v6 + 1;
            v18 = arm64g_calculate_condition(49, v6, 1, 0);
            if (!(v18 & 1))
                goto LABEL_9e2d64;
            v17 = sub_9e227c(a0, a1, a2, v4, a4);
        }
    }
    else
    {
LABEL_9e2d38:
        v17 = 0;
        goto LABEL_9e2d64;
    }
    sub_a6c2e4(v4, "crypto/bn/bn_gf2m.c", 478);
    return v17;
}
