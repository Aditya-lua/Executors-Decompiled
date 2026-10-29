/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9eb9e0..0x9ebaf8 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9eb9e0_1 {
    unsigned long long field_0;
} st_9eb9e0_1;

typedef struct st_9eb9e0_0 {
    struct st_9eb9e0_1 *field_0;
    unsigned int field_8;
} st_9eb9e0_0;


unsigned long long sub_9eb9e0(st_9eb9e0_0 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x20
    unsigned long idx;  // x21
    unsigned long long v5;  // x9
    unsigned long long v6;  // 4119
    unsigned long long i;  // x9
    unsigned long v8;  // x11
    unsigned long long v9;  // 4123
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 1;
    v2 = a1;
    if (*(int *)((char *)&a0[1].field_0 + 4))
    {
        *(unsigned int *)((char *)&a0[1].field_0 + 4) = 0;
        v3 = sub_9ebaf8(a0, v2);
        if (!sub_9e4828(a0))
        {
            *(unsigned int *)((char *)&a0[1].field_0 + 4) = !*(int *)((char *)&a0[1].field_0 + 4);
            return v3;
        }
        return v3;
    }
    idx = a0->field_8;
    if ((int)idx >= 1)
    {
        v5 = *(long long *)a0->field_0;
        *(unsigned long long *)a0->field_0 = v5 + v2;
        v6 = arm64g_calculate_condition(50, v5, v2, 0);
        if (!(v6 & 1))
        {
            i = 8;
            v2 = 1;
            while (((unsigned int)idx & ~((int)((unsigned int)idx) >> 31)) * 8 != i)
            {
                v8 = *(long long *)((char *)a0->field_0 + i);
                *(unsigned long *)((char *)a0->field_0 + i) = v8 + 1;
                i += 8;
                v9 = arm64g_calculate_condition(0x22, v8, 1, 0);
                if (!(v9 & 1))
                    return 1;
            }
            goto LABEL_9ebabc;
        }
    }
    else
    {
LABEL_9ebabc:
        if (!(idx >> 31 & 1))
        {
            v10 = sub_9e4cdc(a0, (unsigned int)idx + 1);
            if (!v10)
                return v10;
            a0->field_8 = a0->field_8 + 1;
            *(unsigned long long *)&a0->field_0[idx] = v2;
        }
    }
    return 1;
}
