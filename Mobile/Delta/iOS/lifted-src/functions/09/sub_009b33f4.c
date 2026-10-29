/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b33f4..0x9b35b0 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b33f4_0 {
    char padding_0[172];
    unsigned int field_ac;
} st_9b33f4_0;

extern char g_d28af3;

long long sub_9b33f4(st_9b33f4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (29 < a0->field_ac - 21)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 1118, "ossl_statem_server_construct_message");
        sub_9a58a4(a0, 80, 236, 0);
        return 0;
    }
    goto *((void *)(sub_9b341c + *(&(&g_d28af3)[a0->field_ac] - 21) * 4));
}
