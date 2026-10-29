/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b1b7c..0x9b1cd8 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b1b7c_1 {
    unsigned int field_0;
    char padding_4[212];
    struct st_9b1b7c_0 *field_d8;
} st_9b1b7c_1;

typedef struct st_9b1b7c_2 {
    char padding_0[24];
    struct st_9b1b7c_1 *field_18;
    char padding_20[40];
    int field_48;
    char padding_4c[2440];
    int field_9d4;
} st_9b1b7c_2;

typedef struct st_9b1b7c_3 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9b1b7c_4 *field_8;
    char padding_10[8];
    unsigned int field_18;
} st_9b1b7c_3;

typedef struct st_9b1b7c_0 {
    char padding_0[80];
    char field_50;
} st_9b1b7c_0;

typedef struct st_9b1b7c_4 {
    unsigned long long field_0;
} st_9b1b7c_4;

extern st_9b1b7c_3 g_e89520;
extern st_9b1b7c_3 g_e895b0;

unsigned long long sub_9b1b7c(st_9b1b7c_2 *a0)
{
    st_9b1b7c_1 *v2;  // x8
    st_9b1b7c_3 *v3;  // x8
    int v4;  // w21
    unsigned int *v5;  // x22
    unsigned int *v6;  // x22
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)&a0->padding_4c[532] && *(long long *)&a0->padding_4c[668])
        return 0;
    v2 = a0->field_18;
    if (a0->field_18->field_0 != 0x10000)
    {
        if (a0->field_18->field_0 != 0x1ffff)
        {
            v4 = a0->field_48;
            a0->field_48 = v4;
            if (!(v2->field_d8->field_50 >> 3 & 1))
            {
                if (v4 >= 0x303)
                    v4 = 0x303;
            }
            else if (v4 == 0x100)
            {
                v7 = sub_c64b00(a0, 0x100);
                if (!(unsigned int)v7)
                    return v7;
            }
            a0->field_9d4 = v4;
            return 0;
        }
        v3 = &g_e895b0.field_0;
        if (g_e895b0.field_0)
            goto LABEL_9b1bf0;
    }
    else
    {
        v3 = &g_e89520.field_0;
        if (g_e89520.field_0)
        {
LABEL_9b1bf0:
            v4 = 0;
            v5 = &v3->field_18;
            do
            {
                v6 = v5;
                if (*(long long *)((char *)v6 - 16))
                    (*(long long *)((char *)v6 - 16))();
                v5 = v6 + 6;
            } while (*v6);
        }
    }
    return 191;
}
