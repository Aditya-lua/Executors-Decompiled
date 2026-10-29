/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x83010..0x831e8 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_83010_0 {
    char field_0;
} st_83010_0;

extern unsigned long long g_e6ba78;
extern unsigned long long g_e6bad8;

unsigned long long sub_83010(unsigned long a0, long long a1, long long a2, unsigned long long a3, unsigned long long a4, long long a5, long long a6, long long a7, unsigned long a8, unsigned int a9)
{
    unsigned int v3;  // w8
    unsigned long v4;  // 4112
    unsigned long long v13;  // x8
    unsigned long long *v14;  // x8
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // 4112
    unsigned long long v8;  // 4105
    char v9;  // x1
    unsigned long long v10;  // x23
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    st_83010_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_83010_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]

    v2 = &a8;
    v3 = *(unsigned int *)((void*)&a8 + 4);
    v1 = &v0;
    v0 = &v1;
    if (a3 == a4)
    {
        *(unsigned int *)a0 = 0;
        if (a3 <= 2)
        {
            v4 = arm64g_calculate_condition(148, a3, a4, 0);
            v5 = 3;
            v6 = (v4 & 1 ? v3 : 0x40000000);
        }
        else
        {
            v7 = arm64g_calculate_condition(148, a3, a4, 0);
            v5 = 0;
            v6 = (v7 & 1 ? v3 : 0x40000000);
        }
        v8 = arm64g_calculate_condition(v5 | 16, v6, 0, 0);
        return !(v8 & 1);
    }
    v9 = a8;
    if (3 < a9)
    {
        if (v3)
        {
            v10 = sub_83b18(a7);
            if (!*(int *)a0)
                goto LABEL_830f8;
LABEL_830d4:
            v11 = sub_83bf8(a6, a1, a2);
        }
        else
        {
            v10 = 0xffffffffffffffff;
            if (*(int *)a0)
                goto LABEL_830d4;
LABEL_830f8:
            v11 = 0xffffffffffffffff;
        }
        v12 = sub_833bc(a1, a2, a4, a5);
        v13 = sub_83488(a1, a2, a4) + v12 * 8;
        if (v11 >= v10 && v13 >= v10)
        {
            *(unsigned int *)a0 = 0;
            goto *((void *)(g_e6bad8));
        }
        if (v13 < v11)
            v14 = &g_e6ba78;
        else
            v14 = &g_e6bad8;
        goto *((void *)(*v14));
    }
    else if (v3)
    {
        if (999 >= a4 && *(int *)a0 == 2)
            goto *((void *)(g_e6bad8));
        if (a4 >= 10 - a9 << (v9 & 63) >> 3 && a4 >> (v9 - 1 & 63) <= a3)
            goto *((void *)(g_e6ba78));
        *(unsigned int *)a0 = 0;
        goto *((void *)(g_e6bad8));
    }
    else
    {
        *(unsigned int *)a0 = 1;
        return 2;
    }
}
