/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7e86c..0xa7ec3c (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7e86c_1 {
    char padding_0[8];
    struct st_a7e86c_0 *field_8;
    char padding_10[16];
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    char padding_48[48];
    unsigned long long field_78;
    uint128_t field_80;
    uint128_t field_90;
    unsigned long long field_a0;
    unsigned long long field_a8;
    long long field_b0;
} st_a7e86c_1;

typedef struct st_a7e86c_0 {
    unsigned long long field_0;
    char padding_8[40];
    unsigned int field_30;
} st_a7e86c_0;

extern unsigned long long g_a7ec3c;
extern unsigned long long g_a7edb4;
extern char g_10002b0;

unsigned long long sub_a7e86c(st_a7e86c_1 *a0, uint128_t *a1, unsigned long long a2)
{
    st_a7e86c_0 *v10;  // x24
    unsigned long long v11;  // x22
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long v20;  // cc_op
    unsigned long long v21;  // x0
    unsigned long long v12;  // x23
    unsigned long long *v22;  // x24
    uint128_t v23;  // q1
    uint128_t v24;  // q1
    unsigned long v26;  // x12
    unsigned long v27;  // x13
    unsigned long v28;  // x16
    unsigned long v29;  // x17
    unsigned long v30;  // 4110
    unsigned long v31;  // cc_op
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long long v34;  // 4110
    unsigned long v35;  // 4110
    unsigned long long v36;  // 4110
    unsigned long v37;  // 4110
    unsigned long v38;  // cc_op
    unsigned long v39;  // cc_dep1
    unsigned long v40;  // cc_dep2
    unsigned long long v41;  // 4110
    unsigned long v42;  // 4110
    unsigned long long v43;  // 4110
    unsigned long v44;  // 4110
    unsigned long v45;  // cc_op
    unsigned long v46;  // cc_dep1
    unsigned long v47;  // cc_dep2
    unsigned long long v48;  // 4110
    unsigned long v49;  // 4110
    unsigned long long v50;  // 4110
    unsigned long v51;  // 4110
    unsigned long v52;  // cc_op
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // cc_dep2
    unsigned long long v55;  // 4110
    unsigned long v56;  // 4110
    unsigned long long v57;  // 4110
    unsigned long v58;  // 4110
    unsigned long v59;  // cc_op
    unsigned long v60;  // cc_dep1
    unsigned long v61;  // cc_dep2
    unsigned long long v62;  // 4110
    unsigned long v63;  // 4110
    unsigned long long v64;  // 4110
    unsigned long v65;  // 4110
    unsigned long v66;  // cc_op
    unsigned long v67;  // cc_dep1
    unsigned long v68;  // cc_dep2
    unsigned long long v69;  // 4110
    unsigned long v70;  // 4110
    unsigned long long v71;  // 4110
    unsigned long long v13;  // 4110
    unsigned long long v72;  // 4110
    unsigned long long v73;  // 4102
    unsigned long long v74;  // 4110
    unsigned long long v75;  // 4102
    unsigned long long v14;  // 4102
    unsigned long v0;  // [bp-0xc0]
    unsigned long v1;  // [bp-0xb0]
    unsigned long long v2;  // [bp-0xa8]
    uint128_t v3;  // [bp-0xa0]
    uint128_t v4;  // [bp-0x90]
    uint128_t v5;  // [bp-0x80]
    uint128_t v6;  // [bp-0x70]
    unsigned long v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v10 = a0->field_8;
    v11 = *(long long *)&v10->padding_8[24];
    v12 = *(long long *)&v10->padding_8[32];
    sub_a6c4e8(a0->field_b0, 32, "crypto/ml_dsa/ml_dsa_encoders.c", 773);
    a0->field_b0 = 0;
    if (a0->field_a8)
    {
        v13 = arm64g_calculate_condition(v20 | 16, v15, v16, v17);
        v14 = arm64g_calculate_condition(20, (v13 & 1 ? a0->field_a8 : 0x40000000), (v13 & 1 ? a1 : 0), 0);
        if (!(v14 & 1))
            goto LABEL_a7e8d8;
    }
    else
    {
        v18 = arm64g_calculate_condition(v20 | 16, v15, v16, v17);
        v19 = arm64g_calculate_condition(16, (v18 & 1 ? 0 : 0x40000000), (v18 & 1 ? a1 : 0), 0);
        if (!(v19 & 1))
        {
LABEL_a7e8d8:
            if (!a0->field_a0 && *(long long *)&a0->field_8[1].padding_8[4] == a2)
            {
                v21 = sub_a7fb64(a0);
                if (!(unsigned int)v21)
                {
                    if (*(long long *)&g_10002b0 == v7)
                        return v21;
                    ___stack_chk_fail();
                }
                if (v10->field_30 == 4)
                    v22 = &g_a7ec3c;
                else
                    v22 = &g_a7edb4;
                if ((long long)a2 >= 0 && a2 >= 32 && (v23 = a1[1], a0->field_20 = *a1, a0->field_30 = a1[1], (a2 & 0x7fffffffffffffe0) != 32 && (v24 = a1[3], a0->field_80 = a1[2], a0->field_90 = a1[3], (a2 & 0x7fffffffffffffc0) != 64)))
                {
                    v3 = a1[4];
                    v4 = a1[5];
                    v5 = a1[6];
                    v6 = a1[7];
                    v1 = a1 + 8;
                    v2 = a2 - 128;
                    if (v12)
                        v22();
                    if (v11)
                        v22();
                    if (!v2)
                    {
                        if (!a0->field_a8)
                        {
                            v21 = sub_a6dac4(a1, a2, "crypto/ml_dsa/ml_dsa_encoders.c", 809);
                            a0->field_a8 = v21;
                            if (!v21)
                            {
                                if (*(long long *)&g_10002b0 == v7)
                                    return v21;
                                ___stack_chk_fail();
                            }
                        }
                        if (sub_a80034(a0))
                        {
                            v26 = *(unsigned long long *)&v4;
                            v27 = *(unsigned long long *)((void*)&v4 + 8);
                            v28 = *(unsigned long long *)&v5;
                            v29 = *(unsigned long long *)((void*)&v5 + 8);
                            if (*(unsigned long long *)&v3 == a0->field_40)
                            {
                                v30 = arm64g_calculate_condition(v20, v15, v16, v17);
                                v31 = 4;
                                v32 = (v30 & 1 ? *(unsigned long long *)((void*)&v3 + 8) : 0);
                                v33 = (v30 & 1 ? *(long long *)&a0->padding_48[0] : 0);
                                v34 = arm64g_calculate_condition(4, v32, v33, 0);
                                if (!(v34 & 1))
                                    goto LABEL_a7ebce;
                            }
                            else
                            {
                                v35 = arm64g_calculate_condition(v20, v15, v16, v17);
                                v31 = 0;
                                v32 = (v35 & 1 ? *(unsigned long long *)((void*)&v3 + 8) : 0);
                                v33 = (v35 & 1 ? *(long long *)&a0->padding_48[0] : 0);
                                v36 = arm64g_calculate_condition(0, v32, v33, 0);
                                if (!(v36 & 1))
                                {
LABEL_a7ebce:
                                    v42 = arm64g_calculate_condition(v31, v32, v33, 0);
                                    v38 = 0;
                                    v39 = (v42 & 1 ? v26 : 0);
                                    v40 = (v42 & 1 ? *(long long *)&a0->padding_48[8] : 0);
                                    v43 = arm64g_calculate_condition(0, v39, v40, 0);
                                    if (!(v43 & 1))
                                    {
LABEL_a7ebd2:
                                        v49 = arm64g_calculate_condition(v38, v39, v40, 0);
                                        v45 = 0;
                                        v46 = (v49 & 1 ? v27 : 0);
                                        v47 = (v49 & 1 ? *(long long *)&a0->padding_48[16] : 0);
                                        v50 = arm64g_calculate_condition(0, v46, v47, 0);
                                        if (!(v50 & 1))
                                        {
LABEL_a7ebd6:
                                            v56 = arm64g_calculate_condition(v45, v46, v47, 0);
                                            v52 = 0;
                                            v53 = (v56 & 1 ? v28 : 0);
                                            v54 = (v56 & 1 ? *(long long *)&a0->padding_48[24] : 0);
                                            v57 = arm64g_calculate_condition(0, v53, v54, 0);
                                            if (!(v57 & 1))
                                            {
LABEL_a7ebda:
                                                v63 = arm64g_calculate_condition(v52, v53, v54, 0);
                                                v59 = 0;
                                                v60 = (v63 & 1 ? v29 : 0);
                                                v61 = (v63 & 1 ? *(long long *)&a0->padding_48[32] : 0);
                                                v64 = arm64g_calculate_condition(0, v60, v61, 0);
                                                if (!(v64 & 1))
                                                {
LABEL_a7ebde:
                                                    v70 = arm64g_calculate_condition(v59, v60, v61, 0);
                                                    v66 = 0;
                                                    v67 = (v70 & 1 ? *(unsigned long long *)&v6 : 0);
                                                    v68 = (v70 & 1 ? *(long long *)&a0->padding_48[40] : 0);
                                                    v71 = arm64g_calculate_condition(0, v67, v68, 0);
                                                    if (v71 & 1)
                                                    {
LABEL_a7ebe1:
                                                        v72 = arm64g_calculate_condition(v66, v67, v68, 0);
                                                        v73 = arm64g_calculate_condition(4, (v72 & 1 ? *(unsigned long long *)((void*)&v6 + 8) : 0), (v72 & 1 ? a0->field_78 : 0), 0);
                                                        if (v73 & 1)
                                                        {
                                                            if (*(long long *)&g_10002b0 == v7)
                                                                return 1;
                                                            ___stack_chk_fail();
                                                        }
                                                    }
                                                    else
                                                    {
LABEL_a7ebe2:
                                                        v74 = arm64g_calculate_condition(v66, v67, v68, 0);
                                                        v75 = arm64g_calculate_condition(0, (v74 & 1 ? *(unsigned long long *)((void*)&v6 + 8) : 0), (v74 & 1 ? a0->field_78 : 0), 0);
                                                        if (v75 & 1)
                                                        {
                                                            if (*(long long *)&g_10002b0 == v7)
                                                                return 1;
                                                            ___stack_chk_fail();
                                                        }
                                                    }
                                                    goto LABEL_a7ebe8;
                                                }
LABEL_a7ebdd:
                                                v65 = arm64g_calculate_condition(v59, v60, v61, 0);
                                                v66 = 4;
                                                v67 = (v65 & 1 ? *(unsigned long long *)&v6 : 0);
                                                v68 = (v65 & 1 ? *(long long *)&a0->padding_48[40] : 0);
                                                v69 = arm64g_calculate_condition(4, v67, v68, 0);
                                                if (!(v69 & 1))
                                                    goto LABEL_a7ebe2;
                                                goto LABEL_a7ebe1;
                                            }
LABEL_a7ebd9:
                                            v58 = arm64g_calculate_condition(v52, v53, v54, 0);
                                            v59 = 4;
                                            v60 = (v58 & 1 ? v29 : 0);
                                            v61 = (v58 & 1 ? *(long long *)&a0->padding_48[32] : 0);
                                            v62 = arm64g_calculate_condition(4, v60, v61, 0);
                                            if (!(v62 & 1))
                                                goto LABEL_a7ebde;
                                            goto LABEL_a7ebdd;
                                        }
LABEL_a7ebd5:
                                        v51 = arm64g_calculate_condition(v45, v46, v47, 0);
                                        v52 = 4;
                                        v53 = (v51 & 1 ? v28 : 0);
                                        v54 = (v51 & 1 ? *(long long *)&a0->padding_48[24] : 0);
                                        v55 = arm64g_calculate_condition(4, v53, v54, 0);
                                        if (!(v55 & 1))
                                            goto LABEL_a7ebda;
                                        goto LABEL_a7ebd9;
                                    }
LABEL_a7ebd1:
                                    v44 = arm64g_calculate_condition(v38, v39, v40, 0);
                                    v45 = 4;
                                    v46 = (v44 & 1 ? v27 : 0);
                                    v47 = (v44 & 1 ? *(long long *)&a0->padding_48[16] : 0);
                                    v48 = arm64g_calculate_condition(4, v46, v47, 0);
                                    if (!(v48 & 1))
                                        goto LABEL_a7ebd6;
                                    goto LABEL_a7ebd5;
                                }
                            }
                            v37 = arm64g_calculate_condition(v31, v32, v33, 0);
                            v38 = 4;
                            v39 = (v37 & 1 ? v26 : 0);
                            v40 = (v37 & 1 ? *(long long *)&a0->padding_48[8] : 0);
                            v41 = arm64g_calculate_condition(4, v39, v40, 0);
                            if (!(v41 & 1))
                                goto LABEL_a7ebd2;
                            goto LABEL_a7ebd1;
                        }
                        else
                        {
LABEL_a7ebe8:
                            sub_a368c8();
                            sub_a369bc("crypto/ml_dsa/ml_dsa_encoders.c", 817, "ossl_ml_dsa_sk_decode");
                            v0 = a0->field_8->field_0;
                            sub_a36abc(57, 158, "%s private key does not match its pubkey part");
                            sub_a7fbd8(a0);
                        }
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v7)
        return 0;
    ___stack_chk_fail();
}
