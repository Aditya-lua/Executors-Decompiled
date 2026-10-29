/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981440..0x981510 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981440_1 {
    char padding_0[48];
    struct st_981440_0 *field_30;
    struct st_981440_0 *field_38;
    char padding_40[8];
    struct st_981440_0 *field_48;
    char padding_50[74];
    unsigned short field_9a;
} st_981440_1;

typedef struct st_981440_0 {
    char padding_0[8];
    struct st_981440_0 *field_8;
    char padding_10[1040];
    unsigned long long field_420;
} st_981440_0;


st_981440_0 * sub_981440(st_981440_1 *a0, st_981440_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_981440_0 *v17;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_981440_0 *v12;  // x20
    st_981440_0 *v13;  // w0
    st_981440_0 *v14;  // x21
    st_981440_0 *v15;  // x21
    unsigned short v16;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0->field_38 == a1)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a1;
    v13 = (st_981440_0 *)(unsigned int)sub_9812b8();
    if (!v13)
        return v13;
    v14 = a0->field_48;
    if (a0->field_48)
    {
        do
        {
            v15 = v14;
            sub_9857d8(v15->field_420, v12);
            v14 = v15->field_8;
        } while (v15->field_8);
    }
    a0->field_38 = v12;
    v16 = 0x100;
    if (a0->field_30)
    {
        v16 = 0x100 | (0x100 | (unsigned short)(__ROL__(sub_9d46fc(a0->field_30, 0x55, 0, 0) >> 2, 7)) & 128) & 0xff;
        v12 = a0->field_38;
    }
    if (v12)
        v17 = (st_981440_0 *)((unsigned short)sub_9d46fc(v12, 0x55, 0, 0) * 32 & 64);
    else
        v17 = (st_981440_0 *)0;
    a0->field_9a = v17 | v16 | a0->field_9a & 0xfffffe3f;
    return 1;
}
