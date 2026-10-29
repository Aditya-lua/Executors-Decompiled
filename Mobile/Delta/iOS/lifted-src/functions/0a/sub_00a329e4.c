/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa329e4..0xa32b84 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a329e4(long long a0, int a1, unsigned int *a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // x21
    long long v13;  // w8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = a1;
        if (!_strncmp())
        {
            v13 = 0xffff;
        }
        else if (!_strncmp(a0, "RSA", v12))
        {
            v13 = 1;
        }
        else if (!_strncmp(a0, "DSA", v12))
        {
            v13 = 2;
        }
        else if (!_strncmp(a0, "DH", v12))
        {
            v13 = 4;
        }
        else if (!_strncmp(a0, "EC", v12))
        {
            v13 = 0x800;
        }
        else if (!_strncmp(a0, "RAND", v12))
        {
            v13 = 8;
        }
        else if (!_strncmp(a0, "CIPHERS", v12))
        {
            v13 = 64;
        }
        else if (!_strncmp(a0, "DIGESTS", v12))
        {
            v13 = 128;
        }
        else if (!_strncmp(a0, "PKEY", v12))
        {
            v13 = 0x600;
        }
        else if (!_strncmp(a0, "PKEY_CRYPTO", v12))
        {
            v13 = 0x200;
        }
        else if (_strncmp(a0, "PKEY_ASN1", v12))
        {
            a0 = 0;
            goto LABEL_a32b74;
        }
        else
        {
            v13 = 0x400;
        }
        *a2 = *a2 | v13;
        a0 = 1;
LABEL_a32b74:
    }
    return a0;
}
