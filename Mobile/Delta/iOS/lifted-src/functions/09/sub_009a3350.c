/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a3350..0x9a33e0 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a3350_1 {
    char padding_0[8];
    long long field_8;
} st_9a3350_1;

typedef struct st_9a3350_0 {
    char padding_0[2256];
    long long field_8d0;
} st_9a3350_0;


long long sub_9a3350(st_9a3350_0 *a0, st_9a3350_1 *a1)
{
    st_9a3350_0 *v2;  // x19
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 1266, "tls_parse_ctos_early_data");
        v3 = 50;
    }
    else if ((int)v2->field_8d0)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 1271, "tls_parse_ctos_early_data");
        v3 = 47;
    }
    else
    {
        return 1;
    }
    sub_9a58a4(v2, v3, 110, 0);
    return 0;
}
