/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc133dc..0xc135b0 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c133dc_0 {
    char padding_0[16];
    unsigned int field_10;
} st_c133dc_0;

extern char g_e0eb50;

long long sub_c133dc(unsigned short *a0, st_c133dc_0 *a1)
{
    unsigned long v3;  // x10
    unsigned long v4;  // x9
    long long v13;  // x13
    unsigned long v14;  // x14
    unsigned long v15;  // x12
    long long v16;  // x13
    unsigned long v17;  // x14
    unsigned long long v5;  // 4119
    unsigned int v6;  // w13
    unsigned int v7;  // w12
    unsigned int v8;  // w11
    unsigned int v9;  // w14
    long long v10;  // x11
    long long v11;  // x1
    st_c133dc_0 *v12;  // x0
    unsigned int v18;  // [bp-0x1d]
    uint40_t v0;  // [bp-0x19]
    unsigned int v19;  // [bp-0x14]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1->field_10;
    if (!(v3 >> 25 & 1))
    {
        v4 = *a0;
        if (!(v3 >> 26 & 1))
        {
            v5 = arm64g_calculate_condition(83, v4 & 0xffffffff, 0, 0);
            if (v5 & 1)
                v6 = v4;
            else
                v6 = -(unsigned int)v4;
            if (v6 >= 1000)
            {
                v7 = 839 * (__ROL__(v6, 28) & 0xf0000fff & 0xfff) >> 19;
                v8 = v6 - 10000 * v7;
                v9 = 5243 * (__ROL__(v8, 30) & 0xc0003fff & 0x3fff) >> 0x11;
                *(short *)((char *)&v0 + 1) = *(short *)(2 * v9 + 14721940);
                v10 = 1;
                *(short *)((char *)&v0 + 3) = *(short *)(2 * (v8 - 100 * v9 & 0xffff) + 14721940);
                if ((unsigned int)v4)
                    goto LABEL_c1355c;
            }
            else if ((unsigned short)v6 >= 10)
            {
                v7 = 5243 * (__ROL__(v6, 30) & 0xc0003fff & 0x3fff) >> 0x11;
                v10 = 3;
                *(short *)((char *)&v0 + 3) = *(short *)(2 * (v6 - 100 * v7 & 0xffff) + 14721940);
                if ((unsigned int)v4)
                    goto LABEL_c1355c;
            }
            else
            {
                v10 = 5;
                v7 = v6;
                if ((unsigned int)v4)
                {
LABEL_c1355c:
                    if (!(v7 & 0xffff))
                        goto LABEL_c1357c;
                }
            }
            *((char *)&v0 + v10 - 1) = *(char *)((__ROL__(v7, 1) & 30 & 31) + 14721941);
LABEL_c1357c:
            v11 = __ROL__((unsigned int)v4, 0x11) & 0xfffe0001 & 1 ^ 1;
            v12 = a1;
        }
        else
        {
            v13 = 3;
            do
            {
                v14 = __ROL__((unsigned int)v4, 28) & 0xf0000fff & 0xfff;
                *((char *)&v19 + v13) = *(char *)((v4 & 15) + 14740256);
                v13 -= 1;
                v4 = v14;
            } while ((unsigned int)v4);
LABEL_c134e8:
            v12 = a1;
            v11 = 1;
        }
    }
    else
    {
        v15 = *a0;
        v16 = 3;
        do
        {
            v17 = (unsigned int)v15 >> 4;
            *((char *)&v18 + v16) = (&g_e0eb50)[v15 & 15];
            v16 -= 1;
            v15 = v17;
        } while ((unsigned int)v15);
        goto LABEL_c134e8;
    }
    return sub_be8310(v12, v11);
}
