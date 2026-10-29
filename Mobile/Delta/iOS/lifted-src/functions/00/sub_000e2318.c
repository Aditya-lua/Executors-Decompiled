/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe2318..0xe24b4 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e2318_0 {
    char field_0;
} st_e2318_0;

extern unsigned long long g_e6e530;
extern unsigned long long g_e6e5a0;
extern long long g_f03880;
extern char g_f0d44c;

unsigned long long sub_e2318(unsigned int a0)
{
    unsigned long long v4;  // x0
    unsigned int v5;  // x9
    unsigned long long v6;  // x12
    unsigned int v7;  // x13
    unsigned long long v8;  // x14
    unsigned long long v9;  // x14
    unsigned long long v10;  // x14
    unsigned int v11;  // w14
    unsigned long v12;  // x15
    st_e2318_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_e2318_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
    {
        return a0;
    }
    else if (*(long long *)(a0 + 80))
    {
        std::__1::mutex::lock(&g_f03880);
        v4 = sub_d6bd0(*(long long *)(a0 + 80));
        if ((unsigned int)v4)
        {
            std::__1::mutex::unlock(&g_f03880);
            return v4;
        }
        v5 = 0;
        v6 = 14424;
        while (1)
        {
            if (g_f0d44c * 72 + 0xffffffffffffe818 != v5)
            {
                v7 = *(long long *)(a0 + 80);
                v8 = v7 + v5;
                if (!*(long long *)(v8 + 8504) && !*(long long *)(v8 + 8512) && (v9 = v7 + v5, !*(long long *)(v9 + 8520) && !*(int *)(v9 + 8468)))
                {
                    v10 = v7 + v5;
                    if (*(int *)(v10 + 8484))
                    {
                        v11 = 1;
                        if (*(long long *)(v7 + v6))
                            goto LABEL_e2444;
                    }
                    else
                    {
                        v11 = *(int *)(v10 + 8500) != 0;
                        if (*(long long *)(v7 + v6))
                            goto LABEL_e2444;
                    }
                }
                else
                {
                    v11 = 1;
                    if (*(long long *)(v7 + v6))
                        goto LABEL_e2444;
                }
                v12 = v7 + v6;
                if (!*(long long *)(v12 + 0x400) && !*(long long *)(v12 + 0x800) && !*(long long *)(v7 + v6 + 4128) && !(v11 & 1))
                {
                    *(unsigned long long *)(v7 + v6) = 3960360;
                    goto *((void *)(g_e6e530));
                }
            }
LABEL_e2444:
            v6 += 8;
            v5 += 72;
            if (v5 == 3096)
                goto *((void *)(g_e6e5a0));
        }
    }
    else
    {
        return 0;
    }
}
