/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x169350..0x16ab80 (6192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_169350_5 {
    char padding_0[2];
    char field_2;
    char padding_3[69];
    unsigned long long field_48;
    struct st_169350_4 *field_50;
    struct st_169350_6 *field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_169350_5;

typedef struct st_169350_6 {
    uint128_t field_0;
} st_169350_6;

typedef struct st_169350_15 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_169350_15;

typedef struct st_169350_16 {
    char padding_0[12];
    unsigned int field_c;
} st_169350_16;

typedef struct st_169350_12 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_169350_12;

typedef struct st_169350_4 {
    char padding_0[32];
    unsigned long long field_20;
} st_169350_4;

typedef struct st_169350_8 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[16];
    long long field_20;
} st_169350_8;

typedef struct st_169350_7 {
    struct st_169350_2 *field_0;
    char padding_8[8];
    struct st_169350_5 *field_10;
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[16];
    long long field_40;
} st_169350_7;

typedef struct st_169350_3 {
    struct st_169350_0 *field_0;
} st_169350_3;

typedef struct st_169350_13 {
    char padding_0[88];
    struct st_169350_12 *field_58;
} st_169350_13;

typedef struct st_169350_0 {
    char padding_0[64];
    uint128_t field_40;
    char field_50;
    char field_51;
    char padding_52[2];
    unsigned int field_54;
    unsigned long long field_58;
} st_169350_0;

typedef struct st_169350_1 {
    char field_0;
} st_169350_1;

typedef struct st_169350_2 {
    char padding_0[72];
    struct st_169350_3 *field_48;
    struct st_169350_3 *field_50;
    char padding_58[8];
    uint128_t field_60;
    unsigned long long field_70;
} st_169350_2;

typedef struct st_169350_11 {
    unsigned long long field_0;
} st_169350_11;

typedef struct st_169350_10 {
    char padding_0[184];
    struct st_169350_11 *field_b8;
    char padding_c0[96];
    struct st_169350_11 *field_120;
    char padding_128[80];
    struct st_169350_11 *field_178;
} st_169350_10;

extern long long g_f01360;
extern st_169350_3 *g_f0d398;
extern st_169350_10 *g_f0d3d8;

long long sub_169350(st_169350_7 *a0)
{
    st_169350_2 *v30;  // x20
    st_169350_0 **iter;  // x21
    st_169350_15 **v40;  // x24
    unsigned long long idx;  // x20
    st_169350_16 *v42;  // x8
    unsigned long long idx1;  // x21
    unsigned long long idx2;  // x22
    unsigned long v45;  // x8
    st_169350_4 *v46;  // x9
    st_169350_4 *v47;  // x8
    unsigned long v48;  // x9
    uint128_t *v49;  // x9
    st_169350_0 *v32;  // x8
    st_169350_16 *v50;  // x8
    st_169350_16 *node;  // x11
    uint128_t *v52;  // x12
    unsigned long long v53;  // x10
    uint128_t *v54;  // x12
    st_169350_13 *v56;  // x0
    st_169350_12 *v57;  // x9
    unsigned long long v33;  // w9
    st_169350_0 *v34;  // x8
    st_169350_0 **v35;  // x1
    unsigned long long index;  // x8
    unsigned long long v37;  // x23
    unsigned long long i;  // x26
    st_169350_2 *v39;  // x8
    unsigned long long j;  // [bp-0x188]
    unsigned long v1;  // [bp-0x180]
    st_169350_7 *v2;  // [bp-0x178]
    unsigned long long v3;  // [bp-0x170]
    unsigned long long v4;  // [bp-0x168]
    st_169350_15 **v5;  // [bp-0x160], Other Possible Types: unsigned long long
    unsigned int v6;  // [bp-0x154]
    unsigned long v7;  // [bp-0x150]
    st_169350_1 **v8;  // [bp-0x148], Other Possible Types: char
    st_169350_1 *v9;  // [bp-0x140]
    unsigned long long v10;  // [bp-0x134]
    char v11;  // [bp-0x130], Other Possible Types: unsigned long long
    uint128_t v12;  // [bp-0x130]
    unsigned long long v13;  // [bp-0x120]
    unsigned long v14;  // [bp-0x120]
    unsigned long long v15;  // [bp-0x110]
    unsigned long long v16;  // [bp-0x108]
    unsigned long long v17;  // [bp-0x100]
    st_169350_1 **v18;  // [bp-0xf8], Other Possible Types: unsigned long long
    st_169350_1 *v19;  // [bp-0xf0]
    st_169350_1 **v20;  // [bp-0xe8], Other Possible Types: char
    st_169350_1 *v21;  // [bp-0xe0]
    st_169350_1 **v22;  // [bp-0xd8], Other Possible Types: char
    st_169350_1 *v23;  // [bp-0xd0]
    char *v24;  // [bp-0xc0], Other Possible Types: st_169350_8 *, uint128_t, unsigned long long *, st_169350_1 *, unsigned long, unsigned long long
    unsigned long long v25;  // [bp-0xb8]
    char v26;  // [bp-0xb0]
    st_169350_1 **v27;  // [bp-0x88], Other Possible Types: char
    char *v28;  // [bp-0x10]
    char v29;  // [bp+0x0]

    v28 = &v29;
    v9 = &v8;
    v8 = &v9;
    v15 = 0;
    v16 = 0;
    v17 = 0;
    std::__1::mutex::lock(&g_f01360);
    v30 = a0->field_0;
    iter = v30->field_48;
    if (iter != v30->field_50)
    {
        while (1)
        {
            v32 = *iter;
            if (v32 && v32->field_50 == 1 && !(v33 = *(int *)&v32[1].padding_0[0], v33 <= 0))
            {
                v32->field_54 = v32->field_54 + 1;
                v24 = v32->field_58;
                v25 = v33;
                sub_61070(&v26, iter);
                sub_167570(&v15, &v24);
                sub_60b78(&v26);
                v34 = *iter;
                if (v34->field_51 != 1)
                {
                    iter += 2;
                    if (iter == v30->field_50)
                        break;
                    else
                        continue;
                }
                else
                {
                    v24 = v34->field_40;
                    *(unsigned long long *)&v34->field_40 = 0;
                    *(unsigned long long *)((char *)&v34->field_40 + 8) = 0;
                    sub_611fc(&v24);
                    v35 = iter;
                    *v35->field_50 = 0;
                    sub_1675dc(&v11, v35 + 2, v30->field_50, iter);
                }
            }
            else
            {
                sub_1675dc(&v11, iter + 2);
            }
            sub_e6bcc(&v30->field_48);
            if (iter == v30->field_50)
                break;
        }
    }
    std::__1::mutex::unlock(&g_f01360);
    index = a0->field_10;
    if (index)
        v37 = (long long)((*(long long *)(index + 88) - *(long long *)(index + 72)) * 0x10000000) >> 63 & 0xffffffff00000000 | __ROL__(*(long long *)(index + 88) - *(long long *)(index + 72), 60) & 0xf0000000ffffffff & 0xffffffff;
    else
        v37 = (long long)(a0->field_28 - a0->field_20) >> 5;
    i = v15;
    v7 = (int)v37;
    v2 = a0;
    v3 = v37;
    if (i != v16)
    {
        v1 = -v7;
        j = v37 & 0x7fffffff;
        v5 = v16;
        do
        {
            if (*(long long *)i && *(int *)(i + 8) >= 1)
            {
                v18 = 0;
                sub_8b4808();
                g_f0d3d8->field_b8();
            }
            if ((int)sub_1672d0(*(long long *)(i + 16)) >= 1 && *(long long *)i)
                g_f0d3d8->field_120();
            i += 32;
        } while (i != v16);
    }
    v11 = 0;
    v13 = 0;
    std::__1::mutex::lock(&g_f01360);
    v39 = a0->field_0;
    v12 = v39->field_60;
    v39->field_60 = v11;
    v14 = v39->field_70;
    v39->field_70 = v13;
    std::__1::mutex::unlock(&g_f01360);
    v40 = *(unsigned long long *)&v12;
    v5 = *(unsigned long long *)((void*)&v12 + 8);
    if (v40 != v5)
    {
        v1 = -v7;
        j = v37 & 0x7fffffff;
        v10 = 0;
        idx = sub_8b4808(*v40->field_0, &v10);
        v42 = *(long long *)(idx + 88);
        *(unsigned long long *)&v42->padding_0[0] = *v40->field_8;
        v42->field_c = 10;
        *(long long *)(idx + 88) = *(long long *)(idx + 88) + 16;
        idx1 = a0->field_10;
        if (idx1)
        {
            if (v37)
            {
                idx2 = a0->field_10;
                v24 = &v27;
                v27 = &v24;
                v45 = *(char *)(idx2 + 2);
                if (v45 >> 2 & 1)
                {
                    v46 = *(long long *)(idx2 + 80);
                    *(char *)(idx2 + 2) = (char)v45 & 251;
                    *(unsigned long long *)(idx2 + 120) = v46->field_20;
                    v46->field_20 = idx2;
                }
                g_f0d3d8->field_178();
            }
            else
            {
                v19 = &v18;
                v18 = &v19;
                if (idx1 != idx)
                {
                    v47 = *(long long *)(idx + 80);
                    if (*(long long *)(idx1 + 80) != v47)
                    {
                        v21 = &v20;
                        v20 = &v21;
                        if ((int)v7 >= 1)
                        {
                            v4 = ((unsigned long long)(*(long long *)(idx1 + 88) - *(long long *)(idx1 + 72)) >> 4) - v7;
                            v6 = (unsigned int)v4 + 1;
                            v23 = &v22;
                            v22 = &v23;
                            g_f0d3d8->field_178();
                        }
                    }
                    else
                    {
                        v24 = &v27;
                        v27 = &v24;
                        v48 = *(char *)(idx + 2);
                        if (v48 >> 2 & 1)
                        {
                            *(char *)(idx + 2) = (char)v48 & 251;
                            *(unsigned long long *)(idx + 120) = v47->field_20;
                            v47->field_20 = idx;
                        }
                        v49 = *(long long *)(idx1 + 88) + v1 * 16;
                        v50 = *(long long *)(idx + 88);
                        node = v50;
                        v52 = v49;
                        if ((int)v7 >= 1)
                        {
                            do
                            {
                                v53 = j;
                                v54 = v52 + 1;
                                *(uint128_t *)node = *v52;
                                node += 1;
                                j = v53 - 1;
                                v52 = v54;
                            } while (j);
                        }
                        *(uint128_t **)(idx1 + 88) = v49;
                        *(st_169350_16 **)(idx + 88) = &v50[v7];
                    }
                }
            }
        }
        else
        {
            sub_164790(idx, &a0->field_20);
        }
        (*(long long *)g_f0d398)();
    }
    else if (*(long long *)&a0->padding_30[8])
    {
        v24 = 0;
        v56 = sub_8b4808(a0->field_40, &v24);
        v57 = v56->field_58;
        v57->field_0 = *(long long *)&a0->padding_30[8];
        v57->field_c = 10;
        v56->field_58 = v56->field_58 + 1;
        (*(long long *)g_f0d398)();
    }
    else
    {
        if (a0->field_10 && (int)a0->field_18 >= 1)
            g_f0d3d8->field_120();
        v24 = &a0->field_20;
        sub_1684c4(&v24);
        operatordelete(sub_60b78(a0));
        v24 = &v12;
        sub_d7bcc(&v24);
        v24 = &v15;
        return sub_1652b8(&v24);
    }
}
