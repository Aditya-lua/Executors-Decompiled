/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1c704..0xa1ccfc (1528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1c704_0 {
    char padding_0[208];
    char *field_d0;
    char padding_d8[216];
    struct st_a1c704_1 *field_1b0;
} st_a1c704_0;

typedef struct st_a1c704_3 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
    unsigned int field_28;
} st_a1c704_3;

typedef struct st_a1c704_1 {
    struct st_a1c704_1 *field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_a1c704_1 *field_28;
} st_a1c704_1;

typedef struct st_a1c704_2 {
    struct st_a1c704_0 *field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    char padding_20[32];
    long long field_40;
} st_a1c704_2;


char * sub_a1c704(st_a1c704_2 *a0, st_a1c704_3 *a1, long long a2, char *a3, long long a4)
{
    long long v5;  // x1
    long long v6;  // x22
    long long v15;  // x27
    char *v16;  // w28
    unsigned int v17;  // w0
    int v18;  // w28
    unsigned long v19;  // x22
    unsigned int v20;  // w9
    unsigned long v21;  // x22
    unsigned int v22;  // w9
    char *v23;  // x22
    char *v7;  // x20
    char *v8;  // x21
    long long v9;  // x23
    long long v10;  // x26
    long long v11;  // x28
    char *v12;  // x0
    unsigned int v13;  // w25
    unsigned int v0;  // [bp-0x70]
    char *iter;  // [bp-0x6c]
    char *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (sub_9e4828(a0->field_10))
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_mult.c", 157, "ossl_ec_scalar_mul_ladder");
        v5 = 114;
    }
    else if (sub_9e4828(a0->field_18))
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_mult.c", 161, "ossl_ec_scalar_mul_ladder");
        v5 = 164;
    }
    else
    {
        v6 = 524291;
        sub_9de064(a4);
        v7 = sub_a1a56c(a0);
        if (v7)
        {
            v8 = sub_a1a56c(a0);
            if (!v8)
                goto LABEL_a1c85c;
            if (a3)
            {
                if (sub_a1a654(v7, a3))
                    goto LABEL_a1c8c4;
                v6 = 524304;
                v9 = 180;
            }
            else if (sub_a1a654(v7, a0->field_8))
            {
LABEL_a1c8c4:
                sub_9e5d14(*(long long *)&v7[16], 4);
                sub_9e5d14(*(long long *)&v7[24], 4);
                sub_9e5d14(*(long long *)&v7[32], 4);
                sub_9e5d14(a1->field_10, 4);
                sub_9e5d14(a1->field_18, 4);
                sub_9e5d14(a1->field_20, 4);
                sub_9e5d14(*(long long *)&v8[16], 4);
                sub_9e5d14(*(long long *)&v8[24], 4);
                sub_9e5d14(*(long long *)&v8[32], 4);
                v10 = sub_9de208(a4);
                v11 = sub_9de208(a4);
                v12 = sub_9de208(a4);
                if (!v12)
                {
                    v9 = 193;
                }
                else if (sub_9e7dc8(v10, a0->field_10, a0->field_18, a4))
                {
                    iter = (char *)(unsigned int)sub_9e46a8(v10);
                    v13 = sub_9e4290(v10);
                    v2 = v12;
                    if (!sub_9e4cdc(v2, v13 + 2) || (v0 = v13, !sub_9e4cdc(v11, v13 + 2)))
                    {
                        v9 = 212;
                    }
                    else if (sub_9e4c34(v2, a2))
                    {
                        sub_9e5d14(v2, 4);
                        if ((iter < (int)sub_9e46a8(v2) || sub_9e5c94(v2)) && !sub_9e5dac(v2, v2, v10, a4))
                        {
                            v9 = 229;
                        }
                        else if (sub_9db29c(v11, v2, v10))
                        {
                            sub_9e5d14(v11, 4);
                            if (sub_9db29c(v2, v11, v10))
                            {
                                sub_9e5980(sub_9e5748(v11, iter), v2, v11, v0 + 2);
                                v15 = sub_9e4290(a0->field_40);
                                if (!sub_9e4cdc(*(long long *)&v8[16], v15) || !sub_9e4cdc(*(long long *)&v8[24], v15) || !sub_9e4cdc(*(long long *)&v8[32], v15) || !sub_9e4cdc(a1->field_10, v15) || !sub_9e4cdc(a1->field_18, v15) || !sub_9e4cdc(a1->field_20, v15) || !sub_9e4cdc(*(long long *)&v7[16], v15) || !sub_9e4cdc(*(long long *)&v7[24], v15) || !sub_9e4cdc(*(long long *)&v7[32], v15))
                                {
                                    v9 = 260;
                                }
                                else if (!*(int *)&v7[40])
                                {
                                    v6 = 524304;
                                    if (a0->field_0->field_d0)
                                        a0->field_0->field_d0();
                                    v9 = 266;
                                }
                                else if (sub_a1ccfc(a0, a1, v8, v7, a4))
                                {
                                    v16 = (char *)1;
                                    do
                                    {
                                        iter -= 1;
                                        if (iter < 1)
                                        {
                                            v21 = v16;
                                            sub_9e5980(v21, a1->field_10, *(long long *)&v8[16], v15);
                                            sub_9e5980(v21, a1->field_18, *(long long *)&v8[24], v15);
                                            sub_9e5980(v21, a1->field_20, *(long long *)&v8[32], v15);
                                            v22 = (*(int *)&v8[40] ^ a1->field_28) & v16;
                                            a1->field_28 = v22 ^ a1->field_28;
                                            *(unsigned int *)&v8[40] = *(int *)&v8[40] ^ v22;
                                            if (a0->field_0->field_1b0)
                                                a0->field_0->field_1b0();
                                            v23 = 1;
                                            goto LABEL_a1c894;
                                        }
                                        v17 = sub_9e5748(v2, iter);
                                        v18 = v17 ^ v16;
                                        v19 = v18;
                                        sub_9e5980(v19, a1->field_10, *(long long *)&v8[16], v15);
                                        sub_9e5980(v19, a1->field_18, *(long long *)&v8[24], v15);
                                        sub_9e5980(v19, a1->field_20, *(long long *)&v8[32], v15);
                                        v20 = (*(int *)&v8[40] ^ a1->field_28) & v18;
                                        a1->field_28 = v20 ^ a1->field_28;
                                        *(unsigned int *)&v8[40] = *(int *)&v8[40] ^ v20;
                                        v6 = 162;
                                        v16 = (char *)v17;
                                    } while (sub_a1cd68(a0, a1, v8, v7, a4));
                                    v9 = 353;
                                }
                                else
                                {
                                    v6 = 0x99;
                                    v9 = 272;
                                }
                            }
                            else
                            {
                                v9 = 240;
                            }
                        }
                        else
                        {
                            v9 = 235;
                        }
                    }
                    else
                    {
                        v9 = 217;
                    }
                }
                else
                {
                    v9 = 198;
                }
            }
            else
            {
                v6 = 524304;
                v9 = 175;
            }
        }
        else
        {
            v8 = 0;
LABEL_a1c85c:
            v9 = 169;
            v6 = 524304;
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_mult.c", v9, "ossl_ec_scalar_mul_ladder");
        sub_a36abc(16, v6, 0);
        v23 = 0;
LABEL_a1c894:
        sub_a1a254(v7);
        sub_a1a298(v8);
        sub_9de17c(a4);
        return v23;
    }
    sub_a36abc(16, v5, 0);
    return 0;
}
