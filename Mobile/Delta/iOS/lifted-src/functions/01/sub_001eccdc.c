/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eccdc..0x1ecea4 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eccdc_1 {
    char padding_0[148];
    unsigned int field_94;
} st_1eccdc_1;

typedef struct st_1eccdc_0 {
    char field_0;
} st_1eccdc_0;


unsigned long long sub_1eccdc(st_1eccdc_1 *a0, unsigned long a1, unsigned long a2, unsigned int a3)
{
    unsigned long long v27;  // x20
    st_1eccdc_0 **v0;  // [bp-0x120], Other Possible Types: char
    st_1eccdc_0 *v1;  // [bp-0x118]
    double v2;  // [bp-0x110]
    unsigned int v3;  // [bp-0x110]
    uint128_t v4;  // [bp-0x108], Other Possible Types: unsigned long long
    unsigned int v5;  // [bp-0x100]
    uint128_t v6;  // [bp-0xf8], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0xf0]
    unsigned long v8;  // [bp-0xe8]
    unsigned int v9;  // [bp-0xe0]
    unsigned long long v10;  // [bp-0xdc]
    unsigned long long v11;  // [bp-0xd8]
    unsigned long long v12;  // [bp-0xd0]
    unsigned long long v13;  // [bp-0xc8]
    unsigned long long v14;  // [bp-0xc0]
    unsigned long long v15;  // [bp-0xb0]
    unsigned long long v16;  // [bp-0xa0]
    unsigned long long v17;  // [bp-0x98]
    unsigned long long v18;  // [bp-0x90]
    unsigned long long v19;  // [bp-0x80]
    unsigned long long v20;  // [bp-0x70]
    unsigned long long v21;  // [bp-0x60]
    char v22;  // [bp-0x54]
    unsigned int v23;  // [bp-0x4c]
    unsigned long v24;  // [bp-0x48]
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v1 = &v0;
    v0 = &v1;
    v24 = a1;
    v21 = 0;
    v20 = 0;
    v19 = 0;
    v18 = 0;
    v16 = 0;
    v14 = 0;
    v15 = 0;
    v12 = 0;
    v8 = a1;
    v9 = a3;
    v10 = 0;
    v11 = 0;
    v13 = 0;
    v15 = 0;
    v17 = 0;
    v2 = 1.5e-323;
    v4 = 0x10000000100000001;
    v6 = CONCAT(1, 1);
    sub_1f42b0();
    if (!(sub_1f0934(a0, a0, &v22, &v24, a2, &v8) & 1))
    {
LABEL_1ece30:
        v27 = 0;
    }
    else if (v24 != a2)
    {
        v27 = 0;
        *(unsigned long long *)&a0->padding_0[8] = 0;
        a0->field_94 = a0->field_94 | 0x69000000;
    }
    else
    {
        sub_1fa964(a0);
        v3 = 21;
        v6 = 0;
        v7 = 0;
        v4 = v22;
        v5 = v23;
        sub_1f42b0(a0, &v3);
        if (v11 == 1 && !sub_1f9fa0(a0, &v8))
            goto LABEL_1ece30;
        sub_1f9c1c(a0, sub_1f6fd4(a0, &v8));
        v27 = 1;
    }
    sub_1eccac(&v20);
    sub_1eccac(&v18 + 1);
    sub_1eccac(&v16);
    sub_1eccac(&v14 + 1);
    sub_1eccac(&v12);
    return v27;
}
