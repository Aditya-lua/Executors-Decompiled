/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9de208..0x9de514 (780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9de208_0 {
    char padding_0[20];
    unsigned int field_14;
    char field_18;
    char padding_19[23];
    char field_30;
    char padding_31[23];
    char field_48;
    char padding_49[23];
    char field_60;
    char padding_61[23];
    char field_78;
    char padding_79[23];
    char field_90;
    char padding_91[23];
    char field_a8;
    char padding_a9[23];
    char field_c0;
    char padding_c1[23];
    char field_d8;
    char padding_d9[23];
    char field_f0;
    char padding_f1[23];
    char field_108;
    char padding_109[23];
    char field_120;
    char padding_121[23];
    char field_138;
    char padding_139[23];
    char field_150;
    char padding_151[23];
    char field_168;
    char padding_169[23];
    struct st_9de208_0 *field_180;
    struct st_9de208_0 *field_188;
} st_9de208_0;


st_9de208_0 * sub_9de208(void* a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_9de208_0 *v17;  // x9
    st_9de208_0 *v18;  // x19
    st_9de208_0 **v19;  // x9
    unsigned long v20;  // d0
    unsigned int iter;  // x9
    unsigned int v22;  // w10
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w8
    void* v13;  // x20
    unsigned int v14;  // x8
    void* v15;  // x0
    st_9de208_0 *v16;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if ((int)a0[52])
    {
        return 0;
    }
    else if ((int)a0[56])
    {
        return 0;
    }
    else
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = (int)a0[24];
        if (v12 == (int)a0[28])
        {
            v13 = a0;
            v14 = sub_a6bf4c(400, "crypto/bn/bn_ctx.c", 324);
            v15 = v13;
            if (!v14)
                goto LABEL_9de334;
            v16 = (st_9de208_0 *)v14;
            sub_991a38(v16);
            if (!((unsigned int)((int)a0[60]) >> 3 & 1))
            {
                sub_991a38(&v16->field_18);
                sub_991a38(&v16->field_30);
                sub_991a38(&v16->field_48);
                sub_991a38(&v16->field_60);
                sub_991a38(&v16->field_78);
                sub_991a38(&v16->field_90);
                sub_991a38(&v16->field_a8);
                sub_991a38(&v16->field_c0);
                sub_991a38(&v16->field_d8);
                sub_991a38(&v16->field_f0);
                sub_991a38(&v16->field_108);
                sub_991a38(&v16->field_120);
                sub_991a38(&v16->field_138);
                sub_991a38(&v16->field_150);
                sub_991a38(&v16->field_168);
            }
            else
            {
                sub_9e5d14(v16, 8);
                sub_991a38(&v16->field_18);
                sub_9e5d14(&v16->field_18, 8);
                sub_991a38(&v16->field_30);
                sub_9e5d14(&v16->field_30, 8);
                sub_991a38(&v16->field_48);
                sub_9e5d14(&v16->field_48, 8);
                sub_991a38(&v16->field_60);
                sub_9e5d14(&v16->field_60, 8);
                sub_991a38(&v16->field_78);
                sub_9e5d14(&v16->field_78, 8);
                sub_991a38(&v16->field_90);
                sub_9e5d14(&v16->field_90, 8);
                sub_991a38(&v16->field_a8);
                sub_9e5d14(&v16->field_a8, 8);
                sub_991a38(&v16->field_c0);
                sub_9e5d14(&v16->field_c0, 8);
                sub_991a38(&v16->field_d8);
                sub_9e5d14(&v16->field_d8, 8);
                sub_991a38(&v16->field_f0);
                sub_9e5d14(&v16->field_f0, 8);
                sub_991a38(&v16->field_108);
                sub_9e5d14(&v16->field_108, 8);
                sub_991a38(&v16->field_120);
                sub_9e5d14(&v16->field_120, 8);
                sub_991a38(&v16->field_138);
                sub_9e5d14(&v16->field_138, 8);
                sub_991a38(&v16->field_150);
                sub_9e5d14(&v16->field_150, 8);
                sub_991a38(&v16->field_168);
                sub_9e5d14(&v16->field_168, 8);
            }
            v17 = (long long)v13[16];
            v18 = v16;
            v16->field_180 = v17;
            v16->field_188 = 0;
            v19 = &v17->field_188;
            if (!*(long long *)v13)
                v19 = v13;
            *v19 = v16;
            *(st_9de208_0 **)&v13[8] = v16;
            *(st_9de208_0 **)&v13[16] = v16;
            v20 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(__double_as_longlong((double)v13[24]), _mm_set_epi32(0, 0, 16, 1)));
            *(unsigned long *)&v13[24] = v20;
        }
        else
        {
            if (v12)
            {
                iter = (long long)a0[8];
                v22 = v12 & 15;
                if (v22)
                    goto LABEL_9de318;
                iter = *(long long *)(iter + 392);
            }
            else
            {
                iter = *(long long *)a0;
            }
            v22 = 0;
            *(unsigned long long *)&a0[8] = iter;
LABEL_9de318:
            *(unsigned int *)&a0[24] = v12 + 1;
            v15 = a0;
            if (!iter)
            {
LABEL_9de334:
                *(unsigned int *)&v15[56] = 1;
                sub_a368c8(v15);
                sub_a369bc("crypto/bn/bn_ctx.c", 231, "BN_CTX_get");
                sub_a36abc(3, 109, 0);
                return 0;
            }
            v13 = a0;
            v18 = (st_9de208_0 *)(iter + v22 * 24);
        }
        sub_9e5b4c(v18);
        v18->field_14 = v18->field_14 & 0xfffffffb;
        *(int *)&v13[48] = (int)v13[48] + 1;
        return v18;
    }
}
