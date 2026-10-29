/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x970d44..0x970e80 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_970d44_0 {
    char padding_0[8];
    struct st_970d44_1 *field_8;
    char padding_10[3048];
    long long field_bf8;
    char padding_c00[16];
    long long field_c10;
    long long field_c18;
    char padding_c20[8];
    long long field_c28;
    long long field_c30;
} st_970d44_0;

typedef struct st_970d44_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_970d44_1;


long long sub_970d44(st_970d44_0 *a0)
{
    unsigned long v2;  // x0
    unsigned long v3;  // x19
    unsigned int v4;  // w0
    unsigned long long v5;  // 4139
    unsigned long v6;  // x8
    unsigned long long v7;  // x21
    unsigned long v8;  // x0
    long long v9;  // x22
    unsigned long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_ad5db8(a0->field_c18, a0->field_bf8))
    {
        v2 = sub_ad5464(a0->field_c18, a0->field_c10, a0->field_bf8, a0->field_8->field_0, a0->field_8->field_470);
        v3 = v2;
        if (v2 && !(v2 = sub_ad55f0(a0->field_c18, a0->field_c30, v3, a0->field_c28, a0->field_bf8), !v2))
        {
            v4 = sub_9e46a8();
            v5 = arm64g_calculate_condition(177, v4, 7, 0);
            v6 = (v5 & 1 ? v4 + 14 : v4 + 7);
            v7 = (long long)(v6 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v6, 61) & 0xe00000001fffffff & 0x1fffffff;
            v8 = sub_a6bf4c(v7, "ssl/tls_srp.c", 320);
            if (v8)
            {
                v9 = v8;
                sub_9e5350(v2, v9);
                v10 = sub_9568f8(a0, v9, v7, 1);
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/tls_srp.c", 321, "srp_generate_server_master_secret");
                sub_9a58a4(a0, 80, 0x8000f, 0);
                v10 = 0;
            }
        }
        else
        {
            v10 = 0;
        }
    }
    else
    {
        v3 = 0;
        v10 = 0;
        v2 = 0;
    }
    sub_9e4838(v2);
    sub_9e4838(v3);
    return v10;
}
