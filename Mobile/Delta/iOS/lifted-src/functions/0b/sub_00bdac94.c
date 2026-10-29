/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdac94..0xbdad7c (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdac94_0 {
    char padding_0[16];
    long long field_10;
} st_bdac94_0;


double sub_bdac94(void* a0, st_bdac94_0 *a1, long long a2, long long a3, long long *a4)
{
    unsigned long v4;  // d0
    unsigned long long v5;  // 4102
    unsigned long v6;  // d0
    unsigned long v7;  // d0
    long long v8;  // x0
    unsigned long long v9;  // 4102
    uint128_t v0;  // [bp-0x38]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ >= 0)
    {
        if (sub_bce208(a3, a4, a1->field_10 - (a1->field_10 != 0)))
        {
            sub_b9ebec(&v0, a4[1], a4[2]);
            *(uint128_t *)&a0[8] = v0;
            *(unsigned long *)&a0[24] = v1;
            *(long long *)a0 = a2;
            return v4;
        }
        *(unsigned long *)&a0[8] = 0x8000000000000000;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (v5 & 1)
            return v7;
        /* unsupported instruction */;
        sub_b86a90();
        return v6;
    }
    v8 = sub_c769bc();
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v9 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (!(v9 & 1))
    {
        /* unsupported instruction */;
        sub_b86a90(a2);
    }
    __Unwind_Resume(v8);
}
