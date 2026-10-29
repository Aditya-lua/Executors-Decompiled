/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb93860..0xb93d28 (1224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b93860_0 {
    unsigned long long field_0;
    char padding_8[64];
    long long field_48;
    unsigned long long field_50;
} st_b93860_0;

extern unsigned long long g_b7a7fc;
extern unsigned long long g_b7e018;
extern unsigned long long g_b86e9c;
extern unsigned long long g_bef1c8;
extern long long g_cb8a25;
extern long long g_cb8c08;
extern long long g_cb8c42;
extern long long g_ef7f70;
extern char g_ef8038;
extern long long g_efb3e0;

unsigned long long sub_b93860(st_b93860_0 **a0, unsigned long long *a1)
{
    st_b93860_0 *v21;  // x27
    unsigned long long i;  // x21
    unsigned long v31;  // x25
    unsigned long v32;  // x26
    long long v33;  // x22
    unsigned long long ptr;  // x0
    unsigned long long v35;  // x23
    unsigned long long node;  // x20
    long long v37;  // x0
    long long v38;  // x0
    unsigned long long v39;  // x2
    uint128_t *iter;  // x24
    unsigned long long v23;  // x19
    unsigned long long v41;  // x21
    uint128_t *v42;  // x8
    unsigned long long v43;  // x22
    unsigned long long iter1;  // x25
    unsigned long long j;  // x28
    unsigned long long v46;  // x19
    unsigned long long v47;  // x21
    unsigned long long v48;  // x24
    unsigned long long ptr1;  // x26
    unsigned long long n;  // x27
    unsigned long v24;  // cc_dep1
    st_b93860_0 *v51;  // x10
    unsigned long long v52;  // x0
    unsigned long long v53;  // x22
    unsigned long long v54;  // x22
    unsigned long long v25;  // x24
    unsigned long long v26;  // x1
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    st_b93860_0 *v0;  // [bp-0x128]
    unsigned long v1;  // [bp-0x120]
    unsigned long v2;  // [bp-0x118]
    uint128_t v3;  // [bp-0x110]
    unsigned long long v4;  // [bp-0x100]
    uint128_t v5;  // [bp-0xf0], Other Possible Types: char, unsigned long
    unsigned long long v6;  // [bp-0xe8]
    uint128_t v7;  // [bp-0xe0], Other Possible Types: unsigned long
    unsigned long long v8;  // [bp-0xd8]
    char *v9;  // [bp-0xd0], Other Possible Types: uint128_t
    unsigned long long v10;  // [bp-0xc8]
    uint128_t v11;  // [bp-0xc0]
    uint128_t v12;  // [bp-0xb0]
    unsigned long long v13;  // [bp-0xa0]
    unsigned long long v14;  // [bp-0x98]
    uint128_t v15;  // [bp-0x90], Other Possible Types: unsigned long long *, unsigned long long
    unsigned long long v16;  // [bp-0x88]
    unsigned long long v17;  // [bp-0x80]
    char v18;  // [bp-0x69]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v21 = *a0;
    i = v21->field_50;
    v23 = v21->field_0;
    v24 = v23;
    if (v23 == 12)
        v25 = i;
    else
        v25 = i + 1;
    v26 = v25 * 64;
    if (v25 <= 0x3ffffffffffffff)
    {
        v27 = arm64g_calculate_condition(4, v24, 12, 0);
        v28 = arm64g_calculate_condition(148, (v27 & 1 ? v26 : 0x20000000), (v27 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v28 & 1))
            goto LABEL_b938b0;
    }
    else
    {
        v29 = arm64g_calculate_condition(4, v24, 12, 0);
        v30 = arm64g_calculate_condition(144, (v29 & 1 ? v26 : 0x20000000), (v29 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v30 & 1))
        {
LABEL_b938b0:
            sub_c6b970(0);
        }
    }
    v31 = *a1;
    v32 = a1[1];
    v33 = v21->field_48;
    if (v26)
    {
        ptr = _malloc(v26);
        if (!ptr)
        {
            v37 = sub_c6b970(8, v26);
            sub_b72eec(&v15);
            v38 = __Unwind_Resume(v37);
            sub_c73e0c(v38);
        }
        v35 = ptr;
        node = 0;
        v15 = CONCAT(ptr, v25);
        v17 = 0;
        if (i)
            goto LABEL_b9390c;
    }
    else
    {
        node = 0;
        v35 = 8;
        v15 = CONCAT(8, 0);
        v17 = 0;
        if (v23 == 12)
            v39 = i;
        else
            v39 = i + 1;
        if (v39)
        {
            sub_c6c0cc(&v15, 0);
            v35 = *(unsigned long long *)((void*)&v15 + 8);
            node = v17;
            if (i)
            {
LABEL_b9390c:
                iter = v35 + node * 64;
                do
                {
                    v41 = i;
                    sub_b9790c(&v5, v33);
                    iter[2] = v9;
                    iter[3] = v11;
                    *iter = v5;
                    iter[1] = v7;
                    iter += 4;
                    node += 1;
                    v33 += 64;
                    i = v41 - 1;
                } while (i);
            }
        }
        else if (!(!i))
        {
            goto LABEL_b9390c;
        }
    }
    v1 = v32;
    v2 = v31;
    v0 = v21;
    if (v23 != 12)
    {
        sub_b8a584(&v5, v21);
        v42 = v35 + node * 64;
        *v42 = v5;
        v42[1] = v7;
        v42[2] = v9;
        v42[3] = v11;
        node += 1;
    }
    v3 = v15;
    v4 = node;
    v43 = *(unsigned long long *)((void*)&v3 + 8);
    v12 = CONCAT(1, 0);
    v13 = 0;
    if (node)
    {
        iter1 = 0;
        j = node * 64;
        v46 = node - 1;
        v47 = 1;
        do
        {
            v14 = v43;
            if (v46)
            {
                v15 = &v14;
                v16 = &g_b7e018;
                sub_b71ea8(&v5, &g_cb8a25, &v15);
                v48 = *(unsigned long long *)&v5;
                ptr1 = *(unsigned long long *)((void*)&v5 + 8);
                n = v7;
                if (*(unsigned long long *)&v12 - iter1 < n)
                {
                    sub_c6c0cc(&v12, iter1, n, 1, 1);
                    v47 = *(unsigned long long *)((void*)&v12 + 8);
                    iter1 = v13;
                }
                else if (!n)
                {
                    continue;
                }
                _memcpy(v47 + iter1, ptr1, n);
                iter1 = v13;
                continue;
            }
            if (*(long long *)v43 == 11)
            {
                v15 = &v14;
                v16 = &g_b7e018;
                sub_b71ea8(&v5, &g_cb8c42, &v15);
                v48 = *(unsigned long long *)&v5;
                ptr1 = *(unsigned long long *)((void*)&v5 + 8);
                n = v7;
                if (n > *(unsigned long long *)&v12 - iter1)
                {
                    sub_c6c0cc(&v12, iter1, n, 1, 1);
                    goto LABEL_b93b38;
                }
                goto LABEL_b93ad0;
            }
            else
            {
                v15 = 0;
                v16 = 1;
                v17 = 0;
                *(unsigned long long *)&v7 = 1610612768;
                v5 = CONCAT(&g_ef8038, &v15);
                if (sub_b7e020(v43, &v5))
                {
                    sub_c73d64("a Display implementation returned an error unexpectedly-- failed to decompileUtf8Errorvalid_up_toerror_lenunsupported types versionwe have debug infoinputTagMapResMapOptAltIsNotIsASeparatedListSeparatedNonEmptyListMany0Many1CountTakeUntilLengthValueTagClosureAlphaDigitAlphaNumericSpaceMultiSpaceLengthValueFnEofSwitchTagBitsOneOfNoneOfRegexpMatchRegexpMatchesRegexpFindRegexpCaptureRegexpCapturesTakeWhile1FixEscapedManyMNPermutationVerifyTakeTill1TakeWhileMNMany0CountMany1CountFloatSatisfy", 55, &v18, &g_ef7f70, &g_efb3e0);
                    __debugbreak();
                }
                v48 = v15;
                ptr1 = v16;
                n = v17;
                if (*(unsigned long long *)&v12 - iter1 >= n)
                {
LABEL_b93ad0:
                    if (!n)
                        continue;
                    goto LABEL_b93ad4;
                }
                else
                {
                    sub_c6c0cc(&v12, iter1, n, 1, 1);
LABEL_b93b38:
                    iter1 = v13;
LABEL_b93ad4:
                    v47 = *(unsigned long long *)((void*)&v12 + 8);
                    _memcpy(v47 + iter1, ptr1, n);
                }
            }
            iter1 += n;
            v13 = iter1;
            if (v48)
                _free(ptr1);
            v43 += 64;
            v46 -= 1;
            j -= 64;
        } while (j);
    }
    v15 = v12;
    v17 = v13;
    v51 = v0;
    v5 = v51 + 1;
    v6 = &g_b86e9c;
    v7 = v51[1].padding_8;
    v8 = &g_bef1c8;
    v9 = &v15;
    v10 = &g_b7a7fc;
    v52 = sub_be769c(v2, v1, &g_cb8c08, &v5);
    if (*(unsigned long long *)&v15)
        _free(*(unsigned long long *)((void*)&v15 + 8));
    v53 = v4 + 1;
    while (1)
    {
        v54 = v53 - 1;
        if (v53 == 1)
            break;
        sub_b728e8();
        v53 = v54;
    }
    if (*(unsigned long long *)&v3)
        _free(*(unsigned long long *)((void*)&v3 + 8));
    return v52;
}
