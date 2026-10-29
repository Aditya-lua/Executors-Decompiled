/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8b20..0x9d8bd0 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8b20_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9d8b20_0;

typedef struct st_9d8b20_1 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[12];
    struct st_9d8b20_2 *field_40;
} st_9d8b20_1;

typedef struct st_9d8b20_2 {
    struct st_9d8b20_0 *field_0;
} st_9d8b20_2;


unsigned long long sub_9d8b20(st_9d8b20_1 *a0, unsigned long long *a1, unsigned int a2)
{
    unsigned long long *iter;  // x19
    unsigned long v3;  // x9
    unsigned long long v4;  // x2
    unsigned long long v5;  // x8
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = a1;
    v3 = (0xffffffff ^ a0->field_30 >> 6) & 8;
    sub_9d3d58();
    if (*(int *)*(long long *)((char *)a0->field_40 + v3) < (int)a2)
        v4 = *(int *)*(long long *)((char *)a0->field_40 + v3);
    else
        v4 = a2 - 1;
    if ((int)v4 >= 1)
    {
        v5 = 0;
        do
        {
            if (*(char *)(*(long long *)(*(long long *)((char *)a0->field_40 + v3) + 8) + v5) == 10)
                break;
        } while ((v5 += 1, v4 != v5));
        v6 = sub_9d8a38(a0, iter);
        if ((int)v6 < 1)
            return v6;
        iter = (char *)iter + (v6 & 0xffffffff);
    }
    else
    {
        v6 = 0;
    }
    *(char *)iter = 0;
    return v6;
}
