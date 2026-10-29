/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x969e24..0x969e90 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_969e24(void)
{
    unsigned long long v4;  // x0
    char v0;  // [bp-0x4a]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if ((int)sub_a5b508() >= 1)
        v4 = sub_a99eb4(&v0);
    else
        v4 = 0;
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
