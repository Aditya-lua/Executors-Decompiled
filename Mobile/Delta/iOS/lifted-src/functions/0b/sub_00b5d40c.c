/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d40c..0xb5d514 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b5d40c(char *a0, long long a1, unsigned long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long v6;  // x8
    unsigned long long v7;  // x0
    unsigned long long v0;  // [bp-0x42]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a2f9e0();
    if (!(unsigned int)v3)
        return v3;
    if (a4)
    {
        if (a5 > a3)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 322, "ossl_ccm_cipher");
            sub_a36abc(57, 106, 0);
            return 0;
        }
        v4 = sub_b5d0e8(a0, a1, a2, a4, a5);
        if (!(unsigned int)v4)
            return v4;
        *(unsigned long long *)a2 = a5;
    }
    else
    {
        v0 = 0;
        v5 = sub_a2f9e0();
        if (!(unsigned int)v5)
            return v5;
        v6 = *a0;
        if (!(v6 >> 1 & 1))
            return 0;
        if (v6 >> 2 & 1 && ((unsigned int)v6 & 9) != 9)
        {
            v7 = sub_b5d0e8(a0, &v0, a2, (char *)&v0 + 1, 0);
            if (!(unsigned int)v7)
                return v7;
        }
        *(unsigned long long *)a2 = 0;
    }
    return 1;
}
