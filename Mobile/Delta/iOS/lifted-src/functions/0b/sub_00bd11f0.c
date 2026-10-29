/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd11f0..0xbd12f8 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd11f0_1 {
    struct st_bd11f0_1 *field_0;
    char padding_8[352];
    unsigned short field_168;
    unsigned short field_16a;
    char padding_16c[4];
    struct st_bd11f0_1 *field_170;
} st_bd11f0_1;

typedef struct st_bd11f0_0 {
    char *field_0;
    struct st_bd11f0_1 *field_8;
    struct st_bd11f0_1 *field_10;
    struct st_bd11f0_1 *field_18;
    char padding_20[32];
    struct st_bd11f0_1 *field_40;
} st_bd11f0_0;

extern long long g_efa258;
extern long long g_efa2a0;

char * sub_bd11f0(st_bd11f0_0 *a0)
{
    char *v2;  // x8
    char *iter;  // x10
    char *v12;  // x12
    char *v13;  // x9
    char *v4;  // x9
    char *v5;  // x8
    char *i;  // x8
    char *v7;  // x8
    char *v9;  // x11
    unsigned long v10;  // x13
    char *j;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_40;
    if (!v2)
        return v2;
    a0->field_40 = v2 - 1;
    if (a0->field_0 == 1)
    {
        iter = a0->field_8;
        if (iter)
        {
            v4 = a0->field_10;
            v5 = a0->field_18;
            if (*(short *)&iter[362] <= v5)
                goto LABEL_bd126c;
LABEL_bd122c:
            v9 = iter;
        }
        else
        {
            iter = a0->field_10;
            i = a0->field_18;
            if (a0->field_18)
            {
                do
                {
                    v7 = i;
                    iter = *(long long *)&iter[368];
                    i = v7 - 1;
                } while (i);
            }
            v5 = 0;
            v4 = 0;
            a0->field_0 = 1;
            a0->field_8 = iter;
            a0->field_10 = 0;
            a0->field_18 = 0;
            if (0 < *(short *)&iter[362])
                goto LABEL_bd122c;
            do
            {
LABEL_bd126c:
                v9 = *(long long *)iter;
                if (!v9)
                {
                    sub_c73c64(&g_efa258);
                    __debugbreak();
                }
            } while ((v4 += 1, v5 = *(short *)&iter[360], iter = v9, *(short *)&v9[362] <= (unsigned int)v5));
        }
        if (v4)
        {
            v10 = v9 + 0x8 * v5 + 376;
            do
            {
                j = v4;
                v12 = *(long long *)v10;
                v10 = v12 + 368;
                v13 = j - 1;
                v4 = v13;
            } while (j != 1);
        }
        else
        {
            v13 = v5 + 1;
            v12 = v9;
        }
        a0->field_8 = v12;
        a0->field_10 = 0;
        a0->field_18 = v13;
        return v9 + 0x18 * v5 + 8;
    }
    sub_c73c64(&g_efa2a0);
    __debugbreak();
}
