/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa9c70..0xaa9ce4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa9c70(unsigned long long *a0, long long a1, unsigned long a2)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if ((unsigned long long)a1 > a0[5] - a0[1])
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/rand/rand_pool.c", 395, "ossl_rand_pool_add_end");
        sub_a36abc(36, 125, 0);
        return 0;
    }
    if (!a1)
        return 1;
    a0[1] = a0[1] + a1;
    a0[6] = a0[6] + a2;
    return 1;
}
