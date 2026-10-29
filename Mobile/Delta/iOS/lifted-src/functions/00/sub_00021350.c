/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21350..0x21544 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_21350_3 {
    unsigned long long field_0;
    char field_8[20];
    char field_c;
    char padding_d[71];
    unsigned long long field_54;
    char padding_5c[52];
    unsigned int field_90;
    char padding_94[120];
    unsigned long long field_10c;
    unsigned long long field_114;
} st_21350_3;

typedef struct st_21350_2 {
    char padding_0[48];
    char field_30;
} st_21350_2;

typedef struct st_21350_1 {
    char padding_0[8];
    unsigned int field_8;
    unsigned long long field_c;
    unsigned long long field_14;
    char padding_1c[20];
    char field_30;
} st_21350_1;

typedef struct st_21350_0 {
    char field_0;
} st_21350_0;

extern unsigned int g_f00c20;

long long sub_21350(void* a0)
{
    unsigned long v13;  // x24
    st_21350_3 *v14;  // x22
    long long v15;  // x0
    st_21350_2 *v16;  // x21
    st_21350_1 *v17;  // x22
    unsigned long v18;  // x23
    unsigned int v19;  // w25
    unsigned long v20;  // x26
    char v21;  // x0
    st_21350_0 **v0;  // [bp-0xc8], Other Possible Types: char
    st_21350_0 *v1;  // [bp-0xc0]
    unsigned int v2;  // [bp-0xb8], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0xb4]
    unsigned long v4;  // [bp-0xb0]
    st_21350_1 *v5;  // [bp-0xa8]
    st_21350_1 *v6;  // [bp-0x98]
    st_21350_1 *v7;  // [bp-0x94]
    st_21350_1 *v8;  // [bp-0x84]
    uint128_t v9;  // [bp-0x80]
    uint128_t v10;  // [bp-0x70]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v1 = &v0;
    v0 = &v1;
    v13 = (long long)a0[132];
    v14 = a0 + 132;
    sub_f8d0();
    v15 = sub_18934(a0, 0);
    v9 = (int128_t)a0[128];
    v10 = (int128_t)a0[144];
    v7 = (st_21350_1 *)0;
    v8 = (st_21350_1 *)0;
    if (sub_1f3d4(a0, 308, "if statement"))
        sub_1f158(&v7, &v9 | 4);
    v16 = sub_10a78(a0);
    sub_16df8(a0, (unsigned long long)((long long)a0[408] - (long long)a0[400]) >> 3);
    v5 = (st_21350_1 *)0;
    v6 = (st_21350_1 *)0;
    if ((int)a0[128] == 295)
    {
        v16->field_30 = 1;
        sub_16844(a0, "elseif");
        sub_1f158(&v5, v14);
        v17 = sub_21350(a0);
        v18 = *(long long *)((char *)&v17->field_c + 4);
        *(int *)&a0[276] = (int)a0[276];
    }
    else
    {
        if ((int)a0[128] == 294)
        {
            v16->field_30 = 1;
            sub_1f158(&v5, v14);
            v19 = (int)a0[128];
            v20 = (long long)a0[132];
            sub_f8d0(a0);
            v17 = sub_10a78(a0);
            sub_16df8(a0, (unsigned long long)((long long)a0[408] - (long long)a0[400]) >> 3);
            *(long long *)&(&v17->field_8)[1] = (long long)a0[140];
        }
        else
        {
            v17 = 0;
            v19 = *(unsigned int *)&v9;
            v20 = *(unsigned long long *)((void*)&v9 + 4);
        }
        v18 = (long long)a0[140];
        v2 = v19;
        v3 = v20;
        v21 = sub_1e5c4(a0, 296, &v2);
        if (!v17)
        {
            v16->field_30 = v21;
        }
        else if (v17->field_8 == g_f00c20)
        {
            v17->padding_1c[16] = v21;
        }
    }
    v2 = v13;
    v4 = v18;
    return sub_69e4(sub_404c((long long)a0[216], 96), &v2, v15, v16, v17, &v7, &v5);
}
