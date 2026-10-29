/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cfddc..0x9cfe40 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_9cfddc(long long *a0)
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
    sub_afc404(*a0);
    sub_af99a8(a0[1]);
    sub_9d03c8(a0[2]);
    sub_a6c2e4(a0[7], "crypto/asn1/x_info.c", 35);
    sub_a6c2e4();
    return;
}
