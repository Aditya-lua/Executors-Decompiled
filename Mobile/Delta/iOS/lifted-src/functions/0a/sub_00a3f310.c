/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f310..0xa3f3d0 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_e93500;
extern unsigned int g_e93510;
extern unsigned int g_e93520;
extern unsigned int g_e93530;

unsigned int sub_a3f310(long long a0, unsigned int a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!_strcmp("group", a0))
        return g_e93500;
    switch (a1)
    {
    case 4096:
        if (!_strcmp("fips186_4", a0))
        {
            return g_e93520;
        }
        else if (!_strcmp("fips186_2", a0))
        {
            return g_e93530;
        }
        goto LABEL_a3f3a0;
    case 0:
        if (!_strcmp("generator", a0))
            return g_e93510;
    default:
LABEL_a3f3a0:
        return 0xffffffff;
    }
}
