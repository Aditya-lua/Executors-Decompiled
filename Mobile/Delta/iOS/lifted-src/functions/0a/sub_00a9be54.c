/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9be54..0xa9bf30 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a9be54(long long a0, unsigned int a1, unsigned long a2, long long a3)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
    {
        v2 = _strlen(a3);
        if ((int)v2 < (int)a1)
            v3 = v2;
        else
            v3 = a1;
        _memcpy();
        return v3;
    }
    else if (sub_a4f498())
    {
        sub_a368c8();
        sub_a369bc("crypto/pem/pem_lib.c", 62, "PEM_def_callback");
        sub_a36abc(9, 109, 0);
        _bzero(a0, a1);
        return 0xffffffff;
    }
    else
    {
        return _strlen(a0);
    }
}
