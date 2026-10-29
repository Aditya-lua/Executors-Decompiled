/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x165560..0x165594 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e82b60;
extern char g_10001e8;

void sub_165560(void)
{
    unsigned long long v3;  // x30
    unsigned long long *v4;  // x0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = ___cxa_allocate_exception(8);
    *v4 = &g_10001e8;
    ___cxa_throw(v4, &g_e82b60, 0x1652b4);
}
