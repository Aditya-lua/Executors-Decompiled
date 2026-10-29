/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc17a74..0xc19124 (5808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c17a74_0 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_c17a74_0;

typedef struct st_c17a74_2 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
} st_c17a74_2;

typedef struct st_c17a74_1 {
    unsigned long long field_0;
    struct st_c17a74_2 *field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    char padding_38[8];
    unsigned int field_40;
} st_c17a74_1;

typedef struct st_c17a74_3 {
    unsigned long long field_0;
} st_c17a74_3;

extern unsigned long long g_efc710;
extern long long g_efc728;
extern long long g_efc848;
extern st_c17a74_3 *g_f0b210;

void sub_c17a74(unsigned long long a0, st_c17a74_1 *a1)
{
    unsigned long long v27;  // x28
    unsigned long long v28;  // x27
    unsigned long long v37;  // x30
    unsigned long long iter;  // x25
    unsigned long long *v39;  // x19
    unsigned long v40;  // x21
    unsigned long long *v41;  // x24
    unsigned long v42;  // x27
    unsigned long long i;  // x28
    unsigned long long ptr;  // x22
    unsigned long long *v45;  // x26
    unsigned long long *v46;  // x26
    unsigned long long v29;  // x26
    unsigned int v47;  // w20
    unsigned long long *v48;  // x26
    unsigned long v49;  // x10
    st_c17a74_0 *v50;  // x10
    unsigned long long j;  // x10
    unsigned long long node;  // x11
    unsigned long long v53;  // x12
    unsigned int *v54;  // x13
    unsigned long long v55;  // 4127
    long long v56;  // x27
    unsigned long long v30;  // x25
    unsigned long long v57;  // x26
    unsigned long long ptr1;  // x0
    unsigned long long *v59;  // x26
    unsigned int v60;  // w20
    unsigned long long *v61;  // x26
    unsigned long v62;  // x8
    st_c17a74_0 *v63;  // x8
    unsigned long long k;  // x8
    unsigned long long iter1;  // x9
    unsigned long long v66;  // x10
    unsigned long long v31;  // x24
    unsigned int *v67;  // x11
    unsigned long long v68;  // 4127
    long long idx;  // x19
    st_c17a74_1 *v70;  // x8
    st_c17a74_1 *v71;  // x23
    unsigned long v72;  // x24
    unsigned long v73;  // x25
    unsigned long long v74;  // 4138
    void* v75;  // x9
    unsigned long v76;  // x8
    unsigned long long v32;  // x23
    unsigned long v77;  // x0
    unsigned long long v78;  // 4164
    unsigned long long v79;  // 4112
    st_c17a74_1 *v80;  // x9
    unsigned long long v81;  // x23
    unsigned long long v82;  // x23
    unsigned long long v83;  // 4145
    uint128_t *v84;  // x8
    unsigned long long l;  // x19
    unsigned long long v33;  // x22
    unsigned long long v34;  // x21
    unsigned long long v35;  // x20
    unsigned long long v36;  // x19
    unsigned long long v0;  // [bp-0x248]
    unsigned long long v1;  // [bp-0x210]
    long long v2;  // [bp-0x1f0]
    uint128_t v3;  // [bp-0x1e0]
    uint128_t v4;  // [bp-0x1d0]
    unsigned long long v5;  // [bp-0x188]
    unsigned long long v6;  // [bp-0x180]
    unsigned long long v7;  // [bp-0x178]
    uint128_t v8;  // [bp-0x140], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0x138]
    long long v10;  // [bp-0x130], Other Possible Types: unsigned long long
    unsigned long long v11;  // [bp-0x128]
    uint128_t v12;  // [bp-0xd0]
    unsigned long long v13;  // [bp-0xc0]
    unsigned long long v14;  // [bp-0x60]
    unsigned long long v15;  // [bp-0x58]
    unsigned long long v16;  // [bp-0x50]
    unsigned long long v17;  // [bp-0x48]
    unsigned long long v18;  // [bp-0x40]
    unsigned long long v19;  // [bp-0x38]
    unsigned long long v20;  // [bp-0x30]
    unsigned long long v21;  // [bp-0x28]
    unsigned long long v22;  // [bp-0x20]
    unsigned long long v23;  // [bp-0x18]
    char *v24;  // [bp-0x10]
    unsigned long long v25;  // [bp-0x8]
    char v26;  // [bp+0x0]

    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = &v26;
    v25 = v37;
    v0 = a0;
    iter = 0;
    v39 = &a1->field_8->field_0;
    v40 = a1->field_10;
    v41 = &v39[4 * a1->field_10];
    v42 = a1->field_20;
    i = a1->field_28;
    ptr = 4;
    v45 = v39;
    while (1)
    {
        do
        {
            v46 = v45;
            if (v46 == v41)
            {
                v56 = 0;
                v57 = 0;
                goto LABEL_c17ccc;
            }
        } while ((v47 = iter, v48 = v46 + 4, iter += 1, v45 = v48, *v46 == 0x8000000000000000));
        v49 = v47;
        if (v40 > v49)
        {
            v50 = &v39[4 * v49];
            if (v50->field_0 == 0x8000000000000000)
            {
                j = 0xffffffff;
                node = 0;
                v53 = 0xffffffff;
            }
            else
            {
                j = v50->field_18;
                node = 0;
                v53 = 0xffffffff;
            }
        }
        else
        {
            j = 0xffffffff;
            node = 0;
            v53 = 0xffffffff;
        }
        do
        {
LABEL_c17b68:
            j = *(int *)(v42 + 48 * j + 32);
            node += 1;
        } while (j < i);
        while (i > v53)
        {
            v54 = v42 + 48 * v53;
            v53 = v54[9];
            v55 = arm64g_calculate_condition(1, v54[10], 1, 0);
            if (!(v55 & 1) && !(node += 1, i <= j))
                goto LABEL_c17b68;
        }
        v45 = v48;
        if (!node)
        {
            ptr1 = _malloc(16);
            if (!ptr1)
            {
                sub_c6b970(4, 16);
                v2 = 48;
                v1 = &g_efc710;
                sub_c73c94(v2);
LABEL_c18dd4:
                __debugbreak();
            }
            *(unsigned int *)ptr1 = v47;
            v57 = 4;
            ptr = ptr1;
            v56 = 1;
            v10 = 1;
            break;
        }
    }
    while (1)
    {
        v59 = v48;
        if (v59 != v41)
        {
            v60 = iter;
            v61 = v59 + 4;
            iter += 1;
            v48 = v61;
            if (*v59 == 0x8000000000000000)
                continue;
            v62 = v60;
            if (v40 > v62)
            {
                v63 = &v39[4 * v62];
                if (v63->field_0 == 0x8000000000000000)
                {
                    k = 0xffffffff;
                    iter1 = 0;
                    v66 = 0xffffffff;
                    if (i <= 0xffffffff)
                        goto LABEL_c17c3c;
                }
                else
                {
                    k = v63->field_18;
                    iter1 = 0;
                    v66 = 0xffffffff;
                    if (k >= i)
                        goto LABEL_c17c3c;
                }
            }
            else
            {
                k = 0xffffffff;
                iter1 = 0;
                v66 = 0xffffffff;
                if (i <= 0xffffffff)
                    goto LABEL_c17c3c;
            }
        }
        else
        {
LABEL_c17ccc:
            v12 = CONCAT(8, 0);
            v13 = 0;
            v71 = a1;
            v72 = v71->field_40;
            v73 = v40;
            v74 = arm64g_calculate_condition(1, v72 & 0xffffffff, 1, 0);
            if (!(v74 & 1))
            {
                if (v73 <= v72)
                {
                    sub_c73c94(v72, v73, &g_efc728);
                    goto LABEL_c18dd4;
                }
                v75 = &v39[4 * v72];
                v10 = (long long)v75[16];
                v8 = *(int128_t *)v75;
                *(unsigned long long *)&v75[16] = v13;
                *(uint128_t *)v75 = v12;
                v76 = (int)v75[24];
                v77 = (int)v75[28];
                *(unsigned long *)&v75[24] = 0xffffffffffffffff;
                v78 = arm64g_calculate_condition(1, v77 & 0xffffffff, 1, 0);
                if (!(v78 & 1))
                {
                    if (v73 > v77)
                    {
                        *(unsigned int *)&v39[3 + 4 * v77] = v76;
                    }
                    else
                    {
LABEL_c18db4:
                        sub_c73c94();
                        goto LABEL_c18dd4;
                    }
                }
                v79 = arm64g_calculate_condition(1, v76 & 0xffffffff, 1, 0);
                if (v79 & 1)
                {
LABEL_c17d54:
                    v80 = a1;
                    v80->field_40 = v76;
                    v80->field_30 = v80->field_30 + 1;
                    if ((unsigned long long)v8 != 0x8000000000000000)
                    {
                        v81 = v10 + 1;
                        while (1)
                        {
                            v82 = v81 - 1;
                            if (v81 == 1)
                                break;
                            sub_c259a4();
                            v81 = v82;
                        }
                        if ((unsigned long long)v8)
                            _free(*(unsigned long long *)((void*)&v8 + 8));
                    }
                    v73 = v72;
                    v71 = a1;
                    if (!v56)
                        goto LABEL_c17e4c;
                    goto LABEL_c17e14;
                }
                else if (v73 > v76)
                {
                    *(unsigned int *)((char *)&v39[3 + 4 * v76] + 4) = v77;
                    goto LABEL_c17d54;
                }
                else
                {
                    goto LABEL_c18db4;
                }
                goto LABEL_c18db4;
            }
            else
            {
                v71->field_30 = v71->field_30 + 1;
                v3 = v12;
                v4 = CONCAT(0xffffffffffffffff, v13);
                v83 = arm64g_calculate_condition(1, v73 & 0xffffffff, 1, 0);
                if (v83 & 1)
                {
                    sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 88, &g_efc848);
                    goto LABEL_c18dd4;
                }
                if (v73 == v71->field_0)
                {
                    sub_c737b0(v71);
                    v39 = &v71->field_8->field_0;
                }
                v84 = &v39[4 * v73];
                *v84 = v3;
                v84[1] = v4;
                v71->field_10 = v73 + 1;
                if (!v56)
                    goto LABEL_c17e4c;
LABEL_c17e14:
                l = 0;
                do
                {
                    v11 = 0;
                    v8 = 0;
                    v9 = 8;
                    v10 = 0;
                    sub_c2bc00(v71, *(int *)(ptr + l), v73, &v8);
                    l += 4;
                } while (v56 * 4 != l);
            }
LABEL_c17e4c:
            if (v57)
                _free(ptr);
            v5 = 0;
            v6 = 4;
            v7 = 0;
            g_f0b210();
        }
        do
        {
LABEL_c17c60:
            k = *(int *)(v42 + 48 * k + 32);
            iter1 += 1;
        } while (k < i);
        while (1)
        {
LABEL_c17c3c:
            if (i <= v66)
            {
                v48 = v61;
                break;
                if (!iter1)
                {
                    idx = v56;
                    if (v56 == v57)
                    {
                        sub_c736c8(&v57, idx, 1, 4, 4);
                        ptr1 = ptr;
                    }
                    *(unsigned int *)(ptr1 + idx * 4) = v60;
                    v56 = idx + 1;
                    v10 = v56;
                    v70 = a1;
                    v42 = v70->field_20;
                    i = v70->field_28;
                    v39 = &v70->field_8->field_0;
                    v40 = v70->field_10;
                    v48 = v61;
                    break;
                }
            }
            else
            {
                v67 = v42 + 48 * v66;
                v66 = v67[9];
                v68 = arm64g_calculate_condition(1, v67[10], 1, 0);
                if (!(v68 & 1) && !(iter1 += 1, i <= k))
                    goto LABEL_c17c60;
            }
        }
    }
}
