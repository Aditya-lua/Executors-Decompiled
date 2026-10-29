/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaff6b4..0xaff790 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aff6b4(long long *a0, long long a1, long long a2, unsigned long a3, unsigned long a4, long long a5)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_954340(a0 + 2);
    if (!v2)
    {
        v2 = sub_afe0c8(a0 + 2, *a0, "SM3", 0);
        if (!v2)
            return v2;
    }
    if (!a1)
    {
        if (sub_ac6da0(a0[1], v2, a5, a2))
            return 1;
        sub_a368c8();
        sub_a369bc("providers/implementations/asymciphers/sm2_enc.c", 94, "sm2_asym_encrypt");
        sub_a36abc(57, 158, 0);
        return 0;
    }
}
