/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x992148..0x9929fc (2228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_992148_2 {
    char padding_0[216];
    void* field_d8;
} st_992148_2;

typedef struct st_992148_3 {
    struct st_992148_4 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_992148_2 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[228];
    unsigned int field_160;
    char padding_164[916];
    unsigned long long field_4f8;
    char padding_500[120];
    unsigned int field_578;
    char padding_57c[900];
    void* field_900;
    void* field_908;
    char padding_910[160];
    char field_9b0;
    char padding_9b1[7];
    char field_9b8;
    char padding_9b9[351];
    unsigned int field_b18;
    char padding_b1c[324];
    unsigned long long field_c60;
    unsigned long long field_c68;
    char padding_c70[32];
    unsigned long long field_c90;
    char field_c98;
    char padding_c99[7];
    char field_ca0;
    char padding_ca1[71];
    unsigned long long field_ce8;
} st_992148_3;

typedef struct st_992148_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_992148_0;

typedef struct st_992148_5 {
    char padding_0[72];
    unsigned long long field_48;
} st_992148_5;

typedef struct st_992148_1 {
    unsigned long long field_0;
} st_992148_1;

typedef struct st_992148_4 {
    struct st_992148_1 *field_0;
} st_992148_4;

extern uint128_t g_e88988;
extern uint128_t g_e88998;
extern uint128_t g_e889a8;
extern uint128_t g_e889b8;
extern unsigned long long g_e889d8;
extern unsigned long long g_e88ce0;
extern char g_10002b0;

unsigned long long sub_992148(st_992148_3 *a0, unsigned int a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7, unsigned long a8, unsigned long long a9, unsigned long long a10, unsigned long long a11, unsigned long long a12, unsigned long long a13, unsigned int a14, unsigned long long a15, unsigned long long a16, unsigned long long a17)
{
    unsigned long v63;  // x8
    unsigned long long v64;  // w8
    unsigned long long v73;  // w8
    unsigned long v74;  // cc_dep1
    unsigned long long v75;  // x8
    unsigned long long v76;  // 4115
    unsigned long long v77;  // 4107
    unsigned long long v78;  // 4107
    st_992148_5 *v79;  // x1
    unsigned int v81;  // w8
    unsigned long v82;  // x9
    unsigned long v65;  // cc_dep1
    unsigned long v83;  // x1
    unsigned long v85;  // x9
    st_992148_0 *iter;  // x27
    unsigned int v87;  // w8
    unsigned long long v88;  // x9
    unsigned long long v89;  // w8
    unsigned int v90;  // w8
    unsigned long long v91;  // x27
    unsigned long long v92;  // x0
    unsigned long long v66;  // w28
    unsigned long v93;  // x8
    uint128_t *v94;  // x10
    unsigned long long v95;  // x8
    unsigned long idx;  // x9
    char *v97;  // x8
    unsigned long long v67;  // x8
    unsigned long long v68;  // 4119
    unsigned long long v69;  // x23
    unsigned long long v70;  // 4107
    unsigned long long v71;  // 4107
    long long v72;  // x8
    unsigned long long v0;  // [bp-0x400]
    unsigned long long v1;  // [bp-0x3f8]
    unsigned long long v2;  // [bp-0x3f0]
    unsigned long v3;  // [bp-0x3e8]
    unsigned long long v4;  // [bp-0x3e0]
    unsigned long long v5;  // [bp-0x3d8]
    unsigned long long v6;  // [bp-0x3d0]
    unsigned long long v7;  // [bp-0x3c8]
    unsigned long long v8;  // [bp-0x3c0]
    unsigned int v9;  // [bp-0x3b8]
    unsigned long long v10;  // [bp-0x3b0]
    unsigned long long v11;  // [bp-0x3a8]
    unsigned long long v12;  // [bp-0x3a0]
    unsigned long long v13;  // [bp-0x398]
    unsigned long long v14;  // [bp-0x390]
    unsigned long long v15;  // [bp-0x388]
    unsigned long long v16;  // [bp-0x380]
    unsigned long long v17;  // [bp-0x378]
    char *v18;  // [bp-0x370]
    unsigned long long v19;  // [bp-0x368]
    char *v20;  // [bp-0x360]
    st_992148_3 *v21;  // [bp-0x358]
    unsigned long v22;  // [bp-0x350]
    unsigned long long *v23;  // [bp-0x348]
    unsigned long long v24;  // [bp-0x338]
    unsigned long long v25;  // [bp-0x330]
    uint128_t *v26;  // [bp-0x328]
    st_992148_3 *v27;  // [bp-0x320]
    uint128_t *v28;  // [bp-0x318]
    unsigned long long v29;  // [bp-0x2e8]
    unsigned long long v30;  // [bp-0x2e0]
    unsigned long v31;  // [bp-0x2d8]
    unsigned int v32;  // [bp-0x2cc]
    unsigned long long v33;  // [bp-0x2c8]
    unsigned int v34;  // [bp-0x29c]
    unsigned int v35;  // [bp-0x298]
    unsigned long long v36;  // [bp-0x294]
    unsigned long long v37;  // [bp-0x290]
    unsigned int v38;  // [bp-0x28c]
    unsigned long long v39;  // [bp-0x288]
    uint128_t v40;  // [bp-0x280]
    uint128_t v41;  // [bp-0x270]
    unsigned long v42;  // [bp-0x260]
    uint320_t v43;  // [bp-0x230]
    unsigned long v44;  // [bp-0x210]
    char v45;  // [bp-0x208]
    uint128_t v46;  // [bp-0x140]
    uint128_t v47;  // [bp-0x130]
    unsigned long v48;  // [bp-0x120]
    uint128_t v49;  // [bp-0x118]
    uint128_t v50;  // [bp-0x108]
    unsigned long v51;  // [bp-0xf8]
    uint128_t v52;  // [bp-0xf0]
    uint128_t v53;  // [bp-0xe0]
    unsigned long v54;  // [bp-0xd0]
    uint128_t v55;  // [bp-0xc8]
    uint128_t v56;  // [bp-0xb8]
    unsigned long v57;  // [bp-0xa8]
    uint128_t v58;  // [bp-0xa0]
    uint128_t v59;  // [bp-0x90]
    unsigned long v60;  // [bp-0x80]
    unsigned long v61;  // [bp-0x78]
    char *v62;  // [bp-0x10]

    v62 = &a8;
    v33 = a4;
    v32 = a1;
    v61 = *(long long *)&g_10002b0;
    v39 = 0;
    v31 = a0->field_8;
    v37 = 0;
    v36 = 0;
    if (a2 == 1)
    {
        v35 = sub_963ccc(a0);
        if (!a16)
            goto LABEL_9921e0;
LABEL_9921c0:
        v30 = *(long long *)(a16 + 16);
        v63 = a0->field_c60;
        if (!a0->field_c60)
            goto LABEL_9921ec;
    }
    else
    {
        v35 = 0x4000;
        if (a16)
            goto LABEL_9921c0;
LABEL_9921e0:
        v30 = 0;
        v63 = a0->field_c60;
        if (!a0->field_c60)
        {
LABEL_9921ec:
            if (a3)
            {
                v64 = a2;
                v65 = v64;
                v66 = !v64;
                v67 = 3192;
                if (!v64)
                    v67 = 3184;
                v27 = (char *)a0 + v67;
                v68 = arm64g_calculate_condition(3, v65, 0, 0);
                if (v68 & 1)
                {
                    v69 = 3200;
                    v70 = arm64g_calculate_condition(3, v65, 0, 0);
                    if (!(v70 & 1))
                        goto LABEL_99222e;
LABEL_99222d:
                    v72 = 80;
                }
                else
                {
                    v69 = 3208;
                    v71 = arm64g_calculate_condition(3, v65, 0, 0);
                    if (v71 & 1)
                        goto LABEL_99222d;
                    v72 = 88;
LABEL_99222e:
                }
                if (v27->field_0)
                {
                    v25 = v27->field_0;
                    goto LABEL_99229c;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/record/rec_layer_s3.c", 1284, "ssl_set_new_record_layer");
                    sub_a36abc(20, 0xc0103, 0);
LABEL_992948:
                    if (*(long long *)&g_10002b0 == v61)
                        return 0;
                    ___stack_chk_fail();
                }
            }
            else if (!((char)a0->field_18->field_d8[80] & 8))
            {
                v63 = &g_e88ce0;
            }
            else
            {
                v63 = &g_e889d8;
            }
        }
    }
    v25 = v63;
    v73 = a2;
    v74 = v73;
    v66 = !v73;
    v75 = 3192;
    if (!v73)
        v75 = 3184;
    v27 = (char *)a0 + v75;
    v76 = arm64g_calculate_condition(3, v74, 0, 0);
    if (v76 & 1)
    {
        v69 = 3200;
        v77 = arm64g_calculate_condition(3, v74, 0, 0);
        if (!(v77 & 1))
            goto LABEL_99229a;
LABEL_992299:
        v72 = 80;
    }
    else
    {
        v69 = 3208;
        v78 = arm64g_calculate_condition(3, v74, 0, 0);
        if (v78 & 1)
            goto LABEL_992299;
        v72 = 88;
LABEL_99229a:
    }
LABEL_99229c:
    v29 = *(long long *)((char *)a0 + v72);
    sub_a70ed8("options", &a0->field_9b0);
    v46 = *(uint128_t *)&v43;
    v47 = *(uint128_t *)((void*)&v43 + 16);
    v48 = *(unsigned long long *)((void*)&v43 + 32);
    sub_a70404("mode", &a0->field_9b8);
    v49 = *(uint128_t *)&v43;
    v50 = *(uint128_t *)((void*)&v43 + 16);
    v51 = *(unsigned long long *)((void*)&v43 + 32);
    if (v66)
    {
        sub_a70ed8("read_buffer_len", &a0->field_c98);
        v52 = *(uint128_t *)&v43;
        v53 = *(uint128_t *)((void*)&v43 + 16);
        v54 = *(unsigned long long *)((void*)&v43 + 32);
        v79 = &a0->field_ca0;
        v55 = *(uint128_t *)&v43;
        v56 = *(uint128_t *)((void*)&v43 + 16);
        v57 = *(unsigned long long *)((void*)&v43 + 32);
        sub_a71bbc(sub_a6ffac("read_ahead", v79), v79);
        v58 = *(uint128_t *)&v43;
        v59 = *(uint128_t *)((void*)&v43 + 16);
        v60 = *(unsigned long long *)((void*)&v43 + 32);
        v81 = __ROL__(a0->field_160, 24) & 0xff000001 & 1;
        v38 = v81;
        v82 = a0->field_578;
        if (v82 & 1)
            v37 = 1;
        if (v82 >> 2 & 1)
            goto LABEL_99240c;
    }
    else
    {
        sub_a70ed8("block_padding", &a0[1].field_8);
        v52 = *(uint128_t *)&v43;
        v53 = *(uint128_t *)((void*)&v43 + 16);
        v54 = *(unsigned long long *)((void*)&v43 + 32);
        v83 = a0[1].padding_10;
        v55 = *(uint128_t *)&v43;
        v56 = *(uint128_t *)((void*)&v43 + 16);
        v57 = *(unsigned long long *)((void*)&v43 + 32);
        sub_a71bbc(sub_a70ed8("hs_padding", v83), v83);
        v58 = *(uint128_t *)&v43;
        v59 = *(uint128_t *)((void*)&v43 + 16);
        v60 = *(unsigned long long *)((void*)&v43 + 32);
        v81 = __ROL__(a0->field_160, 22) & 0xffc00001 & 1;
        v38 = v81;
        v85 = a0->field_578;
        if (v85 >> 1 & 1)
            v37 = 1;
        if (v85 >> 3 & 1)
        {
LABEL_99240c:
            v36 = 1;
        }
    }
    iter = &v43;
    if (v81)
    {
        iter = &v45;
        sub_a6ffac("use_etm", &v38);
        *(uint128_t *)&v43 = v40;
        *(uint128_t *)((char *)&v43 + 16) = v41;
        v44 = v42;
    }
    if (v37)
    {
        sub_a6ffac("stream_mac", &v37);
        iter->field_0 = v40;
        iter->field_10 = v41;
        iter->field_20 = v42;
        iter += 1;
    }
    if (v36)
    {
        sub_a6ffac("tlstree", &v36);
        iter->field_20 = v42;
        iter->field_0 = v40;
        iter->field_10 = v41;
        iter += 1;
    }
    if (v66 && a0->field_900 && (v87 = (char)a0->field_900[856], 3 >= v87 - 1))
    {
        v35 = 0x100 << ((char)v87 & 31);
    }
    else if (v35 == 0x4000)
    {
        goto LABEL_992514;
    }
    sub_a70404("max_frag_len", &v35);
    iter->field_20 = v42;
    iter->field_0 = v40;
    iter->field_10 = v41;
    iter += 1;
LABEL_992514:
    v28 = &v41;
    v26 = &v42;
    if (a0->field_78)
        v88 = v66 ^ 1;
    else
        v88 = 1;
    v24 = v69;
    if (!(v88 & 1))
    {
        if (2 > a3 - 1)
        {
            v89 = *(int *)&a0[1].padding_57c[728];
            if (a0->field_b18 == 2 && v89 >= (unsigned int)(int)a0->field_900[836])
                v89 = (int)a0->field_900[836];
            v34 = v89;
            if (v89)
                goto LABEL_9925b4;
        }
    }
    else
    {
        if (a2 == 1 && a3 == 1 && !a0->field_78)
        {
            v90 = (int)a0->field_900[836];
            if ((int)a0->field_900[836] || a0->field_908 && !(v90 = (int)a0->field_908[836], !v90))
            {
                v34 = v90;
LABEL_9925b4:
                sub_a70404("max_early_data", &v34);
                iter->field_20 = v42;
                iter->field_0 = v40;
                iter->field_10 = v41;
                iter += 1;
            }
            else
            {
                sub_c64b64(a0, &v34);
            }
        }
    }
    sub_a71bbc();
    iter->field_20 = v42;
    iter->field_0 = v40;
    iter->field_10 = v41;
    if (!v66)
    {
        v91 = 0;
        if (a3)
        {
            v92 = 0;
            if ((unsigned int)((int)a0->field_18->field_d8[80]) >> 3 & 1)
            {
                sub_991e48(a0, 2);
                v91 = 0;
                v92 = 0;
            }
        }
        else
        {
            v92 = 0;
        }
    }
    else
    {
        v91 = a0->field_c90;
        v93 = (int)a0->field_18->field_d8[80];
        if (a3 && v93 >> 3 & 1)
        {
            sub_991e48(a0, 1);
            v93 = (int)a0->field_18->field_d8[80];
        }
        if (!(v93 >> 3 & 1))
        {
            v92 = sub_9d3c1c(sub_9d8844());
            if (!v92)
                goto LABEL_99290c;
        }
        else
        {
            v92 = sub_9d3c1c(sub_9d7920());
            if (!v92)
            {
LABEL_99290c:
                sub_a368c8();
                sub_a369bc("ssl/record/rec_layer_s3.c", 1391, "ssl_set_new_record_layer");
                sub_9a58a4(a0, 80, 0xc0103, 0);
                goto LABEL_992948;
            }
        }
        a0->field_c90 = v92;
    }
    v40 = g_e88988;
    if (a0->field_4f8)
    {
        v41 = g_e88998;
        v94 = v26;
        v95 = 2;
    }
    else
    {
        v94 = v28;
        v95 = 1;
    }
    idx = v95 + 1;
    *v94 = g_e889a8;
    if (a0->field_ce8)
    {
        (&v40)[idx] = g_e889b8;
        idx = v95 + 2;
    }
    v97 = &(&v40)[idx];
    *(unsigned long long *)v97 = 0;
    *(unsigned long long *)&v97[8] = 0;
    v16 = 0;
    v17 = 0;
    v22 = a0->field_c68;
    v23 = &v39;
    v20 = &v40;
    v21 = a0;
    v19 = &v46;
    v18 = &v43;
    v14 = v29;
    v15 = v92;
    v12 = a17;
    v13 = v91;
    v10 = a15;
    v11 = v30;
    v9 = a14;
    v7 = a12;
    v8 = a13;
    v5 = a10;
    v6 = a11;
    v3 = a8;
    v4 = a9;
    v1 = a6;
    v2 = a7;
    v0 = a5;
    (*(long long *)v25)();
}
