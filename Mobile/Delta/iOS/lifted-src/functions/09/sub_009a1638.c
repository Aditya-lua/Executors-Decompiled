/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1638..0x9a1734 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a1638_0 {
    struct st_9a1638_1 *field_0;
    long long field_8;
} st_9a1638_0;

typedef struct st_9a1638_2 {
    char padding_0[3056];
    long long field_bf0;
} st_9a1638_2;

typedef struct st_9a1638_1 {
    char field_0;
} st_9a1638_1;


long long sub_9a1638(st_9a1638_2 *a0, st_9a1638_0 *a1)
{
    long long v2;  // x8
    char *v3;  // x22
    unsigned long v4;  // x20
    long long v5;  // x0
    st_9a1638_2 *v6;  // x0
    long long v7;  // x1
    long long v8;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (!v2 || (v3 = a1->field_0, v4 = v2 - 1, v4 != *v3 || (a1->field_0 = &v3[v2], a1->field_8 = 0, _memchr(v3 + 1, 0, v4))))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 227, "tls_parse_ctos_srp");
        v6 = a0;
        v7 = 50;
        v8 = 110;
    }
    else
    {
        sub_a6c2e4(a0->field_bf0, "include/internal/packet.h", 483);
        v5 = sub_a6da14(v3 + 1, v4, "include/internal/packet.h", 486);
        a0->field_bf0 = v5;
        if (v5)
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 232, "tls_parse_ctos_srp");
        v6 = a0;
        v7 = 80;
        v8 = 786691;
    }
    sub_9a58a4(v6, v7, v8, 0);
    return 0;
}
