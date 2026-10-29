/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x23680c..0x236970 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_23680c_0 {
    char field_0;
} st_23680c_0;

extern long long g_f03880;
extern char g_f0d44c;

unsigned int sub_23680c(unsigned int a0)
{
    unsigned int v4;  // x0
    unsigned int v5;  // x8
    unsigned long long v6;  // x10
    unsigned int v7;  // x11
    unsigned long long v8;  // x12
    unsigned long long v9;  // x12
    unsigned long long v10;  // x12
    unsigned int v11;  // w12
    unsigned long v12;  // x13
    st_23680c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_23680c_0 *v1;  // [bp-0x28]
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
        v4 = sub_234b78(*(long long *)(a0 + 80));
        if (!v4)
        {
            v5 = 0;
            v4 = 0x55;
            v6 = 14424;
            do
            {
                if (0xffffffffffffe818 + g_f0d44c * 72 == v5)
                    continue;
                v7 = *(long long *)(a0 + 80);
                v8 = v7 + v5;
                if (!*(long long *)(v8 + 8504) && !*(long long *)(v8 + 8512) && (v9 = v7 + v5, !*(long long *)(v9 + 8520) && !*(int *)(v9 + 8468) && (v10 = v7 + v5, !*(int *)(v10 + 8484))))
                {
                    v11 = *(int *)(v10 + 8500) != 0;
                    if (*(long long *)(v7 + v6))
                        continue;
                }
                else
                {
                    v11 = 1;
                    if (*(long long *)(v7 + v6))
                        continue;
                }
                v12 = v7 + v6;
                if (!*(long long *)(v12 + 0x400) && !*(long long *)(v12 + 0x800) && !*(long long *)(v7 + v6 + 4128) && !(v11 & 1))
                {
                    *(unsigned long long *)(v7 + v6) = 3960360;
                    goto LABEL_236944;
                }
            } while ((v4 += 1, v6 += 8, v5 += 72, v5 != 3096));
            v4 = 0;
        }
LABEL_236944:
        std::__1::mutex::unlock(&g_f03880);
        return v4;
    }
    else
    {
        return 0;
    }
}
