/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c76c..0x99c8b8 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c76c_1 {
    char padding_0[216];
    struct st_99c76c_0 *field_d8;
} st_99c76c_1;

typedef struct st_99c76c_2 {
    char padding_0[24];
    struct st_99c76c_1 *field_18;
    char padding_20[1024];
    char field_420;
    char padding_421[63];
    long long field_460;
    char padding_468[1364];
    int field_9bc;
    char padding_9c0[480];
    unsigned int field_ba0;
} st_99c76c_2;

typedef struct st_99c76c_0 {
    char padding_0[80];
    char field_50;
} st_99c76c_0;


long long sub_99c76c(st_99c76c_2 *a0, long long a1)
{
    long long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_ba0)
    {
        if (sub_c68d5c(a1, 0xff01, 2) && sub_c6876c(a1, 2) && sub_a6ec4c(a1, &a0->field_420, a0->field_460, 1) && sub_a6e970(a1))
            goto LABEL_99c868;
        v2 = 55;
    }
    else
    {
        if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && (0x303 < a0->field_9bc || sub_959e54(a0, 9, 0, 769, 0) && 770 > a0->field_9bc))
            return 2;
        if (sub_c68d5c(a1, 0xff01, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, 0, 1) && sub_a6e970(a1))
        {
LABEL_99c868:
            return 1;
        }
        v2 = 42;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", v2, "tls_construct_ctos_renegotiate");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
