/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c5450..0x1c55b8 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c5450_0 {
    char field_0;
} st_1c5450_0;

extern unsigned long long g_e72320;
extern unsigned long long g_e72328;
extern unsigned long long g_e72378;
extern char g_10002b0;

unsigned long long sub_1c5450(unsigned long a0, long long a1)
{
    unsigned long long *v11;  // x22
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    st_1c5450_0 **v0;  // [bp-0x890], Other Possible Types: char
    st_1c5450_0 *v1;  // [bp-0x888]
    unsigned long v2;  // [bp-0x880]
    char *v3;  // [bp-0x878]
    unsigned long long v4;  // [bp-0x870]
    unsigned long long v5;  // [bp-0x868]
    unsigned long long v6;  // [bp-0x858]
    char v7;  // [bp-0x848]
    unsigned long v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v3 = &v7;
    v4 = 0x800;
    v5 = 0;
    v6 = 0;
    v11 = &g_e72320;
    if (!(sub_1c2800(&v2) & 1))
    {
        if (*(long long *)&g_10002b0 == v8)
            return 0;
        __Unwind_Resume(___stack_chk_fail());
    }
    else if (sub_1bd2ac(&v2))
    {
        if (sub_1af75c(&v2) != 2)
        {
            if (0x2000 >= sub_1af75c(&v2))
            {
                v12 = sub_1a7f50(&v2);
                v13 = sub_1af75c(&v2);
                if (sub_1bca84(sub_1a7f50(&v2), v12 + v13 - 2, a1) & 1)
                    goto *((void *)(g_e72328));
            }
            v11 = &g_e72378;
        }
        goto *((void *)(*v11));
    }
    else
    {
        goto *((void *)(g_e72328));
    }
}
