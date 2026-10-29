/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f200..0xa4f300 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4f200_0 {
    long long field_0;
    unsigned int field_8;
    long long field_c;
    long long field_10;
} st_a4f200_0;

extern long long g_7fffff;

long long sub_a4f200(long long a0, unsigned long a1, st_a4f200_0 *a2)
{
    long long v3;  // w21
    long long v4;  // x21
    long long v5;  // x22
    unsigned long long v6;  // 4124
    long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = (&a2->field_8)[1];
    if ((&a2->field_8)[1])
    {
LABEL_a4f22c:
        if (v3 > &g_7fffff)
            return 0;
        v6 = arm64g_calculate_condition(49, a2->field_8 - 0x100, 0xff, 0);
        if (v6 & 1)
        {
            return 0;
        }
        else if (a0 || sub_a6820c(a2->field_0, 0))
        {
            if (!sub_aa57f0())
                v0 = 0;
            return v0;
        }
    }
    else
    {
        if (!a2->field_c)
            return a2->field_c;
        v4 = sub_a68f38(a2->field_0);
        v5 = a2->field_c;
        if (!_strchr(v5, 58))
        {
            _strlen(v5);
            if (v4)
            {
LABEL_a4f2c8:
                v3 = (unsigned int)sub_a69060(v4, v5);
                if (v3)
                    goto LABEL_a4f22c;
            }
        }
        else if (v4)
        {
            goto LABEL_a4f2c8;
        }
    }
    return 0;
}
