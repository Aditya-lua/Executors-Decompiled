/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b6564..0x1b6634 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b6564_0 {
    char field_0;
} st_1b6564_0;

extern unsigned long long g_e719b0;
extern unsigned long long g_e719b8;

char * sub_1b6564(unsigned long a0, char *a1, char *a2)
{
    char *v4;  // x9
    unsigned long v5;  // cc_op
    unsigned int v6;  // w8
    unsigned int v7;  // w10
    unsigned long long v8;  // x10
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    st_1b6564_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b6564_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = a1 + 1;
    v5 = 4;
    if (v4 != a2)
    {
        v6 = *a1;
    }
    else
    {
        v6 = *a1;
        v5 = 3;
        v4 = v6 & 0xff;
        a2 = 36;
        if (v6 == 36)
            goto *((void *)(g_e719b0));
    }
    v7 = v6 - 46;
    v8 = 1 << ((char)v7 & 63) & 0x7fffffffffff & 0xffffe00000000001;
    if (v7 <= 46)
    {
        v9 = arm64g_calculate_condition(v5 | 144, v4, a2, 0);
        v10 = arm64g_calculate_condition(4, (v9 & 1 ? v8 : 0x40000000), 0, 0);
        if (!(v10 & 1))
        {
            goto *((void *)(g_e719b0));
        }
        else
        {
            sub_1bbad0();
            goto *((void *)(g_e719b8));
        }
    }
    else
    {
        v11 = arm64g_calculate_condition(v5 | 144, v4, a2, 0);
        v12 = arm64g_calculate_condition(0, (v11 & 1 ? v8 : 0x40000000), 0, 0);
        if (!(v12 & 1))
        {
            goto *((void *)(g_e719b0));
        }
        else
        {
            sub_1bbad0();
            goto *((void *)(g_e719b8));
        }
    }
}
