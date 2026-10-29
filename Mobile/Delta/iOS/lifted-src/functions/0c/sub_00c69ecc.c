/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc69ecc..0xc6a268 (924 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c69ecc_0 {
    struct st_c69ecc_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_c69ecc_0 *field_8;
    char padding_10[40];
    struct st_c69ecc_0 *field_38;
    char padding_40[108];
    struct st_c69ecc_0 *field_ac;
    struct st_c69ecc_0 *field_b0;
    struct st_c69ecc_0 *field_b8;
    char padding_c0[112];
    struct st_c69ecc_0 *field_130;
} st_c69ecc_0;


st_c69ecc_0 * sub_c69ecc(st_c69ecc_0 *a0, st_c69ecc_0 *a1, st_c69ecc_0 *a2)
{
    st_c69ecc_0 *v2;  // x22
    st_c69ecc_0 *v3;  // x20
    st_c69ecc_0 *v12;  // w24
    unsigned long v13;  // x22
    st_c69ecc_0 *v14;  // x0
    st_c69ecc_0 *v15;  // x28
    st_c69ecc_0 *v16;  // x0
    st_c69ecc_0 *v17;  // x0
    st_c69ecc_0 *v18;  // x0
    st_c69ecc_0 *v19;  // x8
    st_c69ecc_0 *v20;  // x0
    st_c69ecc_0 *v21;  // x24
    st_c69ecc_0 *v4;  // w28
    st_c69ecc_0 *v5;  // x23
    st_c69ecc_0 *v6;  // x8
    st_c69ecc_0 *v7;  // x9
    st_c69ecc_0 *v8;  // x25
    st_c69ecc_0 *v9;  // w27
    st_c69ecc_0 *iter;  // x8
    st_c69ecc_0 *v11;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a1 && (v2 = a2, (int)sub_ad69e4(a1) >= 1)))
    {
LABEL_c6a210:
        if (a0)
        {
LABEL_c6a214:
            *(unsigned int *)&a0->padding_40[104] = 1;
            return 0;
        }
    }
    else if (a0 || v2)
    {
        if (a0 && !*(long long *)&a0->padding_10[32])
            goto LABEL_c6a214;
        if (v2)
        {
            v3 = 0;
            v4 = 0xffffffff;
        }
        else
        {
            v3 = sub_ad69f8(a1, 0);
            v2 = *(long long *)&v3->padding_c0[96];
            if (!*(long long *)&v3->padding_c0[96])
                return 1;
            v4 = (st_c69ecc_0 *)0;
        }
        if (sub_ae2ff0(v2->field_0) && sub_ae2ff0(*(long long *)&v2->field_1))
        {
            v5 = 1;
LABEL_c69f80:
            v6 = v2->field_0;
            if (v6)
            {
                v7 = (int)v6->field_0;
                if ((unsigned int)v7 != 1)
                {
                    if ((unsigned int)v7)
                        goto LABEL_c69fa4;
                    v8 = 0;
                    v9 = (st_c69ecc_0 *)1;
                }
                else
                {
                    v9 = (st_c69ecc_0 *)0;
                    v8 = *(long long *)&v6->field_1;
                }
            }
            else
            {
LABEL_c69fa4:
                v8 = 0;
                v9 = (st_c69ecc_0 *)0;
            }
            iter = *(long long *)&v2->field_1;
            if (iter)
            {
                v7 = (int)iter->field_0;
                if ((unsigned int)v7 != 1)
                {
                    if ((unsigned int)v7)
                        goto LABEL_c69fe4;
                    v11 = 0;
                    v12 = (st_c69ecc_0 *)1;
                }
                else
                {
                    v12 = (st_c69ecc_0 *)0;
                    v11 = *(long long *)&iter->field_1;
                }
            }
            else
            {
LABEL_c69fe4:
                v11 = 0;
                v12 = (st_c69ecc_0 *)0;
            }
            v13 = (char *)&v4->field_0 + 1;
            if ((int)sub_ad69e4(a1) > (int)v13)
            {
                do
                {
                    v14 = sub_ad69f8(a1, v13);
                    if (!v14)
                        goto LABEL_c6a210;
                    v3 = v14;
                    v15 = *(long long *)&v14->padding_c0[96];
                    if (v15)
                    {
                        if (sub_ae2ff0(v15->field_0) && sub_ae2ff0(*(long long *)&v15->field_1))
                        {
                            sub_ae3bc8();
                            if (v7 || !v8)
                                goto LABEL_c6a090;
                            if (!a0)
                                return 0;
                        }
                        else
                        {
                            if (!a0)
                                return 0;
                            iter = 41;
                            *(unsigned int *)&a0->padding_40[100] = v13;
                            *(unsigned int *)&a0->padding_40[104] = 41;
                            v5 = sub_ae3bac();
                            if (!(unsigned int)v5)
                                return 0;
                            sub_ae3bc8();
                            if (v7 || !v8)
                                goto LABEL_c6a090;
                        }
                        v16 = sub_ae3b90();
                        if (!(unsigned int)v16)
                            return 0;
                        v5 = v16;
                        v8 = 0;
                        v9 = (st_c69ecc_0 *)0;
                        sub_ae3bc8();
LABEL_c6a090:
                        if (v7 && (int)v7->field_0 == 1)
                        {
                            if (!v9)
                            {
                                if (sub_c69da0(*(long long *)&v7->field_1, v8))
                                {
                                    sub_ae3bc8();
                                }
                                else
                                {
                                    if (!a0)
                                        return 0;
                                    v5 = sub_ae3b90();
                                    if (!(unsigned int)v5)
                                        return 0;
                                    v9 = (st_c69ecc_0 *)0;
                                    iter = *(long long *)(*(long long *)&v3->padding_c0[96] + 8);
                                    if (iter || !v11)
                                        goto LABEL_c6a0d8;
LABEL_c6a0bc:
                                    v17 = sub_ae3b90();
                                    if (!(unsigned int)v17)
                                        return 0;
                                    v5 = v17;
                                    v11 = 0;
                                    v12 = (st_c69ecc_0 *)0;
                                    iter = *(long long *)(*(long long *)&v3->padding_c0[96] + 8);
LABEL_c6a0d8:
                                    if (!iter || !(v7 = (int)iter->field_0, (unsigned int)v7 == 1))
                                        continue;
                                    if (!v12)
                                    {
                                        if (sub_c69da0(*(long long *)&iter->field_1, v11))
                                        {
                                            iter = *(long long *)(*(long long *)&v3->padding_c0[96] + 8);
                                        }
                                        else
                                        {
                                            if (!a0)
                                                return 0;
                                            v18 = sub_ae3b90();
                                            v12 = (st_c69ecc_0 *)0;
                                            if (!(unsigned int)v18)
                                                return 0;
LABEL_c6a10c:
                                            v5 = v18;
                                            continue;
                                        }
                                    }
                                    v12 = (st_c69ecc_0 *)0;
                                    v11 = *(long long *)&iter->field_1;
                                    continue;
                                }
                            }
                            v9 = (st_c69ecc_0 *)0;
                            v8 = *(long long *)&v7->field_1;
                        }
                        iter = *(long long *)&iter->field_1;
                        if (iter || !v11)
                            goto LABEL_c6a0d8;
                        if (!a0)
                            return 0;
                        goto LABEL_c6a0bc;
                    }
                    else
                    {
                        iter = v8 | v11;
                        if (iter)
                        {
                            if (!a0)
                                return 0;
                            v18 = sub_ae3b90();
                            if (!(unsigned int)v18)
                                return 0;
                            goto LABEL_c6a10c;
                        }
                        else
                        {
                            v8 = 0;
                            v11 = 0;
                        }
                    }
                    v13 = (unsigned int)v13 + 1;
                } while ((int)v13 < (int)sub_ad69e4(a1));
            }
            else
            {
                if (!v3)
                    goto LABEL_c6a210;
            }
            v19 = *(long long *)&v3->padding_c0[96];
            if (!v19)
            {
                return v5;
            }
            if (!v19->field_0 || (int)v19->field_0->field_0)
            {
LABEL_c6a1c0:
                if (*(long long *)&v19->field_1)
                {
                    if (!*(int *)*(long long *)&v19->field_1)
                        v21 = 0;
                    else
                        v21 = v5 & 0xffffffff;
                    if (!a0)
                        return v21;
                    if (!*(int *)*(long long *)&v19->field_1)
                    {
                        *(unsigned int *)&a0->padding_40[100] = v13;
                        *(unsigned int *)&a0->padding_40[104] = 46;
                        a0->field_ac = v3;
                        goto *((void *)(*(long long *)&a0->padding_10[32]));
                    }
                    else
                    {
                        return v21;
                    }
                }
            }
            else
            {
                if (a0 && (v20 = sub_ae3b90(), (unsigned int)v20))
                {
                    v5 = v20;
                    v19 = *(long long *)&v3->padding_c0[96];
                    goto LABEL_c6a1c0;
                }
            }
        }
        else if (a0 && (*(unsigned int *)&a0->padding_40[100] = (unsigned int)v4, *(unsigned int *)&a0->padding_40[104] = 41, v5 = sub_ae3bac(), (unsigned int)v5))
        {
            goto LABEL_c69f80;
        }
    }
    return 0;
}
