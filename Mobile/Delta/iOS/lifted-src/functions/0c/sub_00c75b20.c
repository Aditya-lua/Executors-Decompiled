/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75b20..0xc75bcc (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c75b20_0 {
    uint128_t field_0;
    struct st_c75b20_0 *field_10;
    char padding_18[8];
    struct st_c75b20_0 *field_20;
    char padding_28[8];
    struct st_c75b20_0 *field_30;
    char padding_38[8];
    uint128_t field_40;
    struct st_c75b20_0 *field_50;
    char padding_58[8];
    struct st_c75b20_0 *field_60;
    char padding_68[8];
    struct st_c75b20_0 *field_70;
    char field_72[30];
    char field_80;
    char padding_81[15];
    struct st_c75b20_0 *field_90;
} st_c75b20_0;


st_c75b20_0 * sub_c75b20(st_c75b20_0 *a0)
{
    st_c75b20_0 *v13;  // w8
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    uint240_t v0;  // [bp-0xae]
    uint128_t v1;  // [bp-0x90]
    st_c75b20_0 *v2;  // [bp-0x80]
    st_c75b20_0 *v3;  // [bp-0x70]
    st_c75b20_0 *v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    st_c75b20_0 *v6;  // [bp-0x40]
    st_c75b20_0 *v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v13 = (st_c75b20_0 *)a0->field_72[24];
    if (!v13)
    {
        v8 = v14;
        v9 = v15;
        v10 = &v12;
        v11 = v16;
        v1 = 850045863;
        v2 = (st_c75b20_0 *)0;
        v3 = (st_c75b20_0 *)0;
        v4 = (st_c75b20_0 *)0;
        v5 = 1018212795;
        v6 = (st_c75b20_0 *)0;
        v7 = (st_c75b20_0 *)0;
        *(unsigned long long *)((char *)&v0 + 6) = 0;
        *(unsigned long long *)((char *)&v0 + 14) = 0;
        *(unsigned long long *)((char *)&v0 + 22) = 0;
        a0->field_0 = 850045863;
        *(uint128_t *)&a0->field_10 = 0;
        *(uint128_t *)&a0->field_50 = 0;
        *(uint128_t *)&a0->field_60 = 0;
        *(uint128_t *)&a0->field_30 = 0;
        a0->field_40 = 1018212795;
        *(uint128_t *)&a0->field_20 = 0;
        *(unsigned short *)&a0->field_70 = 0;
        *(uint128_t *)((char *)&a0->field_70 + 2) = *(uint128_t *)&v0;
        *(uint128_t *)&a0->field_72[8] = *(uint128_t *)((void*)&v0 + 14);
        a0->field_72[24] = 1;
        sub_c5e690();
        return a0;
    }
    else if (v13 == 1)
    {
        return a0;
    }
    else
    {
        return 0;
    }
}
