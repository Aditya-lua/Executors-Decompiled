/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95efcc..0x95f0c4 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95efcc_0 {
    unsigned int field_0;
    char padding_4[68];
    unsigned int field_48;
    char padding_4c[2876];
    struct st_95efcc_1 *field_b88;
} st_95efcc_0;

typedef struct st_95efcc_1 {
    char padding_0[48];
    long long field_30;
    char padding_38[952];
    long long field_3f0;
} st_95efcc_1;

extern char g_10002b0;

unsigned long long sub_95efcc(st_95efcc_0 *a0, unsigned long a1, unsigned int a2)
{
    unsigned long v6;  // x8
    st_95efcc_0 *v8;  // x19
    unsigned long long v9;  // x0
    unsigned int v0;  // [bp-0x3d8]
    unsigned long v1;  // [bp-0x188]
    char v2;  // [bp-0x180]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (a0)
    {
        v6 = a0->field_0;
        if (!(unsigned int)v6)
        {
LABEL_95f014:
            if (32 >= a2)
            {
                if (a0)
                {
                    v0 = a0->field_48;
                    v1 = a2;
                    ___memcpy_chk(&v2);
                    v8 = a0;
                    if (sub_a7c17c(v8->field_b88->field_3f0))
                    {
                        v9 = sub_a66b6c(v8->field_b88->field_30, &v0);
                        sub_a7c1b4(v8->field_b88->field_3f0);
                        if (*(long long *)&g_10002b0 == v3)
                            return v9 != 0;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return 0;
                    ___stack_chk_fail();
                }
            }
            else
            {
                if (*(long long *)&g_10002b0 == v3)
                    return 0;
                ___stack_chk_fail();
            }
        }
        else if (v6 >> 7 & 1)
        {
            a0 = sub_980dc8();
            goto LABEL_95f014;
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return 0;
    ___stack_chk_fail();
}
