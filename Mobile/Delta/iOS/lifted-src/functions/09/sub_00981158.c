/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981158..0x981218 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981158_3 {
    struct st_981158_0 *field_0;
    struct st_981158_1 *field_8;
    char padding_10[40];
    unsigned long long field_38;
    char padding_40[56];
    unsigned long long field_78;
    unsigned long long field_80;
    unsigned long long field_88;
    char padding_90[2];
    unsigned short field_92;
    char padding_94[4];
    unsigned long long field_98;
} st_981158_3;

typedef struct st_981158_2 {
    char padding_0[136];
    struct st_981158_1 *field_88;
    struct st_981158_1 *field_90;
    unsigned long long field_98;
} st_981158_2;

typedef struct st_981158_1 {
    struct st_981158_2 *field_0;
    struct st_981158_0 *field_8;
    struct st_981158_1 *field_10;
    char padding_18[40];
    long long field_40;
    char padding_48[56];
    long long field_80;
    long long field_88;
    long long field_90;
    char padding_98[2];
    unsigned short field_9a;
    char padding_9c[4];
    long long field_a0;
} st_981158_1;

typedef struct st_981158_0 {
    char padding_0[16];
    struct st_981158_1 *field_10;
} st_981158_0;


unsigned long long sub_981158(st_981158_1 *a0)
{
    st_981158_2 *v2;  // x8
    st_981158_1 *v3;  // x9
    st_981158_0 *v4;  // x11
    st_981158_3 *v5;  // x10
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_97b1a4(a0->field_40);
    a0->field_40 = 0;
    sub_98830c(a0->field_88);
    a0->field_88 = 0;
    sub_980540(a0->field_80);
    a0->field_80 = 0;
    sub_a356d0(a0->field_90);
    a0->field_90 = 0;
    if (a0->field_9a >> 5 & 1)
    {
        v2 = a0->field_0;
        if (v2->field_88 == a0)
            v2->field_88 = a0->field_8;
        v3 = a0->field_10;
        if (v2->field_90 == a0)
            v2->field_90 = v3;
        v4 = a0->field_8;
        v5 = &a0->field_8;
        if (v3)
            v3->field_8 = v4;
        if (v4)
            v4->field_10 = v3;
        v2->field_98 = v2->field_98 - 1;
        v5->field_0 = 0;
        v5->field_8 = 0;
        a0->field_9a = a0->field_9a & 0xffffffdf;
    }
    v6 = sub_a4bca0(a0->field_a0);
    a0->field_a0 = 0;
    return v6;
}
