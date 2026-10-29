/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61c5c..0xc61dbc (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61c5c_0 {
    char padding_0[80];
    long long field_50;
    long long field_58;
    char padding_60[120];
    long long field_d8;
    char padding_e0[824];
    long long field_418;
    char padding_420[8];
    long long field_428;
    char padding_430[496];
    unsigned long long field_620;
} st_c61c5c_0;


unsigned long long sub_c61c5c(st_c61c5c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x1
    unsigned long long *v9;  // x20
    unsigned long long v10;  // x8
    long long v11;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if ((a0->field_620 & 0x1c200) != 0xc000)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_98b268(a0->field_d8);
    if ((char)a0->field_620 >= 0)
    {
        sub_979174(a0, 365, 6, "no transport parameters received", 0, "ssl/quic/quic_channel.c", 1152, "ch_on_handshake_complete");
        return 0;
    }
    sub_a6c2e4(a0->field_50, "ssl/quic/quic_channel.c", 1157);
    a0->field_50 = 0;
    sub_984434(a0->field_428);
    sub_98b928(a0->field_d8);
    v8 = a0->field_58;
    v9 = &a0->field_58;
    v10 = v9[185] | 0x200;
    v9[185] = v10;
    if (v8)
    {
        sub_977264(a0);
        sub_a6c2e4(a0->field_58, "ssl/quic/quic_channel.c", 1180);
        *v9 = 0;
        v9[1] = 0;
        v10 = a0->field_620;
    }
    if (v10 >> 25 & 1)
    {
        if (!(v10 >> 10 & 1))
        {
            if (!(v10 >> 9 & 1))
            {
                sub_979174(a0, 10, 30, "handshake cannot be confirmed before it is completed", 0, "ssl/quic/quic_channel.c", 3042, "ossl_quic_channel_on_handshake_confirmed");
            }
            else
            {
                v11 = sub_c61a4c(a0, 2);
                a0->field_620 = a0->field_620 | 0x400;
                sub_97b0f0(v11, 2);
                sub_97559c(a0->field_418);
            }
        }
        sub_98b938(a0->field_d8);
    }
    sub_97b0f0();
    return 1;
}
