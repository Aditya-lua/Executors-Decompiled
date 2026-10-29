/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1da644..0x1da71c (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1da644_0 {
    char field_0;
} st_1da644_0;

extern long long g_f10d08;
extern unsigned long long g_f10d18;
extern float g_f10d20;

long long sub_1da644(long long a0, long long a1)
{
    unsigned long long v4;  // 4102
    long long v5;  // x20
    unsigned long long v6;  // w0
    unsigned long long v7;  // x0
    long long v8;  // x0
    long long v9;  // x0
    st_1da644_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1da644_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == 1)
    {
        a1 = 2;
    }
    else if (a1 & a1 - 1)
    {
        a0 = std::__1::__next_prime(a1);
        a1 = a0;
    }
    if ((unsigned long long)a1 > (unsigned long long)g_f10d08)
        return sub_1d6964();
    v4 = arm64g_calculate_condition(36, a1, g_f10d08, 0);
    if (v4 & 1)
        return a0;
    v5 = a1;
    v6 = (unsigned int)sub_10884(g_f10d08);
    v7 = (unsigned long long)((float)g_f10d18 / g_f10d20);
    if (v6)
    {
        v8 = sub_19f1c(v7);
        if ((unsigned long long)v8 >= (unsigned long long)v5)
            v5 = v8;
        if ((unsigned long long)v5 >= (unsigned long long)g_f10d08)
            return v8;
    }
    else
    {
        v9 = std::__1::__next_prime(v7);
        if ((unsigned long long)v9 >= (unsigned long long)v5)
            v5 = v9;
        if ((unsigned long long)v5 >= (unsigned long long)g_f10d08)
            return v9;
    }
    return sub_1d6964();
}
