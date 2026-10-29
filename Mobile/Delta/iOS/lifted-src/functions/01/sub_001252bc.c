/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1252bc..0x12545c (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1252bc_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_1252bc_1;

typedef struct st_1252bc_0 {
    char field_0;
} st_1252bc_0;

extern unsigned long long g_e6ec00;
extern unsigned long long g_e6ec28;
extern long long g_f03880;
extern char g_f0d44c;

st_1252bc_1 * sub_1252bc(st_1252bc_1 *a0)
{
    unsigned int v4;  // x0
    unsigned int v5;  // w8
    unsigned long v6;  // x16
    unsigned long v7;  // x17
    unsigned long v8;  // x17
    unsigned int v9;  // w17
    unsigned long idx;  // x0
    unsigned long v11;  // x1
    unsigned long long v12;  // x16
    st_1252bc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1252bc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
    {
        return a0;
    }
    else if (a0->field_50)
    {
        std::__1::mutex::lock(&g_f03880);
        v4 = sub_105de8(a0->field_50);
        if (!v4)
        {
            v5 = 0x55;
            while (1)
            {
                if (127 < v5)
                {
                    v4 = 0;
                    break;
                }
                if (v5 == g_f0d44c)
                {
                    v5 += 1;
                }
                else
                {
                    v6 = a0->field_50;
                    v7 = v6 + v5 * 72;
                    if (*(long long *)(v7 + 2384) || !(v8 = v7 + 2336, !*(long long *)(v8 + 56) && !*(long long *)(v8 + 64) && !*(int *)(v8 + 12) && !*(int *)(v8 + 28)))
                    {
                        v9 = 1;
                        idx = v5;
                        v11 = v6 + 13744;
                        if (!*(long long *)(v11 + idx * 8))
                            goto LABEL_1253a0;
                    }
                    else
                    {
                        v9 = *(int *)(v8 + 44) != 0;
                        idx = v5;
                        v11 = v6 + 13744;
                        if (!*(long long *)(v11 + idx * 8))
                        {
LABEL_1253a0:
                            v12 = v6 + idx * 8;
                            if (*(long long *)(v12 + 14768))
                            {
                                goto *((void *)(g_e6ec28));
                            }
                            else if (*(long long *)(v12 + 15792))
                            {
                                goto *((void *)(g_e6ec28));
                            }
                            else if (*(long long *)(v12 + 17872) != 0 & 1 | v9 & 1)
                            {
                                goto *((void *)(g_e6ec28));
                            }
                            else
                            {
                                *(unsigned long long *)(v11 + idx * 8) = 3960360;
                                goto *((void *)(g_e6ec00));
                            }
                        }
                    }
                    goto *((void *)(g_e6ec28));
                }
            }
        }
        std::__1::mutex::unlock(&g_f03880);
        return v4;
    }
    else
    {
        return 0;
    }
}
