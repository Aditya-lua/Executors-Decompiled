/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb60420..0xb610bc (3228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b60420_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[48];
    unsigned int field_3c;
    unsigned int field_40;
    unsigned int field_44;
    char *field_48;
    unsigned long long field_50;
    unsigned int field_58;
    char padding_5c[12];
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned int field_78;
    unsigned int field_7c;
} st_b60420_0;

typedef struct st_b60420_2 {
    char field_0;
    char field_1;
    unsigned short field_2;
} st_b60420_2;

typedef struct st_b60420_1 {
    char *field_0;
    unsigned int field_8;
    char padding_c[12];
    char *field_18;
    unsigned int field_20;
    char padding_24[12];
    unsigned long long field_30;
    struct st_b60420_0 *field_38;
} st_b60420_1;


st_b60420_1 * sub_b60420(st_b60420_1 *a0, unsigned int a1)
{
    char *v28;  // x8
    char *v29;  // x8
    char *v38;  // x9
    char *v30;  // x8
    char *v31;  // x8
    char *v32;  // x8
    char *v33;  // x8
    char *v34;  // x8
    char *v35;  // x8
    char *v36;  // x9
    char *v37;  // x8
    unsigned long v0;  // [bp-0xb8]
    unsigned long v1;  // [bp-0xb0]
    unsigned int v2;  // [bp-0xa4]
    char *v3;  // [bp-0xa0]
    char *v4;  // [bp-0xa0]
    char *v5;  // [bp-0xa0]
    unsigned int v6;  // [bp-0x94]
    unsigned int iter2;  // [bp-0x90]
    unsigned int iter1;  // [bp-0x8c]
    st_b60420_2 *v9;  // [bp-0x88]
    unsigned int v10;  // [bp-0x80]
    unsigned int v11;  // [bp-0x7c]
    unsigned long v12;  // [bp-0x78]
    unsigned long v13;  // [bp-0x70]
    unsigned int node;  // [bp-0x64]
    unsigned long iter;  // [bp-0x60], Other Possible Types: unsigned long long
    char *v16;  // [bp-0x58]
    unsigned int v17;  // [bp-0x4c]
    unsigned int v18;  // [bp-0x48]
    unsigned int v19;  // [bp-0x44]
    char *v20;  // [bp-0x40]
    unsigned long v21;  // [bp-0x38]
    char *v22;  // [bp-0x30]
    char *v23;  // [bp-0x30]
    char *v24;  // [bp-0x30]
    char *v25;  // [bp-0x28]
    char *v26;  // [bp-0x20]
    st_b60420_0 *v27;  // [bp-0x18]

    v27 = a0->field_38;
    v26 = a0->field_0;
    v25 = v26 + a0->field_8 - 5;
    v23 = a0->field_18;
    v21 = &v23[-1 * (a1 - a0->field_20 & 0xffffffff)];
    v20 = v23 + a0->field_20 - 0x101;
    v19 = v27->field_3c;
    v18 = v27->field_40;
    v17 = v27->field_44;
    v16 = v27->field_48;
    iter = v27->field_50;
    node = v27->field_58;
    v13 = v27->field_68;
    v12 = v27->field_70;
    v11 = (1 << ((char)v27->field_78 & 31)) - 1;
    v10 = (1 << ((char)v27->field_7c & 31)) - 1;
    while (1)
    {
        if (node < 15)
        {
            v28 = v26;
            v26 = v28 + 1;
            iter += *v28 << ((char)node & 63);
            node += 8;
            v29 = v26;
            v26 = v29 + 1;
            iter += *v29 << ((char)node & 63);
            node += 8;
        }
        v9 = v13 + (iter & v11) * 4;
        while (1)
        {
            iter1 = v9->field_1;
            iter >>= (char)iter1 & 63;
            node -= iter1;
            iter1 = v9->field_0;
            if (!iter1)
            {
                v22 = v23 + 1;
                *v23 = v9->field_2;
                goto LABEL_b60f38;
            }
            else
            {
                if (iter1 & 16)
                {
                    iter2 = v9->field_2;
                    iter1 &= 15;
                    if (iter1)
                    {
                        if (node < iter1)
                        {
                            v30 = v26;
                            v26 = v30 + 1;
                            iter += *v30 << ((char)node & 63);
                            node += 8;
                        }
                        iter2 += (unsigned int)iter & (1 << ((char)iter1 & 31)) - 1;
                        iter >>= (char)iter1 & 63;
                        node -= iter1;
                    }
                    if (node < 15)
                    {
                        v31 = v26;
                        v26 = v31 + 1;
                        iter += *v31 << ((char)node & 63);
                        node += 8;
                        v32 = v26;
                        v26 = v32 + 1;
                        iter += *v32 << ((char)node & 63);
                        node += 8;
                    }
                    v9 = v12 + (iter & v10) * 4;
                    while (1)
                    {
                        iter1 = v9->field_1;
                        iter >>= (char)iter1 & 63;
                        node -= iter1;
                        iter1 = v9->field_0;
                        if (iter1 & 16)
                            break;
                        if (!(iter1 & 64))
                        {
                            v9 = v12 + v9->field_2 * 4 + (iter & (1 << ((char)iter1 & 31)) - 1) * 4;
                        }
                        else
                        {
                            a0->field_30 = "invalid distance code";
                            v27->field_8 = 16209;
                            goto LABEL_b60f80;
                        }
                    }
                    v6 = v9->field_2;
                    iter1 &= 15;
                    if (node < iter1)
                    {
                        v33 = v26;
                        v26 = v33 + 1;
                        iter += *v33 << ((char)node & 63);
                        node += 8;
                        if (node < iter1)
                        {
                            v34 = v26;
                            v26 = v34 + 1;
                            iter += *v34 << ((char)node & 63);
                            node += 8;
                        }
                    }
                    v6 += (unsigned int)iter & (1 << ((char)iter1 & 31)) - 1;
                    iter >>= (char)iter1 & 63;
                    node -= iter1;
                    iter1 = (unsigned int)&v23[-1 * v21];
                    if (iter1 < v6)
                    {
                        iter1 = v6 - iter1;
                        if (v18 < iter1 && (int)v27[55].field_68)
                        {
                            a0->field_30 = "invalid distance too far back";
                            v27->field_8 = 16209;
                            goto LABEL_b60f80;
                        }
                        else
                        {
                            v3 = v16;
                            if (!v17)
                            {
                                v3 = &v3[v19 - iter1 & 0xffffffff];
                                if (iter1 < iter2)
                                {
                                    iter2 -= iter1;
                                    do
                                    {
                                        v4 = v3 + 1;
                                        v22 = v23 + 1;
                                        *v23 = *v3;
                                    } while ((iter1 -= 1, v23 = v22, v3 = v4, iter1));
                                    v3 = &v22[-1 * v6];
                                    v23 = v22;
                                }
                            }
                            else
                            {
                                if (v17 < iter1)
                                {
                                    v3 = &v3[v19 + v17 - iter1 & 0xffffffff];
                                    iter1 -= v17;
                                    if (iter1 < iter2)
                                    {
                                        iter2 -= iter1;
                                        do
                                        {
                                            v4 = v3 + 1;
                                            v23 += 1;
                                            *v23 = *v3;
                                        } while ((iter1 -= 1, v23 = v23, v3 = v4, iter1));
                                        v3 = v16;
                                        if (v17 < iter2)
                                        {
                                            iter1 = v17;
                                            iter2 -= iter1;
                                            do
                                            {
                                                v4 = v3 + 1;
                                                v22 = v23 + 1;
                                                *v23 = *v3;
                                            } while ((iter1 -= 1, v23 = v22, v3 = v4, iter1));
                                            v3 = &v22[-1 * v6];
                                            v23 = v22;
                                        }
                                    }
                                }
                                else
                                {
                                    v3 = &v3[v17 - iter1 & 0xffffffff];
                                    if (iter1 < iter2)
                                    {
                                        iter2 -= iter1;
                                        do
                                        {
                                            v4 = v3 + 1;
                                            v22 = v23 + 1;
                                            *v23 = *v3;
                                        } while ((iter1 -= 1, v23 = v22, v3 = v4, iter1));
                                        v3 = &v22[-1 * v6];
                                        v23 = v22;
                                    }
                                }
                            }
                            for (; 2 < iter2; iter2 -= 3)
                            {
                                v35 = v3;
                                v3 = v35 + 1;
                                v36 = v23;
                                v22 = v36 + 1;
                                *v36 = *v35;
                                v4 = v3 + 1;
                                v24 = v22 + 1;
                                *v22 = *v3;
                                v3 = v4 + 1;
                                v23 = v24 + 1;
                                *v24 = *v4;
                            }
                            if (iter2)
                            {
                                v37 = v3;
                                v3 = v37 + 1;
                                v38 = v23;
                                v23 = v38 + 1;
                                *v38 = *v37;
                                if (1 < iter2)
                                {
                                    v3 += 1;
                                    v22 = v23 + 1;
                                    *v23 = *v3;
                                    v23 = v22;
                                }
                            }
                            v22 = v23;
                        }
                    }
                    else
                    {
                        v3 = &v23[-1 * v6];
                        do
                        {
                            v4 = v3 + 1;
                            v22 = v23 + 1;
                            *v23 = *v3;
                            v5 = v4 + 1;
                            v24 = v22 + 1;
                            *v22 = *v4;
                            v3 = v5 + 1;
                            v23 = v24 + 1;
                            *v24 = *v5;
                            iter2 -= 3;
                        } while (iter2 > 2);
                        v22 = v23;
                        if (iter2)
                        {
                            v3 += 1;
                            v22 = v23 + 1;
                            *v23 = *v3;
                            if (1 < iter2)
                            {
                                v3 += 1;
                                v23 = v22 + 1;
                                *v22 = *v3;
                                v22 = v23;
                            }
                        }
                    }
LABEL_b60f38:
                    v23 = v22;
                    v2 = 0;
                    if (v26 < v25)
                        v2 = v20 > v23;
                    if (v2 & 1)
                        break;
LABEL_b60f80:
                    iter2 = node >> 3;
                    v26 = &v26[-1 * iter2];
                    node -= iter2 * 8;
                    iter &= (1 << ((char)node & 31)) - 1;
                    a0->field_0 = v26;
                    a0->field_18 = v23;
                    if (v26 < v25)
                        v1 = v25 - v26 + 5;
                    else
                        v1 = 5 - (v26 - v25);
                    a0->field_8 = v1;
                    if (v23 < v20)
                        v0 = v20 - v23 + 0x101;
                    else
                        v0 = 0x101 - (v23 - v20);
                    a0->field_20 = v0;
                    v27->field_50 = iter;
                    v27->field_58 = node;
                    return a0;
                }
                if (!(iter1 & 64))
                {
                    v9 = v13 + v9->field_2 * 4 + (iter & (1 << ((char)iter1 & 31)) - 1) * 4;
                }
                else if (iter1 & 32)
                {
                    v27->field_8 = 0x3f3f;
                    goto LABEL_b60f80;
                }
                else
                {
                    a0->field_30 = "invalid literal/length code";
                    v27->field_8 = 16209;
                    goto LABEL_b60f80;
                }
            }
        }
    }
}
