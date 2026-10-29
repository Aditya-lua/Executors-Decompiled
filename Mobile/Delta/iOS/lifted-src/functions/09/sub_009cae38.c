/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cae38..0x9cb8b8 (2688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cae38_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_9cae38_0;

extern st_9cae38_0 g_d2c768;

unsigned long long sub_9cae38(char a0, unsigned long long *a1, char a2, char idx, unsigned int a4, char a5, char a6, long long a7, unsigned int a8, long long a9, long long a10)
{
    char index;  // x23
    char v15;  // x26
    long long v24;  // x24
    char v26;  // x8
    char v27;  // x28
    char node;  // x24
    long long *v29;  // x0
    long long v30;  // x0
    char v31;  // w0
    unsigned long long v32;  // 4112
    char v33;  // x1
    long long v16;  // x1
    long long v35;  // x1
    unsigned long long v36;  // 4112
    unsigned long v37;  // cc_dep1
    unsigned long long v38;  // 4132
    char v39;  // w9
    unsigned long long v40;  // 4109
    unsigned long long v41;  // 4109
    unsigned long long v42;  // x0
    unsigned long long v43;  // 4112
    char v17;  // w8
    char v44;  // w23
    char iter;  // x23
    char v46;  // x25
    long long *i;  // x0
    char v48;  // x24
    char v50;  // x28
    char v51;  // x0
    long long v52;  // x0
    long long v53;  // x25
    long long *v18;  // x20
    unsigned long v54;  // x10
    char v55;  // w0
    unsigned long long v56;  // 4112
    char v57;  // x8
    unsigned long v58;  // x8
    char v59;  // x8
    char v60;  // x22
    char v61;  // x0
    unsigned long long v19;  // 4112
    unsigned long long v64;  // 4112
    unsigned long idx1;  // x4
    char v66;  // x8
    char v67;  // x8
    long long v68;  // x1
    long long v20;  // x1
    long long *v21;  // x0
    unsigned long long v22;  // x0
    char v23;  // x8
    unsigned int v0;  // [bp-0xc0], Other Possible Types: unsigned long, long long, unsigned long long
    char v1;  // [bp-0xbc]
    long long v2;  // [bp-0xb8], Other Possible Types: unsigned long
    unsigned long long v3;  // [bp-0xb0]
    unsigned long v4;  // [bp-0xa8]
    unsigned int v5;  // [bp-0x94]
    unsigned long v6;  // [bp-0x90]
    char v7;  // [bp-0x88], Other Possible Types: long long
    unsigned long long *v8;  // [bp-0x80]
    char v9;  // [bp-0x78], Other Possible Types: unsigned int
    char v10;  // [bp-0x71]
    char v11;  // [bp-0x70], Other Possible Types: unsigned long
    char v12;  // [bp-0x68], Other Possible Types: unsigned long long
    char *v13;  // [bp-0x10]

    v13 = &a8;
    v11 = 0;
    v12 = a2;
    if (a0 && idx)
    {
        if (a2 > 0)
        {
            index = *(long long *)(idx + 32);
            if (index && (v15 = *(long long *)(index + 24), *(long long *)(index + 24)))
            {
                if ((int)a8 < 30)
                    goto LABEL_9caf10;
                goto LABEL_9cae90;
            }
            v15 = 0;
            if (30 <= (int)a8)
            {
LABEL_9cae90:
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 222, "asn1_item_embed_d2i");
                v16 = 201;
            }
            else
            {
LABEL_9caf10:
                v17 = *(char *)idx;
                v18 = (long long *)a0;
                if (3 < v17)
                {
                    if (v17 == 4)
                    {
                        v67 = *(long long *)(index + 64);
                        if (*(long long *)(index + 64))
                        {
                            a8 = a9;
                            a9 = a10;
                        }
                        else
                        {
                            v67 = *(long long *)(index + 32);
                        }
                        goto *((void *)(v67));
                    }
                    if (v17 != 5)
                    {
                        if (v17 != 6)
                            return 0;
LABEL_9cafcc:
                        v7 = a7;
                        v8 = a1;
                        v11 = *a1;
                        v37 = a4;
                        v38 = arm64g_calculate_condition(1, a4, 1, 0);
                        if (v38 & 1)
                        {
                            v39 = 0;
                            v40 = arm64g_calculate_condition(1, v37, 1, 0);
                            if (!(v40 & 1))
                                goto LABEL_9cafe6;
LABEL_9cafe5:
                        }
                        else
                        {
                            v39 = a5;
                            v41 = arm64g_calculate_condition(1, v37, 1, 0);
                            if (v41 & 1)
                                goto LABEL_9cafe5;
LABEL_9cafe6:
                        }
                        v2 = a7;
                        v1 = a6;
                        v0 = v39;
                        v42 = sub_9cc2f8();
                        v43 = arm64g_calculate_condition(1, v42 & 0xffffffff, 1, 0);
                        if (v43 & 1)
                            return v42;
                        if (!(unsigned int)v42)
                        {
                            sub_a368c8();
                            v35 = 375;
                            goto LABEL_9cb040;
                        }
                        if (!index || !((char)(*(char *)(index + 8)) >> 2 & 1))
                        {
                            v44 = !(char)v9;
                        }
                        else
                        {
                            v44 = 0;
                            v12 = a2 - v11 + *v8;
                        }
                        if (v10)
                        {
                            if (!*v18 && !sub_9ce1e4(v18, idx, a9, a10))
                            {
                                sub_a368c8();
                                v35 = 393;
                                goto LABEL_9cb040;
                            }
                            if (v15)
                                v15();
                            v5 = v44;
                            iter = *(long long *)(idx + 16);
                            if (*(long long *)(idx + 24) < 1)
                            {
                                v50 = 0;
                                i = v18;
                                goto LABEL_9cb598;
                            }
                            v46 = 0;
                            i = v18;
                            do
                            {
                                if (*(char *)(iter + 1) & 3)
                                {
                                    v48 = sub_9cf584(*i, iter, 0);
                                    i = v18;
                                    if (v48)
                                    {
                                        sub_9cdc34(sub_9cf574(v18, v48), v48);
                                        i = v18;
                                    }
                                }
                            } while ((v46 += 1, iter += 40, *(long long *)(idx + 24) > v46));
                            iter = *(long long *)(idx + 16);
                            if (*(long long *)(idx + 24) >= 1)
                            {
                                v50 = 0;
                            }
                            else
                            {
                                v50 = 0;
LABEL_9cb598:
                                v57 = v12;
                                if ((char)v9)
                                    goto LABEL_9cb5a4;
                                goto LABEL_9cb764;
                            }
                            while (1)
                            {
                                v51 = sub_9cf584(*i, iter, 1);
                                if (!v51)
                                {
                                    v0 = "Type=";
                                    v2 = *(long long *)(idx + 48);
                                    sub_a364a0(2);
                                    return 0;
                                }
                                node = v51;
                                v52 = sub_9cf574(v18, node);
                                if (v12)
                                {
                                    v53 = v52;
                                    v54 = v11;
                                    if (v12 < 2 || *(char *)v54 || *(char *)(v54 + 1))
                                    {
                                        v6 = v54;
                                        v0 = a10;
                                        v55 = sub_9cb8b8(v53, &v11);
                                        v56 = arm64g_calculate_condition(1, v55, 1, 0);
                                        if (v56 & 1)
                                        {
                                            sub_9cdc34(v53, node);
                                        }
                                        else
                                        {
                                            if (v55)
                                            {
                                                v12 += v6 - v11;
                                            }
                                            else
                                            {
                                                v3 = ", Type=";
                                                v4 = *(long long *)(idx + 48);
                                                v0 = "Field=";
                                                v2 = *(long long *)(node + 24);
                                                sub_a364a0(4);
                                                return 0;
                                            }
                                        }
                                        v50 += 1;
                                        iter += 40;
                                        i = v18;
                                        if (*(long long *)(idx + 24) <= v50)
                                            goto LABEL_9cb598;
                                    }
                                    else
                                    {
                                        v11 = v54 + 2;
                                        if (!(char)v9)
                                        {
                                            sub_a368c8();
                                            sub_a369bc("crypto/asn1/tasn_dec.c", 427, "asn1_item_embed_d2i");
                                            sub_a36abc(13, 159, 0);
                                            v0 = "Type=";
                                            v2 = *(long long *)(idx + 48);
                                            sub_a364a0(2);
                                            return 0;
                                        }
                                        v57 = v12 + v54 - v11;
                                        v12 = v57;
                                        v9 = 0;
                                        i = v18;
LABEL_9cb764:
                                        if (!v57)
                                            v59 = 0;
                                        else
                                            v59 = v5;
                                        if (v59 & 1)
                                        {
                                            sub_a368c8();
                                            sub_a369bc("crypto/asn1/tasn_dec.c", 471, "asn1_item_embed_d2i");
                                            v16 = 148;
                                            break;
                                        }
                                        else
                                        {
                                            for (v60 = v50 & 0xffffffff; *(long long *)(idx + 24) > v60; i = v18)
                                            {
                                                v61 = sub_9cf584(*i, iter, 1);
                                                if (!v61)
                                                {
                                                    v0 = "Type=";
                                                    v2 = *(long long *)(idx + 48);
                                                    sub_a364a0(2);
                                                    return 0;
                                                }
                                                node = v61;
                                                if (!(*(char *)v61 & 1))
                                                {
                                                    sub_a368c8();
                                                    sub_a369bc("crypto/asn1/tasn_dec.c", 491, "asn1_item_embed_d2i");
                                                    sub_a36abc(13, 121, 0);
                                                    v3 = ", Type=";
                                                    v4 = *(long long *)(idx + 48);
                                                    v0 = "Field=";
                                                    v2 = *(long long *)(node + 24);
                                                    sub_a364a0(4);
                                                    return 0;
                                                }
                                                sub_9cdc34(sub_9cf574(v18, node), node);
                                                iter += 40;
                                                v60 += 1;
                                            }
                                            if (sub_9cf424())
                                            {
                                                if (0)
                                                    v15();
                                                *v8 = v11;
                                                return 1;
                                            }
                                            else
                                            {
                                                sub_a368c8();
                                                sub_a369bc("crypto/asn1/tasn_dec.c", 507, "asn1_item_embed_d2i");
                                                v16 = 100;
                                                break;
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    v57 = 0;
                                    i = v18;
                                    if (!(char)v9)
                                        goto LABEL_9cb764;
LABEL_9cb5a4:
                                    if (v57 < 2 || (v58 = v11, *(char *)v58 || *(char *)(v58 + 1)))
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/asn1/tasn_dec.c", 466, "asn1_item_embed_d2i");
                                        v16 = 137;
                                        break;
                                    }
                                    else
                                    {
                                        v11 = v58 + 2;
                                        v57 = 1;
                                        goto LABEL_9cb764;
                                    }
                                    goto LABEL_9cb764;
                                }
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/tasn_dec.c", 387, "asn1_item_embed_d2i");
                            v16 = 149;
                        }
                    }
                    else
                    {
                        v64 = arm64g_calculate_condition(1, a4, 1, 0);
                        if (!(v64 & 1))
                        {
                            sub_a368c8();
                            v20 = 252;
LABEL_9cb0cc:
                            sub_a369bc("crypto/asn1/tasn_dec.c", v20, "asn1_item_embed_d2i");
                            v16 = 230;
                        }
                        else
                        {
                            v11 = *a1;
                            *((char *)&v0 + 4) = 1;
                            *(unsigned int *)&v0 = 0;
                            if (sub_9cc2f8(0, &v9, &v10, 0, 0, &v11, a2, 0xffffffff, v0, a7))
                            {
                                if (v10)
                                {
                                    if (a6)
                                        return 0xffffffff;
                                    sub_a368c8();
                                    sub_a369bc("crypto/asn1/tasn_dec.c", 270, "asn1_item_embed_d2i");
                                    v16 = 139;
                                }
                                else
                                {
                                    idx1 = v9;
                                    if ((unsigned int)idx1 > 30)
                                        v66 = 0;
                                    else
                                        v66 = *(long long *)&(&g_d2c768.field_0)[8 * idx1];
                                    if (*(long long *)(idx + 8) & v66)
                                        return sub_9cba74(v18);
                                    if (a6)
                                        return 0xffffffff;
                                    sub_a368c8();
                                    sub_a369bc("crypto/asn1/tasn_dec.c", 279, "asn1_item_embed_d2i");
                                    v16 = 140;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                v35 = 261;
                                goto LABEL_9cb040;
                            }
                        }
                    }
                }
                else if (v17)
                {
                    if (v17 == 1)
                        goto LABEL_9cafcc;
                    if (v17 != 2)
                        return 0;
                    v19 = arm64g_calculate_condition(1, a4, 1, 0);
                    if (!(v19 & 1))
                    {
                        sub_a368c8();
                        v20 = 298;
                        goto LABEL_9cb0cc;
                    }
                    v7 = a6;
                    v8 = a1;
                    if (v15)
                        v15();
                    v21 = v18;
                    if (*v18)
                    {
                        v22 = sub_9cf274(v21, idx);
                        if (!(v22 >> 31 & 1))
                        {
                            v23 = v22 & 0xffffffff;
                            if (*(long long *)(idx + 24) > v23)
                            {
                                v24 = *(long long *)(idx + 16) + v23 * 40;
                                sub_9cdc34(sub_9cf574(v18, v24), v24);
                                sub_9cf284(v18, 0xffffffff, idx);
                                goto LABEL_9cb478;
                            }
                        }
                    }
                    if (sub_9ce1e4(v21, idx, a9, a10))
                    {
LABEL_9cb478:
                        v11 = *v8;
                        v26 = *(long long *)(idx + 24);
                        if (*(long long *)(idx + 24) >= 1)
                        {
                            v27 = 0;
                            node = *(long long *)(idx + 16);
                            v29 = v18;
                            do
                            {
                                v30 = sub_9cf574(v29, node);
                                v31 = sub_9cb8b8(v30, &v11, v12, node, 1, a7, a8 + 1, a9, a10);
                                v32 = arm64g_calculate_condition(0x11, v31, 1, 0);
                                if (v32 & 1)
                                {
                                    if (v31 >= 1)
                                    {
                                        v26 = *(long long *)(idx + 24);
                                        goto LABEL_9cb540;
                                    }
                                    else
                                    {
                                        v33 = node;
                                        sub_a368c8(sub_9cdc34(v30, v33), v33);
                                        sub_a369bc("crypto/asn1/tasn_dec.c", 338, "asn1_item_embed_d2i");
                                        sub_a36abc(13, 0x8010a, 0);
                                        if (node)
                                        {
                                            v3 = ", Type=";
                                            v4 = *(long long *)(idx + 48);
                                            v0 = "Field=";
                                            v2 = *(long long *)(node + 24);
                                            sub_a364a0(4);
                                            return 0;
                                        }
                                        v0 = "Type=";
                                        v2 = *(long long *)(idx + 48);
                                        sub_a364a0(2);
                                        return 0;
                                    }
                                }
                            } while ((v27 += 1, node += 40, v26 = *(long long *)(idx + 24), v29 = v18, v27 < *(long long *)(idx + 24)));
                        }
                        else
                        {
                            v27 = 0;
                        }
LABEL_9cb540:
                        if (v26 == v27)
                        {
                            if (v7)
                            {
                                sub_9cdc2c();
                                return 0xffffffff;
                            }
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/tasn_dec.c", 350, "asn1_item_embed_d2i");
                            v16 = 143;
                        }
                        else
                        {
                            sub_9cf284();
                            if (0)
                                v15();
                            *v8 = v11;
                            return 1;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        v35 = 314;
LABEL_9cb040:
                        sub_a369bc("crypto/asn1/tasn_dec.c", v35, "asn1_item_embed_d2i");
                        v16 = 524554;
                    }
                }
                else if (*(long long *)(idx + 16))
                {
                    v36 = arm64g_calculate_condition(0x11, a4, 1, 0);
                    if (!(v36 & 1) && !a6)
                    {
                        a8 = a10;
                        return sub_9cb8b8();
                    }
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/tasn_dec.c", 237, "asn1_item_embed_d2i");
                    v16 = 0xaa;
                }
                else
                {
                    return sub_9cba74();
                }
            }
            sub_a36abc(13, v16, 0);
            v0 = "Type=";
            v2 = *(long long *)(idx + 48);
            sub_a364a0(2);
            return 0;
        }
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 212, "asn1_item_embed_d2i");
        v68 = 224;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 208, "asn1_item_embed_d2i");
        v68 = 786690;
    }
    sub_a36abc(13, v68, 0);
    return 0;
}
