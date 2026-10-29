/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96f244..0x96f2fc (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_96f244(long long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long *a4)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a50ac8(sub_95a6a8());
    if ((int)v2 <= 0)
    {
        sub_a368c8();
        sub_a369bc("ssl/tls13_enc.c", 0xff, "tls13_generate_master_secret");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    *a4 = v2;
}
