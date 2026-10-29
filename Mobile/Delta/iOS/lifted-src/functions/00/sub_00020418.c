/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20418..0x20a78 (1632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20418_13 {
    char padding_0[8];
    unsigned long long field_8;
} st_20418_13;

typedef struct st_20418_8 {
    unsigned long long field_0;
    long long field_8;
} st_20418_8;

typedef struct st_20418_4 {
    char padding_0[8];
    struct st_20418_3 *field_8;
} st_20418_4;

typedef struct st_20418_1 {
    char padding_0[20];
    unsigned long long field_14;
} st_20418_1;

typedef struct st_20418_6 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[296];
    unsigned long long field_138;
    long long field_140;
} st_20418_6;

typedef struct st_20418_2 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
    char padding_28[296];
    unsigned long long field_150;
    long long field_158;
} st_20418_2;

typedef struct st_20418_7 {
    unsigned long long field_0;
    void* field_8;
    char padding_10[80];
    unsigned long long field_60;
    long long field_68;
    char padding_70[8];
    unsigned long long field_78;
    long long field_80;
    char padding_88[296];
    unsigned long long field_1b0;
    long long field_1b8;
} st_20418_7;

typedef struct st_20418_5 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
    char padding_20[8];
    char field_28;
} st_20418_5;

typedef struct st_20418_3 {
    unsigned long long field_0;
    uint128_t field_8;
    struct st_20418_3 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
    char padding_31[7];
    unsigned long long field_38;
} st_20418_3;

typedef struct st_20418_9 {
    struct st_20418_12 *field_0;
} st_20418_9;

typedef struct st_20418_12 {
    struct st_20418_9 *field_0;
} st_20418_12;

typedef struct st_20418_0 {
    char field_0;
} st_20418_0;

extern char g_f0cab0;

long long sub_20418(void* a0, unsigned long a1, unsigned long a2, long long a3, unsigned long a4, unsigned long long a5, char a6)
{
    void* v29;  // x0
    unsigned long v30;  // x24
    unsigned long v39;  // x21
    st_20418_4 *v40;  // x22
    unsigned long v41;  // x25
    unsigned int *v42;  // x20
    st_20418_3 *v43;  // x0
    st_20418_5 *v44;  // x8
    st_20418_3 *v45;  // x10
    unsigned long v46;  // x11
    unsigned long v47;  // x12
    char v48;  // x13
    st_20418_1 *v31;  // x0
    st_20418_13 *v49;  // x8
    unsigned long long v50;  // x20
    unsigned long v51;  // x21
    long long v52;  // x0
    long long v53;  // x0
    long long v54;  // x0
    long long v32;  // x27
    unsigned long v33;  // x0
    long long v34;  // x0
    long long v35;  // x0
    long long v36;  // x20
    char i;  // x24
    unsigned long long v38;  // x26
    unsigned long long v0;  // [bp-0x160]
    unsigned long v1;  // [bp-0x150]
    st_20418_2 *v2;  // [bp-0x148]
    st_20418_0 **v3;  // [bp-0x140], Other Possible Types: char
    st_20418_0 *v4;  // [bp-0x138]
    st_20418_3 *v5;  // [bp-0x130], Other Possible Types: unsigned long
    st_20418_7 **v6;  // [bp-0x128]
    st_20418_12 **v7;  // [bp-0x120], Other Possible Types: unsigned long
    st_20418_6 **v8;  // [bp-0x118]
    st_20418_12 **v9;  // [bp-0x110], Other Possible Types: unsigned long
    unsigned long v10;  // [bp-0x108]
    char v11;  // [bp-0xfc]
    char v12;  // [bp-0xec]
    st_20418_8 *v13;  // [bp-0xe8], Other Possible Types: unsigned long
    long long v14;  // [bp-0xe0]
    char v15;  // [bp-0xd8]
    st_20418_7 *v16;  // [bp-0xd0], Other Possible Types: char, unsigned long
    char v17;  // [bp-0xc8], Other Possible Types: long long, unsigned long
    char v18;  // [bp-0xc0]
    char v19;  // [bp-0xb8]
    char v20;  // [bp-0xb0]
    st_20418_2 *v21;  // [bp-0xa8], Other Possible Types: char
    char v22;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long long v23;  // [bp-0x98]
    uint128_t v24;  // [bp-0x90], Other Possible Types: unsigned long long *
    long long v25;  // [bp-0x88], Other Possible Types: unsigned int
    uint128_t v26;  // [bp-0x80], Other Possible Types: char
    char *v27;  // [bp-0x10]
    char v28;  // [bp+0x0]

    v27 = &v28;
    v4 = &v3;
    v3 = &v4;
    if (!(a5 & 1))
        sub_f8d0(a0);
    v29 = a0 + 128;
    if ((int)a0[128] == 299)
    {
        v24 = *(int128_t *)v29;
        v26 = (int128_t)v29[16];
        sub_f8d0(a0);
        v30 = *(unsigned long long *)((void*)&v24 + 4);
        if ((unsigned int)v30 == (unsigned int)a1)
            v25 = a1 >> 32;
        sub_1f174(a0, "variable name");
        *(int *)((long long)a0[488] + 1184) = *(int *)((long long)a0[488] + 1184) + 1;
        v31 = sub_e5f4(a0, 0, &v24, &v21, &v21, a4, a5, 0);
        *(int *)((long long)a0[488] + 1184) = *(int *)((long long)a0[488] + 1184) - 1;
        v16 = a1;
        v17 = *(long long *)&(v31->padding_0)[1];
        if (!(unsigned int)a5 || (v32 = a3, !(g_f0cab0 & 1)))
            v32 = -0x1;
        v33 = sub_404c();
        sub_74c0(v33, &v16, 0, v31, a5, v32);
        if ((char)a0[88] != 1)
            return v33;
        if (a6)
        {
            v34 = sub_ef54(a0, a6);
            v35 = sub_404c((long long)a0[216], 40);
            v36 = v35;
            sub_85c8(v35, v34, a6, a3, v30);
        }
        else
        {
            v36 = sub_404c((long long)a0[216], 40);
            sub_8618(v36, a3, v30);
        }
        v13 = v33;
        sub_1c9f0(a0 + 1184, &v13);
        *(long long *)(sub_12484(a0 + 1184, &v13) + 8) = v36;
        return v33;
    }
    else if (*(long long *)(a4 + 8))
    {
        v21 = 0;
        v22 = 0;
        v16 = 0;
        v17 = 0;
        sub_b814();
        v0 = sub_a0c8(&v24);
        return sub_ebbc(a0, a0 + 132, &v21, &v16, "Expected 'function' after local declaration with attribute, but got %s instead");
    }
    else
    {
        *(int *)((long long)a0[488] + 244) = *(int *)((long long)a0[488] + 244) + 1;
        v21 = a0 + 752;
        v22 = 12297829382473034411 * ((long long)a0[760] - (long long)a0[752] >> 4);
        v23 = 0;
        v19 = 0;
        v20 = 0;
        v1 = a1;
        if ((char)a0[88] == 1)
            sub_199b8(a0, &v21, 0, &v19, 0, 0, a5);
        else
            sub_199b8(a0, &v21, 0, 0, 0, 0, a5);
        *(int *)((long long)a0[488] + 244) = *(int *)((long long)a0[488] + 244) - 1;
        v24 = a0 + 776;
        v25 = (long long)a0[784] - (long long)a0[776] >> 3;
        v26 = 0;
        v16 = a0 + 656;
        v17 = (long long)a0[664] - (long long)a0[656] >> 3;
        v18 = 0;
        v13 = a0 + 1088;
        v14 = (long long)a0[1096] - (long long)a0[1088] >> 3;
        v15 = 0;
        v11 = 0;
        v12 = 0;
        if ((int)a0[128] == 61)
        {
            sub_1f158(&v11, a0 + 132);
            sub_f8d0(a0);
            sub_ff50();
        }
        if (v23)
        {
            i = 0;
            v2 = v21;
            v38 = v22 * 48;
            do
            {
                v39 = v2->field_0;
                v9 = &v7;
                v7 = &v9;
                sub_1dd64(a0 + 360, v39 + v38);
                v40 = sub_fb84(a0 + 360, v39 + v38);
                v41 = (long long)a0[328];
                v42 = (long long)a0[336];
                v43 = sub_404c((long long)a0[216], 64);
                v44 = v39 + v38;
                v45 = v40->field_8;
                v46 = *(int *)((long long)a0[336] - 4);
                v47 = *(long long *)((char *)&v44->field_8 + 8);
                v48 = v44->padding_20[0];
                v43->field_0 = v44->field_0;
                *(int128_t *)&(&v43->field_0)[1] = *(int128_t *)&(&v44->field_0)[1];
                *(st_20418_3 **)((char *)&v43->field_8 + 8) = v45;
                v43->field_18 = ((char *)v42 - v41 >> 3) - 1;
                v43->field_20 = v46;
                *(char *)&v43->field_28 = v48;
                *((char *)&v43->field_28 + 1) = 0;
                *(unsigned long *)&v43->field_30 = v47;
                v40->field_8 = v43;
                sub_103a8(a0 + 400, &v40->field_8);
                v5 = v40->field_8;
                v9 = &v7;
                v7 = &v9;
                sub_103a8(v24, &v5);
                v26 += 1;
                i += 1;
                v38 += 48;
            } while (i < v23);
        }
        if (v18)
            v49 = *(long long *)((char *)v16->field_8 - 8) + 12;
        else
            v49 = a0 + 160;
        v50 = a5 & 0xffffffff;
        v9 = v1;
        v10 = v49->field_8;
        v7 = sub_ef54(a0, &v24);
        v8 = &v24;
        v5 = sub_ef54(a0, &v16);
        v6 = &v16;
        v51 = sub_404c((long long)a0[216], 112);
        sub_643c(v51, &v9, &v7, &v5, &v11, v50);
        if ((char)a0[88] == 1)
        {
            v52 = sub_13c40(a0, &v21);
            v53 = sub_ef54(a0, &v13);
            v54 = sub_404c((long long)a0[216], 56);
            sub_85e0(v54, v52, &v21, v19, v20, v53, &v13);
            v9 = v51;
            sub_1c9f0(a0 + 1184, &v9);
            *(long long *)(sub_12484(a0 + 1184, &v9) + 8) = v54;
        }
        if ((unsigned int)v50 && !(sub_16e9c(&v16, v26) & 1))
            sub_1db64(a0, v51 + 12, "Missing initializer in const declaration");
        sub_dd88(v13, v13->field_0 + v14 * 8, v13->field_8);
        sub_dd88(v16, v16->field_0 + v17 * 8, v16->field_8);
        sub_dd88(v24, *v24 + v25 * 8, v24[1]);
        sub_1d9ac(v21, v21->field_0 + 48 * v22, v21->field_8);
        return v51;
    }
}
