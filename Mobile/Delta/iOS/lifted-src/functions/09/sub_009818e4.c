/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9818e4..0x981984 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9818e4_1 {
    char padding_0[72];
    struct st_9818e4_0 *field_48;
    char padding_50[64];
    long long field_90;
    char padding_98[2];
    unsigned short field_9a;
} st_9818e4_1;

typedef struct st_9818e4_0 {
    char padding_0[8];
    struct st_9818e4_0 *field_8;
} st_9818e4_0;


st_9818e4_1 * sub_9818e4(st_9818e4_1 *a0, unsigned long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9818e4_1 *v8;  // x0
    unsigned long v9;  // x8
    st_9818e4_0 *iter;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_9a & 1)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a368c8();
    sub_a369bc("ssl/quic/quic_port.c", 1765, "ossl_quic_port_raise_net_error");
    sub_a36abc(20, 387, "port failed due to network BIO I/O error");
    v8 = sub_a3709c(a0->field_90);
    v9 = a0->field_9a;
    if (!(v9 & 1))
        a0->field_9a = (unsigned short)v9 | 1;
    if (a1)
        v8 = sub_979680(a1);
    iter = a0->field_48;
    if (a0->field_48)
    {
        do
        {
            if (iter != a1)
                v8 = sub_979680(iter);
        } while ((iter = iter->field_8, iter));
    }
    return v8;
}
