/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976fdc..0x9771bc (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976fdc_8 {
    struct st_976fdc_6 *field_0;
    struct st_976fdc_7 *field_8;
    char padding_10[16];
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[8];
    unsigned long long field_48;
    unsigned long long field_50;
    char padding_58[120];
    unsigned long long field_d0;
    unsigned long long field_d8;
    unsigned long long field_e0;
    char padding_e8[792];
    unsigned long long field_400;
    struct st_976fdc_4 *field_408;
    char padding_410[8];
    unsigned long long field_418;
    unsigned long long field_420;
    char padding_428[24];
    unsigned long long field_440;
    unsigned long long field_448;
    unsigned long long field_450;
    unsigned long long field_458;
    unsigned long long field_460;
    unsigned long long field_468;
    char padding_470[216];
    unsigned long long field_548;
    char padding_550[120];
    unsigned long long field_5c8;
    char padding_5d0[72];
    char field_618[8];
    char field_619;
    char padding_61a[3];
    char field_61d;
    char padding_61e[2];
    unsigned long long field_620;
    unsigned long long field_628;
    char padding_630[8];
    unsigned long long field_638;
} st_976fdc_8;

typedef struct st_976fdc_7 {
    char padding_0[8];
    unsigned long long field_8;
} st_976fdc_7;

typedef struct st_976fdc_4 {
    char padding_0[8];
    struct st_976fdc_5 *field_8;
} st_976fdc_4;

typedef struct st_976fdc_3 {
    struct st_976fdc_2 *field_0;
    struct st_976fdc_1 *field_8;
    struct st_976fdc_0 *field_10;
    char padding_18[16];
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    unsigned long long field_40;
    char padding_48[8];
    unsigned long long field_50;
    unsigned long long field_58;
    char padding_60[120];
    unsigned long long field_d8;
    unsigned long long field_e0;
    unsigned long long field_e8;
    char padding_f0[608];
    char field_350;
    char padding_351[143];
    char field_3e0;
    char padding_3e1[39];
    unsigned long long field_408;
    struct st_976fdc_4 *field_410;
    char padding_418[8];
    unsigned long long field_420;
    unsigned long long field_428;
    char padding_430[24];
    unsigned long long field_448;
    unsigned long long field_450;
    unsigned long long field_458;
    unsigned long long field_460;
    unsigned long long field_468;
    unsigned long long field_470;
    char padding_478[216];
    unsigned long long field_550;
    char padding_558[120];
    unsigned long long field_5d0;
    char padding_5d8[72];
    unsigned long long field_620;
    char field_621;
    char padding_622[3];
    char field_625;
    char padding_626[2];
    unsigned long long field_628;
    unsigned long long field_630;
    char padding_638[8];
    unsigned long long field_640;
} st_976fdc_3;

typedef struct st_976fdc_1 {
    char padding_0[16];
    char field_10;
} st_976fdc_1;

typedef struct st_976fdc_6 {
    char padding_0[16];
    unsigned long long field_10;
} st_976fdc_6;

typedef struct st_976fdc_5 {
    unsigned long long field_0;
} st_976fdc_5;

typedef struct st_976fdc_0 {
    char padding_0[8];
    char field_8;
} st_976fdc_0;

typedef struct st_976fdc_2 {
    char padding_0[72];
    struct st_976fdc_3 *field_48;
    struct st_976fdc_3 *field_50;
    unsigned long long field_58;
} st_976fdc_2;


void sub_976fdc(st_976fdc_3 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_976fdc_2 *v8;  // x8
    st_976fdc_0 *v9;  // x9
    st_976fdc_1 *v10;  // x11
    st_976fdc_8 *v11;  // x10
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->padding_418)
    {
        sub_9754a0(a0->padding_418, 0);
        sub_9754a0(a0->padding_418, 1);
        sub_9754a0(a0->padding_418, 2);
    }
    sub_980be0(a0->field_38, a0);
    sub_9887a0(a0->field_40, a0);
    sub_98b620(a0->field_d8);
    sub_98e018(a0->field_e0);
    sub_976018(a0->field_e8);
    sub_9852c8(a0->field_420);
    if (a0->field_408)
        a0->field_410->field_8();
    if ((char)(*((char *)&a0->field_620 + 1)) >> 4 & 1)
        sub_c044(&a0->field_3e0);
    sub_974d24(a0->padding_418);
    if ((char)(*((char *)&a0->field_620 + 1)) >> 5 & 1)
        sub_989320(&a0->field_350);
    sub_988ae8(a0->field_448);
    sub_9860e8(a0->field_460);
    sub_988ae8(a0->field_450);
    sub_9860e8(a0->field_468);
    sub_988ae8(a0->field_458);
    sub_9860e8(a0->field_470);
    sub_9842b4(a0->field_550);
    a0->field_550 = 0;
    sub_98a138(a0->field_28);
    sub_983138(a0->field_428);
    sub_a6c2e4(a0->field_50, "ssl/quic/quic_channel.c", 423);
    sub_a6c2e4(a0->field_5d0, "ssl/quic/quic_channel.c", 424);
    sub_a356d0(*(long long *)&a0->field_621);
    sub_a6c2e4(a0->field_628, "ssl/quic/quic_channel.c", 426);
    sub_a6c2e4(a0->field_58, "ssl/quic/quic_channel.c", 427);
    if (*((char *)&a0->field_620 + 5) & 1)
    {
        v8 = a0->field_0;
        if (v8->field_48 == a0)
            v8->field_48 = a0->field_8;
        v9 = a0->field_10;
        if (v8->field_50 == a0)
            v8->field_50 = v9;
        v10 = a0->field_8;
        v11 = &a0->field_8;
        if (v9)
            *(st_976fdc_1 **)&v9->field_8 = v10;
        if (v10)
            *(st_976fdc_0 **)&v10->field_10 = v9;
        v8->field_58 = v8->field_58 - 1;
        v11->field_0 = 0;
        v11->field_8 = 0;
        a0->field_620 = a0->field_620 & 0xfffffeffffffffff;
    }
    if (a0->padding_48)
        sub_973a1c(a0->padding_48);
    sub_a6c2e4(a0->padding_638, "ssl/quic/quic_channel.c", 438);
}
