/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa779c0..0xa779ec (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a779c0(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6820c();
    if (!sub_a6820c())
        return;
    goto *((void *)(*(long long *)(sub_a6820c() + 40)));
}
