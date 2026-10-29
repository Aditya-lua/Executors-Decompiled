/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50c030..0x50c284 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50c030_5 {
    char padding_0[1408];
    int field_580;
} st_50c030_5;

typedef struct st_50c030_1 {
    char padding_0[1408];
    unsigned long long field_580;
} st_50c030_1;

typedef struct st_50c030_3 {
    char padding_0[64];
    int field_40;
    char padding_44[28];
    struct st_50c030_2 *field_60;
    char padding_68[88];
    int field_c0;
    char padding_c4[60];
    long long field_100;
    char padding_108[56];
    void* field_140;
    char padding_148[24];
    int field_160;
    char padding_164[284];
    int field_280;
    char padding_284[28];
    long long field_2a0;
    char padding_2a8[24];
    int field_2c0;
    char padding_2c4[60];
    int field_300;
    char padding_304[188];
    int field_3c0;
    char padding_3c4[60];
    int field_400;
    char padding_404[60];
    int field_440;
    char padding_444[92];
    int field_4a0;
    char padding_4a4[220];
    int field_580;
    char padding_584[220];
    int field_660;
    char padding_664[124];
    void* field_6e0;
    char padding_6e8[120];
    int field_760;
} st_50c030_3;

typedef struct st_50c030_4 {
    char padding_0[64];
    unsigned int field_40;
    char padding_44[28];
    unsigned int field_60;
    char padding_64[28];
    void* field_80;
    char padding_88[56];
    int field_c0;
    char padding_c4[60];
    int field_100;
    char padding_104[60];
    int field_140;
    char padding_144[28];
    int field_160;
    char padding_164[28];
    int field_180;
    char padding_184[92];
    int field_1e0;
    char padding_1e4[28];
    int field_200;
    char padding_204[28];
    int field_220;
    char padding_224[60];
    int field_260;
    char padding_264[28];
    int field_280;
    char padding_284[28];
    int field_2a0;
    char padding_2a4[28];
    int field_2c0;
    char padding_2c4[28];
    int field_2e0;
    char padding_2e4[28];
    int field_300;
    char padding_304[60];
    int field_340;
    char padding_344[28];
    int field_360;
    char padding_364[28];
    int field_380;
    char padding_384[60];
    int field_3c0;
    char padding_3c4[28];
    int field_3e0;
    char padding_3e4[28];
    int field_400;
    char padding_404[60];
    int field_440;
    char padding_444[60];
    int field_480;
    char padding_484[28];
    int field_4a0;
    char padding_4a4[28];
    struct st_50c030_1 *field_4c0;
    char padding_4c8[152];
    int field_560;
    char padding_564[28];
    int field_580;
    char padding_584[92];
    unsigned long long field_5e0;
    char padding_5e8[24];
    int field_600;
    char padding_604[60];
    int field_640;
    char padding_644[28];
    int field_660;
    char padding_664[28];
    int field_680;
    char padding_684[92];
    int field_6e0;
    char padding_6e4[28];
    int field_700;
    char padding_704[28];
    int field_720;
    char padding_724[60];
    int field_760;
    char padding_764[60];
    int field_7a0;
} st_50c030_4;

typedef struct st_50c030_2 {
    char padding_0[64];
    unsigned int field_40;
    char padding_44[28];
    unsigned int field_60;
    char padding_64[28];
    unsigned long long field_80;
    char padding_88[56];
    unsigned long long field_c0;
    char padding_c8[56];
    unsigned long long field_100;
    char padding_108[56];
    unsigned int field_140;
    char padding_144[28];
    unsigned int field_160;
    char padding_164[28];
    unsigned long long field_180;
    char padding_188[88];
    char field_1e0;
    char padding_1e1[31];
    unsigned long long field_200;
    char padding_208[24];
    unsigned long long field_220;
    char padding_228[56];
    char field_260;
    char padding_261[31];
    unsigned long long field_280;
    char padding_288[24];
    unsigned long long field_2a0;
    char padding_2a8[24];
    unsigned int field_2c0;
    char padding_2c4[28];
    unsigned long long field_2e0;
    char padding_2e8[24];
    unsigned long long field_300;
    char padding_308[56];
    unsigned long long field_340;
    char padding_348[24];
    char field_360;
    char padding_361[31];
    unsigned long long field_380;
    char padding_388[56];
    unsigned long long field_3c0;
    char padding_3c8[24];
    unsigned long long field_3e0;
    char padding_3e8[24];
    unsigned long long field_400;
    char padding_408[56];
    char field_440;
    char padding_441[63];
    unsigned long long field_480;
    char padding_488[24];
    unsigned long long field_4a0;
    char padding_4a8[24];
    struct st_50c030_1 *field_4c0;
    char padding_4c8[152];
    unsigned long long field_560;
    char padding_568[24];
    unsigned long long field_580;
    char padding_588[88];
    unsigned long long field_5e0;
    char padding_5e8[24];
    unsigned long long field_600;
    char padding_608[56];
    unsigned long long field_640;
    char padding_648[24];
    unsigned long long field_660;
    char padding_668[24];
    unsigned long long field_680;
    char padding_688[88];
    unsigned long long field_6e0;
    char padding_6e8[24];
    unsigned long long field_700;
    char padding_708[24];
    unsigned long long field_720;
    char padding_728[56];
    unsigned long long field_760;
    char padding_768[56];
    unsigned long long field_7a0;
} st_50c030_2;

typedef struct st_50c030_0 {
    char field_0;
} st_50c030_0;

extern unsigned long long g_e81da8;

void sub_50c030(st_50c030_3 *a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    void* v10;  // x0
    long long v11;  // x0
    void* v12;  // x0
    st_50c030_4 *v13;  // x20
    st_50c030_5 *v14;  // x0
    void* v15;  // x0
    long long v16;  // x0
    st_50c030_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_50c030_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long long *)&a0->field_580 = 0;
    a0->field_280 = 0;
    *(unsigned long long *)&a0->field_760 = 0;
    *(unsigned long long *)&a0->field_c0 = 0;
    v10 = operatornew[](65);
    memset(v10, 0, 65);
    a0->field_6e0 = v10;
    v11 = operatornew[](0x400);
    _bzero(v11, 0x400);
    a0->field_100 = v11;
    v12 = operatornew[](128);
    memset(v12, 0, 128);
    a0->field_140 = v12;
    *(unsigned long long *)&a0->field_160 = 0;
    *(unsigned long long *)&a0->field_40 = 0;
    a0->field_2c0 = 0;
    a0->field_440 = 0;
    a0->field_300 = 0;
    a0->field_660 = 0;
    a0->field_4a0 = 0;
    *(char *)&a0->field_400 = 0;
    *(char *)&a0->field_3c0 = 0;
    v13 = operatornew(1960);
    *(unsigned long long *)&v13->field_100 = 0;
    v13->field_140 = 0;
    v13->field_160 = 0;
    v13->field_40 = 0xffffffff;
    v13->field_60 = 0xffffffff;
    v13->field_2c0 = 0;
    *(char *)&v13->field_440 = 0;
    *(unsigned long long *)&v13->field_180 = 0;
    *(unsigned long long *)&v13->field_2e0 = 0;
    *(unsigned long long *)&v13->field_300 = 0;
    *(unsigned long long *)&v13->field_660 = 0;
    *(unsigned long long *)&v13->field_4a0 = 0;
    *(unsigned long long *)&v13->field_400 = 0;
    *(unsigned long long *)&v13->field_c0 = 0;
    *(unsigned long long *)&v13->field_280 = 0;
    *(unsigned long long *)&v13->field_6e0 = 0;
    *(unsigned long long *)&v13->field_580 = 0;
    *(unsigned long long *)&v13->field_760 = 0;
    v13->field_5e0 = 7;
    *(unsigned long long *)&v13->field_7a0 = 0;
    *(unsigned long long *)&v13->field_380 = 0;
    *(unsigned long long *)&v13->field_680 = 0;
    *(unsigned long long *)&v13->field_600 = 0;
    *(char *)&v13->field_360 = 0;
    *(char *)&v13->field_260 = 0;
    *(unsigned long long *)&v13->field_640 = 0;
    *(unsigned long long *)&v13->field_3e0 = 0;
    *(unsigned long long *)&v13->field_720 = 0;
    *(unsigned long long *)&v13->field_560 = 0;
    *(unsigned long long *)&v13->field_3c0 = 0;
    *(unsigned long long *)&v13->field_340 = 0;
    *(long long *)&v13->field_200 = operatornew[](37);
    *(unsigned long long *)&v13->field_2a0 = 0;
    *(unsigned long long *)&v13->field_220 = 0;
    *(unsigned long long *)&v13->field_480 = 0;
    *(unsigned long long *)&v13->field_700 = 0;
    v14 = operatornew(1416);
    *(unsigned long long *)&v14->field_580 = 0;
    v13->field_4c0 = v14;
    v15 = operatornew(24);
    memset(v15, 0, 24);
    v13->field_80 = v15;
    *(char *)&v13->field_1e0 = 0;
    a0->field_60 = v13;
    v16 = operatornew(1896);
    _bzero(v16, 1896);
    a0->field_2a0 = v16;
    _bzero(operatornew(0x18ac0), 0x18ac0);
    (g_e81da8 - 0xc6fc7100)();
}
