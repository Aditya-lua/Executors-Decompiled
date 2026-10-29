/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6a0ac..0xa6a208 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6a0ac_0 {
    struct st_a6a0ac_0 *field_0;
    struct st_a6a0ac_0 *field_8;
    struct st_a6a0ac_0 *field_10;
    struct st_a6a0ac_0 *field_18;
    struct st_a6a0ac_0 *field_20;
    struct st_a6a0ac_0 *field_28;
    struct st_a6a0ac_0 *field_30;
    struct st_a6a0ac_0 *field_38;
    struct st_a6a0ac_0 *field_40;
    struct st_a6a0ac_0 *field_48;
    struct st_a6a0ac_0 *field_50;
    struct st_a6a0ac_0 *field_58;
    struct st_a6a0ac_0 *field_60;
    struct st_a6a0ac_0 *field_68;
    struct st_a6a0ac_0 *field_70;
    struct st_a6a0ac_0 *field_78;
    struct st_a6a0ac_0 *field_80;
    struct st_a6a0ac_0 *field_88;
    struct st_a6a0ac_0 *field_90;
} st_a6a0ac_0;

extern long long g_a6a208;

st_a6a0ac_0 * sub_a6a0ac(void)
{
    st_a6a0ac_0 *v2;  // x0
    st_a6a0ac_0 *v3;  // x20
    st_a6a0ac_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a68358();
    if (!v2)
        return v2;
    v3 = v2;
    sub_ad6958(v2->field_8, &g_a6a208);
    v3->field_8 = 0;
    sub_ad6958(v3->field_10, &g_a6a208);
    v3->field_10 = 0;
    sub_ad6958(v3->field_18, &g_a6a208);
    v3->field_18 = 0;
    sub_ad6958(v3->field_20, &g_a6a208);
    v3->field_20 = 0;
    sub_ad6958(v3->field_28, &g_a6a208);
    v3->field_28 = 0;
    sub_ad6958(v3->field_30, &g_a6a208);
    v3->field_30 = 0;
    sub_ad6958(v3->field_38, &g_a6a208);
    v3->field_38 = 0;
    sub_ad6958(v3->field_40, &g_a6a208);
    v3->field_40 = 0;
    sub_ad6958(v3->field_48, &g_a6a208);
    v3->field_48 = 0;
    sub_ad6958(v3->field_50, &g_a6a208);
    v3->field_50 = 0;
    sub_ad6958(v3->field_58, &g_a6a208);
    v3->field_58 = 0;
    sub_ad6958(v3->field_60, &g_a6a208);
    v3->field_60 = 0;
    sub_ad6958(v3->field_68, &g_a6a208);
    v3->field_68 = 0;
    sub_ad6958(v3->field_70, &g_a6a208);
    v3->field_70 = 0;
    sub_ad6958(v3->field_78, &g_a6a208);
    v3->field_78 = 0;
    sub_ad6958(v3->field_80, &g_a6a208);
    v3->field_80 = 0;
    sub_ad6958(v3->field_88, &g_a6a208);
    v3->field_88 = 0;
    sub_ad6958(v3->field_90, &g_a6a208);
    v3->field_90 = 0;
    v4 = sub_a7c1d0(v3->field_0);
    v3->field_0 = 0;
    return v4;
}
