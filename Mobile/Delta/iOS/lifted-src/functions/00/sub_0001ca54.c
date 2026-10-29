/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ca54..0x1cc68 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ca54_4 {
    unsigned long long field_0;
    long long field_8;
} st_1ca54_4;

typedef struct st_1ca54_3 {
    unsigned long long field_0;
    void* field_8;
    char padding_10[416];
    unsigned long long field_1b0;
    long long field_1b8;
} st_1ca54_3;

typedef struct st_1ca54_2 {
    char padding_0[128];
    unsigned int field_80;
    uint128_t field_84;
    char padding_94[68];
    long long field_d8;
    char padding_e0[104];
    unsigned long long field_148;
    unsigned long long field_150;
    char padding_158[184];
    unsigned long long field_210;
    char padding_218[120];
    unsigned long long field_290;
    void* field_298;
    char padding_2a0[416];
    unsigned long long field_440;
    long long field_448;
} st_1ca54_2;

typedef struct st_1ca54_0 {
    char field_0;
} st_1ca54_0;

extern char g_f0ca10;

long long sub_1ca54(st_1ca54_2 *a0)
{
    long long v15;  // x0
    char *v16;  // x8
    unsigned long v17;  // x20
    long long v18;  // x0
    long long v19;  // x0
    st_1ca54_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_1ca54_0 *v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0xa0]
    st_1ca54_3 **v3;  // [bp-0x98]
    unsigned long v4;  // [bp-0x90]
    unsigned long v5;  // [bp-0x88]
    st_1ca54_4 *v6;  // [bp-0x80]
    long long v7;  // [bp-0x78]
    unsigned long long v8;  // [bp-0x70]
    st_1ca54_3 *v9;  // [bp-0x68]
    long long v10;  // [bp-0x60]
    unsigned long long v11;  // [bp-0x58]
    uint128_t v12;  // [bp-0x50]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v1 = &v0;
    v0 = &v1;
    v12 = *(int128_t *)&(&a0->field_80)[1];
    v15 = sub_f8d0();
    v9 = &a0->padding_218[104];
    v10 = *(long long *)&a0->padding_218[112] - *(long long *)&a0->padding_218[104] >> 3;
    v11 = 0;
    v6 = &a0->padding_2a0[400];
    v7 = *(long long *)&a0->padding_2a0[408] - *(long long *)&a0->padding_2a0[400] >> 3;
    v8 = 0;
    if (!(sub_1184c(v15, &a0->field_80) & 1) && a0->field_80 != 59)
    {
        sub_ff50();
        if (!v11)
            goto LABEL_1cb14;
        v16 = *(long long *)((char *)v9->field_8 - 8) + 12;
    }
    else
    {
LABEL_1cb14:
        v16 = &v12;
    }
    v4 = *(unsigned long long *)&v12;
    v5 = *(long long *)&v16[8];
    v2 = sub_ef54(a0, &v9);
    v3 = &v9;
    v17 = sub_404c(*(long long *)&a0->padding_94[56], 48);
    sub_6730(v17, &v4, &v2);
    if (a0->padding_0[88] == 1)
    {
        v18 = sub_ef54(a0, &v6);
        v19 = sub_404c(*(long long *)&a0->padding_94[56], 24);
        sub_856c(v19, v18, &v6);
        v4 = v17;
        sub_1c9f0(&a0[1].padding_0[64], &v4);
        *(long long *)(sub_12484(&a0[1].padding_0[64], &v4) + 8) = v19;
    }
    if (g_f0ca10 == 1 && *(long long *)&a0->padding_e0[96] - *(long long *)&a0->padding_e0[88] == 8)
    {
        if (*(long long *)&a0->padding_158[168])
            sub_1db64(a0, v17 + 12, "Exporting values is not compatible with top-level return (export/return conflict)");
        a0->padding_218[0] = 1;
    }
    sub_dd88(v6, v6->field_0 + v7 * 8, v6->field_8);
    sub_dd88(v9, v9->field_0 + v10 * 8, v9->field_8);
    return v17;
}
