/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3eff0..0x3f220 (560 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3eff0_2 {
    char padding_0[8];
    long long field_8;
} st_3eff0_2;

typedef struct st_3eff0_1 {
    char padding_0[32];
    long long field_20;
} st_3eff0_1;

typedef struct st_3eff0_0 {
    char field_0;
} st_3eff0_0;

extern unsigned long long g_e66a88;
extern unsigned long long g_e66a98;
extern unsigned long long g_e66aa8;
extern char g_f0ca50;

long long sub_3eff0(long long *a0, st_3eff0_1 *a1, unsigned long long a2)
{
    st_3eff0_2 *v4;  // x0
    unsigned long long v5;  // x0
    char v14;  // x0
    long long v6;  // x0
    long long len;  // x0
    unsigned long long v8;  // x0
    long long v9;  // x22
    unsigned int v10;  // w0
    long long v11;  // x23
    long long len1;  // x24
    unsigned long long v13;  // x0
    st_3eff0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3eff0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (g_f0ca50 == 1)
    {
        v4 = sub_10160(a0 + 78, &a1->field_20);
        if (v4)
        {
            v5 = sub_46ddc(a0, v4->field_8);
            if (v5 >> 31 & 1)
            {
                v6 = sub_47cd4(a0, v4->field_8);
                sub_2ad10(*a0, 9, a2, v6, 0);
            }
            else if ((unsigned int)a2 != ((unsigned int)v5 & 0xff))
            {
                sub_2ad10(*a0, 6, a2, (unsigned int)v5 & 0xff, 0);
                goto *((void *)(g_e66aa8));
            }
            goto *((void *)(g_e66aa8));
        }
        else
        {
            goto *((void *)(g_e66a88));
        }
    }
    else
    {
        if (sub_44590(a0, a1))
        {
            len = _strlen(a1->field_20);
            v8 = sub_2df40(*a0, a1->field_20, len);
            if (!(v8 >> 31 & 1))
            {
                if (0x3ff >= (unsigned int)v8)
                {
                    v9 = sub_2d798();
                    v10 = sub_2dbc0(*a0, v9);
                    if (v10 <= 0x7fff)
                    {
                        sub_2fdb0(*a0, 12, a2, (short)v10);
                        sub_31514(*a0, v9);
                        goto *((void *)(g_e66aa8));
                    }
                    else
                    {
                        goto *((void *)(g_e66a98));
                    }
                }
                else
                {
                    goto *((void *)(g_e66a98));
                }
            }
        }
        else
        {
            v11 = a1->field_20;
            len1 = _strlen(v11);
            v13 = sub_2df40(*a0, v11, len1);
            if (!(v13 >> 31 & 1))
            {
                v14 = sub_2ffe8(v11, len1);
                sub_2ad10(*a0, 7, a2, 0, v14);
                return sub_31514(*a0, v13);
            }
        }
        sub_45808(&a1->padding_0[12], "Exceeded constant limit; simplify the code to compile");
        __debugbreak();
    }
}
