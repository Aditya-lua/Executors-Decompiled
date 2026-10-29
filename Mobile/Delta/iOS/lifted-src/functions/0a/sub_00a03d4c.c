/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03d4c..0xa03e64 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a03d4c(long long a0, long long a1)
{
    unsigned int v3;  // w20
    unsigned long long ptr;  // x0
    unsigned int v5;  // w8
    unsigned int v6;  // w8
    unsigned long v7;  // x22
    unsigned long long v8;  // x0
    long long v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = _strlen(a1);
    ptr = _strchr(a1, 47);
    if (ptr)
    {
        v5 = v3 + 1;
    }
    else
    {
        v6 = 7;
        if (!(sub_a042ac(a0) & 2))
            v6 = 10;
        v5 = v6 + v3;
    }
    v7 = v5;
    v8 = sub_a6bf4c(v7, "crypto/dso/dso_dlfcn.c", 258);
    if (!v8)
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_dlfcn.c", 260, "dlfcn_name_converter");
        sub_a36abc(37, 109, 0);
        return v8;
    }
    if (ptr)
    {
        v0 = a1;
    }
    else if (!(sub_a042ac(a0) >> 1 & 1))
    {
        v0 = a1;
    }
    else
    {
        v0 = a1;
    }
    sub_9d5b44(v8, v7);
    return v8;
}
