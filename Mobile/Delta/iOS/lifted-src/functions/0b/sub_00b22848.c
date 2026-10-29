/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb22848..0xb22974 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_b22848(long long *a0, unsigned long a1, unsigned long long *a2, unsigned long a3, unsigned long a4, unsigned long long *a5, unsigned long long *a6, unsigned long long *a7, unsigned long a8, unsigned long a9, unsigned long a10)
{
    unsigned long long *v1;  // x0
    long long v2;  // x1
    char *v0;  // [bp-0x10]

    v0 = &a8;
    if (!a2)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
        v2 = 786690;
    }
    else if (!a6)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1226, "key2any_encode");
        v2 = 524550;
    }
    else if (a5)
    {
        a5();
    }
    else
    {
        v1 = sub_afd760(*a0);
        if (v1 && (!a7 || sub_a76e48(a0 + 3, a7, a8)))
            a6();
        sub_9d3c28(v1);
        return 0;
    }
    sub_a36abc(57, v2, 0);
    return 0;
}
