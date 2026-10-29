/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4eda0..0xc4f5a8 (2056 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4eda0_0 {
    long long field_0;
    unsigned long long field_8;
} st_c4eda0_0;

typedef struct st_c4eda0_1 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_c4eda0_1;

extern char g_c4f0d0;
extern st_c4eda0_1 g_e070b0;

st_c4eda0_0 * sub_c4eda0(st_c4eda0_0 *a0, void* a1)
{
    unsigned int v2;  // w8
    long long v3;  // x8
    unsigned long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (short)a1[24];
    if (8496 >= (int)v2)
    {
        if (138 >= v2 - 2)
            goto *((void *)(sub_c4ede0 + *(short *)((char *)&(&g_e070b0.field_0)[v2] - 4) * 4));
        else
            goto *((void *)(&(&g_c4f0d0)[4 * *(short *)(2 * *(long long *)a1 + 14709190)]));
    }
    else
    {
        if (v2 == 8497)
        {
            v3 = *(long long *)a1;
            if (4 >= v3)
            {
                if (v3 != 2)
                {
                    if (v3 != 3)
                    {
                        if (v3 != 4)
                            goto *((void *)(&(&g_c4f0d0)[4 * *(short *)(2 * v3 + 14709190)]));
                        else
                            v5 = (int)a1[8];
                    }
                    else
                    {
                        v5 = (short)a1[8];
                    }
                }
                else
                {
                    v5 = (char)a1[8];
                }
            }
            else
            {
                if (v3 != 5)
                {
                    if (v3 != 6)
                    {
                        if (v3 != 7)
                            goto *((void *)(&(&g_c4f0d0)[4 * *(short *)(2 * v3 + 14709190)]));
                    }
                    else
                    {
                        v5 = (long long)a1[8];
                        if ((long long)v5 < 0)
                        {
                            a0->field_8 = v5;
                            a0->field_0 = 6;
                            return a0;
                        }
                    }
                }
                else
                {
                    v5 = (long long)a1[8];
                }
            }
            a0->field_8 = v5;
            a0->field_0 = 45;
            return a0;
        }
        else if (v2 != 8498)
        {
            if (v2 != 8499)
            {
                goto *((void *)(&(&g_c4f0d0)[4 * *(short *)(2 * *(long long *)a1 + 14709190)]));
            }
            else if (*(long long *)a1 != 10)
            {
                goto *((void *)(&(&g_c4f0d0)[4 * *(short *)(2 * *(long long *)a1 + 14709190)]));
            }
            else
            {
                a0->field_8 = (long long)a1[8];
                a0->field_0 = 11;
                return a0;
            }
        }
        else
        {
            if (*(long long *)a1 != 10)
            {
                goto *((void *)(&(&g_c4f0d0)[4 * *(short *)(2 * *(long long *)a1 + 14709190)]));
            }
            else
            {
                a0->field_8 = (long long)a1[8];
                a0->field_0 = 23;
                return a0;
            }
        }
    }
}
