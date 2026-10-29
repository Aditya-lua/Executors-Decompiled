/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b6ba8..0x9b6c18 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b6ba8_0 {
    char padding_0[172];
    unsigned int field_ac;
} st_9b6ba8_0;


long long sub_9b6ba8(st_9b6ba8_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_ac != 22 && a0->field_ac != 32)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 1338, "ossl_statem_server_post_process_message");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
}
