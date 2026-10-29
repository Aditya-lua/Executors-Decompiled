/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb446e8..0xb44958 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b446e8_1 {
    char padding_0[8];
    long long field_8;
    char field_10;
    char padding_11[31];
    struct st_b446e8_0 *field_30;
    struct st_b446e8_0 *field_38;
} st_b446e8_1;

typedef struct st_b446e8_0 {
    char field_0;
    char field_1;
    unsigned int field_2;
    unsigned short field_6;
} st_b446e8_0;

extern uint128_t g_eed438;
extern uint128_t g_eed448;
extern uint128_t g_eed458;
extern uint128_t g_eed468;
extern uint128_t g_eed478;
extern char g_10002b0;

st_b446e8_0 * sub_b446e8(st_b446e8_1 *a0, st_b446e8_0 *a1, long long a2, long long a3)
{
    long long v8;  // x20
    st_b446e8_0 *v9;  // x0
    st_b446e8_0 *n;  // x24
    unsigned long iter;  // x23
    st_b446e8_0 *v20;  // w8
    st_b446e8_0 *v21;  // w9
    long long v22;  // x1
    long long v10;  // x0
    st_b446e8_0 *v11;  // w0
    st_b446e8_0 *v12;  // w23
    unsigned long v13;  // x25
    st_b446e8_0 *v14;  // w8
    unsigned long v15;  // x26
    unsigned long v16;  // x22
    st_b446e8_0 *v17;  // x21
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    uint128_t v2;  // [bp-0x90]
    uint128_t v3;  // [bp-0x80]
    uint128_t v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = a0->field_8;
    v9 = sub_a2f9e0();
    if ((unsigned int)v9)
    {
        v9 = sub_b44bf8(a0, a3);
        if ((unsigned int)v9)
        {
            if (a1)
            {
                v9 = sub_b44eac(a0, a1, a2);
                if ((unsigned int)v9)
                    goto LABEL_b44764;
            }
            else if (a0->field_30)
            {
LABEL_b44764:
                v10 = sub_954340(&a0->field_10);
                v9 = sub_a3fe04(a0->field_8, v10, 0);
                if ((unsigned int)v9)
                {
                    v11 = (st_b446e8_0 *)(unsigned int)sub_a50a7c(sub_954340(&a0->field_10));
                    if (v11 > 0)
                    {
                        v12 = v11;
                        v13 = v11;
                        v14 = (st_b446e8_0 *)(unsigned int)a0->field_38;
                        if (!a0->field_38)
                        {
                            v2 = g_eed458;
                            v3 = g_eed468;
                            v4 = g_eed478;
                            v0 = g_eed438;
                            v1 = g_eed448;
                            sub_b44bf8(a0, &v0);
                            v14 = (st_b446e8_0 *)(unsigned int)a0->field_38;
                        }
                        v15 = v13 - 1;
                        v16 = v13 * (v15 + (long long)&v14->field_6) / v13;
                        v9 = sub_a6bf4c(v16, "providers/implementations/macs/kmac_prov.c", 351);
                        if (v9)
                        {
                            v17 = v9;
                            if (0xff >= v12)
                            {
                                n = a0->field_38;
                                v17->field_0 = 1;
                                v17->field_1 = (char)v12;
                                *(unsigned int *)&(&v17->field_1)[1] = 1296769025;
                                iter = &v17->field_6;
                                *(unsigned short *)((char *)&v17->field_2 + 2) = 17217;
                                if (n)
                                {
                                    _memcpy(iter, &a0[11].padding_11[19], n);
                                    iter = &(&n->field_0)[iter];
                                }
                                v20 = (st_b446e8_0 *)(unsigned int)(struct st_b446e8_0 *)(iter - (char *)v17);
                                v21 = (st_b446e8_0 *)((unsigned int)v13 * (unsigned int)((v15 + (long long)v20) / v13));
                                if (v21 != v20)
                                    _bzero(iter, v21 - v20);
                                if (!sub_a3fe10(v8, v17, v16))
                                    goto LABEL_b44904;
                                v9 = sub_a3fe10(v8, &a0[1].padding_0[4], a0->field_30) != 0;
                            }
                            else
                            {
LABEL_b44904:
                                v9 = 0;
                            }
                            sub_a6c2e4(v17, "providers/implementations/macs/kmac_prov.c", 358);
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/macs/kmac_prov.c", 332, "kmac_init");
                        v22 = 166;
LABEL_b448f4:
                        sub_a36abc(57, v22, 0);
                        v9 = 0;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/macs/kmac_prov.c", 323, "kmac_init");
                v22 = 114;
                goto LABEL_b448f4;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return v9;
    ___stack_chk_fail();
}
