/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b620..0x98b720 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b620_1 {
    struct st_98b620_0 *field_0;
    char padding_8[8];
    struct st_98b620_0 *field_10;
    char padding_18[184];
    unsigned long long field_d0;
    char padding_d8[24];
    unsigned long long field_f0;
    char padding_f8[8];
    unsigned long long field_100;
    char padding_108[8];
    unsigned long long field_110;
    char padding_118[8];
    unsigned long long field_120;
    char padding_128[8];
    unsigned long long field_130;
    char padding_138[8];
    unsigned long long field_140;
    char padding_148[8];
    unsigned long long field_150;
    char padding_158[8];
    unsigned long long field_160;
} st_98b620_1;

typedef struct st_98b620_0 {
    unsigned long long field_0;
    char padding_8[152];
    long long field_a0;
    char padding_a8[144];
    struct st_98b620_0 *field_138;
    char padding_140[8];
    struct st_98b620_0 *field_148;
    char padding_150[8];
    char field_158;
    char padding_159[175];
    long long field_208;
    char padding_210[24];
    long long field_228;
    char padding_230[8];
    long long field_238;
    char padding_240[8];
    long long field_248;
    char padding_250[8];
    long long field_258;
    char padding_260[8];
    long long field_268;
    char padding_270[8];
    long long field_278;
    char padding_280[8];
    long long field_288;
    char padding_290[8];
    long long field_298;
} st_98b620_0;


void sub_98b620(st_98b620_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_98b620_1 *v8;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_9857e0(a0->field_a0);
    v8 = &a0->field_138;
    if (a0->field_138 && a0->field_148)
        a0->field_148();
    *(uint128_t *)&v8->field_0 = 0;
    *(uint128_t *)&v8->field_10 = 0;
    sub_c044(&a0->field_158);
    sub_a6c2e4(a0->field_208, "ssl/quic/quic_txp.c", 588);
    sub_a6c2e4(a0->field_238, "ssl/quic/quic_txp.c", 593);
    sub_a6c2e4(a0->field_228, "ssl/quic/quic_txp.c", 594);
    sub_a6c2e4(a0->field_258, "ssl/quic/quic_txp.c", 593);
    sub_a6c2e4(a0->field_248, "ssl/quic/quic_txp.c", 594);
    sub_a6c2e4(a0->field_278, "ssl/quic/quic_txp.c", 593);
    sub_a6c2e4(a0->field_268, "ssl/quic/quic_txp.c", 594);
    sub_a6c2e4(a0->field_298, "ssl/quic/quic_txp.c", 593);
    sub_a6c2e4(a0->field_288, "ssl/quic/quic_txp.c", 594);
    sub_a6c2e4();
    return;
}
