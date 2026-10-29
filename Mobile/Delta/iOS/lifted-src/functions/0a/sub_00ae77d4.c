/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae77d4..0xae7890 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ae77d4(unsigned long a0, unsigned long a1, long long a2)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2)
    {
        v2 = sub_9cf180();
        if (!v2)
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_ia5.c", 50, "s2i_ASN1_IA5STRING");
            sub_a36abc(0x22, 0x8000d, 0);
            return v2;
        }
        else if (!sub_9c7770(v2, a2, _strlen(a2)))
        {
            sub_9cf0f4(v2);
        }
        else
        {
            return v2;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_ia5.c", 46, "s2i_ASN1_IA5STRING");
        sub_a36abc(0x22, 107, 0);
    }
    return 0;
}
