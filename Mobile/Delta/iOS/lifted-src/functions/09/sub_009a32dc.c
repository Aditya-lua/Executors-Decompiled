/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a32dc..0x9a3350 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a32dc_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9a32dc_0;

typedef struct st_9a32dc_1 {
    char padding_0[352];
    unsigned long long field_160;
    char padding_168[2120];
    char field_9b0;
} st_9a32dc_1;


char sub_9a32dc(st_9a32dc_1 *a0, st_9a32dc_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 1250, "tls_parse_ctos_ems");
        sub_9a58a4(a0, 50, 110, 0);
        return 0;
    }
    if (a0->field_9b0 & 1)
        return 1;
    a0->field_160 = a0->field_160 | 0x200;
    return 1;
}
