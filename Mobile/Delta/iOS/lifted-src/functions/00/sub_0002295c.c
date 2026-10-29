/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2295c..0x23040 (1764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2295c_8 {
    char padding_0[8];
    long long field_8;
} st_2295c_8;

typedef struct st_2295c_7 {
    unsigned long long field_0;
    long long field_8;
} st_2295c_7;

typedef struct st_2295c_3 {
    struct st_2295c_4 *field_0;
    unsigned long long field_8;
    char padding_10[200];
    unsigned long long field_d8;
    unsigned long long field_e0;
    char padding_e8[8];
    unsigned long long field_f0;
    unsigned long long field_f8;
    char padding_100[8];
    unsigned long long field_108;
    unsigned long long field_110;
} st_2295c_3;

typedef struct st_2295c_2 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[8];
    unsigned long long field_14;
} st_2295c_2;

typedef struct st_2295c_5 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
} st_2295c_5;

typedef struct st_2295c_6 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    unsigned long long field_38;
} st_2295c_6;

typedef struct st_2295c_4 {
    unsigned long long field_0;
} st_2295c_4;

typedef struct st_2295c_0 {
    char field_0;
} st_2295c_0;

extern unsigned int g_f00d90;
extern unsigned int g_f00dc0;
extern unsigned int g_f00dd0;
extern char g_f0c9d0;
extern char g_f0cb10;

long long sub_2295c(void* a0)
{
    char v32;  // x21
    unsigned long long v33;  // x0
    unsigned long v42;  // x0
    long long v43;  // x0
    long long v44;  // x0
    unsigned long long v45;  // x0
    st_2295c_2 *v46;  // x20
    long long v47;  // x0
    long long v48;  // x25
    long long v49;  // x0
    unsigned long v50;  // x0
    unsigned long v51;  // x0
    long long v34;  // x22
    unsigned long v52;  // x0
    unsigned long v53;  // x0
    long long v54;  // x0
    unsigned long v35;  // x20
    long long v36;  // x0
    unsigned long long *v37;  // x8
    unsigned long v38;  // x0
    unsigned long v39;  // x20
    long long v40;  // x21
    st_2295c_8 *v41;  // x0
    unsigned long long v0;  // [bp-0x160]
    st_2295c_3 **v1;  // [bp-0x158]
    unsigned long long v2;  // [bp-0x150]
    st_2295c_6 **v3;  // [bp-0x148]
    unsigned long long v4;  // [bp-0x140]
    st_2295c_0 **v5;  // [bp-0x138], Other Possible Types: char
    st_2295c_0 *v6;  // [bp-0x130]
    unsigned long v7;  // [bp-0x128]
    unsigned long v8;  // [bp-0x120]
    st_2295c_2 *v9;  // [bp-0x118]
    unsigned long v10;  // [bp-0x110]
    unsigned long v11;  // [bp-0x108]
    st_2295c_7 *v12;  // [bp-0x100]
    long long v13;  // [bp-0xf8]
    char v14;  // [bp-0xf0]
    st_2295c_5 *v15;  // [bp-0xe8]
    long long v16;  // [bp-0xe0]
    char v17;  // [bp-0xd8]
    st_2295c_6 *v18;  // [bp-0xd0]
    long long v19;  // [bp-0xc8]
    char v20;  // [bp-0xc0]
    st_2295c_3 *v21;  // [bp-0xb8], Other Possible Types: unsigned long
    long long idx;  // [bp-0xb0]
    char v23;  // [bp-0xa8]
    uint128_t v24;  // [bp-0xa0]
    uint128_t v25;  // [bp-0x90]
    st_2295c_2 *v26;  // [bp-0x78], Other Possible Types: char, unsigned int, unsigned long
    unsigned long v27;  // [bp-0x74]
    char *v28;  // [bp-0x70], Other Possible Types: st_2295c_3 **, st_2295c_2 **, char
    char v29;  // [bp-0x68], Other Possible Types: unsigned long long
    char *v30;  // [bp-0x10]
    char v31;  // [bp+0x0]

    v30 = &v31;
    v6 = &v5;
    v5 = &v6;
    sub_16844();
    v24 = (int128_t)a0[128];
    v25 = (int128_t)a0[144];
    if ((int)a0[128] == 40)
    {
        sub_f8d0(a0);
        v32 = 0;
        *(int *)((long long)a0[488] + 1052) = *(int *)((long long)a0[488] + 1052) + 1;
        v21 = a0 + 848;
        idx = (long long)a0[856] - (long long)a0[848] >> 3;
        v23 = 0;
        v18 = a0 + 1064;
        v19 = (long long)a0[1072] - (long long)a0[1064] >> 5;
        v20 = 0;
        v15 = a0 + 1088;
        v16 = (long long)a0[1096] - (long long)a0[1088] >> 3;
        v17 = 0;
        v12 = a0 + 1112;
        v13 = (long long)a0[1120] - (long long)a0[1112] >> 3;
        v14 = 0;
        if ((int)a0[128] != 41)
        {
            if ((char)a0[88] == 1)
                v33 = sub_239f8(a0, &v21, &v18, &v15, &v12);
            else
                v33 = sub_239f8(a0, &v21, &v18, 0, 0);
            v32 = v33;
        }
        v10 = *(unsigned long long *)((void*)&v24 + 4);
        v11 = (long long)a0[140];
        v26 = *(unsigned int *)&v24;
        v27 = v10;
        if (sub_1ef30(a0, 41, &v26, 1))
            v34 = (long long)a0[160];
        else
            v34 = -0x1;
        *(int *)((long long)a0[488] + 1052) = *(int *)((long long)a0[488] + 1052) - 1;
        if ((int)a0[128] == 263 || v20)
        {
            v26 = 0;
            v28 = 0;
            v45 = sub_ef54(a0, &v21);
            v3 = &v18;
            v4 = v32;
            v1 = &v21;
            v2 = sub_17fc0(a0, &v18);
            v0 = v45;
            v46 = sub_15ad8(a0, &v24, &v26, 0, 0, 0, 0);
            v9 = v46;
            if ((char)a0[88] == 1 && v46->field_8 == g_f00d90)
            {
                v47 = sub_ef54(a0, &v12);
                v48 = sub_ef54(a0, &v15);
                v49 = sub_404c((long long)a0[216], 96);
                sub_8740(v49, -0x1, 0, 0, -0x1, v10, v47, &v12, v48, &v15, v34, (long long)a0[132]);
                v26 = v46;
                sub_1c9f0(a0 + 1184, &v26);
                *(long long *)(sub_12484(a0 + 1184, &v26) + 8) = v49;
            }
            v7 = v10;
            v8 = (unsigned long)(v46->padding_c)[1];
            v50 = sub_13094(a0, &v9, 1);
            v39 = sub_404c((long long)a0[216], 56);
            v26 = v50;
            v28 = &v9;
            v29 = 0;
            sub_62f0(v39, &v7, &v26);
            if ((char)a0[88] != 1)
                goto LABEL_22f58;
            v40 = sub_404c((long long)a0[216], 40);
            sub_854c(v40, 40);
            v26 = v39;
            sub_1c9f0(a0 + 1184, &v26);
            v41 = sub_12484(a0 + 1184, &v26);
            goto LABEL_22f54;
        }
        if (v23 == 1)
        {
            if (v32)
            {
                v35 = *(long long *)&v21->field_0[idx];
            }
            else
            {
                v35 = sub_404c((long long)a0[216], 40);
                sub_5478(v35, &v10, *(long long *)&v21->field_0[idx]);
                if ((char)a0[88] == 1)
                {
                    v36 = sub_404c((long long)a0[216], 12);
                    sub_8648(v36, v34);
                    v26 = v35;
                    sub_1c9f0(a0 + 1184, &v26);
                    *(long long *)(sub_12484(a0 + 1184, &v26) + 8) = v36;
                }
            }
            v37 = &v11;
            v9 = sub_1615c(a0, v35, &v24 | 4);
            if (v32 && g_f0c9d0 & 1 && (v9->field_8 == g_f00dc0 || v9->field_8 == g_f00dd0))
                g_f0cb10 = 1;
            if (v23 != 1)
                v37 = (v9->padding_c)[1];
            v7 = v10;
            v8 = *v37;
            v38 = sub_13094();
            v39 = sub_404c((long long)a0[216], 56);
            v26 = v38;
            v28 = &v9;
            v29 = v32;
            sub_62f0(v39, &v7, &v26);
            if ((char)a0[88] == 1)
            {
                v40 = sub_404c((long long)a0[216], 40);
                sub_854c(v40, 40);
                v26 = v39;
                sub_1c9f0(a0 + 1184, &v26);
                v41 = sub_12484(a0 + 1184, &v26);
LABEL_22f54:
                v41->field_8 = v40;
            }
        }
        else
        {
            v42 = sub_ef54(a0, &v21);
            v39 = sub_404c((long long)a0[216], 56);
            v26 = v42;
            v28 = &v21;
            v29 = v32;
            sub_62f0(v39, &v10, &v26);
            if ((char)a0[88] != 1)
                goto LABEL_22f58;
            v43 = sub_ef54(a0, &v15);
            v44 = sub_404c((long long)a0[216], 40);
            v40 = v44;
            sub_85fc(v44, v10, v34, v43, &v15);
            v26 = v39;
            sub_1c9f0(a0 + 1184, &v26);
            v41 = sub_12484(a0 + 1184, &v26);
            goto LABEL_22f54;
        }
LABEL_22f58:
        sub_dd88(v12, v12->field_0 + v13 * 8, v12->field_8);
        sub_dd88(v15, v15->field_0 + v16 * 8, v15->field_8);
        sub_12a6c(v18, v18->field_0 + v19 * 32, v18->field_8);
        sub_dd88(v21, &v21->field_0[idx], v21->field_8);
        return v39;
    }
    else if (sub_19920(a0 + 96))
    {
        return sub_223d4(a0);
    }
    else
    {
        v51 = sub_12740(a0, 0);
        v21 = v51;
        v52 = sub_13094(a0, &v21, 1);
        v53 = sub_404c((long long)a0[216], 56);
        v26 = v52;
        v28 = &v21;
        v29 = 0;
        sub_62f0(v53, v51 + 12, &v26);
        if ((char)a0[88] != 1)
            return v53;
        v54 = sub_404c((long long)a0[216], 40);
        sub_854c(v54, 40);
        v26 = v53;
        sub_1c9f0(a0 + 1184, &v26);
        *(long long *)(sub_12484(a0 + 1184, &v26) + 8) = v54;
        return v53;
    }
}
