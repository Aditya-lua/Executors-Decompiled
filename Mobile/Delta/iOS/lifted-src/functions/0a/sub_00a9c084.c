/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9c084..0xa9c580 (1276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7fffff;
extern char g_10002b0;

unsigned long long sub_a9c084(unsigned long a0, unsigned long a1, unsigned long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    unsigned long long ptr;  // x26
    unsigned long long v11;  // x0
    unsigned long long v20;  // x20
    unsigned long long v22;  // w0
    unsigned int v23;  // w8
    unsigned long long v12;  // w0
    unsigned long long v13;  // w22
    unsigned long long len;  // x0
    char *v15;  // x20
    unsigned long long v16;  // x0
    unsigned long long v0;  // [bp-0xe0]
    long long v1;  // [bp-0xd8]
    unsigned long long v2;  // [bp-0xa0]
    unsigned long long v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x88]
    char v6;  // [bp-0x80]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    ptr = 0;
    v7 = *(long long *)&g_10002b0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v11 = ptr;
    if (!(a7 & 1))
    {
        sub_a6c2e4(v11, "crypto/pem/pem_lib.c", 253);
        sub_a6c2e4(v4, "crypto/pem/pem_lib.c", 254);
        sub_a6c2e4(v3, "crypto/pem/pem_lib.c", 0xff);
    }
    else
    {
        sub_a6d4c0(v11, 0, "crypto/pem/pem_lib.c", 253);
        sub_a6d4c0(v4, 0, "crypto/pem/pem_lib.c", 254);
        sub_a6d4c0(v3, v2, "crypto/pem/pem_lib.c", 0xff);
    }
    if (!sub_a9d2b4(a4, &v5, &v4, &v3, &v2, a7))
    {
        v22 = (unsigned int)sub_a35fe4();
        if (0 <= v22)
            v23 = (unsigned int)&g_7fffff;
        else
            v23 = 0x7fffffff;
        if ((v23 & v22) == 108)
        {
            v0 = "Expecting: ";
            v1 = a3;
            sub_a364a0(2);
        }
        v20 = 0;
    }
    ptr = v5;
    if (_strcmp(a3, "ANY PRIVATE KEY"))
    {
        if (!_strcmp(a3, "PARAMETERS"))
        {
            len = _strlen(ptr);
            if ((int)len < 12 || !(v15 = ptr + (len & 0x7fffffff), !_strcmp(v15 - 10, "PARAMETERS") && *(v15 - 11) == 32 && (int)(unsigned int)(v15 - ptr - 11) >= 1 && (v16 = sub_9c5edc(&v6, ptr), v16 && (sub_a32e7c(v6), *(long long *)(v16 + 112)))))
                continue;
        }
        else if ((_strcmp(ptr, "X9.42 DH PARAMETERS") || _strcmp(a3, "DH PARAMETERS")) && (v12 = (unsigned int)_strcmp(ptr, "X509 CERTIFICATE"), (v12 || _strcmp(a3, "CERTIFICATE")) && (_strcmp(ptr, "NEW CERTIFICATE REQUEST") || _strcmp(a3, "CERTIFICATE REQUEST")) && (v13 = (unsigned int)_strcmp(ptr, "CERTIFICATE"), (_strcmp(ptr, "CERTIFICATE") || _strcmp(a3, "TRUSTED CERTIFICATE")) && (v12 || _strcmp(a3, "TRUSTED CERTIFICATE")) && (_strcmp(ptr, "CERTIFICATE") || _strcmp(a3, "PKCS7")) && (_strcmp(ptr, "PKCS #7 SIGNED DATA") || _strcmp(a3, "PKCS7")) && (_strcmp(ptr, "CERTIFICATE") || _strcmp(a3, "CMS")) && (_strcmp(ptr, "PKCS7") || _strcmp(a3, "CMS")))))
        {
            continue;
        }
    }
}
