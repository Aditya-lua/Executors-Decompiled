/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8e28..0xab8f24 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_eb3c60;
extern unsigned int g_eb3c70;
extern unsigned int g_eb3c80;
extern unsigned int g_eb3c90;
extern unsigned int g_eb3ca0;
extern unsigned int g_eb3cb0;
extern unsigned int g_eb3cc0;

unsigned long long sub_ab8e28(unsigned long long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int *v8;  // x8
    unsigned long long v9;  // x0
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
    if (sub_a509f4())
    {
        v8 = &g_eb3c60;
    }
    else if (sub_a509f4(a0, "SHA2-224"))
    {
        v8 = &g_eb3c70;
    }
    else if (sub_a509f4(a0, "SHA2-256"))
    {
        v8 = &g_eb3c80;
    }
    else if (sub_a509f4(a0, "SHA2-384"))
    {
        v8 = &g_eb3c90;
    }
    else if (sub_a509f4(a0, "SHA2-512"))
    {
        v8 = &g_eb3ca0;
    }
    else if (sub_a509f4(a0, "SHA2-512/224"))
    {
        v8 = &g_eb3cb0;
    }
    else
    {
        v9 = sub_a509f4(a0, "SHA2-512/256");
        if (!(unsigned int)v9)
            return v9;
        v8 = &g_eb3cc0;
    }
    return *v8;
}
