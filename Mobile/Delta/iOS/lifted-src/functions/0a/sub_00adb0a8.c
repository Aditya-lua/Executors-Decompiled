/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadb0a8..0xadb0f4 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_adb0f4;
extern long long g_adb144;
extern unsigned int g_f09368;
extern char g_f13278;

int sub_adb0a8(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f09368 = sub_a6a3e8(14, 0, 0, &g_adb0f4, "@", &g_adb144);
    g_f13278 = 1;
    return g_f09368;
}
