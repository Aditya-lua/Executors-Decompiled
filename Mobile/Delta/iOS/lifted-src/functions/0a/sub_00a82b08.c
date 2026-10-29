/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa82b08..0xa82b74 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a82b08(void* a0)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(long long)a0[64])
        return (long long)a0[64];
    if ((long long)a0[80])
        sub_a66ec0((long long)a0[80], 64 | *(int *)(*(long long *)a0 + 72) * 0x200);
    v2 = sub_a6c2e4();
    memset(a0 + 64, 0, 40);
    return v2;
}
