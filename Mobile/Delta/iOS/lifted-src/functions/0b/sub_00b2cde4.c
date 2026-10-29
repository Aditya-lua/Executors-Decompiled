/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2cde4..0xb2ce58 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b2cde4(long long *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(a0[19], "providers/implementations/kdfs/argon2.c", 1373);
    a0[19] = 0;
    if (a1)
    {
        v2 = sub_a6d9b4(a1, "providers/implementations/kdfs/argon2.c", 1376);
        a0[19] = v2;
        if (!v2)
            return v2;
    }
    sub_a3f52c(a0[0x11]);
    a0[0x11] = 0;
    sub_a58aa4(a0[18]);
    a0[18] = 0;
    return 1;
}
