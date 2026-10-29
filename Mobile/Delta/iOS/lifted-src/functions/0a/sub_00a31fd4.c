/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa31fd4..0xa327ec (2072 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a327ec;
extern unsigned int g_f086d0;
extern long long g_f0d560;

double sub_a31fd4(uint128_t *a0, int a1, unsigned long long a2, unsigned long long a3)
{
    unsigned int v20;  // w0
    unsigned long long v21;  // 4112
    unsigned long v30;  // d0
    unsigned long long v31;  // x0
    unsigned long long v32;  // w0
    unsigned long long v33;  // x22
    long long v34;  // x0
    unsigned long long v35;  // x0
    unsigned long long v36;  // x24
    unsigned long v37;  // d0
    unsigned long long v38;  // x0
    long long v39;  // x0
    unsigned long long idx;  // x19
    unsigned long v40;  // d0
    unsigned long long v41;  // x0
    unsigned long long v42;  // x22
    unsigned long v43;  // x22
    long long v44;  // x0
    long long v45;  // x0
    unsigned long v46;  // d0
    unsigned long long v47;  // x0
    unsigned long v48;  // d0
    unsigned long long v49;  // x20
    unsigned long long v23;  // x0
    unsigned long v50;  // d0
    unsigned long v57;  // d0
    unsigned long v59;  // d0
    unsigned long long *v24;  // x24
    unsigned long v60;  // d0
    unsigned long long v25;  // x0
    unsigned long long v26;  // x26
    long long v28;  // x1
    unsigned long v29;  // d0
    unsigned long long v0;  // [bp-0x160]
    char v1;  // [bp-0x158]
    char v2;  // [bp-0x150]
    char v3;  // [bp-0x148]
    uint128_t v4;  // [bp-0x140]
    uint128_t v5;  // [bp-0x130]
    uint128_t v6;  // [bp-0x120]
    uint128_t v7;  // [bp-0x110]
    uint128_t v8;  // [bp-0x100]
    uint128_t v9;  // [bp-0xf0]
    uint128_t v10;  // [bp-0xe0]
    uint128_t v11;  // [bp-0xd0]
    uint128_t v12;  // [bp-0xc0]
    uint128_t v13;  // [bp-0xb0]
    uint128_t v14;  // [bp-0xa0]
    uint128_t v15;  // [bp-0x90]
    uint128_t v16;  // [bp-0x80]
    uint128_t v17;  // [bp-0x70]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    if ((int)g_f086d0 < 0)
    {
        v20 = sub_a6a3e8(10, 0, 0, 0, 0, &g_a327ec);
        v21 = arm64g_calculate_condition(1, v20, 1, 0);
        if (v21 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_dyn.c", 213, "dynamic_get_data_ctx");
            sub_a36abc(38, 144, 0);
        }
        else if (sub_a7c198(g_f0d560))
        {
            if ((int)g_f086d0 < 0)
                g_f086d0 = v20;
            sub_a7c1b4(g_f0d560);
            goto LABEL_a32010;
        }
LABEL_a32324:
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_dyn.c", 295, "dynamic_ctrl");
        sub_a36abc(38, 112, 0);
        return v60;
    }
LABEL_a32010:
    idx = sub_a33290(a0);
    if (!idx)
    {
        v23 = sub_a6bffc(88, "crypto/engine/eng_dyn.c", 159);
        if (!v23)
            goto LABEL_a32324;
        v24 = v23;
        v25 = sub_ad61b4();
        v24[10] = v25;
        if (!v25)
        {
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_dyn.c", 166, "dynamic_set_data_ctx");
            sub_a36abc(38, 0x8000f, 0);
            idx = 0;
            v26 = 1;
            goto LABEL_a32300;
        }
        v24[7] = "v_check";
        v24[8] = "bind_engine";
        v26 = 1;
        *(unsigned int *)&v24[9] = 1;
        if (sub_a7c198(g_f0d560))
        {
            idx = sub_a33290(a0, g_f086d0);
            if (idx || !sub_a33288(a0, g_f086d0, v24))
            {
                sub_a7c1b4(g_f0d560);
                v26 = 0;
LABEL_a32300:
                sub_ad6020(v24[10]);
                sub_a6c2e4(v24, "crypto/engine/eng_dyn.c", 193);
                if (v26 & 1 || !idx)
                    goto LABEL_a32324;
            }
            else
            {
                sub_a7c1b4(g_f0d560);
                sub_a6c2e4(0, "crypto/engine/eng_dyn.c", 193);
                idx = v24;
            }
        }
        else
        {
            idx = 0;
            goto LABEL_a32300;
        }
    }
    if (*(long long *)idx)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_dyn.c", 301, "dynamic_ctrl");
        sub_a36abc(38, 100, 0);
        return v60;
    }
    if (a1 > 202)
    {
        if (0xcc < a1)
        {
            if (a1 != 205)
            {
                if (a1 == 206)
                {
                    v31 = sub_a040c0();
                    *(unsigned long long *)idx = v31;
                    if (!v31)
                        return v46;
                    if (!*(long long *)(idx + 24))
                    {
                        if (*(long long *)(idx + 40))
                        {
                            sub_a0444c();
                            *(unsigned long long *)(idx + 24) = sub_a04658(*(long long *)idx, *(long long *)(idx + 40));
                        }
                        else
                        {
                            return v60;
                        }
                    }
                    if (*(int *)(idx + 72) != 2)
                    {
                        if (sub_a042b8(*(long long *)idx))
                            goto LABEL_a325b0;
                        if (!*(int *)(idx + 72))
                            goto LABEL_a3251c;
                    }
                    v32 = (unsigned int)sub_ad69e4(*(long long *)(idx + 80));
                    if (v32 >= 1)
                    {
                        v33 = 0;
                        while (1)
                        {
                            v34 = sub_ad69f8(*(long long *)(idx + 80), v33);
                            v35 = sub_a045ec(*(long long *)idx, *(long long *)(idx + 24), v34);
                            if (!v35)
                                break;
                            v36 = v35;
                            if (sub_a042b8(*(long long *)idx, v36, 0, 0))
                            {
                                sub_a6c2e4(v36, "crypto/engine/eng_dyn.c", 384);
LABEL_a325b0:
                                v38 = sub_a04518(*(long long *)idx, *(long long *)(idx + 64));
                                *(unsigned long long *)(idx + 16) = v38;
                                if (!v38)
                                {
                                    *(unsigned long long *)(idx + 16) = 0;
                                    v45 = sub_a04184(*(long long *)idx);
                                    *(unsigned long long *)idx = 0;
                                    sub_a368c8(v45);
                                    sub_a369bc("crypto/engine/eng_dyn.c", 440, "dynamic_load");
                                    sub_a36abc(38, 104, 0);
                                    return v60;
                                }
                                if (*(int *)(idx + 32))
                                {
                                    v14 = a0[10];
                                    v15 = a0[11];
                                    v16 = a0[12];
                                    v17 = a0[13];
                                    v10 = a0[6];
                                    v11 = a0[7];
                                    v12 = a0[8];
                                    v13 = a0[9];
                                    v6 = a0[2];
                                    v7 = a0[3];
                                    v8 = a0[4];
                                    v9 = a0[5];
                                    v4 = *a0;
                                    v5 = a0[1];
                                    v0 = sub_a33388();
                                    sub_a6bf18(&v1, &v2, &v3);
                                    sub_a33004(a0);
                                    if (!sub_a33394(a0, *(long long *)(idx + 16), 1))
                                    {
                                        sub_a334a0(a0, 1);
                                        *(unsigned long long *)(idx + 8) = 0;
                                        *(unsigned long long *)(idx + 16) = 0;
                                        v39 = sub_a04184(*(long long *)idx);
                                        *(unsigned long long *)idx = 0;
                                        sub_a368c8(v39);
                                        sub_a369bc("crypto/engine/eng_dyn.c", 498, "dynamic_load");
                                        sub_a36abc(38, 109, 0);
                                        a0[10] = v14;
                                        a0[11] = v15;
                                        a0[12] = v16;
                                        a0[13] = v17;
                                        a0[6] = v10;
                                        a0[7] = v11;
                                        a0[8] = v12;
                                        a0[9] = v13;
                                        a0[2] = v6;
                                        a0[3] = v7;
                                        a0[4] = v8;
                                        a0[5] = v9;
                                        *a0 = v4;
                                        a0[1] = v5;
                                        return v40;
                                    }
                                    (*(long long *)(idx + 16))();
                                }
                                else
                                {
                                    v41 = sub_a04518(*(long long *)idx, *(long long *)(idx + 56));
                                    v42 = idx;
                                    *(unsigned long long *)(v42 + 8) = v41;
                                    v43 = v42 + 8;
                                    if (!v41)
                                    {
                                        *(unsigned long long *)v43 = 0;
                                        *(unsigned long long *)(v43 + 8) = 0;
                                        v44 = sub_a04184(*(long long *)idx);
                                        *(unsigned long long *)idx = 0;
                                        sub_a368c8(v44);
                                        sub_a369bc("crypto/engine/eng_dyn.c", 465, "dynamic_load");
                                        sub_a36abc(38, 145, 0);
                                        return v60;
                                    }
                                    v41();
                                }
                            }
                            sub_a6c2e4(v36, "crypto/engine/eng_dyn.c", 387);
                            v33 = (unsigned int)v33 + 1;
                            if (v32 == (unsigned int)v33)
                                break;
                        }
                    }
LABEL_a3251c:
                    sub_a368c8();
                    sub_a369bc("crypto/engine/eng_dyn.c", 429, "dynamic_load");
                    sub_a36abc(38, 132, 0);
                    sub_a04184(*(long long *)idx);
                    *(unsigned long long *)idx = 0;
                    return v37;
                }
LABEL_a323ac:
                sub_a368c8();
                sub_a369bc("crypto/engine/eng_dyn.c", 364, "dynamic_ctrl");
                sub_a36abc(38, 0x77, 0);
                return v60;
            }
            if (a3 && *(char *)a3)
            {
                v47 = sub_a6d9b4(a3, "crypto/engine/eng_dyn.c", 351);
                if (!v47)
                    return v48;
                v49 = v47;
                if (!sub_ad68a0(*(long long *)(idx + 80), v49))
                {
                    sub_a368c8(sub_a6c2e4(v49, "crypto/engine/eng_dyn.c", 355), "crypto/engine/eng_dyn.c", 355);
                    sub_a369bc("crypto/engine/eng_dyn.c", 356, "dynamic_ctrl");
                    sub_a36abc(38, 0x8000f, 0);
                    return v60;
                }
                return v50;
            }
            sub_a368c8();
            v28 = 347;
        }
        else if (a1 != 203)
        {
            if (a1 != 0xcc)
                goto LABEL_a323ac;
            if (a2 < 3)
            {
                *(unsigned int *)(idx + 72) = a2;
                return v29;
            }
            sub_a368c8();
            v28 = 339;
        }
        else if (a2 >= 3)
        {
            sub_a368c8();
            v28 = 330;
        }
        else
        {
            *(unsigned int *)(idx + 48) = a2;
            return v30;
        }
        sub_a369bc("crypto/engine/eng_dyn.c", v28, "dynamic_ctrl");
        sub_a36abc(38, 143, 0);
        return v60;
    }
    if (a1 == 200)
    {
        if (a3 && *(char *)a3)
        {
            sub_a6c2e4(*(long long *)(idx + 24), "crypto/engine/eng_dyn.c", 309);
            *(unsigned long long *)(idx + 24) = sub_a6d9b4(a3, "crypto/engine/eng_dyn.c", 311);
            return v59;
        }
        sub_a6c2e4(*(long long *)(idx + 24), "crypto/engine/eng_dyn.c", 309);
        *(unsigned long long *)(idx + 24) = 0;
        return v59;
    }
    else if (a1 == 201)
    {
        *(unsigned int *)(idx + 32) = a2 != 0;
        return v57;
    }
    else if (a1 == 202)
    {
        if (a3 && *(char *)a3)
        {
            sub_a6c2e4(*(long long *)(idx + 40), "crypto/engine/eng_dyn.c", 322);
            *(unsigned long long *)(idx + 40) = sub_a6d9b4(a3, "crypto/engine/eng_dyn.c", 324);
            return v59;
        }
        sub_a6c2e4(*(long long *)(idx + 40), "crypto/engine/eng_dyn.c", 322);
        *(unsigned long long *)(idx + 40) = 0;
        return v59;
    }
    goto LABEL_a323ac;
}
