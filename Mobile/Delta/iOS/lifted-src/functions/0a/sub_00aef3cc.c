/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaef3cc..0xaef470 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aef3cc(unsigned long a0, long long a1)
{
    long long v2;  // x20
    long long v3;  // x19
    long long v4;  // x0
    long long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = 524301;
    v3 = sub_9c1c08(a1, 0);
    if (v3)
    {
        v4 = sub_aef2d4(v3);
        if (v4)
        {
            sub_9e48d4(v3);
            return v4;
        }
        v2 = 524322;
        v5 = 191;
    }
    else
    {
        v5 = 189;
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/v3_utl.c", v5, "i2s_ASN1_INTEGER");
    sub_a36abc(0x22, v2, 0);
    sub_9e48d4(v3);
    return 0;
}
