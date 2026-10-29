/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e203c..0x9e219c (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e203c_1 {
    unsigned long long field_0;
} st_9e203c_1;

typedef struct st_9e203c_0 {
    struct st_9e203c_1 *field_0;
    unsigned int field_8;
} st_9e203c_0;

extern char g_10002b0;

unsigned long long sub_9e203c(long long a0, long long a1, st_9e203c_0 *a2)
{
    unsigned long v4;  // x9
    unsigned long long v5;  // w8
    unsigned long long v15;  // 4121
    unsigned long v16;  // cc_dep1
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4125
    unsigned long long v22;  // x0
    unsigned long long *v6;  // x10
    unsigned int v7;  // w11
    unsigned long v8;  // x9
    unsigned long idx;  // x13
    unsigned long long v10;  // x14
    unsigned long long v11;  // x15
    unsigned int v12;  // w16
    unsigned int v13;  // w17
    unsigned int v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (sub_9e5c70(a2))
    {
        v4 = a2->field_8;
        if ((int)v4 >= 1)
        {
            v5 = 0;
            v6 = a2->field_0;
            v7 = (unsigned int)v4 * 64 - 1;
            do
            {
                v8 = v4;
                idx = v8 - 1;
                v10 = v6[idx];
                if (v10)
                {
                    v11 = 0x8000000000000000;
                    v12 = 0xffffffc0;
                    v13 = v7;
                    do
                    {
                        if (v11 & v10)
                        {
                            if (5 >= v5)
                                (&v0)[v5] = v13;
                            v5 += 1;
                        }
                    } while ((v11 >>= 1, v13 -= 1, v15 = arm64g_calculate_condition(33, v12, 1, 0), v12 += 1, !(v15 & 1)));
                }
            } while ((v7 -= 64, v4 = idx, (long long)v8 > 1));
            v16 = v5;
            if (v5 >= 1)
            {
                if ((int)v0 <= 661)
                {
                    v17 = arm64g_calculate_condition(211, v16, 1, 0);
                    v18 = arm64g_calculate_condition(147, (v17 & 1 ? v5 : 0x20000000), (v17 & 1 ? 5 : 0), 0);
                    if (!(v18 & 1))
                        goto LABEL_9e213c;
                }
                else
                {
                    v19 = arm64g_calculate_condition(211, v16, 1, 0);
                    v20 = arm64g_calculate_condition(144, (v19 & 1 ? v5 : 0x20000000), (v19 & 1 ? 5 : 0), 0);
                    if (!(v20 & 1))
                        goto LABEL_9e213c;
                }
            }
        }
        else
        {
            v5 = 0;
        }
        (&v0)[v5] = 0xffffffff;
        v21 = arm64g_calculate_condition(1, v5, 1, 0);
        if (!(v21 & 1))
        {
            v22 = sub_9e1d7c(a0, a1, &v0);
            if (*(long long *)&g_10002b0 == v1)
                return v22;
            ___stack_chk_fail();
        }
    }
LABEL_9e213c:
    sub_a368c8();
    sub_a369bc("crypto/bn/bn_gf2m.c", 389, "BN_GF2m_mod");
    sub_a36abc(3, 106, 0);
    if (*(long long *)&g_10002b0 == v1)
        return 0;
    ___stack_chk_fail();
}
