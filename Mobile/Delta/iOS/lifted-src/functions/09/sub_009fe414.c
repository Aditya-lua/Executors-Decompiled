/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fe414..0x9fe4e4 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9fe414(unsigned long a0, unsigned long a1, unsigned int *a2)
{
    unsigned int v2;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a2 = 0;
    if (!*(long long *)(a0 + 8))
    {
        v2 = 4;
    }
    else if ((int)sub_9e46a8(*(long long *)(a0 + 8)) > 0x8000)
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 277, "DH_check_pub_key");
        sub_a36abc(5, 103, 0);
        *a2 = 260;
        return 0;
    }
    else if (*(long long *)(a0 + 16) && sub_9e53a8(*(long long *)(a0 + 8)) >> 31 & 1)
    {
        v2 = *a2 | 36;
    }
    *a2 = v2;
    return 1;
}
