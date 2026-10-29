/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9afaf0..0x9afbc8 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9afaf0(void* a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w0
    unsigned long v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if ((long long)a0[3016])
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_9545a8();
    if (!v8)
        return v8;
    v9 = sub_a3f728();
    *(unsigned long *)&a0[3016] = v9;
    if (!v9)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 2855, "tls13_save_handshake_digest_for_pha");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    else if (sub_a40520())
    {
        return 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 2860, "tls13_save_handshake_digest_for_pha");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        sub_a3f73c((long long)a0[3016]);
        *(unsigned long long *)&a0[3016] = 0;
        return 0;
    }
}
