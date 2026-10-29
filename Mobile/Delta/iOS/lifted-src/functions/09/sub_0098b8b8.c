/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b8b8..0x98b928 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_d28660[4];

long long sub_98b8b8(unsigned long a0, long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a1 >= 4)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_txp.c", 732, "ossl_quic_tx_packetiser_discard_enc_level");
        sub_a36abc(20, 0x80106, 0);
        return 0;
    }
    if (a1 == 1)
        return 1;
    *(unsigned long long *)(a0 + g_d28660[a1] * 8 + 288) = 0;
    return 1;
}
