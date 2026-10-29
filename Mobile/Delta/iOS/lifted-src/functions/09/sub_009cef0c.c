/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cef0c..0x9cef6c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9cef0c(long long a0)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aef3cc(0);
    if (!v2)
        return 0;
    v3 = v2;
    v4 = (int)sub_9d4888(a0, v3) > 0;
    sub_a6c2e4(v3, "crypto/asn1/tasn_prn.c", 398);
    return v4;
}
