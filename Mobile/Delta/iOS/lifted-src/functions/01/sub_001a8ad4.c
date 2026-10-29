/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8ad4..0x1a8b20 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e6fb60;
extern char g_1000060;

void sub_1a8ad4(void)
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
    v8 = ___cxa_allocate_exception(24);
    std::__1::regex_error::regex_error(v8, 3);
    v9 = ___cxa_throw(v8, &g_e6fb60, &g_1000060);
    ___cxa_free_exception(v8);
    __Unwind_Resume(v9);
}
