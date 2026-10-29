/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33298..0xa332ec (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a33298(long long *a0, long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a1)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_lib.c", 206, "ENGINE_set_id");
        sub_a36abc(38, 0xc0102, 0);
        return 0;
    }
    *a0 = a1;
    return 1;
}
