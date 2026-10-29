/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a300..0x98a3b0 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a300_0 {
    char padding_0[124];
    unsigned int field_7c;
    char padding_80[16];
    long long field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
    char field_a8;
} st_98a300_0;


int sub_98a300(st_98a300_0 *a0, unsigned long long a1, unsigned long long a2, long long a3, long long a4)
{
    unsigned int v5;  // w0
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    sub_a368c8();
    sub_a369bc("ssl/quic/quic_tls.c", a3, a4);
    v1 = a1;
    v2 = a2;
    v0 = a1;
    v5 = sub_a36abc(20, 393, "handshake layer error, error code %llu (0x%llx) (\"%s\")");
    if (!a0->field_7c)
        return v5;
    sub_a37190(a0->field_90);
    a0->field_98 = a1;
    a0->field_a0 = a2;
    a0->field_a8 = a0->field_a8 | 2;
}
