/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9998a8..0x999918 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9998a8(unsigned long long *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[211] > a0[210] && a0[16 + 6 * a0[210]])
    {
        sub_c64fdc(a0);
        return 0xfffffffe;
    }
    (*(long long *)(a0[552] + 72))();
}
