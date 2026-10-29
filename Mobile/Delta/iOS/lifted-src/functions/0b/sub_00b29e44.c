/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb29e44..0xb29e88 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b29e44(void)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(24, "providers/implementations/exchange/ecx_exch.c", 52);
    if (!v2)
        return v2;
    *(unsigned long long *)v2 = 32;
    return v2;
}
