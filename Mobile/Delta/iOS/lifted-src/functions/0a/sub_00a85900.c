/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa85900..0xa85a88 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a85900_2 {
    unsigned short field_0;
} st_a85900_2;

typedef struct st_a85900_1 {
    uint128_t field_0;
    uint128_t field_10;
} st_a85900_1;

typedef struct st_a85900_0 {
    void* field_0;
    char padding_8[8];
    long long field_10;
    char padding_18[24];
    struct st_a85900_1 *field_30;
    char padding_38[16];
    struct st_a85900_2 *field_48;
} st_a85900_0;

extern char g_10002b0;

long long sub_a85900(long long a0, st_a85900_0 *a1)
{
    unsigned short *v8;  // x21
    unsigned int v9;  // w22
    unsigned int v18;  // w11
    unsigned int v19;  // w9
    unsigned int v10;  // w23
    unsigned int i;  // w25
    unsigned long v12;  // x0
    unsigned long iter;  // x26
    unsigned long v14;  // x8
    char *v15;  // x11
    unsigned int v16;  // w9
    unsigned int v17;  // w10
    uint128_t v0;  // [bp-0x140]
    uint128_t v1;  // [bp-0x130]
    char v2;  // [bp-0x120]
    char v3;  // [bp-0x11f]
    char v4;  // [bp-0x110]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = a1->field_48;
    v9 = (int)a1->field_0[72];
    v0 = a1->field_30->field_0;
    v1 = a1->field_30->field_10;
    if ((int)v9 >= 1)
    {
        v10 = 0;
        while (1)
        {
            i = 0;
            do
            {
                v2 = v10;
                v3 = i;
                v12 = sub_a3fe04(a0, a1->field_10, 0);
                if (!(unsigned int)v12)
                {
                    if (*(long long *)&g_10002b0 == v5)
                        return v12;
                    ___stack_chk_fail();
                }
                v12 = sub_a3fe10(a0, &v0, 0x22);
                if (!(unsigned int)v12)
                {
                    if (*(long long *)&g_10002b0 == v5)
                        return v12;
                    ___stack_chk_fail();
                }
                iter = 0;
                do
                {
                    v12 = sub_a403bc(a0, &v4, 168);
                    if (!(unsigned int)v12)
                    {
                        if (*(long long *)&g_10002b0 == v5)
                            return v12;
                        ___stack_chk_fail();
                    }
                    v14 = 0;
                    do
                    {
                        if (0x1ff < (long long)iter)
                            goto LABEL_a85968;
                        v15 = &(&v4)[v14];
                        v16 = v15[2];
                        v17 = v15[1];
                        v18 = (*v15 | (v17 * 0x100 | v17 >> 24) & 0xf00) & 0xfff;
                        if (0xd00 < v18)
                            continue;
                        *(unsigned short *)((char *)v8 + iter) = v18;
                        if (509 < (long long)iter)
                            goto LABEL_a85968;
                        iter += 2;
                        v19 = v17 >> 4 | v16 * 16;
                        if (0xd00 >= v19)
                        {
                            *(unsigned short *)((char *)v8 + iter) = v19;
                            iter += 2;
                        }
                        v14 += 3;
                    } while (165 > v14 - 3);
                } while ((long long)iter < 0x200);
LABEL_a85968:
                v8 += 0x100;
                i += 1;
            } while (i != v9);
            v10 += 1;
            if (v10 == v9)
            {
                if (*(long long *)&g_10002b0 == v5)
                    return 1;
                ___stack_chk_fail();
            }
        }
    }
    else
    {
        if (*(long long *)&g_10002b0 == v5)
            return 1;
        ___stack_chk_fail();
    }
}
