/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5baec..0xa5bba8 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a5baec(unsigned long a0, unsigned long long *a1)
{
    unsigned long len;  // x0
    unsigned long v4;  // x2
    unsigned long v5;  // x1
    unsigned long v6;  // x0
    long long v7;  // x0
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_a36c8c();
    len = _strlen(a0);
    v0 = 0;
    if (a0)
    {
        v4 = len;
        v5 = a0;
        v6 = sub_9c5edc(&v0, v5, v4);
        v7 = sub_a32e7c(v0);
        if (!v6)
            goto LABEL_a5bb5c;
        if (!*a1)
        {
            *a1 = a0;
        }
        else if (!a1[1])
        {
            a1[1] = a0;
        }
    }
    else
    {
        v7 = sub_a32e7c(0);
LABEL_a5bb5c:
        sub_a368c8(v7);
        sub_a369bc("crypto/evp/p_lib.c", 1612, "pkey_set_type");
        v5 = 156;
        v4 = 0;
        v7 = sub_a36abc(6, 156, 0);
    }
    return sub_a36cd4(v7, v5, v4);
}
