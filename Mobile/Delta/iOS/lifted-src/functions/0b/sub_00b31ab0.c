/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb31ab0..0xb31b24 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b31ab0(long long *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a3f52c(a0[10]);
    v2 = sub_a40ca8(*a0, "sha256", a0[1]);
    a0[10] = v2;
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/scrypt.c", 167, "set_digest");
        sub_a36abc(57, 147, 0);
        return 0;
    }
    return 1;
}
