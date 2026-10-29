/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99f9b0..0x99fa14 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99f9b0_0 {
    char padding_0[768];
    struct st_99f9b0_1 *field_300;
    char padding_308[1706];
    char field_9b2;
    char padding_9b3[353];
    unsigned int field_b14;
} st_99f9b0_0;

typedef struct st_99f9b0_1 {
    char padding_0[36];
    unsigned int field_24;
    unsigned int field_28;
} st_99f9b0_1;

extern unsigned int g_400000;
extern unsigned int g_800000;

int sub_99f9b0(st_99f9b0_0 *a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // 4102

    if (a0->field_9b2 >> 3 & 1)
    {
        return 1;
    }
    else if (a0->field_300->field_28 == 64)
    {
        return 1;
    }
    else
    {
        v0 = a0->field_300->field_24;
        if ((int)v0 >= 0x40000)
        {
            v1 = arm64g_calculate_condition(3, v0, 0x40000, 0);
            if (v1 & 1)
                return 1;
            if (v0 == &g_400000)
                return 1;
            if (v0 == &g_800000)
                return 1;
        }
        else if (v0 == 4)
        {
            return 1;
        }
        else if (v0 == 0x400)
        {
            return 1;
        }
        a0->field_b14 = 1;
        return 1;
    }
}
