/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2619d8..0x261b14 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2619d8_0 {
    char field_0;
} st_2619d8_0;

extern long long g_f0d228;
extern long long g_f0d230;

long long sub_2619d8(long long a0)
{
    st_2619d8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2619d8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_26163c())
    {
        return sub_1a587c(g_f0d228, g_f0d230, a0) ^ 1;
    }
    else if (sub_1ac528(a0, "rbxinfra.net") & 1)
    {
        return 1;
    }
    else if (sub_1ac528(a0, "rbxtrk.com") & 1)
    {
        return 1;
    }
    else if (sub_1ac528(a0, "roblox.co.uk") & 1)
    {
        return 1;
    }
    else if (sub_1ac528(a0, "roblox.net") & 1)
    {
        return 1;
    }
    else if (sub_1ac528(a0, "roblox.us") & 1)
    {
        return 1;
    }
    else
    {
        return sub_1ac528(a0, "roproxy.com");
    }
}
