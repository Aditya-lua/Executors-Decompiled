/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ac92c..0x9aca2c (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ac92c_1 {
    char padding_0[2304];
    struct st_9ac92c_0 *field_900;
    char padding_908[744];
    long long field_bf0;
    char padding_bf8[32];
    long long field_c18;
} st_9ac92c_1;

typedef struct st_9ac92c_0 {
    char padding_0[864];
    long long field_360;
} st_9ac92c_0;


int sub_9ac92c(st_9ac92c_1 *a0, long long a1)
{
    long long v3;  // x20
    unsigned int v4;  // w0
    unsigned long long v5;  // 4139
    unsigned long v6;  // x8
    unsigned long v7;  // x0
    long long v8;  // x21
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 786691;
    v0 = 0;
    if (a0->field_c18 && !(v4 = sub_9e46a8(a0->field_c18), v5 = arm64g_calculate_condition(177, v4, 7, 0), v6 = (v5 & 1 ? v4 + 14 : v4 + 7), !sub_a6e86c(a1, (long long)(v6 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v6, 61) & 0xe00000001fffffff & 0x1fffffff, &v0, 2)))
    {
        sub_9e5350(a0->field_c18, v0);
        sub_a6c2e4(a0->field_900->field_360, "ssl/statem/statem_clnt.c", 3568);
        v7 = sub_a6d9b4(a0->field_bf0, "ssl/statem/statem_clnt.c", 3569);
        a0->field_900->field_360 = v7;
        if (v7)
            return 1;
        v3 = 524303;
        v8 = 3571;
    }
    else
    {
        v8 = 3563;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/statem_clnt.c", v8, "tls_construct_cke_srp");
    sub_9a58a4(a0, 80, v3, 0);
    return 0;
}
