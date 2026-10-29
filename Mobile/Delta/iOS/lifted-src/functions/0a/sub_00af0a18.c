/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf0a18..0xaf0a8c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_af0a18(long long a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x20
    long long v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
        return 1;
    v2 = sub_a6e19c(a1, a2);
    if (!v2)
        return 0;
    v3 = v2;
    v4 = (int)sub_9d4888(a0, v3) > 0;
    sub_a6c2e4(v3, "crypto/x509/v3_utl.c", 1446);
    return v4;
}
