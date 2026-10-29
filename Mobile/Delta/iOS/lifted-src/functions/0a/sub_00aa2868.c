/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa2868..0xaa2904 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa2868(long long a0, long long a1)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = 0;
LABEL_aa28a0:
        if (sub_aa3d38())
            return 1;
        sub_9c47fc(v2);
    }
    else
    {
        v2 = sub_af4de8(0);
        if (v2)
            goto LABEL_aa28a0;
        sub_a368c8(a0);
        sub_a369bc("crypto/pkcs7/pk7_attr.c", 112, "PKCS7_add0_attrib_signing_time");
        sub_a36abc(33, 0x8000b, 0);
    }
    return 0;
}
