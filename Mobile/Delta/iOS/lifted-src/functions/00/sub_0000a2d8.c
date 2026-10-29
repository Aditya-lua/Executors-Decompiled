/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d8..0xa328 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e615d0;
extern char g_1000040;

void sub_a2d8(long long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x19
    long long v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = ___cxa_allocate_exception(16);
    sub_a0f4(v8, a0);
    v9 = ___cxa_throw(v8, &g_e615d0, &g_1000040);
    ___cxa_free_exception(v8);
    __Unwind_Resume(v9);
}
