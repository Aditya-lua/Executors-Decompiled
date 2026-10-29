/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x957564..0x957628 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_957564_3 {
    char padding_0[216];
    struct st_957564_1 *field_d8;
} st_957564_3;

typedef struct st_957564_4 {
    char padding_0[24];
    struct st_957564_3 *field_18;
    char padding_20[88];
    struct st_957564_0 *field_78;
    char padding_80[640];
    unsigned long long field_300;
    char padding_308[96];
    struct st_957564_0 *field_368;
    char padding_370[1424];
    struct st_957564_0 *field_900;
} st_957564_4;

typedef struct st_957564_1 {
    struct st_957564_2 *field_0;
    char padding_8[8];
    struct st_957564_2 *field_10;
} st_957564_1;

typedef struct st_957564_0 {
    char padding_0[8];
    struct st_957564_0 *field_8;
    char padding_10[744];
    unsigned long long field_2f8;
} st_957564_0;

typedef struct st_957564_2 {
    unsigned long long field_0;
} st_957564_2;


st_957564_0 * sub_957564(st_957564_4 *a0)
{
    st_957564_0 *v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_368)
        a0->field_18->field_d8->field_10();
    v2 = a0->field_900;
    if (v2 && v2->field_8)
    {
        v2->field_2f8 = a0->field_300;
        a0->field_18->field_d8->field_0();
    }
    sub_a368c8();
    sub_a369bc("ssl/s3_msg.c", 26, "ssl3_do_change_cipher_spec");
    sub_a36abc(20, 133, 0);
    return 0;
}
