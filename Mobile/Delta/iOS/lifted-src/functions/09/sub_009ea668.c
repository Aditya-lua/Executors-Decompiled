/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ea668..0x9ea6d0 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ea668(long long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_shift.c", 86, "BN_lshift");
        sub_a36abc(3, 0x77, 0);
        return 0;
    }
    v2 = sub_9ea6d0();
    sub_9e5708(a0);
    return v2;
}
