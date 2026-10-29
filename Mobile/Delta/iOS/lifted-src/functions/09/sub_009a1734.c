/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1734..0x9a1848 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a1734_0 {
    struct st_9a1734_1 *field_0;
    unsigned long long field_8;
} st_9a1734_0;

typedef struct st_9a1734_1 {
    char field_0;
} st_9a1734_1;


int sub_9a1734(void* a0, st_9a1734_0 *a1)
{
    unsigned long v2;  // x8
    char *v3;  // x22
    unsigned long v4;  // x20
    void* v5;  // x23
    unsigned long v6;  // x0
    void* v7;  // x0
    long long v8;  // x1
    long long v9;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2 && !(v3 = a1->field_0, v4 = v2 - 1, v4 != *v3 || (a1->field_0 = &v3[v2], a1->field_8 = 0, !v4)))
    {
        if ((int)a0[1288])
            return 1;
        v5 = a0 + 2680;
        sub_a6c2e4((long long)a0[2688], "include/internal/packet.h", 454);
        *(uint128_t *)v5 = 0;
        v6 = sub_a6dac4(v3 + 1, v4, "include/internal/packet.h", 463);
        *(unsigned long *)&a0[2688] = v6;
        if (v6)
        {
            *(unsigned long *)v5 = v4;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 0x100, "tls_parse_ctos_ec_pt_formats");
        v7 = a0;
        v8 = 80;
        v9 = 786691;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 248, "tls_parse_ctos_ec_pt_formats");
        v7 = a0;
        v8 = 50;
        v9 = 110;
    }
    sub_9a58a4(v7, v8, v9, 0);
    return 0;
}
