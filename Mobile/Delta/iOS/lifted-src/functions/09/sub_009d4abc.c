/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d4abc..0x9d4cf4 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9d4abc(unsigned long long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v3;  // x8
    long long v4;  // x1
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bio_lib.c", 549, "BIO_gets");
        v4 = 786690;
    }
    else if (!*(long long *)(a0 + 8) || !*(long long *)(*(long long *)(a0 + 8) + 56))
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bio_lib.c", 553, "BIO_gets");
        sub_a36abc(32, 121, 0);
        return 0xfffffffe;
    }
    else if (!(a2 >> 31 & 1))
    {
        v3 = *(long long *)(a0 + 24);
        if (*(long long *)(a0 + 16))
        {
            if (!v3)
                (*(long long *)(a0 + 16))();
            v3();
        }
        else
        {
            if (v3)
            {
                v3();
            }
            else if (*(int *)(a0 + 40))
            {
                (*(long long *)(*(long long *)(a0 + 8) + 56))();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/bio/bio_lib.c", 569, "BIO_gets");
                v4 = 120;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bio_lib.c", 558, "BIO_gets");
        v4 = 125;
    }
    sub_a36abc(32, v4, 0);
    return 0xffffffff;
}
