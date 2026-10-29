/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ab1d8..0x9ab254 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ab1d8_0 {
    char padding_0[172];
    unsigned int field_ac;
} st_9ab1d8_0;


long long sub_9ab1d8(st_9ab1d8_0 *a0)
{
    unsigned int v5;  // w8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0->field_ac;
    if (v5 - 4 >= 2 && v5 != 8 && v5 != 43)
    {
        v0 = v6;
        v1 = v7;
        v2 = &v4;
        v3 = v8;
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 1162, "ossl_statem_client_post_process_message");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
}
