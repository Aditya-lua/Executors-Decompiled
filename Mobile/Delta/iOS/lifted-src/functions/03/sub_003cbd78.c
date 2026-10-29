/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cbd78..0x3cc13c (964 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cbd78_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[2084];
    unsigned short field_834;
    char field_836;
    char field_837;
    unsigned short field_838;
    char field_83a;
    char field_83b;
} st_3cbd78_0;

typedef struct st_3cbd78_2 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_3cbd78_2;

typedef struct st_3cbd78_4 {
    unsigned short field_0;
    char field_2;
    char field_3;
    unsigned short field_4;
    char field_6;
    char field_7;
} st_3cbd78_4;

typedef struct st_3cbd78_1 {
    char field_0;
} st_3cbd78_1;

typedef struct st_3cbd78_3 {
    unsigned long long field_0;
} st_3cbd78_3;

extern st_3cbd78_3 *g_f0b120;

long long sub_3cbd78(long long a0, st_3cbd78_0 *a1)
{
    unsigned int v9;  // w0
    unsigned int i;  // x22
    unsigned long v19;  // x26
    unsigned long v20;  // x27
    unsigned int v21;  // x20
    unsigned long long v22;  // x28
    unsigned long long v23;  // x19
    unsigned long v24;  // x13
    unsigned long v25;  // x11
    unsigned long v26;  // x12
    unsigned int v27;  // x9
    unsigned long long v28;  // x10
    unsigned int iter;  // x8
    unsigned int iter1;  // x21
    unsigned long v30;  // x8
    st_3cbd78_2 *v31;  // x9
    char v32;  // x10
    unsigned long v33;  // x8
    st_3cbd78_2 *v34;  // x9
    char v35;  // x10
    long long v36;  // x19
    unsigned int v37;  // w0
    long long v38;  // x19
    char *iter2;  // x10
    char v13;  // x12
    char *node;  // x10
    unsigned int v15;  // x8
    unsigned int v16;  // w23
    st_3cbd78_4 *v17;  // x24
    unsigned long v18;  // x25
    unsigned int v0;  // [bp-0x8c]
    int v1;  // [bp-0x88]
    unsigned int v2;  // [bp-0x84]
    unsigned int v3;  // [bp-0x80]
    int v4;  // [bp-0x7c]
    st_3cbd78_1 **v5;  // [bp-0x70], Other Possible Types: char
    st_3cbd78_1 *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = &v5;
    v5 = &v6;
    v9 = sub_3d706c();
    if (v9 > 12)
        return 0;
    i = 1 << ((char)v9 & 31);
    iter = 0;
    if (v9)
    {
        iter2 = &a1->field_83b;
        do
        {
            v13 = (char)iter | 1;
            *(unsigned short *)(iter2 - 7) = 0xffff;
            *(unsigned short *)(iter2 - 3) = 0xffff;
            *(iter2 - 5) = iter;
            *(iter2 - 4) = iter;
            iter += 2;
            *(iter2 - 1) = v13;
            *iter2 = v13;
            iter2 += 8;
        } while (i != iter);
    }
    else
    {
        node = &a1->field_837;
        do
        {
            *(unsigned short *)(node - 3) = 0xffff;
            *(node - 1) = iter;
            *node = iter;
            node += 4;
            iter += 1;
        } while (i != iter);
    }
    v15 = 0;
    v16 = 0;
    v17 = &a1->field_834;
    v18 = v9 + 1;
    v19 = (2 << ((char)v9 & 31)) - 1;
    v20 = i + 2;
    v3 = v18;
    v4 = i + 1;
    v21 = 1;
    v22 = 0xffffffff;
    v0 = 0;
    v1 = v20;
    v2 = v19;
    while (1)
    {
        v23 = v22;
        v24 = v20;
        v25 = v19;
        v26 = v18;
        v27 = v21;
        while (1)
        {
            v21 = v27;
            v18 = v26;
            v19 = v25;
            v20 = v24;
            v28 = v23;
            iter1 = v15 - v26;
            if ((int)v15 < (int)v26)
                break;
            v27 = 0;
            v22 = (unsigned int)v19 & v16;
            v16 >>= (char)v18 & 31;
            v23 = 0xffffffff;
            v15 = iter1;
            v24 = v1;
            v25 = v2;
            v26 = v3;
            if ((unsigned int)v22 != i)
            {
                if ((unsigned int)v22 == v4)
                {
LABEL_3cc090:
                    v38 = a0;
                    sub_3d44fc(v38, v0);
                    if (!sub_3d706c(v38))
                        return a1->field_8;
                    do
                    {
                        sub_3d44fc(v38);
                    } while (sub_3d706c(v38));
                    return a1->field_8;
                }
                if ((int)v20 < (int)v22)
                    g_f0b120();
                if (v21)
                    g_f0b120();
                if (!(v28 >> 31 & 1))
                {
                    if (0x2000 > (int)v20)
                    {
                        v30 = (unsigned int)v20 + 1;
                        v31 = &(&v17->field_0)[2 * (int)v20];
                        v31->field_0 = v28;
                        v32 = (&v17->field_2)[4 * (v28 & 0xffffffff)];
                        v31->field_2 = v32;
                        if ((unsigned int)v22 != (unsigned int)v30)
                            v32 = (&v17->field_2)[4 * (int)v22];
                        v31->field_3 = v32;
                        v20 = v30;
                    }
                    else
                    {
                        g_f0b120();
                    }
                }
                else
                {
                    if ((unsigned int)v22 == (unsigned int)v20)
                        g_f0b120();
                }
                sub_3d47e8(a1, (unsigned int)v22 & 0xffff);
                if (0xfff >= (int)v20 && !((unsigned int)v20 & (unsigned int)v19))
                {
                    v23 = v22;
                    goto LABEL_3cbf40;
                }
                while (1)
                {
                    if ((int)iter1 < (int)v18)
                    {
                        v21 = 0;
                        v36 = a0;
                        v37 = v0;
                        if (v37)
                            goto LABEL_3cc04c;
                        goto LABEL_3cc040;
                    }
                    v23 = (unsigned int)v19 & v16;
                    v16 >>= (char)v18 & 31;
                    iter1 -= v18;
                    if ((unsigned int)v23 != i)
                    {
                        if ((unsigned int)v23 == v4)
                            goto LABEL_3cc090;
                        if ((int)v20 < (int)v23)
                            g_f0b120();
                        if (!(v22 >> 31 & 1))
                        {
                            if (0x2000 > (int)v20)
                            {
                                v33 = (unsigned int)v20 + 1;
                                v34 = &(&v17->field_0)[2 * (int)v20];
                                v34->field_0 = v22;
                                v35 = (&v17->field_2)[4 * (v22 & 0xffffffff)];
                                v34->field_2 = v35;
                                if ((unsigned int)v23 != (unsigned int)v33)
                                    v35 = (&v17->field_2)[4 * (int)v23];
                                v34->field_3 = v35;
                                v20 = v33;
                            }
                            else
                            {
                                g_f0b120();
                            }
                        }
                        else
                        {
                            if ((unsigned int)v23 == (unsigned int)v20)
                                g_f0b120();
                        }
                        sub_3d47e8(a1, (unsigned int)v23 & 0xffff);
                        v22 = v23;
                        if (0xfff >= (int)v20 && (v22 = v23, !((unsigned int)v20 & (unsigned int)v19)))
                        {
LABEL_3cbf40:
                            v27 = 0;
                            v26 = (unsigned int)v18 + 1;
                            v25 = ~(0xffffffff << ((char)v26 & 31));
                            v15 = iter1;
                            v24 = v20;
                            break;
                        }
                    }
                    else
                    {
                        v27 = 0;
                        v23 = 0xffffffff;
                        v15 = iter1;
                        v24 = v1;
                        v25 = v2;
                        v26 = v3;
                        break;
                    }
                }
            }
        }
        iter1 = v15;
        v22 = v28;
        v36 = a0;
        v37 = v0;
        if (v37)
            goto LABEL_3cc04c;
LABEL_3cc040:
        v37 = sub_3d706c(v36);
        if (!v37)
            return a1->field_8;
LABEL_3cc04c:
        v0 = v37 - 1;
        v16 |= sub_3d706c(v36) << ((char)iter1 & 31);
        v15 = iter1 + 8;
    }
}
