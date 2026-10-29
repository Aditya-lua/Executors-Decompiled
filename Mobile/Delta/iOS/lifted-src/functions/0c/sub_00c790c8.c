/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc790c8..0xc796e8 (1568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c790c8_0 {
    char padding_0[1330];
    unsigned short field_532;
} st_c790c8_0;

typedef struct st_c790c8_11 {
    uint128_t field_0;
} st_c790c8_11;

typedef struct st_c790c8_5 {
    unsigned long long field_0;
    struct st_c790c8_2 *field_8;
} st_c790c8_5;

typedef struct st_c790c8_10 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_c790c8_11 *field_10;
} st_c790c8_10;

typedef struct st_c790c8_6 {
    struct st_c790c8_7 *field_0;
    struct st_c790c8_8 *field_8;
    struct st_c790c8_5 *field_10;
    struct st_c790c8_9 *field_18;
} st_c790c8_6;

typedef struct st_c790c8_2 {
    char padding_0[40];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[9];
    char field_49;
    char padding_4a[294];
    struct st_c790c8_1 *field_170;
    char padding_178[40];
    unsigned long long field_1a0;
} st_c790c8_2;

typedef struct st_c790c8_1 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    struct st_c790c8_0 *field_28;
    unsigned long long field_30;
} st_c790c8_1;

typedef struct st_c790c8_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_c790c8_2 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_c790c8_3;

typedef struct st_c790c8_12 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_c790c8_2 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_c790c8_12;

typedef struct st_c790c8_4 {
    char padding_0[64];
    unsigned long long field_40;
} st_c790c8_4;

typedef struct st_c790c8_9 {
    unsigned long long field_0;
} st_c790c8_9;

typedef struct st_c790c8_7 {
    struct st_c790c8_4 *field_0;
} st_c790c8_7;

typedef struct st_c790c8_13 {
    char padding_0[82];
    unsigned short field_52;
} st_c790c8_13;

typedef struct st_c790c8_8 {
    char field_0;
} st_c790c8_8;

extern long long g_efce78;
extern long long g_efd2f8;

st_c790c8_3 * sub_c790c8(st_c790c8_12 *a0, st_c790c8_6 *a1)
{
    unsigned long long v27;  // x26
    st_c790c8_2 *ptr;  // x20
    unsigned long long v37;  // 4102
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4102
    unsigned long long v40;  // x22
    unsigned long long v41;  // x23
    unsigned long long v42;  // x21
    unsigned long long v43;  // x8
    unsigned long long v44;  // x25
    unsigned long long v45;  // w10
    unsigned int v46;  // w0
    unsigned long long v29;  // x24
    unsigned long v47;  // x22
    st_c790c8_1 *v48;  // x9
    st_c790c8_2 *v49;  // x11
    unsigned long long v50;  // x12
    unsigned long long v51;  // x13
    char *v52;  // x14
    unsigned long v53;  // x15
    unsigned long long v55;  // 4115
    unsigned long long v56;  // x8
    unsigned long v30;  // cc_dep1
    st_c790c8_10 *v57;  // x8
    st_c790c8_0 *v58;  // x10
    unsigned long v59;  // x9
    st_c790c8_13 *v60;  // x12
    unsigned long long v61;  // x13
    unsigned long long v62;  // x14
    unsigned long long v63;  // x11
    st_c790c8_13 *v64;  // x12
    char v65;  // x15
    unsigned int i;  // w15
    unsigned long long v31;  // x13
    uint128_t *iter;  // x21
    unsigned long long v68;  // x1
    unsigned long long v69;  // x27
    unsigned long long v70;  // x23
    unsigned long long v71;  // x28
    unsigned long long v72;  // x23
    unsigned int v73;  // w8
    unsigned long long v74;  // w8
    unsigned long v75;  // cc_dep1
    unsigned long long v32;  // x11
    unsigned long long v76;  // 4105
    unsigned long long v77;  // 4105
    unsigned long long v78;  // w8
    unsigned long v79;  // cc_dep1
    unsigned long long v80;  // 4104
    unsigned long long v81;  // 4104
    unsigned long long v82;  // x27
    unsigned long long v83;  // x0
    unsigned long long v84;  // x8
    unsigned long long v85;  // x22
    unsigned long long v33;  // x8
    unsigned long long v86;  // x8
    unsigned long long v87;  // x22
    unsigned long long v34;  // x10
    unsigned long long v35;  // x12
    unsigned long long v36;  // 4110
    unsigned long long v0;  // [bp-0x158]
    unsigned int v1;  // [bp-0x14c]
    unsigned long v2;  // [bp-0x148]
    uint128_t v3;  // [bp-0x140], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0x138]
    uint128_t v5;  // [bp-0x130]
    unsigned long long v6;  // [bp-0x120]
    unsigned long long v7;  // [bp-0x118]
    unsigned long long v8;  // [bp-0x110]
    unsigned long long v9;  // [bp-0x108]
    uint128_t v10;  // [bp-0x100]
    char v11;  // [bp-0xe8], Other Possible Types: unsigned long long
    unsigned long long v12;  // [bp-0xe0]
    unsigned long long v13;  // [bp-0xd8]
    st_c790c8_2 *v14;  // [bp-0xd0]
    unsigned long long v15;  // [bp-0xc8]
    unsigned long long v16;  // [bp-0xc0]
    uint128_t v17;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long long v18;  // [bp-0xb0]
    uint128_t v19;  // [bp-0xa8]
    unsigned long long v20;  // [bp-0x98]
    unsigned long v21;  // [bp-0x90]
    st_c790c8_2 *v22;  // [bp-0x88]
    unsigned long v23;  // [bp-0x80]
    char v24;  // [bp-0x78]
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v27 = *(long long *)(*(long long *)a1->field_0 + 64);
    ptr = a1->field_10->field_8;
    v29 = ptr->field_49;
    v30 = v29 & 0xff;
    if ((unsigned int)v29 == 8)
        v31 = 12;
    else
        v31 = 4;
    v32 = ptr->field_30;
    v33 = ptr->field_38;
    v34 = v33 - v32 + v31;
    v35 = v27 - v34;
    if (v34 <= v27)
    {
        v36 = arm64g_calculate_condition(35, v30, 8, 0);
        v37 = arm64g_calculate_condition(132, (v36 & 1 ? v32 : 0), (v36 & 1 ? v35 : 0), 0);
        if (v37 & 1)
            goto LABEL_c79144;
LABEL_c7912c:
        v40 = 0;
        v41 = 0;
        v42 = 0;
        v43 = 59;
    }
    else
    {
        v38 = arm64g_calculate_condition(35, v30, 8, 0);
        v39 = arm64g_calculate_condition(128, (v38 & 1 ? v32 : 0), (v38 & 1 ? v35 : 0), 0);
        if (!(v39 & 1))
            goto LABEL_c7912c;
LABEL_c79144:
        v44 = 0;
        v45 = 0;
        v46 = *(char *)a1->field_8;
        v47 = a1->field_10->field_0;
        v48 = ptr->field_170;
        v3 = ptr->field_28 + v35;
        v4 = v32 - v35;
        v5 = CONCAT(&v48->padding_0[16], ptr);
        v6 = 0;
        v49 = ptr->field_28 + v32;
        v50 = ~v27 + v31 + v33;
        v51 = v27 - v31 - v33;
        v43 = 19;
        while (1)
        {
            v52 = &v49->padding_0[v51];
            v53 = *v52;
            if (v45 == 63 && 1 < (unsigned int)v53)
            {
                v43 = 6;
LABEL_c791dc:
                v40 = 0;
                v41 = 0;
                v42 = 0;
                ptr = v49;
                goto LABEL_c791ec;
            }
            v44 |= (v53 & 127) << ((char)v45 & 63);
            if (!(v53 >> 7 & 1))
                break;
            v45 += 7;
            v50 -= 1;
            v55 = arm64g_calculate_condition(50, v51, 1, 0);
            v51 += 1;
            if (!(v55 & 1))
                goto LABEL_c791dc;
        }
        v3 = CONCAT(v50, v52 + 1);
        if (!v44)
            goto LABEL_c79684;
        v56 = v44 - 1;
        if (v48->padding_20 > v56)
        {
            v57 = v48->field_18 + 112 * v56;
            if (*((char *)&v57[4].field_8 + 2) == 1)
                goto LABEL_c79274;
            goto LABEL_c7927c;
        }
        v58 = v48->field_28;
        if (v48->field_28)
        {
            v59 = v48->field_30;
            v43 = 18;
            while (1)
            {
                v60 = &v58->padding_0[1240];
                v61 = v58->field_532;
                v62 = v61 * 8;
                v63 = 0xffffffffffffffff;
                do
                {
                    if (!v62)
                        goto LABEL_c79434;
                    v64 = &v60->padding_0[8];
                    if ((unsigned long long)*(long long *)&v60->padding_0[0] <= v44)
                        v65 = v44 > (unsigned long long)*(long long *)&v60->padding_0[0];
                    else
                        v65 = 0xff;
                    v63 += 1;
                    v62 -= 8;
                    i = v65;
                    v60 = v64;
                } while (i == 1);
                v61 = v63;
                if (!i)
                    break;
LABEL_c79434:
                if (v59)
                {
                    v58 = *(long long *)&v58[1].padding_0[4 + 8 * v61];
                    v59 -= 1;
                }
                else
                {
                    v40 = 0;
                    v41 = 0;
                    v42 = 0;
                    ptr = v44;
                    goto LABEL_c791ec;
                }
            }
            v57 = &v58->padding_0[112 * v63];
            if (*((char *)&v57[4].field_8 + 2) == 1)
            {
LABEL_c79274:
                v6 = 1;
            }
LABEL_c7927c:
            if (v57->padding_0 == 1)
            {
                iter = v57->field_10;
                v68 = (unsigned long long)v57[1].padding_0;
                v1 = v46;
                v2 = *(long long *)a1->field_18;
                v69 = 0;
                if (v57[1].padding_0)
                    goto LABEL_c7929c;
                goto LABEL_c79468;
            }
            else
            {
                v68 = v57->field_8;
                if (6 > v68)
                {
                    iter = &v57->field_10;
                    v1 = v46;
                    v2 = *(long long *)a1->field_18;
                    v69 = 0;
                    if (v68)
                    {
                        v69 = 0;
LABEL_c7929c:
                        v70 = v68 * 16;
                        do
                        {
                            v72 = v70;
                            v10 = *iter;
                            sub_c4cbcc(&v11, &v3, *(int *)((unsigned long long)v5 + 72), &v10);
                            if (v11 == 46)
                            {
                                v41 = v12;
                                ptr = v13;
LABEL_c79564:
                                v82 = v69;
                                v42 = 0;
                                v40 = v41 & 0xffffffffffff0000;
                                v43 = (char)v41;
                                v71 = ptr;
                                goto LABEL_c791ec;
                            }
                            v73 = (unsigned int)v14;
                            if ((int)v73 > 70)
                            {
                                if (v73 == 71)
                                    goto LABEL_c79354;
                                if (v73 != 8199 && v73 != 110)
                                    continue;
                                sub_c4eda0(&v10, &v11);
                                sub_c4b058(&v7, v47, v29, ptr->field_1a0, &v10);
                                v74 = (unsigned int)v7;
                                v75 = v74;
                                if (v74)
                                {
                                    v71 = v71;
                                    v76 = arm64g_calculate_condition(19, v75, 0, 0);
                                    if (!(v76 & 1))
                                        goto LABEL_c792de;
                                }
                                else
                                {
                                    v71 = v9;
                                    v77 = arm64g_calculate_condition(19, v75, 0, 0);
                                    if (!(v77 & 1))
                                    {
LABEL_c792de:
                                        v69 = v8;
                                        continue;
                                    }
                                }
                                continue;
                            }
                            else if (v73 != 3)
                            {
                                if (v73 != 49)
                                    continue;
LABEL_c79354:
                                if (v69)
                                    continue;
                                sub_c4eda0(&v10, &v11);
                                sub_c4f5a8(&v7, *(unsigned long long *)&v10, *(unsigned long long *)((void*)&v10 + 8), v1, v47, ptr, v2, 16);
                                v69 = v8;
                                v71 = v9;
                                if (v7 != 1)
                                    continue;
                                ptr = v71;
                                v41 = v69;
                                goto LABEL_c79564;
                            }
                            else
                            {
                                if (v69)
                                    continue;
                                sub_c4eda0(&v10, &v11);
                                sub_c4b058(&v7, v47, v29, ptr->field_1a0, &v10);
                                v78 = (unsigned int)v7;
                                v79 = v78;
                                if (v78)
                                {
                                    v71 = v0;
                                    v80 = arm64g_calculate_condition(19, v79, 0, 0);
                                    if (!(v80 & 1))
                                        goto LABEL_c793d6;
                                    goto LABEL_c793d5;
                                }
                                else
                                {
                                    v71 = v9;
                                    v81 = arm64g_calculate_condition(19, v79, 0, 0);
                                    if (v81 & 1)
                                    {
LABEL_c793d5:
                                        v69 = 0;
                                        goto LABEL_c793d8;
                                    }
                                    else
                                    {
LABEL_c793d6:
                                        v69 = v8;
LABEL_c793d8:
                                        v0 = v71;
                                    }
                                }
                            }
                        } while ((iter += 1, v70 = v72 - 16, v72 != 16));
                    }
LABEL_c79468:
                    v82 = v69;
                    v17 = v3;
                    v19 = v5;
                    v11 = 0;
                    v12 = 8;
                    v13 = 0;
                    v14 = 0;
                    v15 = 8;
                    v16 = 0;
                    v24 = v1;
                    v20 = v6;
                    v21 = v47;
                    v22 = ptr;
                    v23 = v2;
                    sub_c4da9c(&v10, &v11, 0, 0);
                    if (*(char *)&v10 == 82)
                    {
                        v68 = v16;
                        if (2 > v68)
                            goto LABEL_c794c8;
                        goto LABEL_c7963c;
                    }
                    else
                    {
                        v41 = *(unsigned long long *)&v10;
                        ptr = *(unsigned long long *)((void*)&v10 + 8);
                        if (v11)
                            _free(v12);
                        v40 = v41 & 0xffffffffffff0000;
                        if ((unsigned long long)v14)
                            _free(v15);
                        v42 = 0;
                        v43 = (char)v41;
                    }
                }
                else
                {
                    sub_c73bb0(0);
LABEL_c7963c:
                    v83 = v15;
                    if (21 <= v68)
                        goto LABEL_c79690;
                    sub_c4f930(v83);
                    goto LABEL_c794c8;
                }
            }
        }
        else
        {
            v40 = 0;
            v41 = 0;
            v42 = 0;
            v43 = 18;
            ptr = v44;
        }
    }
    while (1)
    {
LABEL_c791ec:
        v84 = v41 & 0xff00 | v40 | v43;
        if (a0->padding_0 != 1)
        {
            *(unsigned long long *)a0->padding_0 = 1;
            a0->field_8 = v42;
            a0->field_10 = v84;
            a0->field_18 = ptr;
            a0->field_20 = v29;
            a0->field_28 = v27;
            a0->field_30 = v82;
            a0->field_38 = v71;
            return &a0->field_8;
        }
        v11 = &a0->field_8;
        v12 = v42;
        v13 = v84;
        v14 = ptr;
        v15 = v29;
        v16 = v27;
        v17 = v82;
        v18 = v71;
        sub_c4f9e8(&v11);
        sub_c73b38("reentrant initInvalid archive member sizeInvalid archive extended name offsetInvalid archive extended name lengthInvalid archive terminatorInvalid archive member headera formatting trait implementation returned an error when the underlying stream did notinternal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 29, &g_efce78);
LABEL_c79684:
        v83 = sub_c73c64(&g_efd2f8);
LABEL_c79690:
        sub_c4f82c(v83);
LABEL_c794c8:
        v42 = v12;
        v41 = v13;
        if (v11 <= v41)
        {
LABEL_c79590:
            v86 = v14;
            ptr = v15;
            v29 = v16;
            if (v86 <= v29)
                goto LABEL_c795f0;
            goto LABEL_c795a0;
        }
        else if (v41)
        {
            v85 = v41 * 48;
            v42 = sub_b718c0(v42, v11 * 48, 8, v85);
            if (!v42)
            {
                sub_c6b970(8, v85);
                break;
            }
            goto LABEL_c79590;
        }
        else
        {
            _free(v42);
            v42 = 8;
            v86 = v14;
            ptr = v15;
            v29 = v16;
            if (v29 < v86)
            {
LABEL_c795a0:
                if (v29)
                {
                    v87 = v29 * 32;
                    ptr = sub_b718c0(ptr, v86 * 32, 8, v87);
                    if (!ptr)
                    {
                        sub_c6b970(8, v87);
                        break;
                    }
                }
                else
                {
                    _free(ptr);
                    ptr = 8;
                    goto LABEL_c79604;
                }
                goto LABEL_c79604;
            }
            else
            {
LABEL_c795f0:
LABEL_c79604:
                v40 = v41 & 0x3ffffffffff0000;
                v43 = (char)v41;
            }
        }
    }
    __debugbreak();
}
