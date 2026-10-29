/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4cc90..0x4d684 (2548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4cc90_10 {
    char padding_0[16];
    void* field_10;
} st_4cc90_10;

typedef struct st_4cc90_4 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_4cc90_4;

typedef struct st_4cc90_3 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_4cc90_3;

typedef struct st_4cc90_2 {
    char field_0[16];
    char field_4;
    char padding_5[3];
    char field_8;
    char padding_9[7];
    uint128_t field_10;
    unsigned long long field_20;
} st_4cc90_2;

typedef struct st_4cc90_5 {
    char padding_0[56];
    struct st_4cc90_6 *field_38;
} st_4cc90_5;

typedef struct st_4cc90_8 {
    unsigned long long field_0;
} st_4cc90_8;

typedef struct st_4cc90_6 {
    void* field_0;
} st_4cc90_6;

typedef struct st_4cc90_9 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    long long field_18;
    char padding_20[16];
    struct st_4cc90_8 *field_30;
    long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    char padding_50[16];
    unsigned long long field_60;
    unsigned long long field_68;
} st_4cc90_9;

typedef struct st_4cc90_1 {
    char field_0;
} st_4cc90_1;

typedef struct st_4cc90_0 {
    char padding_0[8];
    unsigned int field_8;
} st_4cc90_0;

extern unsigned int g_f00ae0;
extern unsigned int g_f00af0;
extern unsigned int g_f00b00;
extern unsigned int g_f00b10;
extern unsigned int g_f00b20;
extern unsigned int g_f00b30;
extern unsigned int g_f00b40;
extern unsigned int g_f00b50;
extern unsigned int g_f00b60;
extern unsigned int g_f00b70;
extern unsigned int g_f00b80;
extern unsigned int g_f00b90;
extern unsigned int g_f00ba0;
extern unsigned int g_f00bb0;
extern unsigned int g_f00bc0;
extern unsigned int g_f00bd0;
extern unsigned int g_f00be0;
extern unsigned int g_f00bf0;
extern unsigned int g_f00c00;
extern unsigned int g_f00c10;
extern char g_10002b0;

unsigned long long sub_4cc90(st_4cc90_9 *a0, st_4cc90_0 *a1)
{
    unsigned long long idx;  // x19
    st_4cc90_2 *v16;  // x8
    long long v25;  // x25
    unsigned long long v26;  // x23
    unsigned long long v27;  // x26
    unsigned long long v28;  // x27
    st_4cc90_5 *v29;  // x8
    unsigned long long i;  // x22
    unsigned long long v31;  // x23
    unsigned int v32;  // s0
    unsigned long long v33;  // x22
    uint128_t v34;  // q0
    unsigned int v17;  // w8
    uint128_t v35;  // q1
    unsigned long long v36;  // x8
    unsigned long long v37;  // x22
    unsigned long long v38;  // x23
    st_4cc90_10 *v39;  // x24
    unsigned int v40;  // w8
    unsigned long long v41;  // w2
    unsigned long v42;  // cc_op
    unsigned long v43;  // cc_dep1
    unsigned long v44;  // cc_dep2
    unsigned int v18;  // w10
    unsigned long v45;  // cc_ndep
    unsigned long v46;  // 4112
    unsigned long v47;  // cc_op
    unsigned long v48;  // cc_dep1
    unsigned long long v49;  // 4112
    unsigned long v50;  // 4112
    unsigned long long index;  // x0
    unsigned long long v51;  // 4112
    unsigned long long v52;  // 4112
    unsigned long long v53;  // 4102
    unsigned long long v20;  // x9
    unsigned long long v54;  // 4112
    unsigned long long v55;  // 4102
    st_4cc90_3 *v56;  // x0
    st_4cc90_5 *v21;  // x8
    st_4cc90_9 *v57;  // x0
    st_4cc90_4 *v58;  // x8
    uint128_t v59;  // q1
    unsigned long v60;  // x22
    unsigned long long j;  // x24
    unsigned long long v62;  // x23
    unsigned long long v63;  // x24
    unsigned long long v64;  // x0
    unsigned long long v22;  // x24
    long long v65;  // x0
    long long v66;  // x0
    long long v67;  // x0
    long long v68;  // x0
    long long v69;  // x0
    st_4cc90_9 *v23;  // x22
    unsigned long long *v24;  // x22
    st_4cc90_1 **v0;  // [bp-0x100], Other Possible Types: char
    st_4cc90_1 *v1;  // [bp-0xf8]
    unsigned long v2;  // [bp-0xf0]
    uint320_t v3;  // [bp-0xe8], Other Possible Types: unsigned long
    uint320_t v4;  // [bp-0xc0]
    uint128_t v5;  // [bp-0xc0]
    st_4cc90_5 *v6;  // [bp-0x98]
    unsigned long long v7;  // [bp-0x90]
    unsigned long long v8;  // [bp-0x8c]
    unsigned long long v9;  // [bp-0x88]
    unsigned long long v10;  // [bp-0x80]
    unsigned long long v11;  // [bp-0x78]
    unsigned long v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    idx = a1;
    v12 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long long *)&v16->field_0[0] = 0;
    *(unsigned long long *)&v16->field_0[8] = 0;
    v17 = a1->field_8;
    if (a1 && v17 == g_f00ae0)
    {
        sub_4cc90(a0, *(long long *)(idx + 32));
    }
    else if (v17 == g_f00af0)
    {
        *(unsigned int *)&v16->field_0[0] = 1;
    }
    else if (idx && v17 == g_f00b00)
    {
        *(unsigned int *)&v16->field_0[0] = 2;
        v16->field_0[8] = *(char *)(idx + 28);
    }
    else if (idx && v17 == g_f00b10)
    {
        *(unsigned int *)&v16->field_0[0] = 3;
        *(double *)&v16->field_0[8] = *(double *)(idx + 32);
    }
    else if (idx && v17 == g_f00b20)
    {
        *(unsigned int *)&v16->field_0[0] = 4;
        *(long long *)&v16->field_0[8] = *(long long *)(idx + 32);
    }
    else if (idx && v17 == g_f00b30)
    {
        v18 = *(long long *)(idx + 40);
        *(long long *)&v16->field_0[8] = *(long long *)(idx + 32);
        *(unsigned int *)&v16->field_0[0] = 7;
        *(unsigned int *)&v16->field_0[4] = v18;
    }
    else
    {
        if (idx && v17 == g_f00b40)
        {
            index = sub_3a7e0(a0->field_18, idx + 32);
            if (index)
                goto LABEL_4cdfc;
            index = sub_3a7e0(a0[1].padding_10, idx + 32);
            goto LABEL_4cdf8;
        }
        if (v17 != g_f00b50 && v17 != g_f00b60)
        {
            if (v17 == g_f00b70)
                v20 = idx;
            else
                v20 = 0;
            v6 = v20;
            if (v20)
            {
                sub_4cc90(a0, *(long long *)(v20 + 32));
                v21 = idx;
                if (*(long long *)&a0->padding_20[0])
                {
                    v22 = sub_158b8(*(long long *)&a0->padding_20[0], &v6);
                    if (v22)
                    {
                        v21 = v6;
                        if (*(int *)(v22 + 8))
                        {
                            v23 = a0;
                            v24 = &v23->field_60;
                            v25 = v23->field_68 - v23->field_60;
                            v26 = 14757395258967641293 * (v25 >> 3);
                            sub_2de18(v24, v26 + *(long long *)&v21[1].padding_0[0]);
                            if (*(long long *)&v6[1].padding_0[0])
                            {
                                v27 = 0;
                                v28 = 1;
                                v29 = v6;
                                do
                                {
                                    sub_4cc90(a0, *(long long *)&v29->field_38[v27]);
                                    if (!(v7 & 0xfffffff7))
                                        v28 = 0;
                                    else
                                        sub_2dcf4(v24, &v7);
                                } while ((v27 += 1, v29 = v6, (unsigned long long)*(long long *)&v29[1].padding_0[0] > v27));
                                if (!(v28 & 1))
                                    goto LABEL_4d0b8;
                            }
                            sub_321e8(a0->field_38, *(int *)(v22 + 8), a0->field_60 + v25);
LABEL_4d0b8:
                            sub_4dd28(v24, v26);
                            goto LABEL_4d5e0;
                        }
                    }
                    else
                    {
                        v21 = v6;
                    }
                }
                if (*(long long *)&v21[1].padding_0[0])
                {
                    i = 0;
                    do
                    {
                        sub_4cc90(a0, *(long long *)&v21->field_38[i]);
                        i += 1;
                        v21 = v6;
                    } while (i < (unsigned long long)*(long long *)&v21[1].padding_0[0]);
                }
            }
            else if (idx && v17 == g_f00b80)
            {
                sub_4cc90(a0, *(long long *)(idx + 32));
                switch (v7)
                {
                case 5:
                    if (sub_1935c(idx + 40, "x") & 1 || sub_1935c(idx + 40, "X"))
                    {
                        *(unsigned int *)&v16->field_0[0] = 3;
                        v32 = v9;
                    }
                    else
                    {
                        if (sub_1935c(idx + 40, "y") & 1 || sub_1935c(idx + 40, "Y"))
                        {
                            *(unsigned int *)&v16->field_0[0] = 3;
                            v32 = *(unsigned int *)((void*)&v9 + 4);
                        }
                        else
                        {
                            if (!(sub_1935c(idx + 40, "z") & 1) && !sub_1935c(idx + 40, "Z"))
                                break;
                            *(unsigned int *)&v16->field_0[0] = 3;
                            v32 = v10;
                        }
                    }
                    *(double *)&v16->field_0[8] = __int_as_float(v32);
                    break;
                case 6:
                    if (sub_1935c(idx + 40, "x") & 1 || sub_1935c(idx + 40, "X"))
                    {
                        *(unsigned int *)&v16->field_0[0] = 3;
                        *(unsigned long long *)&v16->field_0[8] = v9;
                        break;
                    }
                    else
                    {
                        if (sub_1935c(idx + 40, "y") & 1 || sub_1935c(idx + 40, "Y"))
                        {
                            *(unsigned int *)&v16->field_0[0] = 3;
                            *(unsigned long long *)&v16->field_0[8] = v10;
                            break;
                        }
                        else
                        {
                            if (sub_1935c(idx + 40, "z") & 1 || sub_1935c(idx + 40, "Z"))
                            {
                                *(unsigned int *)&v16->field_0[0] = 3;
                                *(unsigned long long *)&v16->field_0[8] = v11;
                                break;
                            }
                        }
                    }
                case 8:
                    if (((long long)(a0->field_48 - a0->field_40) >> 3) * 14757395258967641293 > v9)
                    {
                        index = sub_4aaac(a0->field_40 + 40 * v9, idx + 40);
                        goto LABEL_4cdf8;
                    }
                    break;
                default:
                    if (a0->padding_20[8] == 1)
                    {
                        v31 = *(long long *)(idx + 32);
                        if (v31 && *(int *)(v31 + 8) == g_f00b50)
                        {
                            if (sub_1935c(v31 + 32, "math"))
                                sub_3371c(*(long long *)(idx + 40));
                            if (a0->field_30 && !*(int *)&v16->field_0[0])
                                a0->field_30();
                        }
                    }
                }
            }
            else if (idx && v17 == g_f00b90)
            {
                sub_4cc90(a0, *(long long *)(idx + 40));
                sub_4cc90(a0, *(long long *)(idx + 32));
                if (*(unsigned int *)&v4 == 8 && v7 == 7 && (v33 = *(unsigned long long *)((void*)&v4 + 8), ((long long)(a0->field_48 - a0->field_40) >> 3) * 14757395258967641293 > v33 && v8))
                {
                    v3 = sub_a38c(a0->field_38, v9);
                    index = sub_4aaac(a0->field_40 + 40 * v33, &v3);
LABEL_4cdf8:
                    if (index)
                    {
LABEL_4cdfc:
                        v34 = *(int128_t *)(index + 8);
                        v35 = *(int128_t *)(index + 24);
                        *(long long *)&v16->field_10 = *(long long *)(index + 40);
                        *(uint128_t *)v16->field_0 = v34;
                        *(uint128_t *)&v16->field_4 = v35;
                    }
                }
            }
            else
            {
                if (idx && v17 == g_f00ba0)
                    (*(long long *)*(long long *)*(long long *)(idx + 144))();
                if (idx && v17 == g_f00bb0)
                {
                    v5 = _INSERT(*(uint128_t *)&v4, 0, 0);
                    sub_3b8e8(&v7, &v5, 0);
                    v36 = *(long long *)(idx + 40);
                    if (v36)
                    {
                        v37 = 0;
                        v38 = 0;
                        do
                        {
                            v39 = *(long long *)(idx + 32) + v37;
                            sub_4cc90(a0, v39->field_10);
                            if (!*(long long *)&v39->padding_0[8])
                                continue;
                            sub_4cc90(a0, *(long long *)&v39->padding_0[8]);
                            v40 = *(unsigned int *)&v5 & 0xfffffff7;
                            v41 = *(unsigned int *)((void*)&v3 + 4);
                            if (*(unsigned int *)&v3 == 7)
                            {
                                v46 = arm64g_calculate_condition(v42, v43, v44, v45);
                                v47 = 3;
                                v48 = (v46 & 1 ? v40 : 0x40000000);
                                v49 = arm64g_calculate_condition(19, v48, 0, 0);
                                if (!(v49 & 1))
                                    goto LABEL_4d15a;
                                goto LABEL_4d159;
                            }
                            else
                            {
                                v50 = arm64g_calculate_condition(v42, v43, v44, v45);
                                v47 = 0;
                                v48 = (v50 & 1 ? v40 : 0x40000000);
                                v51 = arm64g_calculate_condition(16, v48, 0, 0);
                                if (v51 & 1)
                                {
LABEL_4d159:
                                    v52 = arm64g_calculate_condition(v47 | 16, v48, 0, 0);
                                    v53 = arm64g_calculate_condition(3, (v52 & 1 ? v41 : 0x40000000), 0, 0);
                                    if (v53 & 1)
                                        continue;
                                    goto LABEL_4d160;
                                }
                                else
                                {
LABEL_4d15a:
                                    v54 = arm64g_calculate_condition(v47 | 16, v48, 0, 0);
                                    v55 = arm64g_calculate_condition(0, (v54 & 1 ? v41 : 0x40000000), 0, 0);
                                    if (v55 & 1)
                                        continue;
LABEL_4d160:
                                    v2 = sub_a38c(a0->field_38, *(unsigned long long *)((void*)&v3 + 8));
                                    sub_4c7c4(&v7, &v2);
                                    v56 = sub_4d954(&v7, &v2);
                                    *(unsigned long long *)((char *)&v56->field_18 + 8) = *(unsigned long long *)((void*)&v4 + 32);
                                    *(uint128_t *)((char *)&v56->field_8 + 8) = *(uint128_t *)((void*)&v4 + 16);
                                    *(uint128_t *)(v56->padding_0)[1] = v5;
                                }
                            }
                        } while ((v38 += 1, v36 = *(long long *)(idx + 40), v37 += 24, v36 > v38));
                    }
                    if (v10 == v36)
                    {
                        *(unsigned int *)&v16->field_0[0] = 8;
                        v57 = a0;
                        *(unsigned long long *)&v16->field_0[8] = 14757395258967641293 * ((long long)(v57->field_48 - v57->field_40) >> 3);
                        sub_4abf4(&v57->field_40, &v7);
                    }
                    sub_a070(&v7);
                }
                else if (idx && v17 == g_f00bc0)
                {
                    sub_4cc90(a0, *(long long *)(idx + 32));
                    if (v7)
                        sub_4a930(v16, *(int *)(idx + 28), &v7);
                }
                else if (idx && v17 == g_f00bd0)
                {
                    sub_4cc90(a0, *(long long *)(idx + 32));
                    sub_4cc90(a0, *(long long *)(idx + 40));
                    if (v7)
                        sub_4b284(v16, *(int *)(idx + 28), &v7, &v4, a0->field_38);
                }
                else if (idx && v17 == g_f00be0)
                {
                    sub_4cc90(a0, *(long long *)(idx + 32));
                }
                else if (idx && v17 == g_f00bf0)
                {
                    sub_4cc90(a0, *(long long *)(idx + 32));
                    sub_4cc90(a0, *(long long *)(idx + 48));
                    sub_4cc90(a0, *(long long *)(idx + 64));
                    if (v7)
                    {
                        v58 = &v3;
                        if (sub_3a988(&v7))
                            v58 = &v4;
                        v59 = v58->field_10;
                        *(uint128_t *)v16->field_0 = v58->field_0;
                        *(uint128_t *)&v16->field_4 = v59;
                        *(unsigned long long *)&v16->field_10 = v58->field_20;
                    }
                }
                else if (idx && v17 == g_f00c00)
                {
                    if (*(long long *)(idx + 56))
                    {
                        v60 = *(long long *)(idx + 48);
                        j = *(long long *)(idx + 56) * 8;
                        v62 = 1;
                        do
                        {
                            v63 = j;
                            sub_4cc90(a0, *(long long *)v60);
                            v62 = v7 == 7 & (unsigned int)v62;
                            v60 += 8;
                            j = v63 - 8;
                        } while (j);
                        if (!(v62 & 1))
                            goto LABEL_4d5e0;
                    }
                    sub_4b078(v16, idx, a0->field_8, a0->field_38);
                }
                else if (idx && v17 == g_f00c10)
                {
                    sub_4cc90(a0, *(long long *)(idx + 32));
                }
            }
        }
    }
LABEL_4d5e0:
    v64 = sub_4ab28(a0, a0->field_8, idx, v16);
    if (*(long long *)&g_10002b0 == v12)
        return v64;
    v65 = ___stack_chk_fail();
    sub_a070(&v7);
    v66 = __Unwind_Resume(v65);
    sub_a070(&v7);
    v67 = __Unwind_Resume(v66);
    sub_a070(&v7);
    v68 = __Unwind_Resume(v67);
    sub_a070(&v7);
    v69 = __Unwind_Resume(v68);
    __Unwind_Resume(v69);
}
