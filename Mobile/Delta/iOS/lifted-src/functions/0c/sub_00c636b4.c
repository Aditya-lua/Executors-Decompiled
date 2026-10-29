/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc636b4..0xc63728 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c636b4(unsigned long a0, unsigned int *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0)
    {
        sub_98b244();
        sub_98b250(sub_98b230(sub_a369bc("ssl/quic/quic_tls.c", 254, "quic_write_records"), 254, "quic_write_records"));
    }
    else
    {
        sub_a368c8();
        sub_98b230(sub_a369bc("ssl/quic/quic_tls.c", 254, "quic_write_records"), 254, "quic_write_records");
    }
    *a1 = 0xfffffffe;
}
