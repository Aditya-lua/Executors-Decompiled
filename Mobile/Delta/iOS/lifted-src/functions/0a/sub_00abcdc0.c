/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabcdc0..0xabcfe0 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_abcdc0(unsigned long long *a0, double *a1, unsigned long long a2, unsigned long long a3)
{
    uint128_t v2;  // q0
    uint128_t v3;  // q1
    uint128_t v12;  // q10
    uint128_t v13;  // q11
    uint128_t v14;  // q12
    uint128_t v15;  // q13
    uint128_t v16;  // q14
    uint128_t v17;  // q15
    uint128_t v18;  // q16
    uint128_t v19;  // q17
    uint128_t v20;  // q18
    uint128_t v21;  // q19
    uint128_t v4;  // q2
    uint128_t v22;  // q20
    uint128_t v23;  // q21
    uint128_t v24;  // q22
    uint128_t v25;  // q23
    uint128_t v26;  // q24
    unsigned long long v27;  // x2
    double *v28;  // x1
    double *v29;  // x1
    unsigned long long v30;  // 4109
    double *v31;  // x1
    uint128_t v5;  // q3
    unsigned long long v32;  // 4109
    double *v33;  // x1
    unsigned long long v34;  // 4109
    double *v35;  // x1
    unsigned long long v36;  // 4109
    double *v37;  // x1
    unsigned long long v38;  // 4109
    double *v39;  // x1
    unsigned long long v40;  // 4109
    double *v41;  // x1
    uint128_t v6;  // q4
    unsigned long long v42;  // 4109
    double *v43;  // x1
    unsigned long long v44;  // 4109
    double *v45;  // x1
    unsigned long long v46;  // 4109
    double *v47;  // x1
    unsigned long long v48;  // 4109
    double *v49;  // x1
    unsigned long long v50;  // 4109
    double *v51;  // x1
    uint128_t v7;  // q5
    unsigned long long v52;  // 4109
    uint128_t v8;  // q6
    uint128_t v9;  // q7
    uint128_t v10;  // q8
    uint128_t v11;  // q9
    char *v0;  // [bp-0x50]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(unsigned long long *)&*(double *)a0;
    v3 = *(unsigned long long *)&*(double *)&a0[1];
    v4 = *(unsigned long long *)&*(double *)&a0[2];
    v5 = *(unsigned long long *)&*(double *)&a0[3];
    v6 = *(unsigned long long *)&*(double *)&a0[4];
    v7 = *(unsigned long long *)&*(double *)&a0[5];
    v8 = *(unsigned long long *)&*(double *)&a0[6];
    v9 = *(unsigned long long *)&*(double *)&a0[7];
    v10 = *(unsigned long long *)&*(double *)&a0[8];
    v11 = *(unsigned long long *)&*(double *)&a0[9];
    v12 = *(unsigned long long *)&*(double *)&a0[10];
    v13 = *(unsigned long long *)&*(double *)&a0[11];
    v14 = *(unsigned long long *)&*(double *)&a0[12];
    v15 = *(unsigned long long *)&*(double *)&a0[13];
    v16 = *(unsigned long long *)&*(double *)&a0[14];
    v17 = *(unsigned long long *)&*(double *)&a0[15];
    v18 = *(unsigned long long *)&*(double *)&a0[16];
    v19 = *(unsigned long long *)&*(double *)&a0[0x11];
    v20 = *(unsigned long long *)&*(double *)&a0[18];
    v21 = *(unsigned long long *)&*(double *)&a0[19];
    v22 = *(unsigned long long *)&*(double *)&a0[20];
    v23 = *(unsigned long long *)&*(double *)&a0[21];
    v24 = *(unsigned long long *)&*(double *)&a0[22];
    v25 = *(unsigned long long *)&*(double *)&a0[23];
    v26 = *(unsigned long long *)&*(double *)&a0[24];
    while (1)
    {
        v27 = a2 - a3;
        if (a2 < a3)
            break;
        v28 = a1 + 1;
        v2 ^= *(unsigned long long *)&*a1;
        a1 = v28;
        if (a3 >= 16)
        {
            v29 = v28 + 1;
            v3 ^= *(unsigned long long *)&*v28;
            v30 = arm64g_calculate_condition(4, a3, 16, 0);
            a1 = v29;
            if (!(v30 & 1))
            {
                a1 = v29 + 1;
                v4 ^= *(unsigned long long *)&*v29;
                if (a3 >= 32)
                {
                    v31 = a1 + 1;
                    v5 ^= *(unsigned long long *)&*a1;
                    v32 = arm64g_calculate_condition(4, a3, 32, 0);
                    a1 = v31;
                    if (!(v32 & 1))
                    {
                        a1 = v31 + 1;
                        v6 ^= *(unsigned long long *)&*v31;
                        if (a3 >= 48)
                        {
                            v33 = a1 + 1;
                            v7 ^= *(unsigned long long *)&*a1;
                            v34 = arm64g_calculate_condition(4, a3, 48, 0);
                            a1 = v33;
                            if (!(v34 & 1))
                            {
                                a1 = v33 + 1;
                                v8 ^= *(unsigned long long *)&*v33;
                                if (a3 >= 64)
                                {
                                    v35 = a1 + 1;
                                    v9 ^= *(unsigned long long *)&*a1;
                                    v36 = arm64g_calculate_condition(4, a3, 64, 0);
                                    a1 = v35;
                                    if (!(v36 & 1))
                                    {
                                        a1 = v35 + 1;
                                        v10 ^= *(unsigned long long *)&*v35;
                                        if (a3 >= 80)
                                        {
                                            v37 = a1 + 1;
                                            v11 ^= *(unsigned long long *)&*a1;
                                            v38 = arm64g_calculate_condition(4, a3, 80, 0);
                                            a1 = v37;
                                            if (!(v38 & 1))
                                            {
                                                a1 = v37 + 1;
                                                v12 ^= *(unsigned long long *)&*v37;
                                                if (a3 >= 96)
                                                {
                                                    v39 = a1 + 1;
                                                    v13 ^= *(unsigned long long *)&*a1;
                                                    v40 = arm64g_calculate_condition(4, a3, 96, 0);
                                                    a1 = v39;
                                                    if (!(v40 & 1))
                                                    {
                                                        a1 = v39 + 1;
                                                        v14 ^= *(unsigned long long *)&*v39;
                                                        if (a3 >= 112)
                                                        {
                                                            v41 = a1 + 1;
                                                            v15 ^= *(unsigned long long *)&*a1;
                                                            v42 = arm64g_calculate_condition(4, a3, 112, 0);
                                                            a1 = v41;
                                                            if (!(v42 & 1))
                                                            {
                                                                a1 = v41 + 1;
                                                                v16 ^= *(unsigned long long *)&*v41;
                                                                if (a3 >= 128)
                                                                {
                                                                    v43 = a1 + 1;
                                                                    v17 ^= *(unsigned long long *)&*a1;
                                                                    v44 = arm64g_calculate_condition(4, a3, 128, 0);
                                                                    a1 = v43;
                                                                    if (!(v44 & 1))
                                                                    {
                                                                        a1 = v43 + 1;
                                                                        v18 ^= *(unsigned long long *)&*v43;
                                                                        if (a3 >= 144)
                                                                        {
                                                                            v45 = a1 + 1;
                                                                            v19 ^= *(unsigned long long *)&*a1;
                                                                            v46 = arm64g_calculate_condition(4, a3, 144, 0);
                                                                            a1 = v45;
                                                                            if (!(v46 & 1))
                                                                            {
                                                                                a1 = v45 + 1;
                                                                                v20 ^= *(unsigned long long *)&*v45;
                                                                                if (a3 >= 160)
                                                                                {
                                                                                    v47 = a1 + 1;
                                                                                    v21 ^= *(unsigned long long *)&*a1;
                                                                                    v48 = arm64g_calculate_condition(4, a3, 160, 0);
                                                                                    a1 = v47;
                                                                                    if (!(v48 & 1))
                                                                                    {
                                                                                        a1 = v47 + 1;
                                                                                        v22 ^= *(unsigned long long *)&*v47;
                                                                                        if (a3 >= 176)
                                                                                        {
                                                                                            v49 = a1 + 1;
                                                                                            v23 ^= *(unsigned long long *)&*a1;
                                                                                            v50 = arm64g_calculate_condition(4, a3, 176, 0);
                                                                                            a1 = v49;
                                                                                            if (!(v50 & 1))
                                                                                            {
                                                                                                a1 = v49 + 1;
                                                                                                v24 ^= *(unsigned long long *)&*v49;
                                                                                                if (a3 >= 192)
                                                                                                {
                                                                                                    v51 = a1 + 1;
                                                                                                    v25 ^= *(unsigned long long *)&*a1;
                                                                                                    v52 = arm64g_calculate_condition(4, a3, 192, 0);
                                                                                                    a1 = v51;
                                                                                                    if (!(v52 & 1))
                                                                                                    {
                                                                                                        a1 = v51 + 1;
                                                                                                        v26 ^= *(unsigned long long *)&*v51;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a0 = sub_abcbe0();
        a2 = v27;
    }
    *a0 = *(unsigned long long *)&v2;
    a0[1] = *(unsigned long long *)&v3;
    a0[2] = *(unsigned long long *)&v4;
    a0[3] = *(unsigned long long *)&v5;
    a0[4] = *(unsigned long long *)&v6;
    a0[5] = *(unsigned long long *)&v7;
    a0[6] = *(unsigned long long *)&v8;
    a0[7] = *(unsigned long long *)&v9;
    a0[8] = *(unsigned long long *)&v10;
    a0[9] = *(unsigned long long *)&v11;
    a0[10] = *(unsigned long long *)&v12;
    a0[11] = *(unsigned long long *)&v13;
    a0[12] = *(unsigned long long *)&v14;
    a0[13] = *(unsigned long long *)&v15;
    a0[14] = *(unsigned long long *)&v16;
    a0[15] = *(unsigned long long *)&v17;
    a0[16] = *(unsigned long long *)&v18;
    a0[0x11] = *(unsigned long long *)&v19;
    a0[18] = *(unsigned long long *)&v20;
    a0[19] = *(unsigned long long *)&v21;
    a0[20] = *(unsigned long long *)&v22;
    a0[21] = *(unsigned long long *)&v23;
    a0[22] = *(unsigned long long *)&v24;
    a0[23] = *(unsigned long long *)&v25;
    a0[24] = *(unsigned long long *)&v26;
    return a2 - a3 + a3;
}
