/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fb650..0x1fb6a4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e7f560;
extern char g_1000180;

unsigned long long * sub_1fb650(unsigned long long *a0)
{
    unsigned long long ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _calloc(1, 0x100);
    *a0 = ptr;
    if (ptr)
        return a0;
    ___cxa_throw(std::bad_alloc::bad_alloc(___cxa_allocate_exception(8)), &g_e7f560, &g_1000180);
}
