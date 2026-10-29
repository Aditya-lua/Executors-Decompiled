/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x198d8..0x1990c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e61f90;
extern char g_e7f600;

void sub_198d8(void)
{
    unsigned long long v3;  // x30
    unsigned long long *v4;  // x0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = ___cxa_allocate_exception(8);
    *v4 = &g_e7f600;
    ___cxa_throw(v4, &g_e61f90, 0x19f98);
}
