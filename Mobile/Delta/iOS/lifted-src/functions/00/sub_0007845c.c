/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7845c..0x78620 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7845c_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_7845c_0;

extern st_7845c_0 g_cbef70;
extern unsigned long long g_e6b0e8;
extern unsigned long long g_e6b0f8;

unsigned long long sub_7845c(short *a0, unsigned int a1, unsigned int *a2, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // w8
    unsigned long long v12;  // x5
    unsigned long idx;  // x1
    unsigned long long v14;  // x6
    short v15;  // x7
    unsigned int v16;  // w5
    unsigned int v17;  // w11
    unsigned long v18;  // x6
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long long v21;  // 4108
    unsigned int v4;  // w9
    unsigned long long v22;  // 4108
    unsigned long long v23;  // 4106
    unsigned long long v5;  // w9
    unsigned long long v6;  // w1
    unsigned long long v7;  // w8
    unsigned long long v8;  // x11
    unsigned short v9;  // x9
    char v10;  // x13
    unsigned long long v11;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        a1 = 11;
    if (5 > a1)
        return 0xffffffffffffffff;
    if (a1 > 12)
        return 0xffffffffffffffd4;
    if (!((a3 & 0xffffffff) * 0x100000000))
        v2 = 32;
    else
        v2 = Clz((a3 & 0xffffffff) * 0x100000000);
    v3 = (unsigned int)(32 - v2);
    if (!(a4 * 0x100000000))
        v4 = 32;
    else
        v4 = Clz(a4 * 0x100000000);
    v5 = 33 - v4;
    if (v3 >= v5)
        v3 = v5;
    if (a1 < v3)
        return 0xffffffffffffffff;
    v6 = 0;
    v7 = 0;
    v8 = 0;
    if (!a5)
        v9 = 1;
    else
        v9 = 0xfffe;
    v10 = 62 - a1;
    v11 = 1 << ((char)a1 & 31);
    do
    {
        v12 = a2[v6];
        if (v12 == a3)
            goto *((void *)(g_e6b0e8));
        idx = v6;
        if (!(unsigned int)v12)
        {
            a0[idx] = 0;
            continue;
        }
        if ((unsigned int)v12 > (unsigned int)(a3 >> ((char)a1 & 63)))
        {
            v14 = v12 * 0x4000000000000000 / (a3 & 0xffffffff);
            v15 = v14 >> (v10 & 63);
            v16 = v15;
            if (7 >= (int)v16 && v14 - (v15 << (v10 & 63)) > (&g_cbef70.field_0)[v15] << (v10 - 20 & 63))
                v16 += 1;
            v17 = v8;
            v18 = (short)v16;
            v19 = v18 & 0xffffffff;
            v20 = v17;
            if ((int)v17 < (int)v18)
            {
                v7 = (unsigned int)idx;
                v21 = arm64g_calculate_condition(195, v19, v20, 0);
                if (!(v21 & 1))
                    goto LABEL_78586;
            }
            else
            {
                v7 = v7;
                v22 = arm64g_calculate_condition(195, v19, v20, 0);
                if (!(v22 & 1))
                {
LABEL_78586:
                    v8 = (unsigned short)v17;
LABEL_78588:
                    a0[idx] = v16;
                    v11 -= v18;
                    continue;
                }
            }
            v8 = (unsigned short)v18;
            goto LABEL_78588;
        }
        else
        {
            a0[idx] = v9;
            v11 = (unsigned int)v11 - 1;
        }
    } while ((v6 = (unsigned int)idx + 1, a4 >= v6));
    if (a0[v7] >> 1 > (int)-(unsigned int)v11)
    {
        a0[v7] = a0[v7] + (unsigned short)v11;
    }
    else
    {
        v23 = arm64g_calculate_condition(0x22, sub_78af4(), 0x77, 0);
        if (v23 & 1)
            goto *((void *)(g_e6b0e8));
    }
    goto *((void *)(g_e6b0f8));
}
