/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981384..0x981440 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981384_0 {
    char padding_0[48];
    unsigned short field_30;
    char padding_32[6];
    unsigned short field_38;
    char padding_3a[6];
    long long field_40;
    char padding_48[82];
    unsigned short field_9a;
} st_981384_0;


int sub_981384(st_981384_0 *a0, unsigned short a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned short v12;  // w0
    unsigned short v13;  // x21
    unsigned short v14;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (*(long long *)&a0->field_30 == a1)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = sub_9812b8();
    if (!v12)
        return v12;
    sub_97b310(a0->field_40, a1);
    *(unsigned long long *)&a0->field_30 = a1;
    v13 = 0x100;
    if (a1)
        v13 = 0x100 | (0x100 | (unsigned short)(__ROL__(sub_9d46fc(a1, 0x55, 0, 0) >> 2, 7)) & 128) & 0xff;
    if (*(long long *)&a0->field_38)
        v14 = (unsigned short)sub_9d46fc(*(long long *)&a0->field_38, 0x55, 0, 0) * 32 & 64;
    else
        v14 = 0;
    a0->field_9a = v14 | v13 | a0->field_9a & 0xfffffe3f;
    return 1;
}
