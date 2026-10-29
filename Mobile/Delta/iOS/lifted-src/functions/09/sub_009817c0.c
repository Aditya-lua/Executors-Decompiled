/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9817c0..0x9818e4 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9817c0_0 {
    unsigned long long field_0;
    char field_8;
    char field_9;
    char field_a;
} st_9817c0_0;


void* sub_9817c0(void* a0, st_9817c0_0 *a1, long long a2)
{
    unsigned long v4;  // x8
    void* v5;  // x0
    unsigned long long v6;  // 4120
    unsigned int iter;  // x21
    void* v8;  // x0
    unsigned long long v9;  // x8
    unsigned int v0;  // [bp-0x40]
    unsigned int v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    a1->field_8 = 1 & ~(char)a0[154];
    *(unsigned short *)&a1->field_9 = 0;
    a1->field_0 = 0xffffffffffffffff;
    if (*(char *)(*(long long *)a0 + 160) & 1)
        return a0;
    v4 = (short)a0[154];
    v5 = a0;
    if (!(v4 & 1))
    {
        v5 = a0;
        if ((unsigned int)v4 & 24)
        {
            v5 = a0;
            v6 = arm64g_calculate_condition(0x11, sub_97b360((long long)a0[64]) & 0xffffffff, 2, 0);
            if (!(v6 & 1))
            {
                sub_9818e4(a0, 0);
                v5 = a0;
            }
        }
    }
    iter = (long long)v5[72];
    if (!iter)
        return v5;
    do
    {
        v0 = 0;
        v1 = 0;
        v8 = sub_9773e4(iter, &v0, a2);
        a1->field_8 = a1->field_8 || (char)v1;
        a1->field_9 = a1->field_9 || *(char *)((void*)&v1 + 1);
        a1->field_a = a1->field_a || *(char *)((void*)&v1 + 2);
        v9 = a1->field_0;
        if (a1->field_0 >= v0)
            v9 = v0;
    } while ((a1->field_0 = v9, iter = *(long long *)(iter + 8), iter));
    return v8;
}
