/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0224c..0xa02590 (836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0224c_1 {
    char padding_0[8];
    struct st_a0224c_0 *field_8;
    struct st_a0224c_0 *field_10;
    struct st_a0224c_0 *field_18;
    char padding_20[80];
    struct st_a0224c_0 *field_70;
    char padding_78[64];
    long long field_b8;
} st_a0224c_1;

typedef struct st_a0224c_0 {
    struct st_a0224c_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_a0224c_0 *field_8;
} st_a0224c_0;


st_a0224c_0 * sub_a0224c(long long a0, unsigned long long a1, st_a0224c_1 *a2, unsigned int a3, long long a4, long long a5, long long a6)
{
    unsigned long long v7;  // x26
    long long v8;  // x21
    unsigned int v17;  // w0
    unsigned long long v18;  // 4125
    unsigned int v19;  // w8
    unsigned int v20;  // w0
    unsigned long long v21;  // 4125
    st_a0224c_0 *v22;  // x27
    st_a0224c_0 *v9;  // x19
    st_a0224c_0 *v10;  // x0
    st_a0224c_0 *v11;  // x0
    st_a0224c_0 *v12;  // x20
    long long v13;  // x0
    long long v14;  // x28
    st_a0224c_0 *v15;  // x0
    st_a0224c_0 *v16;  // w23
    long long v0;  // [bp-0xa8]
    st_a0224c_0 *v1;  // [bp-0xa0]
    st_a0224c_0 *v2;  // [bp-0x94]
    long long v3;  // [bp-0x90]
    st_a0224c_0 *v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = 0;
    if (!a2->field_8 || !a2->field_10 || !a2->field_18)
    {
        v12 = 0;
        v9 = 0;
        v8 = 101;
    }
    else if (a2->field_70)
    {
        v7 = a1;
        v8 = 524291;
        v9 = sub_a034e8();
        if (v9)
        {
            v10 = sub_9e4958();
            v9->field_0 = v10;
            v11 = sub_9e4958(v10);
            v12 = 0;
            *(st_a0224c_0 **)&v9->field_1 = v11;
            if (!v9->field_0 || !v11 || (v12 = sub_9dddcc(a2->field_b8), !v12))
                goto LABEL_a02508;
            v13 = sub_9de208(v12);
            v14 = sub_9de208(v12);
            v3 = sub_9de208(v12);
            v15 = sub_9de208(v12);
            if (!v15)
                goto LABEL_a02508;
            v16 = (st_a0224c_0 *)0;
            while (1)
            {
                v2 = v16;
                if (!sub_a02590(a2, v12, &v4, v9, a0, v7, a3, a4, a5, a6))
                    break;
                v17 = sub_9e46a8(a2->field_10);
                v18 = arm64g_calculate_condition(177, v17, 7, 0);
                if (v18 & 1)
                    v19 = v17 + 14;
                else
                    v19 = v17 + 7;
                if ((int)v7 > (int)((int)(v19) >> 3))
                {
                    v20 = sub_9e46a8(a2->field_10);
                    v21 = arm64g_calculate_condition(177, v20, 7, 0);
                    v7 = (int)((v21 & 1 ? v20 + 14 : v20 + 7)) >> 3;
                }
                if (!sub_9e4db0(a0))
                    break;
                do
                {
                    if (!sub_9e9188(v14, sub_9e46a8(a2->field_10) - 1, 0xffffffff, 0, 0, v12))
                        goto LABEL_a02508;
                } while (sub_9e4828(v14));
                sub_9e5d14(v14, 4);
                sub_9e5d14(v3, 4);
                sub_9e5d14(v15, 4);
                if (!sub_9e6404(v15, v14, a2->field_70, a2->field_10, v12) || !sub_9e6404(v15, v15, v9->field_0, a2->field_10, v12) || (v1 = v15, !sub_9e6404(v3, v14, v13, a2->field_10, v12) || !sub_9e6104(*(long long *)&v9->field_1, v1, v3, a2->field_10) || (v0 = v13, v22 = v4, !sub_9e6404(*(long long *)&v9->field_1, *(long long *)&v9->field_1, v22, a2->field_10, v12) || !sub_9e1750(v14, v14, a2->field_10, v12) || !sub_9e6404(*(long long *)&v9->field_1, *(long long *)&v9->field_1, v14, a2->field_10, v12))))
                    break;
                if (!sub_9e4828(v9->field_0) && !sub_9e4828(*(long long *)&v9->field_1))
                    goto LABEL_a02544;
                v16 = (char *)&v2->field_0 + 1;
                v13 = v0;
                v15 = v1;
                if (v16 == 10)
                {
                    v8 = 116;
                    break;
                }
            }
        }
        else
        {
            v12 = 0;
        }
    }
    else
    {
        v12 = 0;
        v9 = 0;
        v8 = 111;
    }
LABEL_a02508:
    sub_a368c8();
    sub_a369bc("crypto/dsa/dsa_ossl.c", 195, "ossl_dsa_do_sign_int");
    sub_a36abc(10, v8, 0);
    sub_a034fc(v9);
    v9 = 0;
    v22 = v4;
LABEL_a02544:
    sub_9dded4(v12);
    sub_9e4838(v22);
    return v9;
}
