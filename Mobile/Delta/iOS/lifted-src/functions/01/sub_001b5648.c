/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b5648..0x1b5730 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b5648_0 {
    char field_0;
} st_1b5648_0;

extern unsigned long long g_e724c0;
extern unsigned long long g_e724c8;

void sub_1b5648(long long a0)
{
    char *v6;  // x19
    unsigned long long v7;  // x0
    char *v8;  // x21
    st_1b5648_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1b5648_0 *v1;  // [bp-0x48]
    st_1b5648_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_1b5648_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (!sub_6b08())
        return;
    v6 = sub_a0c8(a0);
    v7 = sub_a0c8(a0);
    v8 = v7 + sub_6b08(a0);
    if (v6 != v8)
    {
        while (1)
        {
            if (sub_1b8324(*v6) & 1)
            {
                v6 += 1;
                if (v6 == v8)
                    goto *((void *)(g_e724c0));
            }
            else
            {
                goto *((void *)(g_e724c8));
            }
        }
    }
    else
    {
        goto *((void *)(g_e724c0));
    }
}
