/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99b03c..0x99b118 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99b03c_0 {
    char padding_0[136];
    unsigned long long field_88;
} st_99b03c_0;

typedef struct st_99b03c_1 {
    char padding_0[2176];
    struct st_99b03c_0 *field_880;
} st_99b03c_1;

extern void g_e88ef8;

unsigned long long sub_99b03c(st_99b03c_1 *a0, unsigned long long a1, long long a2, long long a3, long long a4, unsigned int a5)
{
    unsigned long long v2;  // 4173
    unsigned int v3;  // x25
    unsigned long long v4;  // x0
    void* v5;  // x22
    unsigned long long v6;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(2, a0->field_880->field_88, 29, 0);
    if (!(v2 & 1))
    {
        v3 = 0;
        do
        {
            v4 = sub_99af14(a0, v3, a1, a2, a3, a4);
            if (!(unsigned int)v4)
                return v4;
        } while ((v3 += 1, a0->field_880->field_88 + 29 != v3));
    }
    if (a5)
    {
        v5 = &g_e88ef8;
        v6 = 16;
        do
        {
            if (*(long long *)v5 && *(int *)((char *)v5 - 44) & (unsigned int)a1)
                (*(long long *)v5)();
        } while ((v5 += 56, v6 += 40, v6 != 1176));
    }
    return 1;
}
