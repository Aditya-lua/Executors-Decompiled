/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a59b8..0x9a5ae4 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a59b8_0 {
    struct st_9a59b8_0 *field_0;
    char padding_8[120];
    struct st_9a59b8_0 *field_80;
} st_9a59b8_0;

typedef struct st_9a59b8_1 {
    char padding_0[120];
    struct st_9a59b8_0 *field_78;
    char padding_80[44];
    unsigned int field_ac;
    char padding_b0[4];
    unsigned int field_b4;
    char padding_b8[56];
    unsigned int field_f0;
    char padding_f4[2940];
    struct st_9a59b8_0 *field_c70;
} st_9a59b8_1;


int sub_9a59b8(st_9a59b8_1 *a0, st_9a59b8_0 *a1)
{
    unsigned long long v2;  // 4131
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(1, (unsigned long long)a1, 1, 0);
    if (!(v2 & 1))
    {
        if (!(int)a0->field_78)
        {
            if (a1)
            {
                if ((a0->field_ac & 0xfffffffe) == 50)
                {
                    if (a0->field_f0 == 4)
                        return 1;
                }
                else
                {
                    return 1;
                }
            }
            else
            {
                if (a0->field_ac != 50)
                    return 1;
            }
            a0->field_b4 = 1;
            if (a0->field_c70 && a0->field_c70->field_80)
                a0->field_c70->field_80();
            if (!a1)
                return 1;
        }
        else if (a0->field_f0 != 12)
        {
            return 1;
        }
        else if (a0->field_ac == 50)
        {
            a0->field_b4 = 1;
            if (!a0->field_c70)
            {
                return 1;
            }
            else if (a0->field_c70->field_80)
            {
                a0->field_c70->field_80();
            }
            else
            {
                return 1;
            }
        }
        else
        {
            return 1;
        }
    }
    else
    {
        if ((a0->field_ac & 0xfffffffe) == 50)
        {
            a0->field_b4 = 1;
            if (a0->field_c70 && a0->field_c70->field_80)
                a0->field_c70->field_80();
        }
        else
        {
            return 1;
        }
    }
    if (a0->field_f0 != 3)
        return 1;
    a0->field_f0 = 7;
    return 1;
}
