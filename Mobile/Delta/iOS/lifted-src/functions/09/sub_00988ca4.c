/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988ca4..0x988d04 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_988ca4(void)
{
    unsigned long long v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v0 = 2;
    sub_988b64();
    if (*(long long *)&g_10002b0 == v1)
        return;
    ___stack_chk_fail();
}
