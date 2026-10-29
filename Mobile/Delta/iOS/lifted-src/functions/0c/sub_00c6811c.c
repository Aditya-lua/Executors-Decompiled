/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6811c..0xc68318 (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6811c_0 {
    char padding_0[8];
    long long field_8;
} st_c6811c_0;

typedef struct st_c6811c_1 {
    struct st_c6811c_1 *field_0;
    long long field_8;
    char padding_10[8];
    long long field_18;
    struct st_c6811c_1 *field_20;
} st_c6811c_1;

extern long long g_a695a0;
extern char g_10002b0;

st_c6811c_1 * sub_c6811c(st_c6811c_1 *a0, st_c6811c_1 *a1, st_c6811c_1 *a2)
{
    st_c6811c_1 *v6;  // x19
    st_c6811c_0 *v7;  // x0
    st_c6811c_1 *v16;  // x23
    unsigned long long v17;  // 4102
    st_c6811c_1 *v18;  // x0
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4102
    st_c6811c_1 *v13;  // x0
    st_c6811c_1 *v14;  // x0
    st_c6811c_1 *v15;  // x22
    st_c6811c_1 *v0;  // [bp-0xc0], Other Possible Types: unsigned long
    st_c6811c_1 *v1;  // [bp-0xb0]
    char v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1;
    v3 = *(long long *)&g_10002b0;
    v0 = (st_c6811c_1 *)0;
    v1 = (st_c6811c_1 *)0;
    if (a0 || sub_a68f38())
    {
        v7 = sub_a69890();
        if (a2)
        {
            do
            {
            } while ((char)a2->field_0 && (v7 = sub_a698ac(), v12 = arm64g_calculate_condition(v8 | 16, v9, v10, v11), v12 & 1));
        }
        v13 = sub_a63e6c(v7->field_8, &v2);
        if (v13 && (v14 = (int)v13->field_0, (unsigned int)v14))
            goto LABEL_c682b8;
    }
    if ((int)(unsigned int)v6 >= 1)
    {
        v14 = sub_ad69f8(a0->field_18);
        if (v14)
            goto LABEL_c681c4;
    }
    else
    {
        v14 = sub_ad61b4();
        if (v14)
        {
LABEL_c681c4:
            v15 = v14;
            v16 = sub_a6d9b4(a2, "crypto/core_namemap.c", 234);
            if (!v16 || !sub_ad68a0(v15, v16))
            {
                if (0 < (int)(unsigned int)v6)
                    goto LABEL_c682a0;
                goto LABEL_c68290;
            }
            if ((int)(unsigned int)v6 > 0)
            {
LABEL_c681fc:
                *(unsigned int *)&a0->field_20 = (unsigned int)v6;
                sub_a69890();
                if (a2)
                {
                    do
                    { } while ((char)a2->field_0 && (sub_a698ac(), v17 = arm64g_calculate_condition(v8 | 16, v9, v10, v11), v17 & 1));
                }
                v0 = (unsigned int)v6;
                v18 = sub_a637e0(a0->field_8, &v2, &v0, 0);
                v14 = v18;
                if (!(unsigned int)v14)
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return v14;
                    ___stack_chk_fail();
                }
                v14 = v6;
                if (0 >= (int)(unsigned int)v18)
                {
                    sub_a368c8(v14);
                    sub_a369bc("crypto/core_namemap.c", 281, "namemap_add_name");
                    sub_a36abc(15, 132, 0);
                    goto LABEL_c682b4;
                }
            }
            else if (sub_ad68a0(a0->field_18, v15))
            {
                v6 = sub_ad69e4(a0->field_18);
                v14 = v6;
                if ((unsigned int)v14)
                    goto LABEL_c681fc;
            }
            else
            {
                v16 = 0;
LABEL_c68290:
                sub_ad6958(v15, &g_a695a0);
LABEL_c682a0:
                sub_a6c2e4(v16, "crypto/core_namemap.c", 251);
LABEL_c682b4:
                v14 = 0;
            }
        }
    }
LABEL_c682b8:
    if (*(long long *)&g_10002b0 == v3)
        return v14;
    ___stack_chk_fail();
}
