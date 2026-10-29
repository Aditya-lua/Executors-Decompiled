/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac5b7c..0xac5d1c (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_eb3de0;
extern long long g_eb3e20;
extern long long g_eb3e60;
extern long long g_eb3ea0;
extern long long g_eb3ee0;
extern long long g_eb3f20;
extern long long g_eb3f60;
extern long long g_eb3fa0;
extern long long g_eb3fe0;
extern long long g_eb4020;
extern long long g_eb4060;
extern long long g_eb40a0;

long long sub_ac5b7c(long long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (!_strcmp("SLH-DSA-SHA2-128s", a0))
    {
        v8 = &g_eb3de0;
    }
    else if (!_strcmp("SLH-DSA-SHAKE-128s", a0))
    {
        v8 = &g_eb3e20;
    }
    else if (!_strcmp("SLH-DSA-SHA2-128f", a0))
    {
        v8 = &g_eb3e60;
    }
    else if (!_strcmp("SLH-DSA-SHAKE-128f", a0))
    {
        v8 = &g_eb3ea0;
    }
    else if (!_strcmp("SLH-DSA-SHA2-192s", a0))
    {
        v8 = &g_eb3ee0;
    }
    else if (!_strcmp("SLH-DSA-SHAKE-192s", a0))
    {
        v8 = &g_eb3f20;
    }
    else if (!_strcmp("SLH-DSA-SHA2-192f", a0))
    {
        v8 = &g_eb3f60;
    }
    else if (!_strcmp("SLH-DSA-SHAKE-192f", a0))
    {
        v8 = &g_eb3fa0;
    }
    else if (!_strcmp("SLH-DSA-SHA2-256s", a0))
    {
        v8 = &g_eb3fe0;
    }
    else if (!_strcmp("SLH-DSA-SHAKE-256s", a0))
    {
        v8 = &g_eb4020;
    }
    else if (_strcmp("SLH-DSA-SHA2-256f", a0))
    {
        if (!_strcmp("SLH-DSA-SHAKE-256f", a0))
            v8 = &g_eb40a0;
        else
            v8 = 0;
    }
    else
    {
        v8 = &g_eb4060;
    }
    return v8;
}
