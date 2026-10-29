/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95f104..0x95f408 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95f104_2 {
    struct st_95f104_2 *field_0;
    char padding_8[16];
    struct st_95f104_2 *field_18;
    char padding_20[24];
    struct st_95f104_1 *field_38;
    char padding_40[16];
    struct st_95f104_2 *field_50;
    struct st_95f104_2 *field_58;
    struct st_95f104_2 *field_60;
    char padding_68[144];
    long long field_f8;
    char padding_100[392];
    long long field_288;
    char padding_290[640];
    long long field_510;
    char padding_518[8];
    struct st_95f104_2 *field_520;
    struct st_95f104_2 *field_528;
    struct st_95f104_2 *field_530;
    long long field_538;
    char padding_540[4];
    unsigned long long field_544;
    char padding_54c[12];
    long long field_558;
    long long field_560;
    long long field_568;
    long long field_570;
    char padding_578[776];
    long long field_880;
    char padding_888[120];
    struct st_95f104_2 *field_900;
    long long field_908;
    long long field_910;
    char padding_918[120];
    long long field_990;
    char padding_998[8];
    long long field_9a0;
    long long field_9a8;
    char padding_9b0[112];
    long long field_a20;
    char padding_a28[8];
    long long field_a30;
    char padding_a38[8];
    long long field_a40;
    long long field_a48;
    long long field_a50;
    char padding_a58[24];
    long long field_a70;
    char padding_a78[8];
    long long field_a80;
    char padding_a88[8];
    long long field_a90;
    char padding_a98[8];
    long long field_aa0;
    char padding_aa8[8];
    long long field_ab0;
    char padding_ab8[8];
    long long field_ac0;
    char padding_ac8[40];
    long long field_af0;
    char padding_af8[8];
    long long field_b00;
    char padding_b08[24];
    long long field_b20;
    char padding_b28[48];
    struct st_95f104_2 *field_b58;
    char padding_b60[24];
    long long field_b78;
    char padding_b80[8];
    long long field_b88;
    long long field_b90;
    char padding_b98[24];
    long long field_bb0;
    char padding_bb8[16];
    long long field_bc8;
    char padding_bd0[136];
    char field_c58;
    char padding_c59[31];
    struct st_95f104_0 *field_c78;
} st_95f104_2;

typedef struct st_95f104_1 {
    unsigned long long field_0;
} st_95f104_1;

typedef struct st_95f104_0 {
    char padding_0[88];
    struct st_95f104_1 *field_58;
} st_95f104_0;

extern long long g_963fec;
extern long long g_a9b2c0;
extern long long g_afa308;
extern long long g_afa390;

void sub_95f104(st_95f104_2 *a0)
{
    st_95f104_2 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    if ((int)a0->field_0)
        return;
    if (a0->field_60)
    {
        a0->field_58 = sub_9d4f1c(a0->field_58);
        (*(long long *)(*(long long *)&a0->padding_c59[23] + 88))();
    }
    sub_991e8c(&a0->padding_bd0[128]);
    sub_af82fc(a0->field_510);
    sub_ad6958(a0->field_520, &g_963fec);
    a0->field_520 = 0;
    sub_aded90(a0->field_528);
    a0->field_528 = 0;
    sub_afc404(a0->field_538);
    *(uint128_t *)&a0->field_530 = 0;
    *(unsigned long *)(a0->padding_540)[1] = 0xffffffffffffffff;
    sub_9ebcf4(a0->field_f8);
    sub_ad6020(a0->field_558);
    sub_ad6020(a0->field_560);
    sub_ad6020(a0->field_568);
    sub_ad6020(*(long long *)&a0->padding_54c[8]);
    if (*(long long *)&a0->padding_888[112])
    {
        sub_966d14(a0);
        sub_9662a0(*(long long *)&a0->padding_888[112]);
    }
    sub_9662a0(a0->field_900);
    sub_a6c2e4(a0->field_908, "ssl/ssl_lib.c", 1477);
    sub_958664(*(long long *)&a0->padding_578[0x300]);
    sub_a6c2e4(*(long long *)&a0[1].padding_888[112], "ssl/ssl_lib.c", 1480);
    sub_a6c2e4(*(long long *)&a0->padding_9b0[104], "ssl/ssl_lib.c", 1483);
    sub_95e3b8(a0->padding_b80);
    sub_a6c2e4(*(long long *)&a0->padding_a58[16], "ssl/ssl_lib.c", 1485);
    sub_a6c2e4(a0->padding_a78, "ssl/ssl_lib.c", 1486);
    sub_a6c2e4(a0->padding_a88, "ssl/ssl_lib.c", 1487);
    sub_a6c2e4(a0->padding_aa8, "ssl/ssl_lib.c", 1488);
    sub_a6c2e4(a0->padding_ab8, "ssl/ssl_lib.c", 1489);
    sub_a6c2e4(a0->padding_a98, "ssl/ssl_lib.c", 1490);
    sub_ad6958(a0->field_a40, &g_afa308);
    sub_ad6958(a0->padding_a38, &g_a9b2c0);
    sub_9f7788(*(long long *)&a0->padding_b60[16]);
    sub_a6c2e4(a0->padding_a28, "ssl/ssl_lib.c", 1497);
    sub_a6c2e4(a0->field_a48, "ssl/ssl_lib.c", 1499);
    sub_a6c2e4(*(long long *)&a0->padding_ac8[32], "ssl/ssl_lib.c", 1500);
    sub_a6c2e4(*(long long *)&a0->padding_b08[16], "ssl/ssl_lib.c", 1501);
    if (*(long long *)&a0->padding_b28[40])
    {
        sub_a6c2e4(*(long long *)(*(long long *)&a0->padding_b28[40] + 648), "ssl/ssl_lib.c", 1503);
        v2 = *(long long *)&a0->padding_b28[40];
    }
    else
    {
        v2 = 0;
    }
    sub_a6c2e4(v2, "ssl/ssl_lib.c", 1504);
    sub_a6c2e4(*(long long *)&a0->padding_b98[16], "ssl/ssl_lib.c", 1505);
    sub_a3f73c(*(long long *)&a0->padding_bb8[8]);
    sub_ad6958(a0->padding_998, &g_afa390);
    sub_ad6958(a0->field_9a0, &g_afa390);
    sub_a6c2e4(a0[1].field_908, "ssl/ssl_lib.c", 1511);
    sub_a6c2e4(*(long long *)&a0[1].padding_918[0], "ssl/ssl_lib.c", 1512);
    sub_aded90(*(long long *)&a0->padding_918[112]);
    if (!a0->field_18)
    {
        sub_9d0c1c(*(long long *)&a0[1].padding_888[24]);
        sub_a6c2e4(a0->padding_af8, "ssl/ssl_lib.c", 1522);
        sub_ad6020(a0->field_b88);
        sub_9d5018(a0->field_58);
        a0->field_58 = 0;
        sub_9d5018(a0->field_50);
        a0->field_50 = 0;
        sub_a6c2e4();
        return;
    }
    a0->field_18->field_38();
}
