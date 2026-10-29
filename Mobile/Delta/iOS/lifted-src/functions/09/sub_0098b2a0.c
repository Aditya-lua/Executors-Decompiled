/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b2a0..0x98b3e8 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b2a0_0 {
    char padding_0[160];
    struct st_98b2a0_0 *field_a0;
    struct st_98b2a0_0 *field_a8;
    struct st_98b2a0_0 *field_b0;
    struct st_98b2a0_0 *field_b8;
    struct st_98b2a0_0 *field_c0;
    struct st_98b2a0_0 *field_c8;
    struct st_98b2a0_0 *field_d0;
    struct st_98b2a0_0 *field_d8;
    struct st_98b2a0_0 *field_e0;
    char padding_e8[32];
    long long field_108;
    long long field_110;
    struct st_98b2a0_0 *field_118;
    char padding_120[56];
    char field_158;
    char padding_159[127];
    struct st_98b2a0_0 *field_1d8;
} st_98b2a0_0;

extern long long g_98b3e8;
extern long long g_98b428;
extern long long g_98b564;
extern long long g_98b5e0;

st_98b2a0_0 * sub_98b2a0(st_98b2a0_0 *a0)
{
    st_98b2a0_0 *v2;  // x0
    st_98b2a0_0 *v3;  // x20
    st_98b2a0_0 *v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a0->field_a0 && a0->field_a8 && a0->field_b0 && a0->field_b8 && a0->field_c0 && a0->field_c8 && a0->field_d0 && a0->field_d8 && a0->field_e0 && (int)a0->field_118)
    {
        v2 = sub_a6bffc(720, "ssl/quic/quic_txp.c", 557);
        if (!v2)
            return v2;
        v3 = v2;
        _memcpy();
        v3->field_1d8 = 0;
        v4 = v3;
        if (sub_97bee0(&v4->field_158, v4->field_b0, v4->field_b8, v4->field_a8, &g_98b3e8, v4, &g_98b428, v4, &g_98b564, v4, &g_98b5e0, v4, a0->field_108, a0->field_110))
            return v4;
        sub_a6c2e4(v4, "ssl/quic/quic_txp.c", 572);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_txp.c", 553, "ossl_quic_tx_packetiser_new");
        sub_a36abc(20, 0xc0102, 0);
    }
    return 0;
}
