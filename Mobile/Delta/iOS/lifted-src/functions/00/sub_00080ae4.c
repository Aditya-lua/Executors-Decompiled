/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x80ae4..0x81054 (1392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_80ae4_1 {
    char field_0[28];
    char field_c;
    char padding_d[27];
    unsigned int field_28;
    char padding_2c[4];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned int field_40;
    char padding_44[4];
    unsigned long long field_48;
    unsigned long long field_50;
    char padding_58[24];
    unsigned long long field_70;
    unsigned long long field_78;
} st_80ae4_1;

typedef struct st_80ae4_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[56];
    unsigned long long field_48;
    unsigned long long field_50;
    uint128_t field_58;
    char padding_68[88];
    uint128_t field_c0;
    unsigned long long field_d0;
    char padding_d8[8];
    unsigned long long field_e0;
    char padding_e8[32];
    unsigned int field_108;
    unsigned int field_10c;
    unsigned long long field_110;
    char padding_118[8];
    unsigned long long field_120;
    char padding_128[8];
    unsigned long long field_130;
    unsigned long long field_138;
    unsigned long long field_140;
    unsigned long long field_148;
    unsigned long long field_150;
    char padding_158[8];
    unsigned long long field_160;
    unsigned long long field_168;
    unsigned long long field_170;
    unsigned long long field_178;
    unsigned long long field_180;
    unsigned long long field_188;
    unsigned int field_190;
    char padding_194[4];
    unsigned long long field_198;
    char padding_1a0[2048];
    unsigned long long field_9a0;
    unsigned long long field_9a8;
    char padding_9b0[40];
    unsigned long long field_9d8;
    unsigned long long field_9e0;
    unsigned long long field_9e8;
    unsigned long long field_9f0;
    char padding_9f8[240];
    char field_ae8[28];
    char field_af4;
    char padding_af5[27];
    unsigned int field_b10;
    char padding_b14[4];
    unsigned long long field_b18;
    unsigned long long field_b20;
    unsigned int field_b28;
    char padding_b2c[4];
    unsigned long long field_b30;
    unsigned long long field_b38;
    char padding_b40[24];
    unsigned long long field_b58;
    unsigned long long field_b60;
} st_80ae4_2;

typedef struct st_80ae4_0 {
    char field_0;
} st_80ae4_0;


long long sub_80ae4(void* a0, uint128_t *a1, unsigned long a2, unsigned long long a3, unsigned int a4, unsigned int a5)
{
    uint128_t v11;  // q0
    uint128_t v12;  // q1
    void* v21;  // x27
    unsigned long v22;  // x8
    unsigned long v23;  // x20
    unsigned long v24;  // x8
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long v27;  // x21
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4107
    unsigned long long v30;  // 4112
    uint128_t v13;  // q3
    unsigned long long v31;  // 4107
    unsigned long long v32;  // x8
    unsigned long v33;  // x23
    unsigned long v34;  // x20
    unsigned long v35;  // x0
    unsigned int v36;  // w10
    unsigned long v37;  // x28
    unsigned long long v38;  // 4110
    st_80ae4_2 *v39;  // x24
    unsigned int v40;  // w0
    uint128_t v14;  // q0
    unsigned long v41;  // x23
    unsigned long v42;  // x21
    st_80ae4_2 *v43;  // x24
    unsigned long v44;  // x0
    unsigned long long v45;  // 4106
    unsigned long v46;  // x0
    unsigned long v47;  // x0
    unsigned long v48;  // x0
    st_80ae4_2 *v49;  // x25
    st_80ae4_1 *v50;  // x8
    uint128_t v15;  // q1
    unsigned long long v51;  // 4180
    unsigned long v52;  // x20
    unsigned long long v53;  // 4110
    unsigned long v54;  // x24
    long long v55;  // x20
    unsigned long v56;  // x0
    unsigned long long v57;  // x8
    long long v58;  // x20
    unsigned long v59;  // x0
    uint128_t v16;  // q3
    uint128_t v17;  // q0
    uint128_t v18;  // q1
    uint128_t v19;  // q3
    uint128_t v20;  // q1
    unsigned long v0;  // [bp-0xb8]
    unsigned long v1;  // [bp-0xb0]
    st_80ae4_2 *v2;  // [bp-0xa8]
    unsigned long long v3;  // [bp-0xa0]
    unsigned int v4;  // [bp-0x94]
    st_80ae4_0 **v5;  // [bp-0x90], Other Possible Types: char
    st_80ae4_0 *v6;  // [bp-0x88]
    uint128_t v7;  // [bp-0x80], Other Possible Types: uint128_t
    unsigned long v8;  // [bp-0x70]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v6 = &v5;
    v5 = &v6;
    *(unsigned int *)&a0[968] = 1;
    v11 = a1[10];
    v12 = a1[11];
    v13 = a1[13];
    *(uint128_t *)&a0[432] = a1[12];
    *(uint128_t *)&a0[448] = v13;
    *(uint128_t *)&a0[400] = v11;
    *(uint128_t *)&a0[416] = v12;
    v14 = a1[6];
    v15 = a1[7];
    v16 = a1[9];
    *(uint128_t *)&a0[368] = a1[8];
    *(uint128_t *)&a0[384] = v16;
    *(uint128_t *)&a0[336] = v14;
    *(uint128_t *)&a0[352] = v15;
    v17 = a1[2];
    v18 = a1[3];
    v19 = a1[5];
    *(uint128_t *)&a0[304] = a1[4];
    *(uint128_t *)&a0[320] = v19;
    *(uint128_t *)&a0[272] = v17;
    *(uint128_t *)&a0[288] = v18;
    v20 = a1[1];
    *(uint128_t *)&a0[240] = *a1;
    *(uint128_t *)&a0[0x100] = v20;
    if ((int)a0[336] == 1)
        sub_b5534(a0 + 336, a0 + 244);
    v21 = a0 + 244;
    v22 = 1 << ((char)(int)a0[244] & 63);
    if (v22 >= a2)
        v22 = a2;
    if (a2)
        v23 = v22;
    else
        v23 = 1;
    v24 = (long long)v21[148];
    v25 = v24;
    v26 = v23;
    if (v24 < v23)
        v27 = v24;
    else
        v27 = v23;
    if (!(long long)v21[0xcc])
    {
        v28 = arm64g_calculate_condition(4, v25, v26, 0);
        v29 = arm64g_calculate_condition(3, (v28 & 1 ? (int)v21[16] : 0x40000000), (v28 & 1 ? 3 : 0), 0);
        if (!(v29 & 1))
            goto LABEL_80bc2;
        v32 = 3;
LABEL_80bc1:
    }
    else
    {
        v30 = arm64g_calculate_condition(4, v25, v26, 0);
        v31 = arm64g_calculate_condition(0, (v30 & 1 ? (int)v21[16] : 0x40000000), (v30 & 1 ? 3 : 0), 0);
        if (v31 & 1)
            goto LABEL_80bc1;
LABEL_80bc2:
        v32 = 4;
    }
    v3 = v32;
    if (a5 == 1)
    {
        if ((int)a0[368])
            v33 = 0;
        else
            v33 = sub_82890(v27) + 1;
        if (!(int)a0[364])
            v34 = v27 + v23;
        else
            v34 = 0;
    }
    else
    {
        v33 = 0;
        v34 = 0;
    }
    v7 = (int128_t)a0[336];
    v8 = (long long)a0[352];
    v35 = sub_b4348(&v7, v27);
    v36 = 1;
    if (148 >= a3 >> 22 && 0xd9c00000 >= (unsigned long long)((long long)a0[3240] - (long long)a0[3248]))
        v36 = !(int)a0[972];
    v4 = v36;
    v37 = sub_7fa94(v21, a0 + 336, (long long)a0[928] != 0, (int)a0[400], v34, v33, a2, (long long)a0[448] != 0, (long long)a0[392]);
    v38 = arm64g_calculate_condition(130, v37, 120, 0);
    if (v38 & 1)
        return v37;
    v0 = v35;
    v1 = v34;
    v39 = a0 + 704;
    if (!(long long)a0[928])
        sub_7f848(v39);
    v2 = v39;
    v40 = sub_827b0(v2, v37);
    v41 = v33;
    v42 = v27;
    if ((unsigned long long)((long long)a0[712] - (long long)a0[704]) < v37 || v40)
    {
        if ((long long)a0[928])
            return 0xffffffffffffffc0;
        v7 = (int128_t)a0[896];
        v8 = (long long)a0[912];
        v43 = v2;
        memset(v43, 0, 72);
        sub_80164((long long)a0[704], &v7);
        v7 = (int128_t)a0[896];
        v8 = (long long)a0[912];
        v44 = sub_7e0b8(v43, v37, &v7);
        v45 = arm64g_calculate_condition(130, v44, 120, 0);
        if (v45 & 1)
            return v44;
        v46 = sub_7d598(v43, 0x1600);
        *(unsigned long *)&a0[3224] = v46;
        if (!v46)
            return 0xffffffffffffffc0;
        v47 = sub_7d598(v43, 0x1600);
        *(unsigned long *)&a0[3232] = v47;
        if (!v47)
            return 0xffffffffffffffc0;
        v48 = sub_7d598(v43, 0x22d8);
        *(unsigned long *)&a0[3544] = v48;
        if (!v48)
            return 0xffffffffffffffc0;
        *(unsigned long long *)&a0[3552] = 8920;
        v4 = 1;
    }
    v49 = v2;
    sub_7fc34(v49);
    v50 = a0 + 3496;
    *(int128_t *)&v50->field_0[0] = *(int128_t *)v21;
    *(int128_t *)&v50->field_0[12] = (int128_t)v21[12];
    *(unsigned int *)&a0[3536] = (int)a0[432] == 1;
    *(uint128_t *)&a0[792] = 0;
    *(unsigned long *)&a0[784] = a2 + 1;
    v51 = arm64g_calculate_condition(50, a2, 1, 0);
    if (!(v51 & 1))
        *(unsigned int *)&a0[272] = 0;
    *(unsigned long *)&a0[776] = v42;
    sub_77e64(a0 + 808, 0);
    *(unsigned int *)a0 = 1;
    *(unsigned int *)&a0[688] = 0;
    *(unsigned long long *)&a0[696] = 0;
    sub_7f794((long long)a0[3224]);
    v44 = sub_81054(a0 + 3240, v49, v21, (int)a0[400], a4, v4, 1);
    v52 = v1;
    v53 = arm64g_calculate_condition(130, v44, 120, 0);
    if (v53 & 1)
        return v44;
    v54 = v42 / v3;
    *(unsigned long long *)&a0[976] = sub_7f500(v49, v54 * 8 + 63 & 0xffffffffffffffc0, 2);
    if ((int)a0[336] == 1)
    {
        v55 = 8 << ((char)(int)a0[340] & 63);
        v56 = sub_7f500(v49, v55 + 63 & 0xffffffffffffffc0, 2);
        *(unsigned long *)&a0[1096] = v56;
        v52 = v1;
        _bzero(v56, v55, 2);
        *(unsigned long long *)&a0[3168] = sub_7f500(v49, 63 + 12 * v0 & 0xffffffffffffffc0, 2);
        *(unsigned long *)&a0[3176] = v0;
        *(unsigned long long *)&a0[1088] = 0;
        *(char **)&a0[1064] = " ";
        *(char **)&a0[1072] = " ";
        *(unsigned long long *)&a0[1080] = 8589934594;
        *(char **)&a0[1056] = "\r\n";
        *(unsigned int *)&a0[1104] = 0;
    }
    if ((long long)a0[448])
    {
        v57 = (v42 >> 10) + v42 / 3 + 2;
        *(unsigned long long *)&a0[5264] = v57;
        *(unsigned long long *)&a0[5256] = sub_7f500(v49, v57 * 16 + 63 & 0xffffffffffffffc0, 2);
    }
    *(unsigned long long *)&a0[992] = sub_7f500(v49, v42 + 32, 3);
    *(unsigned long *)&a0[1040] = v42;
    *(unsigned int *)&a0[3560] = a5;
    *(unsigned long *)&a0[3576] = v52;
    *(unsigned long long *)&a0[3568] = sub_7f500(v49, v52, 3);
    *(unsigned long *)&a0[3616] = v41;
    *(unsigned long long *)&a0[3608] = sub_7f500(v49, v41, 3);
    if ((int)a0[336] == 1)
    {
        v58 = 1 << ((char)((int)a0[340] - (int)a0[344]) & 63);
        v59 = sub_7f500(v49, v58, 3);
        *(unsigned long *)&a0[1112] = v59;
        _bzero(v59, v58, 3);
    }
    memset(a0 + 3184, 0, 40);
    *(unsigned long *)&a0[1032] = v54;
    *(unsigned long long *)&a0[1008] = sub_7f500(v49, v54, 3);
    *(unsigned long long *)&a0[1016] = sub_7f500(v49, v54, 3);
    *(unsigned long long *)&a0[0x400] = sub_7f500(v49, v54, 3);
    *(unsigned int *)&a0[972] = 1;
    return 0;
}
