/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39d04..0x3a064 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39d04_4 {
    long long field_0;
    char padding_8[616];
    char field_270;
    char padding_271[907];
    unsigned int field_5fc;
} st_39d04_4;

typedef struct st_39d04_7 {
    struct st_39d04_2 *field_0;
    char padding_8[8];
    struct st_39d04_3 *field_10;
    char padding_18[8];
    char field_20;
} st_39d04_7;

typedef struct st_39d04_3 {
    int field_0;
} st_39d04_3;

typedef struct st_39d04_1 {
    char padding_0[12];
    char field_c;
    char padding_d[19];
    struct st_39d04_2 *field_20;
    char padding_28[8];
    struct st_39d04_3 *field_30;
    char padding_38[8];
    long long field_40;
} st_39d04_1;

typedef struct st_39d04_2 {
    long long field_0;
} st_39d04_2;

typedef struct st_39d04_0 {
    char field_0;
} st_39d04_0;

typedef struct st_39d04_5 {
    struct st_39d04_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_39d04_5;

extern st_39d04_5 g_e65458;
extern long long g_f0ca10;

unsigned long long sub_39d04(st_39d04_4 *a0, st_39d04_1 *a1)
{
    st_39d04_7 *v25;  // x21
    unsigned long long v27;  // x24
    unsigned long long v28;  // x0
    unsigned long long v29;  // x23
    long long v30;  // x0
    long long len;  // x0
    long long v32;  // x21
    unsigned long long v33;  // x0
    unsigned int v0;  // [bp-0x12c]
    st_39d04_0 **v1;  // [bp-0x128], Other Possible Types: char
    st_39d04_0 *v2;  // [bp-0x120]
    unsigned int v3;  // [bp-0x118]
    uint128_t v4;  // [bp-0x110]
    unsigned long v5;  // [bp-0x100]
    uint128_t v6;  // [bp-0xf8]
    unsigned long v7;  // [bp-0xe8]
    char *v8;  // [bp-0xe0], Other Possible Types: st_39d04_4 *, unsigned long long *, unsigned long
    unsigned long long v9;  // [bp-0xd8]
    st_39d04_4 *v10;  // [bp-0xd0]
    unsigned long long v11;  // [bp-0xc8]
    unsigned long long v12;  // [bp-0xc0]
    unsigned long long v13;  // [bp-0xb8]
    char v14;  // [bp-0xa9]
    unsigned int v15;  // [bp-0xa8]
    unsigned long long v16;  // [bp-0xa0]
    unsigned long long v17;  // [bp-0x98]
    uint256_t v18;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v19;  // [bp-0x88]
    unsigned long long v20;  // [bp-0x80]
    unsigned long long v21;  // [bp-0x78]
    char v22;  // [bp-0x69]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v2 = &v1;
    v1 = &v2;
    v25 = &a1->field_20;
    v22 = sub_46ddc(a0, *(long long *)(sub_10160(&a0->field_270, a1->field_20) + 8));
    if ((char)g_f0ca10 == 1 && (char)a1->field_40 == 1)
    {
        sub_45d78(a0, a1);
        sub_42080(&a0[1].padding_8[248], v25);
        *(char *)(sub_12484(&a0[1].padding_8[248], v25) + 8) = v22;
    }
    v0 = a0->field_5fc;
    if (a1->padding_28)
    {
        v27 = sub_42480(a0);
        v28 = sub_3b87c();
        if (!(v27 >> 31 & 1))
        {
            v29 = v27;
        }
        else
        {
            v29 = v28;
            sub_47e48(a0, a1->padding_28, v29, 0);
        }
        sub_2ad10(a0->field_0, 89, v22, (unsigned int)v29 & 0xff, 0);
    }
    else
    {
        sub_2ad10(a0->field_0, 89, v22, 0xff, 0);
    }
    v30 = sub_2bc4c(a0->field_0);
    sub_31514(a0->field_0, 0xdeadbeef);
    v18 = 0;
    v16 = 0;
    len = _strlen(*(long long *)v25->field_0);
    v15 = sub_2df40(a0->field_0, *(long long *)v25->field_0, len);
    sub_42648(a0, v15, v25->field_0 + 1);
    v14 = sub_3b87c(a0, a1, 1);
    if (!a1->padding_38)
    {
        v3 = v15;
        v4 = v16;
        v5 = v18;
        v17 = 0;
        *(unsigned long long *)&v18 = 0;
        v16 = 0;
        v6 = *(uint128_t *)((void*)&v18 + 8);
        v7 = *(unsigned long long *)((void*)&v18 + 24);
        v19 = 0;
        v20 = 0;
        v21 = 0;
        v32 = sub_2fe08(a0->field_0, &v3);
        v8 = &v6;
        sub_1aedc(&v8);
        v8 = &v4;
        sub_1aedc(&v8);
        sub_42648(a0, v32, &a1->field_c);
        sub_29a6c(a0->field_0, v30, v32);
        v8 = &v19;
        sub_1aedc(&v8);
        v8 = &v16;
        v33 = sub_1aedc(&v8);
        a0->field_5fc = v0;
        return v33;
    }
    v8 = a0;
    v9 = &v15;
    v10 = a0;
    v11 = &v14;
    v12 = &v15;
    v13 = &v22;
    (&g_e65458.field_0)[*(int *)a1->field_30]();
}
