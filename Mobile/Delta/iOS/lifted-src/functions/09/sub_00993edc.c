/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x993edc..0x9946a4 (1992 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_993edc_0 {
    char padding_0[24];
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
} st_993edc_0;

extern char g_10002b0;

unsigned int sub_993edc(void* a0)
{
    void* v8;  // x20
    void* v18;  // x0
    long long v19;  // x1
    long long v20;  // x2
    unsigned int v21;  // w0
    unsigned long long v22;  // x24
    unsigned long long v23;  // 4118
    long long v24;  // x26
    unsigned long long idx;  // x25
    unsigned long long v26;  // x24
    unsigned long v27;  // x1
    unsigned long v10;  // x21
    unsigned long long v28;  // x0
    uint128_t v29;  // q1
    uint128_t v30;  // q0
    void* v32;  // x0
    long long v33;  // x2
    unsigned int v11;  // w24
    unsigned int v12;  // w26
    unsigned long v13;  // x25
    unsigned long long v14;  // w0
    unsigned long long v15;  // w8
    unsigned long long v16;  // x8
    unsigned long v17;  // x9
    unsigned long v0;  // [bp-0xd8]
    st_993edc_0 *v1;  // [bp-0xd0]
    unsigned long v2;  // [bp-0xc8]
    unsigned long long v3;  // [bp-0xb8]
    unsigned long long v4;  // [bp-0xb0]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    *(unsigned long long *)&a0[4064] = 0;
    *(uint128_t *)&a0[4048] = 0;
    if ((long long)a0[1696] || sub_9972a0(a0))
    {
        v8 = a0 + 1744;
        v1 = a0 + 4048;
        v2 = a0 + 4344;
        v10 = a0 + 0x1000;
        while (1)
        {
            if ((int)a0[4072] != 241 || 13 > (unsigned long long)(long long)a0[0xff8])
                (*(long long *)((long long)a0[4416] + 32))();
            if ((unsigned long long)(long long)a0[1752] > (unsigned long long)((long long)a0[0xff8] - 13))
                (*(long long *)((long long)a0[4416] + 32))();
            *(unsigned int *)&a0[4072] = 240;
            v11 = (short)a0[1800];
            v12 = (short)a0[48];
            v13 = a0 + 4328;
            if (v11 == v12 || (v13 = v2, v12 + 1 == v11))
            {
                v14 = (unsigned int)sub_994b28(v10, v13 + 8);
                if (v14 > 0 || !(v15 = -v14, 63 < -v14 || (unsigned long long)(*(long long *)v13) >> ((char)-v14 & 63) & 1))
                {
                    sub_996e78(v8, v10);
                    v16 = (long long)a0[1752];
                    if (!v16)
                        continue;
                    if (v11 == v12)
                    {
                        v3 = 0;
                        v4 = 0;
                        v17 = (long long)a0[0xff0] + 13;
                        *(unsigned long *)&a0[1784] = v17;
                        if (17729 <= v16)
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/record/methods/dtls_meth.c", 141, "dtls_process_record");
                            v18 = a0;
                            v19 = 22;
                            v20 = 150;
                            goto LABEL_993f8c;
                        }
                        *(unsigned long *)&a0[1776] = v17;
                        *(unsigned long long *)&a0[1760] = v16;
                        if ((long long)a0[4152] && sub_a2d030((long long)a0[4152]))
                        {
                            v21 = sub_a50ac8();
                            if (63 >= v21 - 1)
                            {
                                v22 = v21;
                                if (!(int)a0[4272])
                                {
                                    sub_a36c8c();
                                    (*(long long *)((long long)a0[4416] + 8))();
                                }
                                goto LABEL_9942b8;
                            }
                            else
                            {
                                sub_c64bf0(a0);
LABEL_993f94:
                                v23 = arm64g_calculate_condition(0x11, (int)a0[4104], 1, 0);
                                if (v23 & 1)
                                    break;
                            }
                        }
                        else
                        {
                            v22 = 0;
                            if (!(int)a0[4272])
                            {
                                sub_a36c8c();
                                (*(long long *)((long long)a0[4416] + 8))();
                            }
LABEL_9942b8:
                            if (!(long long)a0[4152])
                            {
                                sub_a36c8c();
                                (*(long long *)((long long)a0[4416] + 8))();
                            }
                            if (v22 > (unsigned long long)(long long)a0[1760])
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/record/methods/dtls_meth.c", 166, "dtls_process_record");
                                v18 = a0;
                                v19 = 50;
                                v20 = 160;
                            }
                            else
                            {
                                *(unsigned long long *)&a0[1752] = (long long)a0[1752] - v22;
                                v0 = (long long)a0[1776];
                                (*(long long *)((long long)a0[4416] + 16))();
                            }
LABEL_993f8c:
                            sub_996e84(v18, v19, v20, 0);
                            goto LABEL_993f94;
                        }
                    }
                    else if ((int)a0[4360] && !(v24 = (long long)a0[4320], 15 < sub_9543c0(v24)))
                    {
                        idx = sub_a6bf4c(88, "ssl/record/methods/dtls_meth.c", 293);
                        v26 = sub_954220(a0 + 1802, idx);
                        if (idx && v26)
                        {
                            v27 = (long long)a0[0xff8];
                            *(unsigned long *)(idx + 8) = v27;
                            v28 = sub_a6dac4((long long)a0[0xff0], v27, "ssl/record/methods/dtls_meth.c", 308);
                            *(unsigned long long *)idx = v28;
                            if (v28)
                            {
                                v29 = (int128_t)v8[48];
                                *(int128_t *)(idx + 48) = (int128_t)v8[32];
                                *(uint128_t *)(idx + 64) = v29;
                                *(long long *)(idx + 80) = (long long)v8[64];
                                v30 = (int128_t)v8[16];
                                *(int128_t *)(idx + 16) = *(int128_t *)v8;
                                *(uint128_t *)(idx + 32) = v30;
                                *(unsigned long long *)(v26 + 8) = idx;
                                if (!sub_954298(v24, v26))
                                {
                                    sub_a6c2e4(*(long long *)idx, "ssl/record/methods/dtls_meth.c", 321);
                                    sub_a6c2e4(idx, "ssl/record/methods/dtls_meth.c", 322);
                                    sub_954264(v26);
                                }
                            }
                            else
                            {
                                sub_a6c2e4(idx, "ssl/record/methods/dtls_meth.c", 310);
                                sub_a368c8(sub_954264(v26));
                                sub_a369bc("ssl/record/methods/dtls_meth.c", 312, "dtls_rlayer_buffer_record");
                                v32 = a0;
                                v33 = 524303;
LABEL_99464c:
                                sub_996e84(v32, 80, v33, 0);
                                break;
                            }
                        }
                        else
                        {
                            sub_a6c2e4(idx, "ssl/record/methods/dtls_meth.c", 296);
                            sub_a368c8(sub_954264(v26));
                            sub_a369bc("ssl/record/methods/dtls_meth.c", 298, "dtls_rlayer_buffer_record");
                            v32 = a0;
                            v33 = 786691;
                            goto LABEL_99464c;
                        }
                    }
                }
            }
            *(unsigned long long *)&a0[1752] = 0;
            *(unsigned long long *)&a0[0xff8] = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return 0xfffffffe;
    ___stack_chk_fail();
}
