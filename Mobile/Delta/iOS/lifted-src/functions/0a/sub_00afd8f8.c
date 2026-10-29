/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd8f8..0xafda74 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_eca090;
extern unsigned int g_eca0a0;
extern unsigned int g_eca0b0;
extern unsigned int g_eca0c0;
extern unsigned int g_eca0d0;
extern unsigned int g_eca0e0;
extern unsigned int g_eca0f0;
extern unsigned int g_eca100;
extern unsigned int g_eca110;
extern unsigned int g_eca120;
extern unsigned int g_eca130;

unsigned long long sub_afd8f8(unsigned long long a0)
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
        v8 = &g_eca090;
    }
    else if (sub_a509f4(a0, "SHA2-224"))
    {
        v8 = &g_eca0a0;
    }
    else if (sub_a509f4(a0, "SHA2-256"))
    {
        v8 = &g_eca0b0;
    }
    else if (sub_a509f4(a0, "SHA2-384"))
    {
        v8 = &g_eca0c0;
    }
    else if (sub_a509f4(a0, "SHA2-512"))
    {
        v8 = &g_eca0d0;
    }
    else if (sub_a509f4(a0, "SHA2-512/224"))
    {
        v8 = &g_eca0e0;
    }
    else if (sub_a509f4(a0, "SHA2-512/256"))
    {
        v8 = &g_eca0f0;
    }
    else if (sub_a509f4(a0, "SHA3-224"))
    {
        v8 = &g_eca100;
    }
    else if (sub_a509f4(a0, "SHA3-256"))
    {
        v8 = &g_eca110;
    }
    else if (sub_a509f4(a0, "SHA3-384"))
    {
        v8 = &g_eca120;
    }
    else
    {
        v9 = sub_a509f4(a0, "SHA3-512");
        if (!(unsigned int)v9)
            return v9;
        v8 = &g_eca130;
    }
    return *v8;
}
