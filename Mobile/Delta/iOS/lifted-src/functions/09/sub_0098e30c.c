/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e30c..0x98e38c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_98e30c(unsigned long a0, unsigned long long a1, long long *a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // w0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1 > 20)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    *(char *)a2 = a1;
    v8 = (unsigned int)sub_aa8658();
    if (v8 == 1)
        return v8;
    sub_a368c8();
    sub_a369bc("ssl/quic/quic_types.c", 23, "ossl_quic_gen_rand_conn_id");
    sub_a36abc(20, 0x80024, 0);
    *(char *)a2 = 0;
    return 0;
}
