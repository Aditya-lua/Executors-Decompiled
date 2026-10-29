/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a33e0..0x9a3b04 (1828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a33e0_0 {
    void* field_0;
    unsigned long long field_8;
} st_9a33e0_0;

extern char g_10002b0;

char sub_9a33e0(void* a0, st_9a33e0_0 *a1)
{
    char v9;  // x10
    unsigned long v10;  // x8
    char v19;  // x8
    char v20;  // x21
    unsigned long v21;  // x27
    unsigned int *v22;  // x22
    char v23;  // x0
    char idx;  // x23
    char v25;  // w0
    char v26;  // x0
    char v27;  // x1
    unsigned long v28;  // x26
    char v11;  // x8
    unsigned long long v29;  // x0
    char v30;  // x10
    char v31;  // x8
    unsigned long long v32;  // 4117
    unsigned long v33;  // x9
    unsigned long v34;  // x11
    char v35;  // x9
    unsigned long v36;  // cc_dep2
    unsigned long v37;  // x10
    unsigned long long v38;  // 4110
    char v12;  // x23
    unsigned long long v39;  // 4106
    unsigned long long v40;  // 4110
    unsigned long long v41;  // 4106
    char v42;  // x0
    char v43;  // x0
    char v44;  // w0
    char v45;  // x9
    unsigned long v46;  // x8
    char v47;  // x8
    char v48;  // w9
    char v13;  // w28
    unsigned long v49;  // x10
    unsigned long v50;  // x11
    unsigned long v51;  // x8
    long long v52;  // x1
    long long v53;  // x1
    long long v54;  // x1
    void* v55;  // x0
    long long v56;  // x1
    long long v57;  // x2
    char v58;  // w0
    char v14;  // w24
    unsigned long v15;  // x25
    unsigned long v16;  // x22
    unsigned long v17;  // x9
    char v18;  // x26
    unsigned int v0;  // [bp-0x2a0]
    unsigned int v1;  // [bp-0x29c]
    unsigned long v2;  // [bp-0x298]
    unsigned int v3;  // [bp-0x28c]
    unsigned long v4;  // [bp-0x288]
    char v5;  // [bp-0x278]
    unsigned long v6;  // [bp-0x70]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v5 = 0;
    if ((char)a0[2832] & 3)
    {
        v9 = a1->field_8 - 2;
        if (a1->field_8 < 2 || (v10 = *(short *)a1->field_0, v11 = (unsigned int)((v10 & 0xff00) >> 8) | (unsigned int)v10 * 0x100 & 0xff00ff00, v11 > v9))
        {
            sub_a368c8();
            v53 = 1328;
            goto LABEL_9a3460;
        }
        v12 = 0;
        v13 = 0;
        v14 = 0;
        v15 = (long long)a0[8];
        v4 = (long long)a0[64];
        v16 = a1->field_0 + 2;
        a1->field_0 = v16 + v11;
        a1->field_8 = v9 - v11;
        *(unsigned int *)&a0[2656] = 0;
        if (v11 == 1)
        {
LABEL_9a3814:
            sub_a368c8();
            v53 = 1340;
            goto LABEL_9a3460;
        }
        while (1)
        {
            if (!v11)
            {
                v43 = v5;
LABEL_9a3834:
                if (!v43)
                    goto LABEL_9a39f8;
                v44 = sub_a50ac8(v12);
                if (v44 < 1)
                    goto LABEL_9a395c;
                v45 = a1->field_8 - 2;
                if (a1->field_8 < 2 || (v46 = *(short *)a1->field_0, v47 = (unsigned int)((v46 & 0xff00) >> 8) | (unsigned int)v46 * 0x100 & 0xff00ff00, v47 > v45))
                {
                    sub_a368c8();
                    v52 = 1528;
                    goto LABEL_9a388c;
                }
                else
                {
                    v48 = 0;
                    v49 = a1->field_0 + 2;
                    a1->field_0 = v49 + v47;
                    a1->field_8 = v45 - v47;
                    do
                    {
                        if (!v47 || (v50 = *(char *)v49, v51 = v47 - 1, v47 = v51 - v50, v51 < v50))
                        {
                            sub_a368c8();
                            v52 = 0x5fe;
                            goto LABEL_9a388c;
                        }
                    } while ((v49 = v49 + 1 + v50, v48 += 1, v48 <= v14));
                    if (v44 == (unsigned int)v50)
                    {
                        v0 = v13;
                        if (sub_99b3fc(a0, v12, *(long long *)((long long)a0[248] + 8)) == 1)
                        {
                            *(unsigned int *)&a0[2872] = v14;
                            sub_9662a0((long long)a0[0x900]);
                            *(unsigned long long *)&a0[0x900] = v5;
                            goto LABEL_9a39f8;
                        }
LABEL_9a395c:
                        sub_9662a0(v5);
                        v58 = 0;
                        break;
                    }
                    else
                    {
                        sub_a368c8();
                        v52 = 1540;
                        goto LABEL_9a388c;
                    }
                }
            }
            v17 = *(short *)v16;
            v18 = (unsigned int)((v17 & 0xff00) >> 8) | (unsigned int)v17 * 0x100 & 0xff00ff00;
            v19 = v11 - 2;
            v20 = v19 - v18;
            if (v19 < v18 || v20 <= 3)
                goto LABEL_9a3814;
            if (!v18)
            {
                sub_a368c8();
                v53 = 1346;
LABEL_9a3460:
                sub_a369bc("ssl/statem/extensions_srvr.c", v53, "tls_parse_ctos_psk");
                goto LABEL_9a3470;
            }
            v21 = v16 + 2;
            v22 = v21 + v18;
            v16 = v22 + 1;
            v3 = *v22;
            if ((long long)a0[2432])
                (long long)a0[2432]();
            if (v5)
            {
                v23 = sub_965e7c(v5, 0);
                if (v23)
                {
                    idx = v23;
                    sub_9662a0(v5);
                    v5 = idx;
                    _memcpy(idx + 640, a0 + 2272, (long long)a0[2264]);
                    *(long long *)(idx + 632) = (long long)a0[2264];
                    if (!v14)
                        *(unsigned int *)&a0[2844] = 1;
                    v13 = 1;
                    *(unsigned int *)&a0[2656] = 1;
                    goto LABEL_9a3554;
                }
                else
                {
                    sub_a368c8();
                    v54 = 1411;
                    goto LABEL_9a3940;
                }
                goto LABEL_9a3940;
            }
            if (0x100 >= v18 && (long long)a0[2424])
            {
                v2 = v15;
                sub_a6c2e4(0, "include/internal/packet.h", 483);
                if (sub_a6da14(v21, v18, "include/internal/packet.h", 486))
                {
                    v1 = v14;
                    (long long)a0[2424]();
                }
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions_srvr.c", 1365, "tls_parse_ctos_psk");
LABEL_9a3470:
                sub_9a58a4();
                v58 = 0;
                break;
            }
            if ((unsigned long long)((long long)a0[2480]) >> 14 & 1 || !((unsigned long long)((long long)a0[2480]) >> 24 & 1) && (int)a0[5440])
            {
                *(unsigned int *)&a0[2656] = 1;
                if (v18 == 32 && (v26 = sub_9663bc(a0, v21, 32), v26))
                {
                    v5 = v26;
                    goto LABEL_9a3744;
                }
            }
            else
            {
                v25 = sub_96a9b8(a0, v21, v18, 0, 0, &v5);
                if (v25 == 3)
                {
                    sub_a368c8();
                    v52 = 1446;
LABEL_9a388c:
                    sub_a369bc("ssl/statem/extensions_srvr.c", v52, "tls_parse_ctos_psk");
                    v55 = a0;
                    v56 = 50;
                    v57 = 110;
                    goto LABEL_9a3954;
                }
                if (v25 <= 1)
                {
                    sub_a368c8();
                    v54 = 1452;
LABEL_9a3940:
                    sub_a369bc("ssl/statem/extensions_srvr.c", v54, "tls_parse_ctos_psk");
                    v55 = a0;
                    v56 = 80;
                    v57 = 786691;
LABEL_9a3954:
                    sub_9a58a4(v55, v56, v57, 0);
                    goto LABEL_9a395c;
                }
                else if (v25 != 2 && v25 != 4)
                {
LABEL_9a3744:
                    if ((int)a0[5440])
                    {
                        v27 = v5;
                        if ((char)a0[2483] & 1 || (v27 = v5, sub_966abc((long long)a0[2952])))
                        {
                            v28 = v15;
                            goto LABEL_9a3778;
                        }
                        else
                        {
                            sub_9662a0(v27);
                            v5 = 0;
                        }
                    }
                    else
                    {
                        v28 = v15;
                        v27 = v5;
LABEL_9a3778:
                        v29 = sub_a7c2c0();
                        idx = v5;
                        if (v14)
                        {
LABEL_9a3788:
                            v15 = v28;
                        }
                        else
                        {
                            if (v29 < (unsigned long long)*(long long *)(idx + 736))
                                v30 = 0;
                            else
                                v30 = v29 - *(long long *)(idx + 736);
                            v31 = v30 + 1000000000;
                            v32 = arm64g_calculate_condition(50, v30, 1000000000, 0);
                            if (!(v32 & 1))
                                v31 = 0xffffffffffffffff;
                            v33 = (unsigned int)((((((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 1000000;
                            v34 = *(int *)(v27 + 832) * 1000000;
                            v35 = v33 - v34;
                            if (v33 < v34)
                                v35 = 0;
                            v36 = v30;
                            if ((unsigned long long)*(long long *)(idx + 728) < v30)
                                goto LABEL_9a3788;
                            v37 = v35 + 10000000000;
                            if (v35 <= v31)
                            {
                                v38 = arm64g_calculate_condition(148, *(long long *)(idx + 728), v36, 0);
                                v15 = v28;
                                v39 = arm64g_calculate_condition(52, (v38 & 1 ? v37 : 0), (v38 & 1 ? v31 : 0), 0);
                                if (!(v39 & 1))
                                    goto LABEL_9a37f8;
                            }
                            else
                            {
                                v40 = arm64g_calculate_condition(148, *(long long *)(idx + 728), v36, 0);
                                v15 = v28;
                                v41 = arm64g_calculate_condition(48, (v40 & 1 ? v37 : 0), (v40 & 1 ? v31 : 0), 0);
                                if (!(v41 & 1))
                                {
LABEL_9a37f8:
                                    *(unsigned int *)&a0[2844] = 1;
                                }
                            }
                        }
LABEL_9a3554:
                        v42 = sub_95a688(v15, *(int *)(*(long long *)(idx + 760) + 64));
                        if (v42)
                        {
                            v12 = v42;
                            v43 = v5;
                            if (sub_a509f4(v12, sub_a50a58(sub_95a688(v15, *(int *)((long long)a0[0x300] + 64)), *(int *)((long long)a0[0x300] + 64))))
                                goto LABEL_9a3834;
                            sub_9662a0(v43);
                            v5 = 0;
                            *(unsigned int *)&a0[2844] = 0;
                            *(unsigned int *)&a0[2656] = 1;
                        }
                        else
                        {
                            sub_a368c8();
                            v54 = 1498;
                            goto LABEL_9a3940;
                        }
                    }
                }
            }
            v11 = v20 - 4;
            v14 += 1;
            if (v11 == 1)
                goto LABEL_9a3814;
        }
    }
    else
    {
LABEL_9a39f8:
        v58 = 1;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v58;
    ___stack_chk_fail();
}
