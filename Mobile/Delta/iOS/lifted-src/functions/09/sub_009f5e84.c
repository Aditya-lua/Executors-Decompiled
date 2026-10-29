/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5e84..0x9f5ef0 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f127e0;

int sub_9f5e84(char idx)
{
    char v2;  // x20
    char v3;  // x19
    unsigned long v4;  // x21
    unsigned int v5;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f127e0 & 1)
        return 1;
    if (idx)
    {
        v2 = *(long long *)idx;
        v3 = *(long long *)(idx + 8);
        v4 = *(long long *)(idx + 16);
    }
    else
    {
        v3 = 0;
        v2 = 0;
        v4 = 50;
    }
    v5 = sub_9f55a8(sub_a680ac(), v2, v3, v4);
    g_f127e0 = 1;
    return v5;
}
