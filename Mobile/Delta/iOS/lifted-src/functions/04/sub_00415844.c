/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x415844..0x4158ac (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e7fc10;

unsigned long long sub_415844(unsigned long long *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[2] <= a0[1])
    {
        v2 = sub_4252fc(a0);
        a0[1] = v2;
        return v2 - 1;
    }
    (g_e7fc10 - 0xbc271f00)();
}
