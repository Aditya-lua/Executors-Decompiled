/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6047c..0xa60658 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e9f8a0;
extern char g_e9f8d0;
extern char g_e9f900;
extern char g_e9f930;
extern char g_e9f960;
extern char g_e9f990;
extern char g_e9f9c0;
extern char g_e9f9f0;
extern char g_e9fa20;
extern char g_e9fa50;
extern char g_e9fa80;
extern char g_e9fab0;
extern char g_e9fae0;
extern char g_e9fb10;

long long sub_a6047c(long long a0)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a6e200("ffdhe2048", a0))
    {
        return &g_e9f8a0;
    }
    else if (!sub_a6e200("ffdhe3072", a0))
    {
        return &g_e9f8d0;
    }
    else if (!sub_a6e200("ffdhe4096", a0))
    {
        return &g_e9f900;
    }
    else if (!sub_a6e200("ffdhe6144", a0))
    {
        return &g_e9f930;
    }
    else if (!sub_a6e200("ffdhe8192", a0))
    {
        return &g_e9f960;
    }
    else if (!sub_a6e200("modp_1536", a0))
    {
        return &g_e9f990;
    }
    else if (!sub_a6e200("modp_2048", a0))
    {
        return &g_e9f9c0;
    }
    else if (!sub_a6e200("modp_3072", a0))
    {
        return &g_e9f9f0;
    }
    else if (!sub_a6e200("modp_4096", a0))
    {
        return &g_e9fa20;
    }
    else if (!sub_a6e200("modp_6144", a0))
    {
        return &g_e9fa50;
    }
    else if (!sub_a6e200("modp_8192", a0))
    {
        return &g_e9fa80;
    }
    else if (!sub_a6e200("dh_1024_160", a0))
    {
        return &g_e9fab0;
    }
    else if (sub_a6e200("dh_2048_224", a0))
    {
        if (!sub_a6e200("dh_2048_256", a0))
            v2 = &g_e9fb10;
        else
            v2 = 0;
        return v2;
    }
    else
    {
        return &g_e9fae0;
    }
}
