/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1230..0x9a1314 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a1230_0 {
    struct st_9a1230_1 *field_0;
    long long field_8;
} st_9a1230_0;

typedef struct st_9a1230_1 {
    char field_0;
} st_9a1230_1;

typedef struct st_9a1230_2 {
    char padding_0[1120];
    unsigned long long field_460;
    char padding_468[72];
    unsigned int field_4b0;
} st_9a1230_2;


long long sub_9a1230(st_9a1230_2 *a0, st_9a1230_0 *a1)
{
    unsigned long v2;  // x2
    char *v3;  // x0
    unsigned long v4;  // x8
    long long v5;  // x1
    st_9a1230_2 *v6;  // x0
    long long v7;  // x1
    long long v8;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_8)
    {
        v2 = *(char *)a1->field_0;
        v3 = a1->field_0 + 1;
        v4 = a1->field_8 - 1;
        a1->field_0 = v3;
        a1->field_8 = v4;
        if (v2 > v4)
            goto LABEL_9a1260;
        a1->field_0 = &v3[v2];
        a1->field_8 = v4 - v2;
        if (a0->field_460 != v2)
        {
            sub_a368c8();
            v5 = 59;
        }
        else if (_memcmp())
        {
            sub_a368c8();
            v5 = 73;
        }
        else
        {
            a0->field_4b0 = 1;
            return 1;
        }
        sub_a369bc("ssl/statem/extensions_srvr.c", v5, "tls_parse_ctos_renegotiate");
        v6 = a0;
        v7 = 40;
        v8 = 337;
    }
    else
    {
LABEL_9a1260:
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 53, "tls_parse_ctos_renegotiate");
        v6 = a0;
        v7 = 50;
        v8 = 336;
    }
    sub_9a58a4(v6, v7, v8, 0);
    return 0;
}
