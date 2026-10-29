/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16b98..0xa16c04 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_e8ef20;
extern unsigned int g_e8ef30;

unsigned int sub_a16b98(long long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int *v8;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (sub_a6e200())
    {
        if (sub_a6e200(a0, "named_curve"))
            return 0xffffffff;
        v8 = &g_e8ef30;
    }
    else
    {
        v8 = &g_e8ef20;
    }
    return *v8;
}
