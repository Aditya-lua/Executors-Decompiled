/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5df34..0xb5dfd0 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5df34(unsigned long a0, unsigned long a1, long long *a2, long long a3, unsigned long a4, long long a5)
{
    unsigned long long v3;  // x30
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a5)
    {
        *a2 = 0;
        return 1;
    }
    v0 = &v2;
    v1 = v3;
    if ((unsigned long long)a5 > (unsigned long long)a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon_gcm.c", 338, "ossl_gcm_stream_update");
        v4 = 106;
    }
    else
    {
        if (sub_b5dfd0())
            return 1;
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon_gcm.c", 343, "ossl_gcm_stream_update");
        v4 = 0x66;
    }
    sub_a36abc(57, v4, 0);
    return 0;
}
