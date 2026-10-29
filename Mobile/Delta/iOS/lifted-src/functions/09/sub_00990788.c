/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x990788..0x990908 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_990788_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    unsigned int field_20;
} st_990788_0;

typedef struct st_990788_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_990788_1;

extern st_990788_1 g_e88970;

long long sub_990788(st_990788_0 *a0, long long a1, long long a2, unsigned int a3, long long a4, unsigned long a5)
{
    unsigned int v2;  // w8
    long long v3;  // x23
    long long v4;  // x0
    long long v5;  // x0
    long long v6;  // x20
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3 - 1;
    if (3 > v2)
    {
        v3 = (&g_e88970.field_0)[v2];
        v4 = sub_a4bc70();
        a0->field_10 = v4;
        if (v4)
        {
            v5 = sub_a4e104(a1, v3, a2);
            a0->field_18 = v5;
            if (v5 && sub_9e4290() == a5)
            {
                if (sub_a4c694(a0->field_10, a0->field_18, 0, a4, 0, 1))
                {
                    a0->field_0 = a1;
                    a0->field_8 = a2;
                    a0->field_20 = a3;
                    return 1;
                }
                v6 = 53;
            }
            else
            {
                v6 = 47;
            }
            sub_a368c8();
            sub_a369bc("ssl/quic/quic_wire_pkt.c", v6, "ossl_quic_hdr_protector_init");
            sub_a36abc(20, 0x80006, 0);
            sub_a4bca0(a0->field_10);
            a0->field_10 = 0;
            sub_a4bbe4(a0->field_18);
            a0->field_18 = 0;
            return 0;
        }
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_wire_pkt.c", 40, "ossl_quic_hdr_protector_init");
        v7 = 524294;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_wire_pkt.c", 0x22, "ossl_quic_hdr_protector_init");
        v7 = 524556;
    }
    sub_a36abc(20, v7, 0);
    return 0;
}
