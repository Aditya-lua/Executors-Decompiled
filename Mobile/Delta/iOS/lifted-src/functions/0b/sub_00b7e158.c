/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7e158..0xb7e1e8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7e158_0 {
    unsigned long long field_0;
} st_b7e158_0;

extern unsigned long long g_b8bc94;
extern unsigned long long g_b8bcc8;
extern unsigned long long g_b960d0;

long long sub_b7e158(st_b7e158_0 **a0, unsigned long a1)
{
    unsigned long long *v5;  // x8
    unsigned long long v6;  // x9
    unsigned long long v7;  // 4143
    unsigned long long v8;  // x9
    unsigned long long *v0;  // [bp-0x28]
    st_b7e158_0 **v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *a0;
    v6 = 2;
    v7 = arm64g_calculate_condition(0x44, *v5, 0, 0);
    if (v7 & 1)
        v6 = *v5 ^ 0x8000000000000000;
    if (!v6)
    {
        v0 = v5;
        v8 = &g_b960d0;
    }
    else if (v6 == 1)
    {
        v0 = v5 + 1;
        v8 = &g_b8bcc8;
    }
    else
    {
        v0 = v5;
        v8 = &g_b8bc94;
    }
    v1 = &v0;
    v2 = v8;
    return sub_be769c();
}
