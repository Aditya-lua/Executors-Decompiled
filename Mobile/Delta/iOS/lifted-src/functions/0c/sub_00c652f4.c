/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc652f4..0xc65334 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

void sub_c652f4(long long a0, unsigned long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a368c8();
    sub_996e50(sub_a369bc("ssl/statem/extensions_srvr.c", a0, "tls_construct_stoc_supported_versions"), a0, "tls_construct_stoc_supported_versions");
}
