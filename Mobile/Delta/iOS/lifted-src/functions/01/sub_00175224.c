/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x175224..0x1752ec (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_cc2b50;
extern unsigned long long g_f0fd38;
extern long long g_f0fd40;
extern unsigned long long g_f0fd48;
extern char g_10002b0;

int sub_175224(void)
{
    unsigned int v4;  // w0
    long long v5;  // x0
    char v0;  // [bp-0x368]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    _memcpy(&v0, &g_cc2b50, 816);
    g_f0fd48 = 0;
    g_f0fd40 = 0;
    g_f0fd38 = &g_f0fd40;
    sub_174654(&g_f0fd38, &v0, &v1);
    v4 = ___cxa_atexit(0x16b06c, &g_f0fd38, 0);
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    v5 = ___stack_chk_fail();
    sub_174278(&g_f0fd38, g_f0fd40);
    __Unwind_Resume(v5);
}
