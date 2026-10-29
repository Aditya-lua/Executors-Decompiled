/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e3a8..0xb5e450 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b5e3a8(long long a0, long long a1, long long *a2, long long a3, long long a4, long long a5)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if ((unsigned long long)a5 > (unsigned long long)a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon_gcm.c", 376, "ossl_gcm_cipher");
        sub_a36abc(57, 106, 0);
        return 0;
    }
    else
    {
        v3 = sub_b5dfd0(a0, a1, a2, a4, a5);
        if (!(unsigned int)v3)
            return v3;
        *a2 = a5;
        return 1;
    }
}
