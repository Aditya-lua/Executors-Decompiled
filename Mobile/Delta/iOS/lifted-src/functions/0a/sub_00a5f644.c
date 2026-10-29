/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5f644..0xa5fd3c (1784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5f644_0 {
    struct st_a5f644_0 *field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
    struct st_a5f644_0 *field_10;
    unsigned long long field_18;
    struct st_a5f644_0 *field_20;
    struct st_a5f644_0 *field_28;
    char padding_30[16];
    struct st_a5f644_0 *field_40;
    struct st_a5f644_0 *field_48;
    struct st_a5f644_0 *field_50;
    struct st_a5f644_0 *field_58;
    struct st_a5f644_0 *field_60;
    struct st_a5f644_0 *field_68;
    char padding_70[8];
    struct st_a5f644_0 *field_78;
    char padding_80[8];
    struct st_a5f644_0 *field_88;
    char padding_90[144];
    struct st_a5f644_0 *field_120;
} st_a5f644_0;

extern long long g_a5ee30;
extern long long g_a5f56c;
extern long long g_a5f588;

st_a5f644_0 * sub_a5f644(st_a5f644_0 *a0, st_a5f644_0 *a1, st_a5f644_0 *a2, unsigned long long a3)
{
    st_a5f644_0 *v4;  // x20
    long long v5;  // x0
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    st_a5f644_0 *v6;  // x22
    st_a5f644_0 *v20;  // x0
    st_a5f644_0 *v21;  // x23
    st_a5f644_0 *v22;  // w27
    st_a5f644_0 *v23;  // w8
    unsigned long long v24;  // 4102
    unsigned long v25;  // x22
    long long v7;  // x0
    st_a5f644_0 *v26;  // x22
    long long v27;  // x0
    long long v29;  // x1
    long long v31;  // x1
    long long v8;  // x0
    st_a5f644_0 *v32;  // x8
    long long v10;  // x1
    st_a5f644_0 *v11;  // x0
    unsigned long long v0;  // [bp-0x70]
    st_a5f644_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/signature.c", 580, "evp_pkey_signature_init");
        sub_a36abc(6, 0xc0102, 0);
        return 0xffffffff;
    }
    v4 = a1;
    v0 = a3;
    sub_a5d5bc();
    *(unsigned int *)&a0->field_0 = (unsigned int)a2;
    if (v4)
    {
        if (!a0->padding_80)
        {
            sub_a368c8();
            v10 = 596;
            goto LABEL_a5f98c;
        }
        v5 = sub_c4ba8(a0->field_18);
        v1 = sub_a55240(v4->field_10, v5, a0->field_8);
        if (v1)
        {
            v6 = sub_a5a1f8(a0->padding_80, *(long long *)&a0->field_1, &v1, a0->field_8);
            if (!v1)
                goto LABEL_a5f8fc;
            if (!v6)
            {
                sub_a55830(v1);
                return 0;
            }
        }
        else
        {
            v6 = 0;
LABEL_a5f8fc:
            sub_a55830(v1);
            if (!v6)
            {
                sub_a55830(v1);
                return 0;
            }
        }
        if (*(long long *)&v4->padding_90[0x88])
            (*(long long *)&v4->padding_90[0x88])();
        v7 = sub_c4ba8(a0->field_18);
        if (!sub_a4f0d8(v4->field_10, (int)v4->field_0, 0, v7))
        {
            v8 = sub_a551d4(a0->field_18, 12);
            if (!sub_a4f0d8(v4->field_10, (int)v4->field_0, 0, v8))
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/signature.c", 664, "evp_pkey_signature_init");
                sub_a36abc(6, 228, 0);
                sub_a55830(v1);
                return 0xfffffffe;
            }
        }
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        goto LABEL_a5f9d8;
    }
    sub_a36c8c();
    v11 = a0->field_18;
    if (!v11)
    {
LABEL_a5fb08:
        sub_a36cd4(v11);
        sub_a55830(v1);
        v1 = 0;
        v32 = (st_a5f644_0 *)a0->padding_70;
        if (v32)
        {
            switch (a2)
            {
            case 64:
                if (v32->field_60)
                {
                    if (v32->field_58)
                        v32->field_58();
                    return 1;
                }
                break;
            case 32:
                if (v32->field_50)
                {
                    if (v32->field_48)
                        v32->field_48();
                    return 1;
                }
                break;
            case 16:
                if (v32->field_40)
                {
                    if (*(long long *)&v32->padding_30[8])
                        (*(long long *)&v32->padding_30[8])();
                    return 1;
                }
                break;
            default:
                sub_a368c8();
                v29 = 883;
LABEL_a5fca4:
                sub_a369bc("crypto/evp/signature.c", v29, "evp_pkey_signature_init");
                v31 = 134;
LABEL_a5fcb0:
                sub_a36abc(6, v31, 0);
                sub_a5d5bc(a0);
                *(unsigned int *)&a0->field_0 = 0;
                sub_a55830(v1);
                return 0;
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/signature.c", 862, "evp_pkey_signature_init");
        sub_a36abc(6, 150, 0);
        return 0xfffffffe;
    }
    if (!a0->padding_80)
    {
        sub_a368c8(sub_a36e70());
        v10 = 681;
LABEL_a5f98c:
        sub_a369bc("crypto/evp/signature.c", v10, "evp_pkey_signature_init");
        v31 = 154;
        goto LABEL_a5fcb0;
    }
    if (*(long long *)&a0->padding_80[96])
    {
        v14 = arm64g_calculate_condition(v16 | 16, v17, v12, v13);
        v15 = arm64g_calculate_condition(20, (v14 & 1 ? *(long long *)&a0->padding_80[96] : 0x40000000), (v14 & 1 ? v11 : 0), 0);
        if (v15 & 1)
            goto LABEL_a5fd34;
    }
    else
    {
        v18 = arm64g_calculate_condition(v16 | 16, v17, v12, v13);
        v19 = arm64g_calculate_condition(16, (v18 & 1 ? 0 : 0x40000000), (v18 & 1 ? v11 : 0), 0);
        if (v19 & 1)
        {
LABEL_a5fd34:
            sub_c67fe0();
            sub_a5d5bc(a0);
            *(unsigned int *)&a0->field_0 = 0;
            sub_a55830(v1);
            return 0;
        }
    }
    v20 = sub_a551d4();
    if (v20)
    {
        v21 = v20;
        v4 = 0;
        v22 = (st_a5f644_0 *)1;
    }
    else
    {
        sub_a368c8(sub_a36e70());
        v29 = 699;
        goto LABEL_a5fca4;
    }
    while (1)
    {
        if (v4)
        {
            do
            {
                /* unsupported instruction */;
                v23 = (st_a5f644_0 *)/* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v24 = arm64g_calculate_condition(19, (unsigned long long)v23, 1, 0);
            if (!(v24 & 1))
            {
                /* unsupported instruction */;
                goto LABEL_a5f7c0;
            }
            else if (1 >= v23)
            {
LABEL_a5f7c0:
                sub_a6c2e4(*(long long *)&v4->field_1, "crypto/evp/signature.c", 464);
                sub_a78ccc(v4->field_10);
                sub_a6c2e4(v4, "crypto/evp/signature.c", 467);
            }
        }
        sub_a55830(v1);
        v1 = 0;
        if (v22 == 1)
        {
            v4 = sub_a4e6ec(*(long long *)&a0->field_1, 12, v21, a0->field_8, &g_a5ee30, &g_a5f56c, &g_a5f588);
            if (v4)
            {
                v25 = v4->field_10;
                goto LABEL_a5f860;
            }
            v26 = 0;
            if (v22 > 1)
                goto LABEL_a5f8d0;
LABEL_a5f8b8:
            v22 = (char *)&v22->field_0 + 1;
            if (v26)
                goto LABEL_a5f8d0;
        }
        else
        {
            v25 = sub_975ff4(a0->field_18);
            v11 = sub_a4ea80(v25, 12, v21, a0->field_8, &g_a5ee30, &g_a5f56c, &g_a5f588);
            if (!v11)
                goto LABEL_a5fb08;
            v4 = v11;
LABEL_a5f860:
            v27 = sub_c4ba8(a0->field_18);
            v1 = sub_a55240(v25, v27, a0->field_8);
            if (v1)
            {
                v26 = sub_a5a1f8(a0->padding_80, *(long long *)&a0->field_1, &v1, a0->field_8);
                if (v1)
                    goto LABEL_a5f8b0;
            }
            else
            {
                v26 = 0;
            }
            sub_a55830(v1);
LABEL_a5f8b0:
            if (1 >= v22)
                goto LABEL_a5f8b8;
LABEL_a5f8d0:
            if (v26)
            {
                sub_a36cd4();
LABEL_a5f9d8:
                a0->field_20 = v4;
                sub_a79f54();
                v4->field_20();
            }
            v11 = sub_a5ed84(v4);
            goto LABEL_a5fb08;
        }
    }
}
