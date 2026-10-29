/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa262b4..0xa26944 (1680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a262b4_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
} st_a262b4_0;

extern char g_10002b0;

unsigned long long sub_a262b4(unsigned long a0, void* a1, unsigned long long *a2, st_a262b4_0 **a3, unsigned long long a4, long long a5)
{
    long long v3;  // x24
    unsigned long long *v4;  // x25
    unsigned long long v13;  // x9
    unsigned long long v14;  // x10
    unsigned long long v15;  // x11
    uint128_t v16;  // q1
    unsigned long v17;  // x9
    unsigned long v18;  // x8
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4102
    long long v22;  // x0
    unsigned long long v5;  // x0
    long long v23;  // x1
    long long v24;  // x2
    uint128_t *v25;  // x8
    uint128_t v26;  // q1
    uint128_t v27;  // q1
    uint128_t v28;  // q1
    uint128_t *v29;  // x8
    uint128_t v30;  // q1
    uint128_t v31;  // q1
    uint128_t v32;  // q0
    unsigned long long v6;  // x19
    unsigned long v34;  // d0
    uint128_t v35;  // q1
    uint128_t *v36;  // x8
    uint128_t v37;  // q1
    unsigned long long v38;  // w8
    unsigned int v39;  // w26
    unsigned int v40;  // w19
    unsigned int v41;  // w25
    unsigned long long v42;  // w24
    unsigned long long idx;  // x27
    uint128_t *v43;  // x8
    uint128_t v44;  // q1
    uint128_t v45;  // q1
    uint128_t v46;  // q1
    unsigned long long v47;  // 4124
    long long v48;  // x1
    uint128_t *v8;  // x28
    unsigned long long v9;  // x26
    unsigned long long v10;  // x0
    uint128_t *v11;  // x24
    unsigned long long v12;  // x8
    char v0;  // [bp-0x8c0]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    xsp = &v0 & 0xffffffffffffffc0;
    *(unsigned long *)(xsp + 56) = a0;
    *(long long *)(xsp + 2136) = *(long long *)&g_10002b0;
    *(uint128_t *)(xsp + 416) = 0;
    *(uint128_t *)(xsp + 432) = 0;
    if (22369621 >= a4)
    {
        v3 = a5;
        v4 = a2;
        v5 = sub_a6bf4c(a4 * 8, "crypto/ec/ecp_sm2p256.c", 462);
        if (v5)
        {
            v6 = v5;
            memset(a1, 0, 96);
            if (a4)
            {
                idx = 0;
                v8 = xsp + 576;
                *(long long *)(xsp + 32) = v3;
                *(unsigned long long *)(xsp + 40) = v6;
                *(unsigned long long **)(xsp + 48) = v4;
                *(void* *)(xsp + 24) = a1;
                do
                {
                    if (sub_a1b4f4(*(long long *)(xsp + 56), a3[idx]))
                        continue;
                    if (0x100 < (int)sub_9e46a8(v4[idx]) || sub_9e5c94(v4[idx]))
                    {
                        v10 = sub_9de208(v3);
                        if (!v10)
                        {
                            sub_a6c2e4(v6, "crypto/ec/ecp_sm2p256.c", 502);
                            if (*(long long *)&g_10002b0 == *(long long *)(xsp + 2136))
                                return 0;
                            ___stack_chk_fail();
                        }
                        v9 = v10;
                        if (!sub_9e5dac())
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/ec/ecp_sm2p256.c", 479, "ecp_sm2p256_windowed_mul");
                            v48 = 524291;
LABEL_a268b8:
                            sub_a36abc(16, v48, 0);
                            sub_a6c2e4(v6, "crypto/ec/ecp_sm2p256.c", 502);
                            if (*(long long *)&g_10002b0 == *(long long *)(xsp + 2136))
                                return 0;
                            ___stack_chk_fail();
                        }
                    }
                    else
                    {
                        v9 = v4[idx];
                    }
                    *(unsigned long long *)(v6 + idx * 8) = v9;
                    v11 = xsp + 64;
                    if ((int)sub_9e42c8(xsp + 416, v9, 4) >= 1 && (int)sub_9e42c8(xsp + 64, a3[idx]->field_10, 4) >= 1 && (int)sub_9e42c8(v11 + 2, a3[idx]->field_18, 4) >= 1 && (int)sub_9e42c8(v11 + 4, a3[idx]->field_20, 4) > 0)
                    {
                        memset(xsp + 448, 0, 64);
                        v12 = *(long long *)(xsp + 128);
                        v13 = *(long long *)(xsp + 0x88);
                        v14 = *(long long *)(xsp + 144);
                        v15 = *(long long *)(xsp + 152);
                        if (v13 || v14 || v12 ^ 1 || v15)
                        {
                            *(uint128_t *)(xsp + 544) = 1;
                            *(uint128_t *)(xsp + 560) = 0;
                            *(uint128_t *)(xsp + 0x200) = 0;
                            *(uint128_t *)(xsp + 528) = 0;
                            if (v14 || v13 || v12 || v15)
                            {
                                v16 = v11[5];
                                *(uint128_t *)(xsp + 576) = v11[4];
                                *(uint128_t *)(xsp + 592) = v16;
                                *(uint128_t *)(xsp + 352) = 0xffffffff00000000ffffffffffffffff;
                                *(uint128_t *)(xsp + 368) = 0xfffffffeffffffffffffffffffffffff;
                                v17 = *(long long *)(xsp + 576);
                                if (*(long long *)(xsp + 584) || *(long long *)(xsp + 592) || *(long long *)(xsp + 576) ^ 1 || *(long long *)(xsp + 600))
                                {
                                    do
                                    {
                                        v18 = *(long long *)(xsp + 352);
                                        if (!*(long long *)(xsp + 360) && !*(long long *)(xsp + 368) && !(*(long long *)(xsp + 352) ^ 1) && !*(long long *)(xsp + 376))
                                        {
                                            v25 = xsp + 0x200;
                                            goto LABEL_a26658;
                                        }
                                        if (!(v17 & 1))
                                        {
                                            do
                                            {
                                                sub_a25400(xsp + 576);
                                                sub_a25480(xsp + 544, xsp + 544);
                                            } while (!(*(char *)(xsp + 576) & 1));
                                            v18 = *(long long *)(xsp + 352);
                                        }
                                        if (!(v18 & 1))
                                        {
                                            do
                                            {
                                                sub_a25400(xsp + 352);
                                                sub_a25480(xsp + 0x200, xsp + 0x200);
                                                v18 = *(long long *)(xsp + 352);
                                            } while (!(v18 & 1));
                                        }
                                        if ((unsigned long long)*(long long *)(xsp + 376) < (unsigned long long)*(long long *)(xsp + 600) || (v19 = arm64g_calculate_condition(36, *(long long *)(xsp + 600), *(long long *)(xsp + 376), 0), v19 & 1 && ((unsigned long long)*(long long *)(xsp + 368) < (unsigned long long)*(long long *)(xsp + 592) || (v20 = arm64g_calculate_condition(52, *(long long *)(xsp + 592), *(long long *)(xsp + 368), 0), !(v20 & 1) && ((unsigned long long)*(long long *)(xsp + 360) < (unsigned long long)*(long long *)(xsp + 584) || (v21 = arm64g_calculate_condition(52, *(long long *)(xsp + 584), *(long long *)(xsp + 360), 0), !(v21 & 1) && v18 < (unsigned long long)*(long long *)(xsp + 576)))))))
                                        {
                                            sub_a25440(xsp + 576, xsp + 576, xsp + 352);
                                            v22 = xsp + 544;
                                            v23 = xsp + 544;
                                            v24 = xsp + 0x200;
                                        }
                                        else
                                        {
                                            sub_a25440(xsp + 352, xsp + 352, xsp + 576);
                                            v22 = xsp + 0x200;
                                            v23 = xsp + 0x200;
                                            v24 = xsp + 544;
                                        }
                                        sub_a256a0(v22, v23, v24);
                                        v17 = *(long long *)(xsp + 576);
                                    } while (*(long long *)(xsp + 584) || *(long long *)(xsp + 592) || v17 ^ 1 || *(long long *)(xsp + 600));
                                }
                                v25 = xsp + 544;
LABEL_a26658:
                                v26 = v25[1];
                                *(uint128_t *)(xsp + 480) = *v25;
                                *(uint128_t *)(xsp + 496) = v26;
                            }
                            sub_a25aa0(xsp + 448, xsp + 480);
                            sub_a257a0(xsp + 160, xsp + 64, xsp + 448);
                            sub_a257a0(xsp + 480, xsp + 480, xsp + 448);
                            sub_a257a0(xsp + 192, v11 + 2, xsp + 480);
                        }
                        else
                        {
                            v27 = *(int128_t *)(xsp + 80);
                            *(int128_t *)(xsp + 160) = *(int128_t *)(xsp + 64);
                            *(uint128_t *)(xsp + 176) = v27;
                            v28 = v11[3];
                            v29 = xsp + 160;
                            v29[2] = v11[2];
                            v29[3] = v28;
                        }
                        v30 = *(int128_t *)(xsp + 176);
                        *(int128_t *)(xsp + 352) = *(int128_t *)(xsp + 160);
                        *(uint128_t *)(xsp + 368) = v30;
                        v31 = *(int128_t *)(xsp + 208);
                        *(int128_t *)(xsp + 384) = *(int128_t *)(xsp + 192);
                        *(uint128_t *)(xsp + 400) = v31;
                        memset(xsp + 0x100, 0, 96);
                        v32 = *(int128_t *)(xsp + 416) | *(int128_t *)(xsp + 432);
                        v34 = __dirty_unsupported_Iop_ZeroHI64ofV128(v32 | __dirty_unsupported_Iop_SliceV128(v32, v32, 8));
                        if (__double_as_longlong(v34))
                        {
                            v35 = *(int128_t *)(xsp + 176);
                            v8[6] = *(int128_t *)(xsp + 160);
                            v8[7] = v35;
                            v36 = xsp + 160;
                            v37 = v36[3];
                            v8[8] = v36[2];
                            v8[9] = v37;
                            *(unsigned long long *)(xsp + 736) = 1;
                            memset((char *)&v8[10] + 8, 0, 24);
                            sub_a26f30(v8 + 12, v8 + 6);
                            sub_a26cc0(v8 + 18, v8 + 12, xsp + 352);
                            sub_a26cc0(v8 + 24, v8 + 18, xsp + 352);
                            sub_a26cc0(v8 + 30, v8 + 24, xsp + 352);
                            sub_a26cc0(v8 + 36, v8 + 30, xsp + 352);
                            sub_a26cc0(v8 + 42, v8 + 36, xsp + 352);
                            sub_a26cc0(v8 + 48, v8 + 42, xsp + 352);
                            sub_a26cc0(v8 + 54, v8 + 48, xsp + 352);
                            sub_a26cc0(v8 + 60, v8 + 54, xsp + 352);
                            sub_a26cc0(v8 + 66, v8 + 60, xsp + 352);
                            sub_a26cc0(v8 + 72, v8 + 66, xsp + 352);
                            sub_a26cc0(v8 + 78, v8 + 72, xsp + 352);
                            sub_a26cc0(v8 + 84, v8 + 78, xsp + 352);
                            sub_a26cc0(v8 + 90, v8 + 84, xsp + 352);
                            v38 = 0;
                            v39 = 63;
                            v40 = 252;
                            do
                            {
                                v41 = (unsigned long long)(*(long long *)(xsp + 416 + (v39 >> 4) * 8)) >> ((char)v40 & 60 & 63);
                                v42 = v41 & 15;
                                if (v38)
                                {
                                    sub_a26f30(xsp + 0x100, xsp + 0x100);
                                    sub_a26f30(xsp + 0x100, xsp + 0x100);
                                    sub_a26f30(xsp + 0x100, xsp + 0x100);
                                    sub_a26f30(xsp + 0x100, xsp + 0x100);
                                    if (v42)
                                        sub_a26944(xsp + 0x100, xsp + 0x100, (char *)v8 + (v41 & 15) * 96);
                                }
                                else if (v42)
                                {
                                    v43 = (char *)v8 + (v41 & 15) * 96;
                                    v44 = v43[3];
                                    *(uint128_t *)(xsp + 288) = v43[2];
                                    *(uint128_t *)(xsp + 304) = v44;
                                    v45 = v43[5];
                                    *(uint128_t *)(xsp + 320) = v43[4];
                                    *(uint128_t *)(xsp + 336) = v45;
                                    v46 = v43[1];
                                    *(uint128_t *)(xsp + 0x100) = *v43;
                                    *(uint128_t *)(xsp + 272) = v46;
                                }
                                else
                                {
                                    v38 = 0;
                                    continue;
                                }
                                v38 = 1;
                            } while ((v39 -= 1, v40 -= 4, v47 = arm64g_calculate_condition(1, v39, 1, 0), !(v47 & 1)));
                        }
                        sub_a26944(*(long long *)(xsp + 24), *(long long *)(xsp + 24), xsp + 0x100);
                        v3 = *(long long *)(xsp + 32);
                        v6 = *(long long *)(xsp + 40);
                        v4 = *(long long *)(xsp + 48);
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ecp_sm2p256.c", 491, "ecp_sm2p256_windowed_mul");
                        v48 = 146;
                        goto LABEL_a268b8;
                    }
                } while ((idx = (unsigned int)idx + 1, (unsigned int)a4 > (unsigned int)idx));
            }
            sub_a6c2e4(v6, "crypto/ec/ecp_sm2p256.c", 502);
            if (*(long long *)&g_10002b0 == *(long long *)(xsp + 2136))
                return 1;
            ___stack_chk_fail();
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ecp_sm2p256.c", 463, "ecp_sm2p256_windowed_mul");
    sub_a36abc(16, 0xc0100, 0);
    sub_a6c2e4(0, "crypto/ec/ecp_sm2p256.c", 502);
    if (*(long long *)&g_10002b0 == *(long long *)(xsp + 2136))
        return 0;
    ___stack_chk_fail();
}
