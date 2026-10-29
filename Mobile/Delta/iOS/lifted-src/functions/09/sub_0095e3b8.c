/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95e3b8..0x95e81c (1124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95e3b8_0 {
    struct st_95e3b8_0 *field_0;
    char field_1;
    char padding_2[14];
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    struct st_95e3b8_0 *field_30;
    char field_38;
    char padding_39[47];
    char field_68;
    char padding_69[135];
    char field_f0;
    char padding_f1[15];
    struct st_95e3b8_0 *field_100;
    struct st_95e3b8_0 *field_108;
    long long field_110;
    struct st_95e3b8_0 *field_118;
    char padding_120[8];
    long long field_128;
    long long field_130;
    char padding_138[32];
    long long field_158;
    long long field_160;
    char padding_168[88];
    long long field_1c0;
    char padding_1c8[8];
    long long field_1d0;
    char padding_1d8[48];
    long long field_208;
    char padding_210[64];
    long long field_250;
    char padding_258[48];
    long long field_288;
    char padding_290[8];
    long long field_298;
    char padding_2a0[8];
    long long field_2a8;
    char padding_2b0[8];
    long long field_2b8;
    char padding_2c0[16];
    long long field_2d0;
    char padding_2d8[232];
    struct st_95e3b8_0 *field_3c0;
    struct st_95e3b8_0 *field_3c8;
    struct st_95e3b8_0 *field_3d0;
    char padding_3d8[8];
    long long field_3e0;
    char padding_3e8[8];
    long long field_3f0;
    char padding_3f8[120];
    long long field_470;
    char padding_478[488];
    long long field_660;
    long long field_668;
    long long field_670;
    struct st_95e3b8_0 *field_678;
    char padding_680[8];
    long long field_688;
    struct st_95e3b8_0 *field_690;
    char padding_698[24];
    long long field_6b0;
    char padding_6b8[8];
    long long field_6c0;
    char padding_6c8[16];
    long long field_6d8;
    long long field_6e0;
} st_95e3b8_0;

extern long long g_afa390;

void sub_95e3b8(st_95e3b8_0 *a0)
{
    long long v2;  // w8
    unsigned long long v3;  // 4102
    st_95e3b8_0 *j;  // x22
    st_95e3b8_0 *v4;  // x20
    st_95e3b8_0 *v5;  // x20
    unsigned long long iter;  // x21
    st_95e3b8_0 *v7;  // x20
    st_95e3b8_0 *v8;  // x20
    st_95e3b8_0 *v9;  // x21
    st_95e3b8_0 *i;  // x22
    st_95e3b8_0 *v11;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(19, v2, 1, 0);
    if (!(v3 & 1))
    {
        /* unsupported instruction */;
    }
    else if (v2 > 1)
    {
        return;
    }
    sub_af82fc(*(long long *)&a0->padding_168[80]);
    sub_a6c2e4(*(long long *)&a0->padding_2d8[224], "ssl/ssl_lib.c", 151);
    *(unsigned long long *)&a0->padding_2d8[224] = 0;
    sub_a6c2e4(a0->field_3c0, "ssl/ssl_lib.c", 154);
    a0->field_3c0 = 0;
    *(char *)&a0->field_3c8 = 0;
    if (a0->field_28)
        sub_966df0(a0, 0);
    sub_a6a9e8(1, a0, &a0->padding_69[127]);
    sub_a66664(a0->field_28);
    sub_af295c(a0->field_20);
    sub_9f6488(a0->padding_1c8);
    sub_ad6020(*(long long *)&a0->padding_2[7]);
    sub_ad6020(a0->field_10);
    sub_ad6020(a0->field_18);
    sub_958664(*(long long *)&a0->padding_138[24]);
    sub_ad6958(a0->padding_120, &g_afa390);
    sub_ad6958(a0->field_128, &g_afa390);
    sub_aded90(a0->field_108);
    a0->field_110 = 0;
    sub_ad6020(a0->padding_3d8);
    sub_97084c(a0);
    sub_970590(*(long long *)&a0->padding_1d8[40]);
    sub_a6c2e4(*(long long *)&a0->padding_258[40], "ssl/ssl_lib.c", 0x1135);
    sub_a6c2e4(a0->padding_290, "ssl/ssl_lib.c", 0x1136);
    sub_a6c2e4(a0->padding_2a0, "ssl/ssl_lib.c", 0x1137);
    sub_a6c2e4(a0->padding_2b0, "ssl/ssl_lib.c", 0x1138);
    sub_a6c2e4(*(long long *)&a0->padding_2c0[8], "ssl/ssl_lib.c", 0x1139);
    sub_a6ce98(*(long long *)&a0->padding_210[56], "ssl/ssl_lib.c", 0x113a);
    v4 = *(long long *)&a0->padding_f1[7];
    if (v4 && sub_9ffde0(v4))
        sub_a3f52c(v4);
    v5 = a0->field_100;
    if (v5 && sub_9ffde0(v5))
        sub_a3f52c(v5);
    iter = 1200;
    do
    {
        v7 = *(long long *)((char *)a0 + iter);
        if (v7 && sub_9ffdd8(v7))
            sub_a4bbe4(v7);
    } while ((iter += 8, iter != 1392));
    do
    {
        v8 = *(long long *)((char *)a0 + iter);
        if (v8 && sub_9ffde0(v8))
            sub_a3f52c(v8);
    } while ((iter += 8, iter != 1504));
    if (a0->field_670)
    {
        v9 = 0;
        i = 0;
        do
        {
            sub_a6c2e4(*(long long *)(a0->field_668 + (char *)v9), "ssl/ssl_lib.c", 0x1144);
            sub_a6c2e4(*(long long *)&(&v9->field_1)[a0->field_668], "ssl/ssl_lib.c", 0x1145);
            sub_a6c2e4(*(long long *)&v9->padding_2[7 + a0->field_668], "ssl/ssl_lib.c", 0x1146);
            i = (char *)&i->field_0 + 1;
            v9 = &v9->field_30;
        } while (i < (unsigned long long)a0->field_670);
    }
    sub_a6c2e4(a0->field_668, "ssl/ssl_lib.c", 0x1148);
    if (a0->field_688)
    {
        v11 = 0;
        j = 0;
        do
        {
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11), "ssl/ssl_lib.c", 0x114a);
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11 + 16), "ssl/ssl_lib.c", 0x114b);
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11 + 24), "ssl/ssl_lib.c", 0x114c);
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11 + 32), "ssl/ssl_lib.c", 0x114d);
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11 + 40), "ssl/ssl_lib.c", 0x114e);
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11 + 48), "ssl/ssl_lib.c", 0x114f);
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11 + 56), "ssl/ssl_lib.c", 0x1150);
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11 + 64), "ssl/ssl_lib.c", 0x1151);
            sub_a6c2e4(*(long long *)(a0->padding_680 + (char *)v11 + 72), "ssl/ssl_lib.c", 0x1152);
            j = (char *)&j->field_0 + 1;
            v11 = &v11->padding_39[39];
        } while (j < (unsigned long long)a0->field_688);
    }
    sub_a6c2e4(a0->padding_680, "ssl/ssl_lib.c", 0x1154);
    sub_a6c2e4(a0->field_158, "ssl/ssl_lib.c", 0x1155);
    sub_a6c2e4(*(long long *)&a0->padding_478[480], "ssl/ssl_lib.c", 0x1157);
    sub_a6c2e4(a0->field_660, "ssl/ssl_lib.c", 0x1158);
    sub_a6c2e4(*(long long *)&a0->padding_698[16], "ssl/ssl_lib.c", 0x115a);
    sub_a6c2e4(a0->padding_6b8, "ssl/ssl_lib.c", 0x115b);
    sub_a7c1d0(a0->padding_3e8);
    sub_a6c2e4(*(long long *)&a0->padding_3f8[112], "ssl/ssl_lib.c", 0x1163);
    sub_a6c2e4(a0->field_6d8, "ssl/ssl_lib.c", 0x1165);
    sub_97efdc(*(long long *)&a0->padding_6c8[8]);
    sub_a6c2e4();
    return;
}
