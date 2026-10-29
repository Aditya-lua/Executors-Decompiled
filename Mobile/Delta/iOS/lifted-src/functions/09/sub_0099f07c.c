/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99f07c..0x99f160 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99f07c_2 {
    char padding_0[8];
    struct st_99f07c_1 *field_8;
} st_99f07c_2;

typedef struct st_99f07c_0 {
    char padding_0[2656];
    unsigned int field_a60;
    char padding_a64[108];
    struct st_99f07c_1 *field_ad0;
} st_99f07c_0;

typedef struct st_99f07c_1 {
    unsigned long long field_0;
} st_99f07c_1;


unsigned long long * sub_99f07c(st_99f07c_0 *a0, st_99f07c_2 *a1)
{
    st_99f07c_0 *v2;  // x19
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a0->field_ad0)
        a0->field_ad0();
    if (!sub_96a380(v2))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1478, "tls_parse_stoc_session_ticket");
        v3 = 110;
    }
    else if (a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1482, "tls_parse_stoc_session_ticket");
        v3 = 50;
    }
    else
    {
        v2->field_a60 = 1;
        return 1;
    }
    sub_9a58a4(v2, v3, 110, 0);
    return 0;
}
