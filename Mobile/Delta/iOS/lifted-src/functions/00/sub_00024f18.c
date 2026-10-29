/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24f18..0x253dc (1220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_24f18_3 {
    unsigned long long field_0;
    long long field_8;
} st_24f18_3;

typedef struct st_24f18_2 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[200];
    unsigned long long field_d8;
    long long field_e0;
} st_24f18_2;

typedef struct st_24f18_1 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[80];
    unsigned long long field_60;
    long long field_68;
    char padding_70[200];
    unsigned long long field_138;
    long long field_140;
} st_24f18_1;

typedef struct st_24f18_4 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
    char padding_20[4];
    unsigned long long field_24;
    unsigned long long field_2c;
    unsigned int field_34;
} st_24f18_4;

typedef struct st_24f18_5 {
    char padding_0[48];
    unsigned long long field_30;
    uint128_t field_38;
} st_24f18_5;

typedef struct st_24f18_6 {
    struct st_24f18_7 *field_0;
} st_24f18_6;

typedef struct st_24f18_7 {
    struct st_24f18_6 *field_0;
} st_24f18_7;

typedef struct st_24f18_0 {
    char field_0;
} st_24f18_0;


long long sub_24f18(void* a0, long long a1)
{
    unsigned int v35;  // w28
    unsigned int v36;  // x20
    st_24f18_4 *v44;  // x8
    unsigned int v37;  // x0
    unsigned long v38;  // x0
    unsigned long v39;  // x24
    unsigned long long v40;  // x26
    unsigned long long v41;  // x22
    st_24f18_5 *v42;  // x8
    unsigned long long v43;  // x0
    long long v0;  // [bp-0x198]
    unsigned int v1;  // [bp-0x184]
    unsigned int v2;  // [bp-0x180]
    st_24f18_0 **v3;  // [bp-0x178], Other Possible Types: char
    st_24f18_0 *v4;  // [bp-0x170]
    st_24f18_7 **v5;  // [bp-0x168], Other Possible Types: unsigned long
    st_24f18_3 **v6;  // [bp-0x160]
    unsigned long v7;  // [bp-0x158]
    st_24f18_0 **v8;  // [bp-0x150], Other Possible Types: uint128_t, unsigned long, unsigned int
    unsigned long v9;  // [bp-0x148], Other Possible Types: unsigned int
    unsigned long long *v10;  // [bp-0x140]
    long long v11;  // [bp-0x138]
    unsigned int v12;  // [bp-0x130]
    st_24f18_2 *v13;  // [bp-0x128]
    long long v14;  // [bp-0x120]
    unsigned int v15;  // [bp-0x118]
    st_24f18_0 *v16;  // [bp-0x110], Other Possible Types: char, unsigned long
    st_24f18_2 **v17;  // [bp-0x108], Other Possible Types: uint128_t, unsigned int, unsigned long
    unsigned int v18;  // [bp-0x100], Other Possible Types: unsigned long long
    unsigned int v19;  // [bp-0xf8]
    st_24f18_1 *v20;  // [bp-0xf0]
    unsigned long long v21;  // [bp-0xe8]
    unsigned int v22;  // [bp-0xe0]
    long long v23;  // [bp-0xd4]
    unsigned long v24;  // [bp-0xd0]
    unsigned int v25;  // [bp-0xc8]
    unsigned int v26;  // [bp-0xc0]
    unsigned int v27;  // [bp-0xb8]
    unsigned int v28;  // [bp-0xb0]
    unsigned long v29;  // [bp-0xa8]
    uint128_t v30;  // [bp-0xa0]
    uint128_t v31;  // [bp-0x90]
    st_24f18_7 **v32;  // [bp-0x78]
    char *v33;  // [bp-0x10]
    char v34;  // [bp+0x0]

    v33 = &v34;
    v4 = &v3;
    v3 = &v4;
    v31 = (int128_t)a0[132];
    sub_f8d0();
    sub_1f174(a0, "function name");
    v27 = 0;
    v28 = 0;
    v25 = 0;
    v26 = 0;
    v23 = (int)a0[128];
    v24 = (long long)a0[132];
    sub_1f3d4(a0, 40, "function parameter list start");
    v20 = a0 + 752;
    v21 = 12297829382473034411 * ((long long)a0[760] - (long long)a0[752] >> 4);
    v22 = 0;
    if ((int)a0[128] == 41)
    {
        v35 = 0;
        v36 = 0;
    }
    else
    {
        sub_199b8(a0, &v20, 1, 0, 0, 0, 0);
        v36 = v19;
        v35 = v16;
    }
    sub_1ef30(a0, 41, &v23, 0);
    v37 = sub_18b88(a0, 0);
    if (!v37)
    {
        v38 = sub_13094(a0, 0, 0);
        v37 = sub_404c((long long)a0[216], 56);
        v16 = v38;
        v17 = 0;
        v18 = 0;
        sub_62f0(v37, a0 + 132, &v16);
    }
    v1 = v35;
    v2 = v36;
    v39 = (long long)a0[168];
    v13 = a0 + 848;
    v14 = (long long)a0[856] - (long long)a0[848] >> 3;
    v15 = 0;
    v10 = a0 + 1064;
    v11 = (long long)a0[1072] - (long long)a0[1064] >> 5;
    v12 = 0;
    if (!v22 || sub_21970(v20->field_0 + 48 * v21, "self") & 1 || *(long long *)(v20->field_0 + 48 * v21 + 24))
    {
        v44->field_0 = v29;
        *(uint128_t *)&(&v44->field_0)[1] = v30;
        v16 = *(unsigned long long *)&v31;
        v17 = v39;
        v8 = 0;
        v9 = 0;
        *(unsigned long long *)((char *)&v44->field_8 + 8) = sub_12160(a0, &v16, &v8, "'self' must be present as the unannotated first parameter");
        *(char *)&v44->field_18 = 1;
        *(unsigned long long *)(v44->padding_20)[1] = 0;
        *(unsigned long long *)((char *)&v44->field_18 + 4) = 0;
    }
    else
    {
        v0 = v37;
        if (v22 != 1)
        {
            v40 = v21 * 48;
            v41 = 1;
            do
            {
                v42 = v20->field_0 + v40;
                v8 = *(int128_t *)&(&v42->field_30)[1];
                v16 = v42->field_30;
                v17 = *(int128_t *)&(&v42->field_30)[1];
                v19 = 1;
                v5 = &v32;
                v32 = &v5;
                sub_22564(v10, &v16);
                v12 += 1;
                if (*(long long *)(v20->field_0 + v40 + 72))
                {
                    v16 = &v8;
                    v8 = &v16;
                    sub_103a8(v13);
                }
                else
                {
                    v16 = *(unsigned long long *)&v31;
                    v17 = v39;
                    v8 = 0;
                    v9 = 0;
                    v7 = sub_12160(a0, &v16, &v8, "All declaration parameters aside from 'self' must be annotated");
                    v5 = &v32;
                    v32 = &v5;
                    sub_103a8(v13, &v7);
                }
            } while ((v15 += 1, v41 += 1, v40 += 48, v22 > v41));
        }
        if (v1 & 1 & !v2)
            sub_1db64(a0, &v31, "All declaration parameters aside from 'self' must be annotated");
        v8 = *(unsigned long long *)&v31;
        v9 = v39;
        v16 = sub_ef54(a0, &v13);
        v17 = &v13;
        v18 = v2;
        v5 = sub_17fc0(a0, &v10);
        v6 = &v10;
        v43 = sub_63d8(sub_404c((long long)a0[216], 128), &v8, a1, &v27, &v25, &v16, &v5, v0);
        v44->field_0 = v29;
        *(uint128_t *)&(&v44->field_0)[1] = v30;
        *(unsigned long long *)((char *)&v44->field_8 + 8) = v43;
        *(char *)&v44->field_18 = 1;
        *(unsigned long long *)((char *)&v44->field_18 + 4) = *(unsigned long long *)&v31;
        *(unsigned long *)(v44->padding_20)[1] = v39;
    }
    *(unsigned int *)((char *)&v44->field_24 + 4) = 3;
    sub_12a6c(v10, *v10 + v11 * 32, v10[1]);
    sub_dd88(v13, v13->field_0 + v14 * 8, v13->field_8);
    return sub_1d9ac(v20, v20->field_0 + 48 * v21, v20->field_8);
}
