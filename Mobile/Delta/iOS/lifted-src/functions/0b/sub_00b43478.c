/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43478..0xb43514 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b43478(long long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // 4136
    long long v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(130, a2 - 33, 33, 0);
    if (!(v2 & 1))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/macs/blake2_mac_impl.c", 94, "blake2_setkey");
        sub_a36abc(57, 105, 0);
        return 0;
    }
    v3 = a0 + 160;
    _memcpy(v3);
    if (31 >= a2)
        _bzero(v3 + a2, 32 - a2);
    sub_b0c9b8(a0 + 128, (unsigned int)a2 & 0xff);
    return 1;
}
