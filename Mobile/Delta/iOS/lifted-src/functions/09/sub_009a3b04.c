/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a3b04..0x9a3b6c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a3b04_0 {
    char padding_0[8];
    long long field_8;
} st_9a3b04_0;

typedef struct st_9a3b04_1 {
    char padding_0[2984];
    unsigned int field_ba8;
} st_9a3b04_1;


long long sub_9a3b04(st_9a3b04_1 *a0, st_9a3b04_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1->field_8)
    {
        a0->field_ba8 = 2;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", 1568, "tls_parse_ctos_post_handshake_auth");
    sub_9a58a4(a0, 50, 278, 0);
    return 0;
}
