/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b7bc..0x98b81c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b7bc_0 {
    uint128_t field_0;
    char field_d;
} st_98b7bc_0;

typedef struct st_98b7bc_1 {
    char padding_0[21];
    uint128_t field_15;
    char field_22;
} st_98b7bc_1;


st_98b7bc_0 * sub_98b7bc(st_98b7bc_1 *a0, st_98b7bc_0 *a1)
{
    uint128_t v3;  // q0
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a1)
    {
        v0 = &v2;
        v1 = v4;
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_txp.c", 679, "ossl_quic_tx_packetiser_set_cur_dcid");
        sub_a36abc(20, 0xc0102, 0);
        return 0;
    }
    v3 = a1->field_0;
    *(long long *)((char *)&a0->field_15 + 2) = *(long long *)((char *)&a1->field_0 + 13);
    *(uint128_t *)&(a0->padding_0)[1] = v3;
    return 1;
}
