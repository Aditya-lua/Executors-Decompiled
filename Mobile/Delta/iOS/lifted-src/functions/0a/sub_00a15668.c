/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa15668..0xa15e58 (2032 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a15668_0 {
    struct st_a15668_0 *field_0;
    char field_1;
    char padding_2[2];
    struct st_a15668_0 *field_4;
    struct st_a15668_0 *field_8;
    struct st_a15668_0 *field_10;
    char padding_18[24];
    struct st_a15668_0 *field_30;
    unsigned long long field_38;
} st_a15668_0;


st_a15668_0 * sub_a15668(st_a15668_0 **a0)
{
    st_a15668_0 *v4;  // x8
    st_a15668_0 *v5;  // x10
    st_a15668_0 *v14;  // x25
    st_a15668_0 *v15;  // x21
    st_a15668_0 *v16;  // x24
    st_a15668_0 *v17;  // x26
    long long v18;  // x27
    unsigned int v19;  // w0
    st_a15668_0 *v20;  // x0
    st_a15668_0 *v21;  // x0
    st_a15668_0 *v22;  // x27
    st_a15668_0 *v23;  // x0
    st_a15668_0 *v6;  // x9
    st_a15668_0 *v24;  // x8
    st_a15668_0 *v25;  // x0
    long long v7;  // x23
    st_a15668_0 *v8;  // x19
    st_a15668_0 *v9;  // x20
    unsigned int v10;  // w0
    st_a15668_0 *v11;  // x26
    st_a15668_0 *v12;  // w25
    st_a15668_0 *v13;  // x22
    long long v0;  // [bp-0x68]
    long long v1;  // [bp-0x64]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0[1];
    if (!v4 || !v4->field_0 || !*(long long *)&v4->field_1)
    {
        v13 = 0;
        v14 = 0;
        v15 = 0;
        v8 = 0;
        v9 = 0;
        v16 = 0;
        v17 = 0;
        v7 = 115;
        v18 = 523;
        goto LABEL_a157b0;
    }
    v5 = a0[2];
    if (!v5 || (v6 = v5->field_0, !v6 || !*(long long *)&v6->field_1 || !*(long long *)&v5->field_1 || !*(long long *)(*(long long *)&v5->field_1 + 8)))
    {
        v13 = 0;
        v14 = 0;
        v15 = 0;
        v8 = 0;
        v9 = 0;
        v16 = 0;
        v17 = 0;
        v7 = 115;
        v18 = 536;
        goto LABEL_a157b0;
    }
    v7 = 524304;
    v8 = sub_9e4db0(*(long long *)&v6->field_1, (int)v6->field_0, 0);
    if (!v8)
    {
        v13 = 0;
        v14 = 0;
        v15 = 0;
        v9 = 0;
        v16 = 0;
        v17 = 0;
        v18 = 541;
        v7 = 524291;
        goto LABEL_a157b0;
    }
    v1 = 524291;
    v9 = sub_9e4db0(*(long long *)(*(long long *)&a0[2]->field_1 + 8), *(int *)*(long long *)&a0[2]->field_1, 0);
    if (!v9)
    {
        v13 = 0;
        v14 = 0;
        v15 = 0;
        v16 = 0;
        v17 = 0;
        v18 = 546;
        v7 = v1;
        goto LABEL_a157b0;
    }
    v10 = sub_a99eac(a0[1]->field_0);
    if (v10 != 406)
    {
        if (v10 == 407)
        {
            v11 = *(long long *)&a0[1]->field_1;
            v12 = (st_a15668_0 *)(int)v11->field_0;
            if ((int)v11->field_0 > 661)
            {
                v13 = 0;
                v14 = 0;
                v15 = 0;
                v16 = 0;
                v17 = 0;
                v7 = 143;
                v18 = 566;
                goto LABEL_a157b0;
            }
            else
            {
                v15 = sub_9e4958();
                if (v15)
                {
                    v19 = sub_a99eac(*(long long *)&v11->field_1);
                    if (v19 == 681)
                    {
                        v13 = 0;
                        v14 = 0;
                        v16 = 0;
                        v17 = 0;
                        v7 = 126;
                        v18 = 627;
                        goto LABEL_a157b0;
                    }
                    else if (v19 == 683)
                    {
                        v16 = v11->field_4;
                        if (v16)
                        {
                            if ((int)v11->field_0 > *(int *)&v16->field_1 && *(int *)&v16->field_1 > *(int *)((char *)&v16->field_0 + 4))
                            {
                                v18 = 611;
                                if (*(int *)((char *)&v16->field_0 + 4) > (int)v16->field_0 && (int)v16->field_0 >= 1)
                                {
                                    if (sub_9e55d4(v15) && sub_9e55d4(v15, (int)v16->field_0) && sub_9e55d4(v15, *(int *)((char *)&v16->field_0 + 4)) && sub_9e55d4(v15, *(int *)&v16->field_1))
                                    {
LABEL_a1596c:
                                        if (sub_9e55d4(v15, 0))
                                        {
                                            v21 = sub_a18ab4(v15, v8, v9, 0);
                                            goto LABEL_a15b48;
                                        }
                                    }
LABEL_a15a68:
                                    v22 = 0;
                                    v14 = 0;
                                    v16 = 0;
                                    v17 = 0;
                                    goto LABEL_a157e0;
                                }
                                else
                                {
                                    v7 = 132;
                                    v13 = 0;
LABEL_a15c6c:
                                    v14 = 0;
                                    v16 = 0;
                                    v17 = 0;
                                    goto LABEL_a157b0;
                                }
                            }
                            else
                            {
                                v13 = 0;
                                v14 = 0;
                                v16 = 0;
                                v17 = 0;
                                v7 = 132;
                                v18 = 611;
                                goto LABEL_a157b0;
                            }
                        }
                        else
                        {
                            v13 = 0;
                            v14 = 0;
                            v17 = 0;
                            v7 = 115;
                            v18 = 605;
                            goto LABEL_a157b0;
                        }
                    }
                    else if (v19 != 682)
                    {
                        v13 = 0;
                        v14 = 0;
                        v16 = 0;
                        v17 = 0;
                        v7 = 115;
                        v18 = 631;
                        goto LABEL_a157b0;
                    }
                    else if (v11->field_4)
                    {
                        v20 = sub_9c1a94(v11->field_4);
                        v18 = 589;
                        if (v20 < 1 || (int)v11->field_0 <= v20)
                        {
                            v7 = 137;
                            goto LABEL_a15c6c;
                        }
                        if (sub_9e55d4(v15) && sub_9e55d4(v15, v20))
                            goto LABEL_a1596c;
                        goto LABEL_a15a68;
                    }
                    else
                    {
                        v13 = 0;
                        v14 = 0;
                        v16 = 0;
                        v17 = 0;
                        v7 = 115;
                        v18 = 582;
                        goto LABEL_a157b0;
                    }
                }
                else
                {
                    v13 = 0;
                    v14 = 0;
                    v16 = 0;
                    v17 = 0;
                    v18 = 571;
                    v7 = v1;
                    goto LABEL_a157b0;
                }
            }
        }
        else
        {
            v13 = 0;
            v14 = 0;
            v15 = 0;
            v16 = 0;
            v17 = 0;
            v7 = 103;
            v18 = 666;
            goto LABEL_a157b0;
        }
    }
    if (!*(long long *)&a0[1]->field_1)
    {
        v13 = 0;
        v14 = 0;
        v15 = 0;
        v16 = 0;
        v17 = 0;
        v7 = 115;
        v18 = 643;
        goto LABEL_a157b0;
    }
    v15 = sub_9c1c08(*(long long *)&a0[1]->field_1, 0);
    if (!v15)
    {
        v13 = 0;
        v14 = 0;
        v16 = 0;
        v17 = 0;
        v7 = 524301;
        v18 = 648;
        goto LABEL_a157b0;
    }
    if (sub_9e5c94(v15) || sub_9e4828(v15))
    {
        v13 = 0;
        v14 = 0;
        v16 = 0;
        v17 = 0;
        v7 = 103;
        v18 = 653;
        goto LABEL_a157b0;
    }
    v12 = (st_a15668_0 *)(unsigned int)sub_9e46a8(v15);
    if (v12 > 661)
    {
        v13 = 0;
        v14 = 0;
        v16 = 0;
        v17 = 0;
        v7 = 143;
        v18 = 659;
        goto LABEL_a157b0;
    }
    v21 = sub_a18a2c(v15, v8, v9, 0);
LABEL_a15b48:
    v13 = v21;
    if (!v21)
    {
        v14 = 0;
        v16 = 0;
        v17 = 0;
        v18 = 671;
        goto LABEL_a157b0;
    }
    if (a0[2]->field_4)
    {
        if ((int)a0[2]->field_4->field_0)
        {
            sub_a6c2e4(*(long long *)&v13->padding_18[8], "crypto/ec/ec_asn1.c", 687);
            v23 = sub_a6bf4c((int)a0[2]->field_4->field_0, "crypto/ec/ec_asn1.c", 688);
            *(st_a15668_0 **)&v13->padding_18[8] = v23;
            if (v23)
            {
                _memcpy();
                *(long long *)&v13->padding_18[16] = (int)a0[2]->field_4->field_0;
                goto LABEL_a15bbc;
            }
            else
            {
                v14 = 0;
                v16 = 0;
                v17 = 0;
                goto LABEL_a157dc;
            }
            goto LABEL_a157dc;
        }
        else
        {
            v14 = 0;
            v16 = 0;
            v17 = 0;
            v7 = 115;
            v18 = 684;
            goto LABEL_a157b0;
        }
        goto LABEL_a157b0;
    }
LABEL_a15bbc:
    if (!a0[4] || (v24 = a0[3], !v24 || !*(long long *)&v24->field_1 || !(int)v24->field_0))
    {
        v14 = 0;
        v16 = 0;
        v17 = 0;
        v7 = 115;
        v18 = 699;
        goto LABEL_a157b0;
    }
    v16 = sub_a1a56c(v13);
    if (!v16)
    {
        v14 = 0;
        v17 = 0;
LABEL_a157dc:
        v22 = v13;
        goto LABEL_a157e0;
    }
    sub_986440(v13, *(char *)*(long long *)&a0[3]->field_1 & 254);
    if (!sub_a1dafc(v13, v16, *(long long *)&a0[3]->field_1, (int)a0[3]->field_0, 0))
    {
        v14 = 0;
        v17 = 0;
        v18 = 712;
        goto LABEL_a157b0;
    }
    v0 = 524301;
    if (!sub_9c1c08(a0[4], v8))
    {
        v14 = 0;
        v17 = 0;
        v18 = 718;
        v7 = v0;
        goto LABEL_a157b0;
    }
    if (sub_9e5c94(v8) || sub_9e4828(v8))
    {
        v14 = 0;
        v17 = 0;
        v7 = 122;
        v18 = 722;
        goto LABEL_a157b0;
    }
    if ((int)sub_9e46a8(v8) > (char *)&v12->field_0 + 1)
    {
        v14 = 0;
        v17 = 0;
        v7 = 122;
        v18 = 726;
        goto LABEL_a157b0;
    }
    if (a0[5])
    {
        if (sub_9c1c08(a0[5], v9))
            goto LABEL_a15d64;
        v14 = 0;
        v17 = 0;
        v18 = 735;
        v7 = v0;
        goto LABEL_a157b0;
    }
    sub_9e48d4(v9);
    v9 = 0;
LABEL_a15d64:
    if (!sub_a1a764(v13, v16, v8, v9))
    {
        v14 = 0;
        v17 = 0;
        v18 = 740;
        goto LABEL_a157b0;
    }
    v17 = sub_9dde10();
    if (v17)
    {
        v14 = sub_a1a70c(v13);
        if (!v14 || sub_a1abf0(v14, 0, 0) != 1 || !sub_a1a764(v14, v16, v8, 0))
        {
            v18 = 763;
            goto LABEL_a157b0;
        }
        else if (sub_a186bc(v14, v17))
        {
            v25 = sub_a186a4();
            if (v25)
            {
                v22 = v25;
                sub_a1a174(v13);
                sub_319f0(v22, 0);
                if (a0[2]->field_4 || sub_a1abf0(v22, 0, 0) == 1)
                    goto LABEL_a157ec;
LABEL_a157e0:
                sub_a1a174(v22);
                v22 = 0;
                goto LABEL_a157ec;
            }
            else
            {
                v18 = 788;
                goto LABEL_a157b0;
            }
            goto LABEL_a157b0;
        }
        else
        {
            v22 = v13;
        }
    }
    else
    {
        v14 = 0;
        v18 = 757;
        v7 = v1;
LABEL_a157b0:
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", v18, "EC_GROUP_new_from_ecparameters");
        sub_a36abc(16, v7, 0);
        goto LABEL_a157dc;
    }
LABEL_a157ec:
    sub_a1a174(v14);
    sub_9e48d4(v15);
    sub_9e48d4(v8);
    sub_9e48d4(v9);
    sub_a1a254(v16);
    sub_9dded4(v17);
    return v22;
}
