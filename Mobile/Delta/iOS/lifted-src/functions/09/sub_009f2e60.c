/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2e60..0x9f2e94 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9f2e60(long long *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a66604(*a0);
    return sub_a66604(a0[1]) ^ v2 * 4;
}
