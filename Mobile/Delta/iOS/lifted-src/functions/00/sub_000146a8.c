/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x146a8..0x14a84 (988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_146a8_3 {
    unsigned long long field_0;
    long long field_8;
} st_146a8_3;

typedef struct st_146a8_1 {
    char padding_0[12];
    unsigned long long field_c;
    unsigned int field_14;
} st_146a8_1;

typedef struct st_146a8_4 {
    char padding_0[20];
    unsigned long long field_14;
} st_146a8_4;

typedef struct st_146a8_2 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[416];
    unsigned long long field_1b0;
    long long field_1b8;
} st_146a8_2;

typedef struct st_146a8_0 {
    char field_0;
} st_146a8_0;


long long sub_146a8(void* a0, st_146a8_1 *a1, long long a2)
{
    unsigned int v20;  // w8
    unsigned int v21;  // w8
    char *v30;  // x1
    unsigned int v22;  // w0
    unsigned long v23;  // x22
    long long v24;  // x20
    long long v25;  // x0
    long long v26;  // x0
    unsigned long v27;  // x22
    long long v28;  // x0
    unsigned long v29;  // x0
    st_146a8_0 **v0;  // [bp-0xe8], Other Possible Types: char
    st_146a8_0 *v1;  // [bp-0xe0]
    unsigned long v2;  // [bp-0xd8]
    unsigned long v3;  // [bp-0xd0]
    st_146a8_4 *idx;  // [bp-0xc8], Other Possible Types: unsigned long
    unsigned long v5;  // [bp-0xc0]
    unsigned long v6;  // [bp-0xb8]
    st_146a8_2 **v7;  // [bp-0xb0], Other Possible Types: unsigned long
    unsigned long v8;  // [bp-0xa8]
    st_146a8_4 **v9;  // [bp-0xa0], Other Possible Types: unsigned long
    st_146a8_3 *v10;  // [bp-0x98], Other Possible Types: unsigned long
    st_146a8_4 **v11;  // [bp-0x90], Other Possible Types: long long, unsigned long
    unsigned long v12;  // [bp-0x88]
    st_146a8_2 *v13;  // [bp-0x80], Other Possible Types: uint128_t, unsigned long
    long long v14;  // [bp-0x78], Other Possible Types: unsigned long
    unsigned long v15;  // [bp-0x70]
    unsigned int v16;  // [bp-0x5c]
    unsigned long v17;  // [bp-0x58]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v1 = &v0;
    v0 = &v1;
    v20 = (int)a0[128];
    if (v20 - 278 >= 2)
    {
        switch (v20)
        {
        case 123:
            idx = sub_219fc(a0);
            v13 = *(long long *)&(a1->padding_0)[1];
            v14 = *(long long *)&(idx->padding_0)[1];
            v10 = sub_13094(a0, &idx, 1);
            v11 = &idx;
            v8 = 0;
            v9 = 0;
            v6 = (long long)a0[140];
            v7 = (long long)a0[168];
            v27 = sub_404c((long long)a0[216], 96);
            sub_55f8(v27, &v13, a1, &v10, a2, &v8, &v6);
            if ((char)a0[88] != 1)
                return v27;
            v28 = sub_404c((long long)a0[216], 48);
            sub_8510(v28, -0x1, -0x1, 0, 0);
            v13 = v27;
            sub_1c9f0(a0 + 1184, &v13);
            v29 = a0 + 1184;
            v30 = &v13;
            break;
        case 40:
            if (*(int *)((char *)&a1->field_c + 4) == (int)a0[132])
            {
                v21 = 40;
            }
            else
            {
                sub_16d40(a0);
                v21 = (int)a0[128];
            }
            v16 = v21;
            v17 = (long long)a0[132];
            sub_f8d0(a0);
            v13 = a0 + 656;
            v14 = (long long)a0[664] - (long long)a0[656] >> 3;
            v15 = 0;
            v10 = a0 + 1088;
            v11 = (long long)a0[1096] - (long long)a0[1088] >> 3;
            v12 = 0;
            if ((int)a0[128] != 41)
                sub_ff50();
            v22 = sub_1ef30(a0, 41, &v16, 0);
            v8 = *(long long *)&(a1->padding_0)[1];
            v9 = (long long)a0[140];
            v6 = sub_ef54(a0, &v13);
            v7 = &v13;
            idx = 0;
            v5 = 0;
            v2 = (long long)a0[140];
            v3 = (long long)a0[140];
            v23 = sub_404c((long long)a0[216], 96);
            sub_55f8(v23, &v8, a1, &v6, a2, &idx, &v2);
            if ((char)a0[88] == 1)
            {
                if (v22)
                    v24 = (long long)a0[160];
                else
                    v24 = -0x1;
                v25 = sub_ef54(a0, &v10);
                v26 = sub_404c((long long)a0[216], 48);
                sub_8510(v26, (long long)a0[132], v24, v25, &v10);
                v8 = v23;
                sub_1c9f0(a0 + 1184, &v8);
                *(long long *)(sub_12484(a0 + 1184, &v8) + 8) = v26;
            }
            sub_dd88(v10, v10->field_0 + v11 * 8, v10->field_8);
            sub_dd88(v13, v13->field_0 + v14 * 8, v13->field_8);
            return v23;
        default:
            return sub_15dd0(a0, a1, a2);
        }
    }
    else
    {
        v13 = (int128_t)a0[132];
        idx = sub_19760(a0);
        v10 = *(long long *)&(a1->padding_0)[1];
        v11 = *(long long *)&(idx->padding_0)[1];
        v8 = sub_13094(a0, &idx, 1);
        v9 = &idx;
        v6 = 0;
        v7 = 0;
        v27 = sub_404c((long long)a0[216], 96);
        sub_55f8(v27, &v10, a1, &v8, a2, &v6, &v13);
        if ((char)a0[88] != 1)
            return v27;
        v28 = sub_404c((long long)a0[216], 48);
        sub_8510(v28, -0x1, -0x1, 0, 0);
        v10 = v27;
        sub_1c9f0(a0 + 1184, &v10);
        v29 = a0 + 1184;
        v30 = &v10;
    }
    *(long long *)(sub_12484(v29, v30) + 8) = v28;
    return v27;
}
