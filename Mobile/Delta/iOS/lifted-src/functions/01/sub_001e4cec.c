/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e4cec..0x1e4d54 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f02738;

void sub_1e4cec(unsigned long a0)
{
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    if (!a0)
        return;
    sub_1dd788();
    sub_1db208(std::__1::mutex::lock(&g_f02738), &v0);
    std::__1::mutex::unlock(&g_f02738);
}
