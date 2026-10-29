/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabc8a0..0xabcb00 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_abc8a0(unsigned long long *a0, unsigned long long *i, unsigned long long iter, unsigned long long a3)
{
    unsigned long long v5;  // x27
    unsigned long long v6;  // x0
    unsigned long long v15;  // x9
    unsigned long long v16;  // x10
    unsigned long long v17;  // x11
    unsigned long long v18;  // x12
    unsigned long long v19;  // x13
    unsigned long long v20;  // x14
    unsigned long long v21;  // x15
    unsigned long long v22;  // x16
    unsigned long long v23;  // x17
    unsigned long long v24;  // x25
    unsigned long long v7;  // x1
    unsigned long long v25;  // x19
    unsigned long long v26;  // x20
    unsigned long long v27;  // x21
    unsigned long long v28;  // x22
    unsigned long long v29;  // x23
    unsigned long long v30;  // x24
    unsigned long long *v31;  // x27
    unsigned long long *v32;  // x27
    unsigned long long v33;  // 4111
    unsigned long long *v34;  // x27
    unsigned long long v8;  // x2
    unsigned long long v35;  // 4111
    unsigned long long *v36;  // x27
    unsigned long long v37;  // 4111
    unsigned long long *v38;  // x27
    unsigned long long v39;  // 4111
    unsigned long long *v40;  // x27
    unsigned long long v41;  // 4111
    unsigned long long *v42;  // x27
    unsigned long long v43;  // 4111
    unsigned long long *v44;  // x27
    unsigned long long v9;  // x3
    unsigned long long v45;  // 4111
    unsigned long long *v46;  // x27
    unsigned long long v47;  // 4111
    unsigned long long *v48;  // x27
    unsigned long long v49;  // 4111
    unsigned long long *v50;  // x27
    unsigned long long v51;  // 4111
    unsigned long long *v52;  // x27
    unsigned long long v53;  // 4111
    unsigned long long *v54;  // x27
    unsigned long long v10;  // x4
    unsigned long long v55;  // 4111
    unsigned long long v11;  // x5
    unsigned long long v12;  // x6
    unsigned long long v13;  // x7
    unsigned long long v14;  // x8
    unsigned long long *v0;  // [bp-0x98]
    unsigned long long v1;  // [bp-0x88]
    char *v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x30]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v0 = i;
    v1 = a3;
    v6 = *a0;
    v7 = a0[1];
    v8 = a0[2];
    v9 = a0[3];
    v10 = a0[4];
    v11 = a0[5];
    v12 = a0[6];
    v13 = a0[7];
    v14 = a0[8];
    v15 = a0[9];
    v16 = a0[10];
    v17 = a0[11];
    v18 = a0[12];
    v19 = a0[13];
    v20 = a0[14];
    v21 = a0[15];
    v22 = a0[16];
    v23 = a0[0x11];
    v24 = a0[18];
    v25 = a0[19];
    v26 = a0[20];
    v27 = a0[21];
    v28 = a0[22];
    v29 = a0[23];
    for (v30 = a0[24]; iter >= x30; i = v0)
    {
        iter -= x30;
        v31 = i + 1;
        if (x30 >= 16)
        {
            v32 = v31 + 1;
            v7 ^= *v31;
            v33 = arm64g_calculate_condition(4, x30, 16, 0);
            v31 = v32;
            if (!(v33 & 1))
            {
                v31 = v32 + 1;
                v8 ^= *v32;
                if (x30 >= 32)
                {
                    v34 = v31 + 1;
                    v9 ^= *v31;
                    v35 = arm64g_calculate_condition(4, x30, 32, 0);
                    v31 = v34;
                    if (!(v35 & 1))
                    {
                        v31 = v34 + 1;
                        v10 ^= *v34;
                        if (x30 >= 48)
                        {
                            v36 = v31 + 1;
                            v11 ^= *v31;
                            v37 = arm64g_calculate_condition(4, x30, 48, 0);
                            v31 = v36;
                            if (!(v37 & 1))
                            {
                                v31 = v36 + 1;
                                v12 ^= *v36;
                                if (x30 >= 64)
                                {
                                    v38 = v31 + 1;
                                    v13 ^= *v31;
                                    v39 = arm64g_calculate_condition(4, x30, 64, 0);
                                    v31 = v38;
                                    if (!(v39 & 1))
                                    {
                                        v31 = v38 + 1;
                                        v14 ^= *v38;
                                        if (x30 >= 80)
                                        {
                                            v40 = v31 + 1;
                                            v15 ^= *v31;
                                            v41 = arm64g_calculate_condition(4, x30, 80, 0);
                                            v31 = v40;
                                            if (!(v41 & 1))
                                            {
                                                v31 = v40 + 1;
                                                v16 ^= *v40;
                                                if (x30 >= 96)
                                                {
                                                    v42 = v31 + 1;
                                                    v17 ^= *v31;
                                                    v43 = arm64g_calculate_condition(4, x30, 96, 0);
                                                    v31 = v42;
                                                    if (!(v43 & 1))
                                                    {
                                                        v31 = v42 + 1;
                                                        v18 ^= *v42;
                                                        if (x30 >= 112)
                                                        {
                                                            v44 = v31 + 1;
                                                            v19 ^= *v31;
                                                            v45 = arm64g_calculate_condition(4, x30, 112, 0);
                                                            v31 = v44;
                                                            if (!(v45 & 1))
                                                            {
                                                                v31 = v44 + 1;
                                                                v20 ^= *v44;
                                                                if (x30 >= 128)
                                                                {
                                                                    v46 = v31 + 1;
                                                                    v21 ^= *v31;
                                                                    v47 = arm64g_calculate_condition(4, x30, 128, 0);
                                                                    v31 = v46;
                                                                    if (!(v47 & 1))
                                                                    {
                                                                        v31 = v46 + 1;
                                                                        v22 ^= *v46;
                                                                        if (x30 >= 144)
                                                                        {
                                                                            v48 = v31 + 1;
                                                                            v23 ^= *v31;
                                                                            v49 = arm64g_calculate_condition(4, x30, 144, 0);
                                                                            v31 = v48;
                                                                            if (!(v49 & 1))
                                                                            {
                                                                                v31 = v48 + 1;
                                                                                v24 ^= *v48;
                                                                                if (x30 >= 160)
                                                                                {
                                                                                    v50 = v31 + 1;
                                                                                    v25 ^= *v31;
                                                                                    v51 = arm64g_calculate_condition(4, x30, 160, 0);
                                                                                    v31 = v50;
                                                                                    if (!(v51 & 1))
                                                                                    {
                                                                                        v31 = v50 + 1;
                                                                                        v26 ^= *v50;
                                                                                        if (x30 >= 176)
                                                                                        {
                                                                                            v52 = v31 + 1;
                                                                                            v27 ^= *v31;
                                                                                            v53 = arm64g_calculate_condition(4, x30, 176, 0);
                                                                                            v31 = v52;
                                                                                            if (!(v53 & 1))
                                                                                            {
                                                                                                v31 = v52 + 1;
                                                                                                v28 ^= *v52;
                                                                                                if (x30 >= 192)
                                                                                                {
                                                                                                    v54 = v31 + 1;
                                                                                                    v29 ^= *v31;
                                                                                                    v55 = arm64g_calculate_condition(4, x30, 192, 0);
                                                                                                    v31 = v54;
                                                                                                    if (!(v55 & 1))
                                                                                                    {
                                                                                                        v31 = v54 + 1;
                                                                                                        v30 ^= *v54;
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
        v0 = v31;
        v6 = sub_abc5a0(v6 ^ *i);
        a3 = v1;
    }
    *a0 = v6;
    a0[1] = v7;
    a0[2] = v8;
    a0[3] = v9;
    a0[4] = v10;
    a0[5] = v11;
    a0[6] = v12;
    a0[7] = v13;
    a0[8] = v14;
    a0[9] = v15;
    a0[10] = v16;
    a0[11] = v17;
    a0[12] = v18;
    a0[13] = v19;
    a0[14] = v20;
    a0[15] = v21;
    a0[16] = v22;
    a0[0x11] = v23;
    a0[18] = v24;
    a0[19] = v25;
    a0[20] = v26;
    a0[21] = v27;
    a0[22] = v28;
    a0[23] = v29;
    a0[24] = v30;
    return iter;
}
