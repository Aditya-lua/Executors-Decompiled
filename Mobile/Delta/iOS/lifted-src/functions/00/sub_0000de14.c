/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xde14..0xe5f4 (2016 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_de14_8 {
    unsigned long long field_0;
    long long field_8;
} st_de14_8;

typedef struct st_de14_2 {
    char padding_0[8];
    struct st_de14_1 *field_8;
} st_de14_2;

typedef struct st_de14_6 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[296];
    unsigned long long field_138;
    long long field_140;
} st_de14_6;

typedef struct st_de14_3 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
    char padding_28[296];
    unsigned long long field_150;
    long long field_158;
} st_de14_3;

typedef struct st_de14_7 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[80];
    unsigned long long field_60;
    long long field_68;
    char padding_70[8];
    unsigned long long field_78;
    long long field_80;
    char padding_88[296];
    unsigned long long field_1b0;
    long long field_1b8;
} st_de14_7;

typedef struct st_de14_9 {
    char padding_0[48];
    char field_30;
} st_de14_9;

typedef struct st_de14_5 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
    char padding_20[8];
    char field_28;
} st_de14_5;

typedef struct st_de14_1 {
    unsigned long long field_0;
    uint128_t field_8;
    struct st_de14_1 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
    char field_31;
    char padding_32[6];
    unsigned long long field_38;
} st_de14_1;

typedef struct st_de14_4 {
    unsigned long long field_0;
    uint128_t field_8;
    struct st_de14_4 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
    long long field_31;
    unsigned long long field_38;
} st_de14_4;

typedef struct st_de14_10 {
    struct st_de14_13 *field_0;
} st_de14_10;

typedef struct st_de14_13 {
    struct st_de14_10 *field_0;
} st_de14_13;

typedef struct st_de14_0 {
    char field_0;
} st_de14_0;


long long sub_de14(void* a0)
{
    unsigned long v40;  // x24
    void* v41;  // x21
    st_de14_1 *v50;  // x0
    st_de14_1 *v51;  // x8
    st_de14_1 **v52;  // x28
    unsigned long v53;  // x9
    st_de14_1 *v54;  // x28
    st_de14_9 *v55;  // x21
    unsigned long v56;  // x20
    unsigned long v57;  // x0
    long long v58;  // x0
    unsigned long long v59;  // x25
    unsigned long long v42;  // x8
    unsigned long long v60;  // x26
    unsigned long v61;  // x28
    unsigned long v62;  // x27
    long long i;  // x27
    unsigned long long v64;  // x20
    unsigned long v65;  // x25
    st_de14_2 *v66;  // x22
    unsigned long v67;  // x28
    unsigned int *v68;  // x26
    st_de14_4 *v69;  // x0
    long long v43;  // x0
    st_de14_5 *v70;  // x8
    st_de14_1 *v71;  // x10
    unsigned long v72;  // x11
    unsigned long v73;  // x12
    char v74;  // x13
    unsigned long v75;  // x21
    unsigned long v76;  // x20
    st_de14_9 *v77;  // x23
    unsigned long v78;  // x20
    unsigned long v79;  // x22
    long long v44;  // x0
    long long v80;  // x0
    long long v81;  // x0
    long long v82;  // x0
    unsigned long v45;  // x9
    unsigned long v46;  // x8
    st_de14_2 *v47;  // x28
    unsigned long v48;  // x8
    unsigned int *v49;  // x20
    unsigned long v0;  // [bp-0x1b8]
    unsigned long v1;  // [bp-0x1b0]
    unsigned int v2;  // [bp-0x1a8], Other Possible Types: unsigned long long
    unsigned int v3;  // [bp-0x1a0], Other Possible Types: unsigned long
    long long v4;  // [bp-0x198], Other Possible Types: unsigned long
    st_de14_3 *v5;  // [bp-0x190], Other Possible Types: long long
    st_de14_0 **v6;  // [bp-0x188], Other Possible Types: char
    st_de14_0 *v7;  // [bp-0x180]
    st_de14_1 *v8;  // [bp-0x178], Other Possible Types: unsigned long
    st_de14_7 **v9;  // [bp-0x170]
    st_de14_13 **v10;  // [bp-0x168], Other Possible Types: unsigned long
    st_de14_6 **v11;  // [bp-0x160]
    st_de14_13 **v12;  // [bp-0x158], Other Possible Types: unsigned int, unsigned long
    unsigned long v13;  // [bp-0x154]
    unsigned long v14;  // [bp-0x150]
    unsigned long long *v15;  // [bp-0x148]
    long long v16;  // [bp-0x140]
    long long v17;  // [bp-0x138]
    st_de14_8 *v18;  // [bp-0x130]
    long long v19;  // [bp-0x128]
    long long v20;  // [bp-0x120]
    st_de14_7 *v21;  // [bp-0x118], Other Possible Types: st_de14_0 **, char
    long long v22;  // [bp-0x110]
    long long v23;  // [bp-0x108]
    uint128_t v24;  // [bp-0x100]
    long long v25;  // [bp-0xe8]
    long long v26;  // [bp-0xe0]
    st_de14_0 *v27;  // [bp-0xd8], Other Possible Types: st_de14_3 *, unsigned int, unsigned long
    unsigned long v28;  // [bp-0xd4]
    unsigned long v29;  // [bp-0xd0], Other Possible Types: unsigned long long
    long long v30;  // [bp-0xc8]
    st_de14_0 *v31;  // [bp-0xc0], Other Possible Types: uint128_t
    uint128_t v32;  // [bp-0xb0]
    char v33;  // [bp-0xa0], Other Possible Types: unsigned long
    uint128_t v34;  // [bp-0x98]
    unsigned long v35;  // [bp-0x88]
    long long v36;  // [bp-0x80]
    char v37;  // [bp-0x78]
    char *v38;  // [bp-0x10]
    char v39;  // [bp+0x0]

    v38 = &v39;
    v7 = &v6;
    v6 = &v7;
    v40 = (long long)a0[132];
    sub_f8d0();
    sub_12548(a0, 0);
    v41 = a0 + 128;
    if ((int)a0[128] == 61)
    {
        v3 = (long long)a0[132];
        sub_f8d0(a0);
        v5 = sub_18934(a0, 0);
        if (sub_1f3d4(a0, 44, "index range"))
            v42 = (long long)a0[160];
        else
            v42 = 0xffffffffffffffff;
        v2 = v42;
        v4 = sub_18934(a0, 0);
        if ((int)a0[128] == 44)
        {
            v1 = (long long)a0[132];
            sub_f8d0(a0);
            v43 = sub_18934(a0, 0);
        }
        else
        {
            v43 = 0;
            v1 = 0xffffffffffffffff;
        }
        v31 = *(int128_t *)v41;
        v32 = (int128_t)v41[16];
        v44 = sub_1f3d4(a0, 293, "for loop");
        v45 = (long long)a0[400];
        v46 = (long long)a0[408];
        *(int *)((long long)a0[336] - 4) = *(int *)((long long)a0[336] - 4) + 1;
        v27 = &v21;
        v21 = &v27;
        sub_1dd64(a0 + 360, &v33);
        v47 = sub_fb84(a0 + 360, &v33);
        v48 = (long long)a0[328];
        v49 = (long long)a0[336];
        v50 = sub_404c((long long)a0[216], 64);
        v51 = v47->field_8;
        v52 = &v47->field_8;
        v53 = *(int *)((long long)a0[336] - 4);
        v50->field_0 = v33;
        *(uint128_t *)&(&v50->field_0)[1] = v34;
        *(st_de14_1 **)((char *)&v50->field_8 + 8) = v51;
        v50->field_18 = ((char *)v49 - v48 >> 3) - 1;
        v50->field_20 = v53;
        *(char *)&v50->field_28 = v37;
        *((char *)&v50->field_28 + 1) = 0;
        *(unsigned long *)&v50->field_30 = v35;
        *v52 = v50;
        sub_103a8(a0 + 400, v52);
        v54 = *v52;
        v55 = sub_10a78(a0);
        sub_16df8(a0, (unsigned long long)((long long)a0[408] - (long long)a0[400]) >> 3);
        *(int *)((long long)a0[336] - 4) = *(int *)((long long)a0[336] - 4) - 1;
        sub_16df8(a0, v46 - v45 >> 3);
        v56 = (long long)a0[140];
        v27 = *(unsigned int *)&v31;
        v28 = *(unsigned long long *)((void*)&v31 + 4);
        v55->field_30 = sub_1e5c4(a0, 296, &v27);
        v27 = v40;
        v29 = v56;
        v57 = sub_404c((long long)a0[216], 96);
        sub_73bc(v57, &v27, v54, v5, v4, v43, v55, v44, &v31 | 4);
        if ((char)a0[88] != 1)
            return v57;
        v58 = sub_404c((long long)a0[216], 36);
        sub_865c(v58, v36, v3, v2, v1);
        v27 = v57;
        sub_1c9f0(a0 + 1184, &v27);
        *(long long *)(sub_12484(a0 + 1184, &v27) + 8) = v58;
        return v57;
    }
    else
    {
        v27 = a0 + 752;
        v29 = 12297829382473034411 * ((long long)a0[760] - (long long)a0[752] >> 4);
        v25 = 0;
        v26 = 0;
        v30 = 0;
        v31 = &v21;
        v21 = &v31;
        sub_1da44(v27, &v33);
        v30 = 1;
        if (*(int *)v41 == 44)
        {
            if ((char)a0[88] == 1)
            {
                v21 = (long long)a0[132];
                sub_f8d0(a0);
                sub_199b8(a0, &v27, 0, &v25, &v21, 0, 0);
            }
            else
            {
                sub_f8d0(a0);
                sub_199b8(a0, &v27, 0, 0, 0, 0, 0);
            }
        }
        v24 = (int128_t)a0[132];
        v59 = sub_1f3d4(a0, 301, "for loop");
        v21 = a0 + 656;
        v22 = (long long)a0[664] - (long long)a0[656] >> 3;
        v23 = 0;
        v18 = a0 + 1088;
        v19 = (long long)a0[1096] - (long long)a0[1088] >> 3;
        v20 = 0;
        sub_ff50();
        v31 = *(int128_t *)v41;
        v32 = (int128_t)v41[16];
        v60 = sub_1f3d4(a0, 293, "for loop");
        v61 = (long long)a0[400];
        v62 = (long long)a0[408];
        *(int *)((long long)a0[336] - 4) = *(int *)((long long)a0[336] - 4) + 1;
        v15 = a0 + 776;
        v16 = (long long)a0[784] - (long long)a0[776] >> 3;
        v17 = 0;
        if (v30)
        {
            v0 = v61;
            v1 = v62;
            v2 = v60;
            v3 = v59;
            i = 0;
            v4 = v40;
            v5 = v27;
            v64 = v29 * 48;
            do
            {
                v65 = v5->field_0;
                v12 = &v10;
                v10 = &v12;
                sub_1dd64(a0 + 360, v65 + v64);
                v66 = sub_fb84(a0 + 360, v65 + v64);
                v67 = (long long)a0[328];
                v68 = (long long)a0[336];
                v69 = sub_404c((long long)a0[216], 64);
                v70 = v65 + v64;
                v71 = v66->field_8;
                v72 = *(int *)((long long)a0[336] - 4);
                v73 = *(long long *)((char *)&v70->field_8 + 8);
                v74 = v70->padding_20[0];
                v69->field_0 = v70->field_0;
                *(int128_t *)&(&v69->field_0)[1] = *(int128_t *)&(&v70->field_0)[1];
                *(st_de14_1 **)((char *)&v69->field_8 + 8) = v71;
                v69->field_18 = ((char *)v68 - v67 >> 3) - 1;
                v69->field_20 = v72;
                *(char *)&v69->field_28 = v74;
                *((char *)&v69->field_28 + 1) = 0;
                *(unsigned long *)&v69->field_30 = v73;
                v66->field_8 = v69;
                sub_103a8(a0 + 400, &v66->field_8);
                v8 = v66->field_8;
                v12 = &v10;
                v10 = &v12;
                sub_103a8(v15, &v8);
                v17 += 1;
                i += 1;
                v64 += 48;
            } while ((unsigned long long)i < (unsigned long long)v30);
            v75 = (long long)a0[400];
            v76 = (long long)a0[408];
            v40 = v4;
            v59 = v3;
            v60 = v2;
            v61 = v0;
            v62 = v1;
        }
        else
        {
            v75 = v61;
            v76 = v62;
        }
        v77 = sub_10a78(a0);
        sub_16df8(a0, v76 - v75 >> 3);
        *(int *)((long long)a0[336] - 4) = *(int *)((long long)a0[336] - 4) - 1;
        sub_16df8(a0, v62 - v61 >> 3);
        v78 = (long long)a0[140];
        v12 = *(unsigned int *)&v31;
        v13 = *(unsigned long long *)((void*)&v31 + 4);
        v77->field_30 = sub_1e5c4(a0, 296, &v12);
        v12 = v40;
        v14 = v78;
        v10 = sub_ef54(a0, &v15);
        v11 = &v15;
        v8 = sub_ef54(a0, &v21);
        v9 = &v21;
        v79 = sub_404c((long long)a0[216], 112);
        sub_6a58(v79, &v12, &v10, &v8, v77, v59, &v24, v60, &v31 | 4);
        if ((char)a0[88] == 1)
        {
            v80 = sub_13c40(a0, &v27);
            v81 = sub_ef54(a0, &v18);
            v82 = sub_404c((long long)a0[216], 56);
            sub_884c(v82, v80, &v27, v25, v26, v81, &v18);
            v12 = v79;
            sub_1c9f0(a0 + 1184, &v12);
            *(long long *)(sub_12484(a0 + 1184, &v12) + 8) = v82;
        }
        sub_dd88(v15, *v15 + v16 * 8, v15[1]);
        sub_dd88(v18, v18->field_0 + v19 * 8, v18->field_8);
        sub_dd88(v21, v21->field_0 + v22 * 8, v21->field_8);
        sub_1d9ac(v27, v27->field_0 + 48 * v29, v27->field_8);
        return v79;
    }
}
