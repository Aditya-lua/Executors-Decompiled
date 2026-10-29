/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d0f8..0xa2d41c (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d0f8_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a2d0f8_0;

typedef struct st_a2d0f8_1 {
    char padding_0[8];
    long long field_8;
    struct st_a2d0f8_0 *field_10;
} st_a2d0f8_1;


unsigned int sub_a2d0f8(unsigned int a0, st_a2d0f8_1 *a1, unsigned int a2)
{
    st_a2d0f8_0 *v2;  // x25
    long long v3;  // x0
    unsigned long v12;  // x14
    unsigned long v13;  // x15
    unsigned long v14;  // x13
    unsigned long v15;  // x16
    unsigned long long *iter;  // x17
    unsigned int v17;  // w0
    unsigned long v18;  // x0
    unsigned int v19;  // w8
    unsigned long long v20;  // 4102
    unsigned int v21;  // w8
    unsigned int idx;  // x19
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4102
    unsigned int v5;  // x0
    unsigned int v6;  // x0
    unsigned long v7;  // x9
    unsigned long v8;  // x8
    unsigned long v9;  // x10
    unsigned long v10;  // x11
    unsigned long v11;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    v3 = sub_a7a42c(a2);
    idx = sub_a6bffc(120, "crypto/encode_decode/decoder_meth.c", 42);
    if (!idx)
        return idx;
    /* unsupported instruction */;
    *(unsigned int *)(idx + 40) = 1;
    *(unsigned int *)(idx + 8) = a0;
    v5 = sub_a6895c(a1);
    *(unsigned long long *)(idx + 16) = v5;
    if (v5)
    {
        *(st_a2d0f8_1 **)(idx + 24) = a1;
        v6 = sub_aa5f84(v3, a1->field_8);
        *(unsigned long long *)(idx + 32) = v6;
        if (v6)
        {
            v7 = idx + 112;
            v8 = idx + 104;
            v9 = idx + 96;
            v10 = idx + 88;
            v11 = idx + 80;
            v12 = idx + 72;
            v13 = idx + 64;
            v14 = idx + 56;
            v15 = idx + 48;
            iter = &v2->field_8;
            while (1)
            {
                v17 = *(int *)((char *)iter - 8);
                if ((int)v17 > 4)
                {
                    if ((int)v17 > 9)
                    {
                        if (v17 == 10)
                        {
                            v18 = v9;
                            if (!*(long long *)v9)
                                goto LABEL_a2d1ac;
                        }
                        else if (v17 == 11)
                        {
                            v18 = v8;
                            if (!*(long long *)v8)
                                goto LABEL_a2d1ac;
                        }
                        else if (!(v17 != 20 || (v18 = v7, *(long long *)v7)))
                        {
                            goto LABEL_a2d1ac;
                        }
                    }
                    else
                    {
                        if (v17 == 5)
                        {
                            v18 = v11;
                            if (!*(long long *)v11)
                                goto LABEL_a2d1ac;
                        }
                        else if (!(v17 != 6 || (v18 = v10, *(long long *)v10)))
                        {
                            goto LABEL_a2d1ac;
                        }
                    }
                }
                else
                {
                    if (2 >= (int)v17)
                    {
                        if (v17 == 1)
                        {
                            v18 = v15;
                            if (!*(long long *)v15)
                            {
LABEL_a2d1ac:
                                *(unsigned long long *)v18 = *iter;
                            }
                        }
                        else if (v17 == 2)
                        {
                            v18 = v14;
                            if (!*(long long *)v14)
                                goto LABEL_a2d1ac;
                        }
                        else if (!v17)
                        {
                            break;
                        }
                    }
                    else
                    {
                        if (v17 == 3)
                        {
                            v18 = v13;
                            if (!*(long long *)v13)
                                goto LABEL_a2d1ac;
                        }
                        else if (!(v17 != 4 || (v18 = v12, *(long long *)v12)))
                        {
                            goto LABEL_a2d1ac;
                        }
                    }
                }
                iter += 2;
            }
            if (!(!*(long long *)v15 ^ !*(long long *)v14) && *(long long *)v8)
            {
                if (!a2 || sub_a78c78(a2))
                {
                    *(unsigned long long *)idx = a2;
                    return idx;
                }
                sub_a2d06c(idx);
            }
            else
            {
                do
                {
                    /* unsupported instruction */;
                    v19 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v20 = arm64g_calculate_condition(19, v19, 1, 0);
                if (!(v20 & 1))
                {
                    /* unsupported instruction */;
                }
                else if (1 < (int)v19)
                {
                    goto LABEL_a2d3c0;
                }
                sub_a6c2e4(*(long long *)(idx + 16), "crypto/encode_decode/decoder_meth.c", 70);
                sub_aa6fd0(*(long long *)(idx + 32));
                sub_a78ccc(*(long long *)idx);
                sub_a6c2e4(idx, "crypto/encode_decode/decoder_meth.c", 74);
LABEL_a2d3c0:
                sub_a368c8();
                sub_a369bc("crypto/encode_decode/decoder_meth.c", 280, "ossl_decoder_from_algorithm");
                sub_a36abc(60, 0xc0108, 0);
            }
        }
        else
        {
            do
            {
                /* unsupported instruction */;
                v21 = /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v22 = arm64g_calculate_condition(3, v21, 1, 0);
            if (v22 & 1)
                goto LABEL_a2d304;
LABEL_a2d33c:
            if (1 >= (int)v21)
                goto LABEL_a2d344;
        }
    }
    else
    {
        do
        {
            /* unsupported instruction */;
            v21 = /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v23 = arm64g_calculate_condition(19, v21, 1, 0);
        if (v23 & 1)
            goto LABEL_a2d33c;
LABEL_a2d304:
        /* unsupported instruction */;
LABEL_a2d344:
        sub_a6c2e4(*(long long *)(idx + 16), "crypto/encode_decode/decoder_meth.c", 70);
        sub_aa6fd0(*(long long *)(idx + 32));
        sub_a78ccc(*(long long *)idx);
        sub_a6c2e4(idx, "crypto/encode_decode/decoder_meth.c", 74);
    }
    return 0;
}
