/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x361668..0x3616c0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f0d428;
extern char g_f0d429;

void sub_361668(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_38cb00();
    if (g_f0d428 == 1 && g_f0d429 & 1)
        return;
    _dispatch_time(0, 1000000000);
}
