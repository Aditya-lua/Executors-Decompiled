/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7df8c..0xb7e018 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7df8c_0 {
    unsigned long long field_0;
} st_b7df8c_0;

extern unsigned long long g_b81c54;
extern unsigned long long g_b86fc0;
extern unsigned long long g_b944e8;
extern long long g_cba67f;

long long sub_b7df8c(unsigned long long *a0, long long *a1)
{
    unsigned long long v5;  // 4130
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    unsigned long long *v0;  // [bp-0x28]
    st_b7df8c_0 **v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = arm64g_calculate_condition(0x44, *a0, 0, 0);
    if (v5 & 1)
        v6 = *a0 ^ 0x8000000000000000;
    else
        v6 = 1;
    if (!v6)
    {
        v0 = a0 + 1;
        v7 = &g_b86fc0;
    }
    else if (v6 == 1)
    {
        v0 = a0;
        v7 = &g_b944e8;
    }
    else
    {
        v0 = a0 + 1;
        v7 = &g_b81c54;
    }
    v1 = &v0;
    v2 = v7;
    return sub_be769c(*a1, a1[1], &g_cba67f, &v1);
}
