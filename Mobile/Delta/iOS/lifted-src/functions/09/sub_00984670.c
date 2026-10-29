/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x984670..0x984a84 (1044 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_984670_0 {
    char padding_0[104];
    char field_68;
    char padding_69[33];
    char field_8a;
} st_984670_0;

extern char g_10002b0;

unsigned long long sub_984670(long long a0, long long a1, long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, long long a6, long long a7)
{
    unsigned long long v14;  // x23
    st_984670_0 *v15;  // x26
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long long v22;  // 4110
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned long v26;  // cc_ndep
    unsigned long v27;  // 4112
    unsigned long long v28;  // 4110
    unsigned long long idx;  // x20
    unsigned long v29;  // 4110
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned long long v32;  // 4110
    long long v17;  // x0
    unsigned long v33;  // 4110
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v39;  // w8
    st_984670_0 *v40;  // x9
    long long v41;  // x1
    unsigned long long v42;  // x8
    unsigned long long v43;  // w0
    unsigned long long v44;  // x0
    long long v45;  // x1
    char *v46;  // x21
    char *v47;  // x8
    unsigned long long v48;  // w19
    unsigned long long v49;  // w0
    unsigned long long v50;  // x21
    unsigned long long *v51;  // x21
    unsigned long index;  // x19
    unsigned long long *v53;  // x21
    unsigned long v18;  // 4112
    unsigned long v19;  // cc_op
    char *v0;  // [bp-0x150]
    long long v1;  // [bp-0x148]
    unsigned long long v2;  // [bp-0x140], Other Possible Types: long long
    unsigned long v3;  // [bp-0x130]
    unsigned long long v4;  // [bp-0x128]
    st_984670_0 *v5;  // [bp-0x120]
    unsigned long long idx1;  // [bp-0x118]
    unsigned long long v7;  // [bp-0x110]
    char v8;  // [bp-0xf0]
    char v9;  // [bp-0xb0]
    unsigned long v10;  // [bp-0x70]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]
    unsigned long long v13;  // [bp+0x4]

    v11 = &v12;
    v14 = v12;
    v10 = *(long long *)&g_10002b0;
    v15 = a0 + (unsigned int)a3 * 208;
    if ((unsigned int)a3 < 4)
        idx = v15;
    else
        idx = 0;
    v17 = sub_985ce8();
    if (v13 <= 1)
    {
        v18 = arm64g_calculate_condition(v23 | 144, v24, v25, v26);
        v19 = 3;
        v20 = (v18 & 1 ? v14 & 0xff : 0x20000000);
        v21 = v18 & 1;
        v22 = arm64g_calculate_condition(147, v20, v21, 0);
        if (!(v22 & 1))
            goto LABEL_9846e6;
LABEL_9846e5:
        v29 = arm64g_calculate_condition(v19 | 144, v20, v21, 0);
        v30 = 4;
        v31 = (v29 & 1 ? idx : 0x40000000);
        v32 = arm64g_calculate_condition(20, v31, 0, 0);
        if (!(v32 & 1))
            goto LABEL_9846ea;
        goto LABEL_9846e9;
    }
    v27 = arm64g_calculate_condition(v23 | 144, v24, v25, v26);
    v19 = 0;
    v20 = (v27 & 1 ? v14 & 0xff : 0x20000000);
    v21 = v27 & 1;
    v28 = arm64g_calculate_condition(144, v20, v21, 0);
    if (v28 & 1)
        goto LABEL_9846e5;
LABEL_9846e6:
    v33 = arm64g_calculate_condition(v19 | 144, v20, v21, 0);
    v30 = 0;
    v31 = (v33 & 1 ? idx : 0x40000000);
    v34 = arm64g_calculate_condition(16, v31, 0, 0);
    if (v34 & 1)
    {
LABEL_9846e9:
        v35 = arm64g_calculate_condition(v30 | 16, v31, 0, 0);
        v36 = arm64g_calculate_condition(4, (v35 & 1 ? v17 : 0x40000000), 0, 0);
        goto LABEL_984700;
    }
LABEL_9846ea:
    v37 = arm64g_calculate_condition(v30 | 16, v31, 0, 0);
    v38 = arm64g_calculate_condition(0, (v37 & 1 ? v17 : 0x40000000), 0, 0);
    if (v38 & 1 || (unsigned int)a3 != 3 && (unsigned int)v14)
    {
LABEL_984700:
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_record_shared.c", 233, "ossl_qrl_enc_level_set_provide_secret");
        v45 = 524550;
        goto LABEL_984778;
    }
    if ((unsigned int)a3)
    {
        v39 = *(char *)(idx + 104);
        goto LABEL_984748;
    }
    v39 = v15->field_68;
    if (v39 != 1)
    {
LABEL_984748:
        v40 = idx;
        if (v39)
        {
            sub_a368c8();
            v41 = 250;
            goto LABEL_984768;
        }
        goto LABEL_9847d0;
    }
    sub_c62520(a0, 0);
    v15->field_68 = 0;
    v40 = v15;
LABEL_9847d0:
    v7 = a5;
    if (!v13)
        v42 = v14;
    else
        v42 = 0;
    v5 = v40;
    idx1 = v42;
    v43 = (unsigned int)sub_985dd8();
    if (v43)
    {
        v44 = v7;
        if (v44 || !(v44 = sub_a40ca8(a1, v17, a2), !v44))
        {
            *(long long *)(idx + 64) = a1;
            *(long long *)(idx + 72) = a2;
            *(unsigned long long *)(idx + 40) = v44;
            *(unsigned int *)(idx + 96) = a4;
            *(unsigned int *)(idx + 100) = sub_985d88(a4);
            *(unsigned long long *)(idx + 80) = v14;
            *(unsigned long long *)(idx + 88) = 0;
            *(char *)(idx + 105) = v13;
            *(unsigned int *)&v2 = 1;
            v3 = v43;
            v4 = v44;
            if (!sub_96eae0(a1, a2, v4, a6, "quic hp", 7, 0, 0, &v8, v3, v2) || !sub_984a84(a0, a3, idx1, a6, a7))
            {
                v48 = 0;
                v50 = 1;
                goto LABEL_9849e8;
            }
            if ((unsigned int)a3 != 3)
            {
LABEL_9848e8:
                v48 = 0;
                goto LABEL_9848ec;
            }
            v46 = &v15->field_8a;
            v47 = &v9;
            if (v13)
                v47 = v46;
            v2 = 1;
            v0 = v47;
            v1 = a7;
            if (sub_96eae0())
            {
                if (v13)
                    goto LABEL_9848e8;
                if (!sub_984a84(a0, 3, v14 ^ 1, &v9, a7))
                    goto LABEL_9849e0;
                v48 = 1;
                v2 = _INSERT(CONCAT(1, 0), 0, 1);
                if (!sub_96eae0(a1, a2, v4, &v9, "quic kuquic ivquic key", 7, 0, 0, v46, a7, v2))
                    goto LABEL_9849e4;
LABEL_9848ec:
                if (!sub_990788(idx, a1, a2, sub_985db0(a4), &v8, v3))
                    goto LABEL_9849e4;
                sub_a66ec0(&v8, 64);
                sub_a66ec0(&v9, 64);
                v49 = 1;
                v5->field_68 = 1;
            }
            else
            {
LABEL_9849e0:
                v48 = 0;
LABEL_9849e4:
                v50 = 0;
LABEL_9849e8:
                *(unsigned int *)(idx + 96) = 0;
                *(unsigned long long *)(idx + 40) = 0;
                sub_a66ec0(&v8, 64);
                sub_a66ec0(&v9, 64);
                sub_a66ec0(idx + 138, 64);
                if (!(v50 & 1))
                {
                    v51 = idx + 48;
                    if (v51[idx1])
                    {
                        sub_a4bca0(v51[idx1]);
                        v51[idx1] = 0;
                    }
                    sub_a66ec0(idx + idx1 * 16 + 106, 16);
                }
                if (v48)
                {
                    index = idx1 ^ 1;
                    v53 = idx + 48;
                    if (v53[index])
                    {
                        sub_a4bca0(v53[index]);
                        v53[index] = 0;
                    }
                    sub_a66ec0(idx + index * 16 + 106, 16);
                }
                if (!v7)
                    sub_a3f52c(v4);
LABEL_984780:
                v49 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/quic/quic_record_shared.c", 264, "ossl_qrl_enc_level_set_provide_secret");
            v45 = 524294;
LABEL_984778:
            sub_a36abc(20, v45, 0);
            goto LABEL_984780;
        }
    }
    else
    {
        sub_a368c8();
        v41 = 0x101;
LABEL_984768:
        sub_a369bc("ssl/quic/quic_record_shared.c", v41, "ossl_qrl_enc_level_set_provide_secret");
        v45 = 786691;
        goto LABEL_984778;
    }
    if (*(long long *)&g_10002b0 == v10)
        return v49;
    ___stack_chk_fail();
}
