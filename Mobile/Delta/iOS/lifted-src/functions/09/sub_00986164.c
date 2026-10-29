/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x986164..0x9861dc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_986164(unsigned long a0, unsigned long a1, unsigned long long a2, long long a3, long long a4, long long a5)
{
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((a3 || !a4) && (a4 || a5))
    {
        v0 = a2;
        v1 = a4 + a2;
        return (unsigned int)sub_987cd8();
    }
    sub_a368c8();
    sub_a369bc("ssl/quic/quic_rstream.c", 66, "ossl_quic_rstream_queue_data");
    sub_a36abc(20, 0xc0103, 0);
    return 0;
}
