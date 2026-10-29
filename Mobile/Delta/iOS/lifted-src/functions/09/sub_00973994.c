/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x973994..0x973a1c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_973994(long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_971cd0(a0 + 19);
    sub_9d5018(a0[11]);
    sub_a6c2e4(a0[3], "ssl/quic/qlog.c", 168);
    sub_a6c2e4(a0[4], "ssl/quic/qlog.c", 169);
    sub_a6c2e4(a0[5], "ssl/quic/qlog.c", 0xaa);
    sub_a6c2e4(a0[10], "ssl/quic/qlog.c", 171);
    sub_a6c2e4();
    return;
}
