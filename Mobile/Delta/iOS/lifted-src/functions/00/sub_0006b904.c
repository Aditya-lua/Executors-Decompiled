/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b904..0x6b9d0 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6b904_0 {
    char field_0;
} st_6b904_0;

extern unsigned long long g_e6a760;
extern unsigned long long g_e6a788;

void sub_6b904(long long a0, char *a1, char *a2)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    st_6b904_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_6b904_0 *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
    {
        goto *((void *)(g_e6a788));
    }
    else
    {
        while (1)
        {
            if (sub_6b52c(a0, a0 + 4, *a1) != 1)
            {
                a1 += 1;
                if (a1 == a2)
                    goto *((void *)(g_e6a788));
            }
            else
            {
                goto *((void *)(g_e6a760));
            }
        }
    }
}
