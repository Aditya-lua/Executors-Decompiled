/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x176e0..0x17ce4 (1540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_176e0_7 {
    char padding_0[8];
    long long field_8;
} st_176e0_7;

typedef struct st_176e0_6 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_176e0_6;

typedef struct st_176e0_3 {
    struct st_176e0_4 *field_0;
    long long field_8;
    char padding_10[200];
    unsigned long long field_d8;
    long long field_e0;
    char padding_e8[8];
    unsigned long long field_f0;
    long long field_f8;
    char padding_100[8];
    unsigned long long field_108;
    long long field_110;
} st_176e0_3;

typedef struct st_176e0_2 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
} st_176e0_2;

typedef struct st_176e0_5 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    unsigned long long field_38;
} st_176e0_5;

typedef struct st_176e0_4 {
    unsigned long long field_0;
} st_176e0_4;

typedef struct st_176e0_0 {
    char field_0;
} st_176e0_0;

extern unsigned int g_f00d90;

unsigned int sub_176e0(void* a0, unsigned int a1, long long a2)
{
    void* v38;  // x19
    void* v39;  // x27
    unsigned long long v48;  // x0
    unsigned long v49;  // x28
    unsigned int v50;  // w23
    unsigned long v52;  // x25
    unsigned long v53;  // cc_op
    unsigned long v54;  // cc_dep1
    unsigned long v55;  // cc_dep2
    unsigned long v56;  // cc_ndep
    unsigned long v57;  // 4112
    unsigned int v40;  // w21
    unsigned long v58;  // cc_op
    unsigned long v59;  // cc_dep1
    unsigned long v60;  // cc_dep2
    unsigned long v61;  // 4112
    void* v41;  // x27
    unsigned long long v62;  // 4129
    unsigned int v63;  // w8
    unsigned int v64;  // w9
    unsigned long v65;  // cc_dep1
    unsigned long v66;  // 4110
    unsigned long v67;  // cc_op
    unsigned long v68;  // cc_dep1
    unsigned long v69;  // cc_dep2
    unsigned int v42;  // x2
    unsigned long v70;  // 4110
    unsigned long long v71;  // 4123
    unsigned long v72;  // x0
    unsigned long v73;  // x22
    unsigned long v74;  // x23
    long long v75;  // x0
    long long v76;  // x0
    long long v77;  // x21
    st_176e0_7 *v78;  // x0
    unsigned int v79;  // x22
    unsigned int v43;  // x3
    unsigned int v80;  // w9
    unsigned long long v81;  // x0
    unsigned long v82;  // x0
    unsigned long v83;  // x22
    unsigned long v84;  // x23
    long long v85;  // x0
    long long v86;  // x0
    unsigned int v44;  // x4
    void* v45;  // x0
    unsigned int v46;  // w23
    unsigned int v47;  // x24
    unsigned long v0;  // [bp-0x190], Other Possible Types: unsigned long long
    st_176e0_3 **v1;  // [bp-0x188], Other Possible Types: st_176e0_6 **
    unsigned long v2;  // [bp-0x180], Other Possible Types: unsigned long long
    st_176e0_5 **v3;  // [bp-0x178], Other Possible Types: unsigned long
    unsigned long long v4;  // [bp-0x170]
    unsigned int v5;  // [bp-0x164]
    unsigned long v6;  // [bp-0x160]
    unsigned long v7;  // [bp-0x158]
    st_176e0_0 **v8;  // [bp-0x150], Other Possible Types: char
    st_176e0_0 *v9;  // [bp-0x148]
    st_176e0_6 *v10;  // [bp-0x140]
    long long v11;  // [bp-0x138]
    unsigned int v12;  // [bp-0x130]
    st_176e0_2 *v13;  // [bp-0x128]
    long long v14;  // [bp-0x120]
    unsigned int v15;  // [bp-0x118]
    st_176e0_5 *v16;  // [bp-0x110]
    long long v17;  // [bp-0x108]
    unsigned int v18;  // [bp-0x100]
    st_176e0_3 *v19;  // [bp-0xf8]
    long long v20;  // [bp-0xf0]
    unsigned int v21;  // [bp-0xe8]
    long long v22;  // [bp-0xe0]
    long long v23;  // [bp-0xd8]
    long long v24;  // [bp-0xd0]
    long long v25;  // [bp-0xc8]
    unsigned long v26;  // [bp-0xc0]
    unsigned int v27;  // [bp-0xb8]
    unsigned int v28;  // [bp-0xb0]
    unsigned long v29;  // [bp-0xa8]
    uint128_t v30;  // [bp-0xa0]
    uint128_t v31;  // [bp-0x90]
    unsigned int v32;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long v33;  // [bp-0x7c]
    st_176e0_3 **v34;  // [bp-0x78], Other Possible Types: unsigned long
    unsigned int v35;  // [bp-0x70], Other Possible Types: unsigned long long
    char *v36;  // [bp-0x10]
    char v37;  // [bp+0x0]

    v36 = &v37;
    v38 = a0;
    v9 = &v8;
    v8 = &v9;
    sub_16844();
    v39 = v38;
    v40 = (int)v39[128];
    v41 = v39 + 128;
    v30 = *(int128_t *)v41;
    v31 = (int128_t)v41[16];
    v28 = 0;
    v29 = 0xffffffffffffffff;
    v26 = 0xffffffffffffffff;
    v27 = 0;
    if (*((char *)v41 - 40) == 1)
    {
        v42 = (unsigned int)&v29;
        v43 = (unsigned int)&v27;
        v44 = (unsigned int)&v26;
        v45 = v38;
    }
    else
    {
        v42 = 0;
        v43 = 0;
        v44 = 0;
        v45 = v38;
    }
    sub_11190(v45, 0, v42, v43, v44);
    v46 = (int)v38[128];
    v7 = (long long)v38[132];
    v5 = sub_1f3d4(v38, 40, "function parameters");
    v47 = 0;
    *(int *)((long long)v38[488] + 1052) = *(int *)((long long)v38[488] + 1052) + 1;
    v19 = v38 + 848;
    v20 = (long long)v38[856] - (long long)v38[848] >> 3;
    v21 = 0;
    v16 = v38 + 1064;
    v17 = (long long)v38[1072] - (long long)v38[1064] >> 5;
    v18 = 0;
    v13 = v38 + 1088;
    v14 = (long long)v38[1096] - (long long)v38[1088] >> 3;
    v15 = 0;
    v10 = v38 + 1112;
    v11 = (long long)v38[1120] - (long long)v38[1112] >> 3;
    v12 = 0;
    if ((int)v38[128] != 41)
    {
        if ((char)v38[88] == 1)
            v48 = sub_239f8(v38, &v19, &v16, &v10, &v13);
        else
            v48 = sub_239f8(v38, &v19, &v16, 0, 0);
        v47 = v48;
    }
    v6 = (long long)v38[132];
    v49 = (long long)v38[140];
    v32 = v46;
    v33 = v7;
    v50 = sub_1ef30(v38, 41, &v32, 1);
    *(int *)((long long)v38[488] + 1052) = *(int *)((long long)v38[488] + 1052) - 1;
    v52 = sub_ef54(v38, &v19);
    if (!v18)
    {
        v57 = arm64g_calculate_condition(v53, v54, v55, v56);
        v58 = 3;
        v59 = (v57 & 1 ? v40 : 0x40000000);
        v60 = (v57 & 1 ? 60 : 0);
    }
    else
    {
        v61 = arm64g_calculate_condition(v53, v54, v55, v56);
        v58 = 0;
        v59 = (v61 & 1 ? v40 : 0x40000000);
        v60 = (v61 & 1 ? 60 : 0);
    }
    v62 = arm64g_calculate_condition(v58 | 16, v59, v60, 0);
    v63 = !(v62 & 1);
    v64 = *(int *)v41;
    v65 = v64;
    if (v64 == 263)
    {
LABEL_178f4:
        v3 = &v16;
        v4 = v47;
        v1 = &v19;
        v2 = sub_17fc0(v38, &v16);
        v0 = v52;
        v79 = sub_15ad8(v38, &v30, a2, v22, v23, v24, v25);
        if ((char)v38[88] != 1 || *(int *)(v79 + 8) != g_f00d90)
            goto LABEL_17bf0;
        if (!v5)
            v7 = 0xffffffffffffffff;
        sub_ef54();
        v81 = sub_ef54(v38, &v10);
        v77 = sub_404c((long long)v38[216], 96);
        if (!v50)
            v6 = 0xffffffffffffffff;
        v2 = v6;
        v3 = (long long)v38[132];
        v0 = v81;
        v1 = &v10;
        sub_8740();
        v32 = v79;
        sub_1c9f0(v38 + 1184, &v32);
        v78 = sub_12484(v38 + 1184, &v32);
        goto LABEL_17be4;
    }
    else
    {
        if (!v47)
        {
            v66 = arm64g_calculate_condition(3, v65, 263, 0);
            v67 = 4;
            v68 = (v66 & 1 ? v21 : 0);
            v69 = v66 & 1;
        }
        else
        {
            v70 = arm64g_calculate_condition(3, v65, 263, 0);
            v67 = 0;
            v68 = (v70 & 1 ? v21 : 0);
            v69 = v70 & 1;
        }
        v71 = arm64g_calculate_condition(v67, v68, v69, 0);
        if (v64 != 58 && v71 & 1 && !(v63 & 1))
        {
            if (a1)
            {
                v72 = sub_404c((long long)v38[216], 56);
                v32 = v52;
                v34 = &v19;
                v35 = 0;
                sub_62f0(v72, &v30 | 4, &v32);
                if ((char)v38[88] != 1)
                    goto LABEL_17c5c;
                if (v5)
                    v73 = v7;
                else
                    v73 = 0xffffffffffffffff;
                if (v50)
                    v74 = v6;
                else
                    v74 = 0xffffffffffffffff;
                v75 = sub_ef54();
                v76 = sub_404c((long long)v38[216], 40);
                v77 = v76;
                sub_85fc(v76, v73, v74, v75, &v10);
                v32 = v72;
                sub_1c9f0(v38 + 1184, &v32);
                v78 = sub_12484(v38 + 1184, &v32);
                goto LABEL_17b6c;
            }
            v32 = v7;
            v34 = v49;
            v79 = sub_404c((long long)v38[216], 40);
            sub_5478(v79, &v32, *(long long *)&v19->field_0[v20]);
            if ((char)v38[88] == 1)
            {
                v77 = sub_404c((long long)v38[216], 12);
                sub_8648();
                v32 = v79;
                sub_1c9f0(v38 + 1184, &v32);
                v78 = sub_12484(v38 + 1184, &v32);
LABEL_17be4:
LABEL_17be8:
                v78->field_8 = v77;
            }
            else
            {
LABEL_17bf0:
            }
        }
        else
        {
            if (v64 != 58)
                v80 = a1 ^ 1;
            else
                v80 = 1;
            if ((v63 | v80) & 1)
                goto LABEL_178f4;
            v82 = sub_404c((long long)v38[216], 56);
            v32 = v52;
            v34 = &v19;
            v35 = v47;
            sub_62f0(v82, &v30 | 4, &v32);
            if ((char)v38[88] == 1)
            {
                if (v5)
                    v83 = v7;
                else
                    v83 = 0xffffffffffffffff;
                if (v50)
                    v84 = v6;
                else
                    v84 = 0xffffffffffffffff;
                v85 = sub_ef54();
                v86 = sub_404c((long long)v38[216], 40);
                v77 = v86;
                sub_85fc(v86, v83, v84, v85, &v10);
                v32 = v82;
                sub_1c9f0(v38 + 1184, &v32);
                v78 = sub_12484(v38 + 1184, &v32);
LABEL_17b6c:
                v79 = 0;
                goto LABEL_17be8;
            }
            else
            {
LABEL_17c5c:
                v79 = 0;
            }
        }
    }
    sub_dd88(v10, v10->field_0 + v11 * 8, v10->field_8);
    sub_dd88(v13, v13->field_0 + v14 * 8, v13->field_8);
    sub_12a6c(v16, v16->field_0 + v17 * 32, v16->field_8);
    sub_dd88(v19, &v19->field_0[v20], v19->field_8);
    return v79;
}
