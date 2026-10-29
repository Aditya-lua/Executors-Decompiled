/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d6650..0x9d66cc (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9d6650(unsigned long a0, unsigned int a1)
{
    unsigned long long v4;  // x0
    unsigned int *v5;  // x0
    char *v0;  // [bp-0x30]
    unsigned int v1;  // [bp-0x24]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a1;
    v0 = &v1;
    v4 = _ioctl();
    if (v4 >> 31 & 1)
    {
        sub_a368c8();
        v5 = ___error(sub_a369bc("crypto/bio/bio_sock.c", 248, "BIO_socket_ioctl"), 248, "BIO_socket_ioctl");
        sub_a36abc(2, *v5, "calling ioctlsocket()");
    }
    return !(unsigned int)v4;
}
