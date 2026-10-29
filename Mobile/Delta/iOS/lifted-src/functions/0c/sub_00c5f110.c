/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f110..0xc5f214 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_cbaa8a;
extern long long g_cbaab1;
extern char g_e072e8;

void sub_c5f110(void)
{
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if (/* unsupported instruction */)
    {
        sub_c60260(sub_c600e4(sub_c601b4(), &g_cbaab1), &g_cbaab1);
        return;
    }
    v3 = sub_c600e4(sub_c601b4(), &g_cbaa8a);
    goto *((void *)(sub_c5f190 + (&g_e072e8)[sub_c40ac4(sub_c41f9c(sub_c60260(v3, &g_cbaa8a))) & 0xff] * 4));
}
