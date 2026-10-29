/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x957938..0x957c58 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_957938_2 {
    char padding_0[32];
    struct st_957938_0 *field_20;
    struct st_957938_0 *field_28;
    char padding_30[8];
    struct st_957938_0 *field_38;
    unsigned long long field_40;
    char padding_48[8];
    unsigned long long field_50;
    uint128_t field_58;
    char padding_68[8];
    struct st_957938_0 *field_70;
    struct st_957938_0 *field_78;
    struct st_957938_0 *field_80;
    unsigned int field_88;
    char padding_8c[20];
    struct st_957938_0 *field_a0;
    struct st_957938_0 *field_a8;
    unsigned long long field_b0;
    struct st_957938_0 *field_b8;
    unsigned int field_c0;
    unsigned int field_c4;
    struct st_957938_0 *field_c8;
    unsigned long long field_d0;
    char field_d8;
    char padding_d9[7];
    struct st_957938_0 *field_e0;
    struct st_957938_0 *field_e8;
    unsigned long long field_f0;
    unsigned int field_f8;
} st_957938_2;

typedef struct st_957938_1 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[32];
    struct st_957938_0 *field_48;
    struct st_957938_0 *field_50;
    char padding_58[8];
    struct st_957938_0 *field_60;
    unsigned long long field_68;
    char padding_70[8];
    unsigned long long field_78;
    uint128_t field_80;
    char padding_90[8];
    struct st_957938_0 *field_98;
    struct st_957938_0 *field_a0;
    struct st_957938_0 *field_a8;
    unsigned int field_b0;
    char padding_b4[20];
    struct st_957938_0 *field_c8;
    struct st_957938_0 *field_d0;
    unsigned long long field_d8;
    struct st_957938_0 *field_e0;
    unsigned int field_e8;
    unsigned int field_ec;
    struct st_957938_0 *field_f0;
    unsigned long long field_f8;
    char field_100;
    char padding_101[7];
    struct st_957938_0 *field_108;
    struct st_957938_0 *field_110;
    unsigned long long field_118;
    unsigned int field_120;
} st_957938_1;

typedef struct st_957938_3 {
    char padding_0[512];
    unsigned long long field_200;
    char padding_208[32];
    unsigned long long field_228;
    char padding_230[32];
    struct st_957938_0 *field_250;
    struct st_957938_0 *field_258;
    char padding_260[8];
    struct st_957938_0 *field_268;
    unsigned long long field_270;
    char padding_278[8];
    unsigned long long field_280;
    uint128_t field_288;
    char padding_298[8];
    struct st_957938_0 *field_2a0;
    struct st_957938_0 *field_2a8;
    struct st_957938_0 *field_2b0;
    unsigned int field_2b8;
    char padding_2bc[20];
    struct st_957938_0 *field_2d0;
    struct st_957938_0 *field_2d8;
    unsigned long long field_2e0;
    struct st_957938_0 *field_2e8;
    unsigned int field_2f0;
    unsigned int field_2f4;
    struct st_957938_0 *field_2f8;
    unsigned long long field_300;
    char field_308;
    char padding_309[7];
    struct st_957938_0 *field_310;
    struct st_957938_0 *field_318;
    unsigned long long field_320;
    unsigned int field_328;
} st_957938_3;

typedef struct st_957938_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[52];
    char field_50;
    char padding_51[511];
    unsigned long long field_250;
    char field_258;
    char padding_259[31];
    unsigned long long field_278;
    char field_280;
    char padding_281[31];
    struct st_957938_0 *field_2a0;
    struct st_957938_0 *field_2a8;
    char padding_2b0[8];
    struct st_957938_0 *field_2b8;
    unsigned long long field_2c0;
    char padding_2c8[8];
    unsigned long long field_2d0;
    uint128_t field_2d8;
    char padding_2e8[8];
    struct st_957938_0 *field_2f0;
    struct st_957938_0 *field_2f8;
    struct st_957938_0 *field_300;
    unsigned int field_308;
    char padding_30c[20];
    struct st_957938_0 *field_320;
    struct st_957938_0 *field_328;
    unsigned long long field_330;
    struct st_957938_0 *field_338;
    unsigned int field_340;
    unsigned int field_344;
    struct st_957938_0 *field_348;
    unsigned long long field_350;
    char field_358;
    char padding_359[7];
    struct st_957938_0 *field_360;
    struct st_957938_0 *field_368;
    unsigned long long field_370;
    unsigned int field_378;
} st_957938_0;


st_957938_0 * sub_957938(st_957938_0 *a0, unsigned long a1)
{
    unsigned long long v71;  // x22
    unsigned long long v72;  // x21
    st_957938_0 *v81;  // x8
    st_957938_0 *v82;  // x20
    st_957938_0 *v83;  // x8
    st_957938_0 *v84;  // x20
    st_957938_0 *v85;  // x8
    st_957938_0 *v86;  // x8
    st_957938_0 *v87;  // x8
    st_957938_0 *v88;  // x0
    unsigned long long v73;  // x20
    unsigned long long v74;  // x19
    unsigned long long v75;  // x30
    unsigned long v76;  // x9
    st_957938_0 *v78;  // x20
    st_957938_0 *v79;  // x8
    st_957938_0 *v80;  // x20
    unsigned int v0;  // [bp-0x240]
    st_957938_0 *v1;  // [bp-0x238]
    unsigned int v2;  // [bp-0x228]
    st_957938_0 *v3;  // [bp-0x220]
    st_957938_0 *v4;  // [bp-0x218]
    unsigned int v5;  // [bp-0x210]
    st_957938_0 *v6;  // [bp-0x208]
    st_957938_0 *v7;  // [bp-0x200]
    unsigned int v8;  // [bp-0x1f8]
    st_957938_0 *v9;  // [bp-0x1f0]
    st_957938_0 *v10;  // [bp-0x1e8]
    unsigned int v11;  // [bp-0x1e0]
    st_957938_0 *v12;  // [bp-0x1d8]
    st_957938_0 *v13;  // [bp-0x1d0]
    unsigned int v14;  // [bp-0x1c8]
    st_957938_0 *v15;  // [bp-0x1c0]
    st_957938_0 *v16;  // [bp-0x1b8]
    unsigned int v17;  // [bp-0x1b0]
    st_957938_0 *v18;  // [bp-0x1a8]
    st_957938_0 *v19;  // [bp-0x1a0]
    unsigned int v20;  // [bp-0x198]
    st_957938_0 *v21;  // [bp-0x190]
    st_957938_0 *v22;  // [bp-0x188]
    char v23;  // [bp-0x179]
    unsigned int v24;  // [bp-0x178]
    unsigned long long v25;  // [bp-0x170]
    st_957938_0 *v26;  // [bp-0x168]
    unsigned int v27;  // [bp-0x160]
    st_957938_2 *v28;  // [bp-0x158]
    st_957938_0 *v29;  // [bp-0x150]
    unsigned int v30;  // [bp-0x148]
    st_957938_1 *v31;  // [bp-0x140]
    st_957938_0 *v32;  // [bp-0x138]
    unsigned int v33;  // [bp-0x130]
    st_957938_3 *v34;  // [bp-0x128]
    st_957938_0 *v35;  // [bp-0x120]
    unsigned short v36;  // [bp-0x112]
    unsigned int v37;  // [bp-0x110]
    char *v38;  // [bp-0x108]
    st_957938_0 *v39;  // [bp-0x100]
    unsigned int v40;  // [bp-0xf8]
    unsigned int v41;  // [bp-0xf4]
    char *v42;  // [bp-0xf0]
    char *v43;  // [bp-0xe8], Other Possible Types: st_957938_0 *
    unsigned long long v44;  // [bp-0xe0]
    st_957938_0 *v45;  // [bp-0xd8], Other Possible Types: unsigned long long
    st_957938_0 *v46;  // [bp-0xc8], Other Possible Types: uint128_t
    st_957938_0 *v47;  // [bp-0xb8], Other Possible Types: unsigned long
    unsigned long long v48;  // [bp-0xb0]
    st_957938_0 *v49;  // [bp-0xa8], Other Possible Types: unsigned int
    st_957938_0 *v50;  // [bp-0xa0]
    st_957938_0 *v51;  // [bp-0x98]
    unsigned int v52;  // [bp-0x90]
    st_957938_0 *v53;  // [bp-0x88], Other Possible Types: unsigned long long
    st_957938_0 *v54;  // [bp-0x80]
    st_957938_0 *v55;  // [bp-0x78]
    st_957938_0 *v56;  // [bp-0x70]
    st_957938_0 *v57;  // [bp-0x68], Other Possible Types: unsigned long
    unsigned int v58;  // [bp-0x60]
    st_957938_0 *v59;  // [bp-0x58]
    unsigned int v60;  // [bp-0x50]
    st_957938_0 *v61;  // [bp-0x48]
    unsigned int v62;  // [bp-0x40]
    char *v63;  // [bp-0x38], Other Possible Types: st_957938_0 *
    unsigned long long v64;  // [bp-0x30]
    unsigned long long v65;  // [bp-0x28]
    unsigned long long v66;  // [bp-0x20]
    unsigned long long v67;  // [bp-0x18]
    char *v68;  // [bp-0x10]
    unsigned long long v69;  // [bp-0x8]
    char v70;  // [bp+0x0]

    if (!a0)
        return a0;
    v64 = v71;
    v65 = v72;
    v66 = v73;
    v67 = v74;
    v68 = &v70;
    v69 = v75;
    if (a0->field_2f0)
    {
        v59 = (st_957938_0 *)0;
        v61 = (st_957938_0 *)0;
        v63 = 0;
        v55 = (st_957938_0 *)0;
        v57 = (st_957938_0 *)0;
        v51 = (st_957938_0 *)0;
        v53 = (st_957938_0 *)0;
        v47 = (st_957938_0 *)0;
        v49 = (st_957938_0 *)0;
        v45 = (st_957938_0 *)0;
        v46 = (st_957938_0 *)0;
        v43 = (st_957938_0 *)0;
        v40 = 1;
        v41 = a0->field_0;
        v62 = (int)a0->field_300;
        v76 = a0->field_2f0->field_18;
        goto LABEL_9579d8;
    }
    else
    {
        v76 = a0->field_2f8;
        if (a0->field_2f8)
        {
            v59 = (st_957938_0 *)0;
            v61 = (st_957938_0 *)0;
            v63 = 0;
            v55 = (st_957938_0 *)0;
            v57 = (st_957938_0 *)0;
            v51 = (st_957938_0 *)0;
            v53 = (st_957938_0 *)0;
            v47 = (st_957938_0 *)0;
            v49 = (st_957938_0 *)0;
            v45 = (st_957938_0 *)0;
            v46 = (st_957938_0 *)0;
            v43 = (st_957938_0 *)0;
            v40 = 1;
            v41 = a0->field_0;
            v62 = (int)a0->field_300;
LABEL_9579d8:
            v36 = (((((v76 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v76 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v76 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v76 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
            v37 = 2;
            v38 = &v36;
            v39 = 0;
            v42 = &v37;
            if (*(int *)&a0->padding_2e8[0])
            {
                v23 = *(int *)&a0->padding_2e8[0];
                v24 = 1;
                v25 = &v23;
                v26 = 0;
                v43 = &v24;
            }
            v33 = a0->field_8;
            v34 = &a0->field_50;
            v35 = 0;
            v30 = a0->field_250;
            v31 = &a0->field_258;
            v32 = 0;
            v44 = &v33;
            v45 = &v30;
            v27 = a0->field_278;
            v28 = &a0->field_280;
            v29 = 0;
            v46 = _INSERT(__double_as_longlong(__longlong_as_double((*(unsigned long long *)((void*)&*(int128_t *)&(&a0->field_2d0)[1] + 8) >> 9) / 1953125)), 8, (*(unsigned long long *)&*(unsigned long long *)(void*)&*(int128_t *)&(&a0->field_2d0)[1] >> 9) / 1953125);
            v49 = a0->field_2d0;
            v47 = a0->field_2c0;
            v48 = &v27;
            v63 = 0;
            v1 = 0;
            if (a0->field_2b8)
            {
                v0 = sub_afb6e8(a0->field_2b8, &v1);
                if ((int)v0 >= 1 && v1)
                    v63 = &v0;
            }
            v78 = *(long long *)&a0->padding_30c[12];
            if (v78)
            {
                v20 = _strlen(v78);
                v21 = v78;
                v22 = 0;
                v79 = &v20;
            }
            else
            {
                v79 = 0;
            }
            v50 = v79;
            if (a0->field_320)
            {
                v17 = (unsigned int)a0->field_328;
                v18 = a0->field_320;
                v19 = 0;
                v53 = &v17;
            }
            if (a0->field_330)
                v51 = a0->field_330;
            v52 = (int)a0->field_338;
            v80 = a0->field_2a0;
            if (v80)
            {
                v8 = _strlen(v80);
                v9 = v80;
                v10 = 0;
                v81 = &v8;
            }
            else
            {
                v81 = 0;
            }
            v54 = v81;
            v82 = a0->field_2a8;
            if (v82)
            {
                v11 = _strlen(v82);
                v12 = v82;
                v13 = 0;
                v83 = &v11;
            }
            else
            {
                v83 = 0;
            }
            v55 = v83;
            v84 = *(long long *)&a0->field_358;
            if (v84)
            {
                v14 = _strlen(v84);
                v15 = v84;
                v16 = 0;
                v85 = &v14;
            }
            else
            {
                v85 = 0;
            }
            v56 = v85;
            v57 = (unsigned int)a0->field_370;
            v58 = *(int *)((char *)&a0->field_338 + 4);
            v86 = *(long long *)&a0->field_340;
            if (v86)
            {
                v5 = (unsigned int)a0->field_348;
                v6 = v86;
                v7 = 0;
                v86 = &v5;
            }
            v59 = v86;
            v60 = (char)a0->field_350;
            v87 = a0->field_360;
            if (v87)
            {
                v2 = (unsigned int)a0->field_368;
                v3 = v87;
                v4 = 0;
                v87 = &v2;
            }
            v61 = v87;
            v88 = sub_9ccc7c(&v40);
            sub_a6c2e4(v1, "ssl/ssl_asn1.c", 0xdd);
        }
        else
        {
            v88 = 0;
        }
    }
    return v88;
}
