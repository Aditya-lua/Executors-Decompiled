/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1feb30..0x1fec08 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1feb30_0 {
    char field_0;
} st_1feb30_0;

extern unsigned long long g_e794b8;
extern unsigned long long g_e794d0;

int sub_1feb30(unsigned long long a0, long long a1)
{
    char *v6;  // x0
    unsigned long v7;  // cc_op
    unsigned long long v16;  // 4102
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // w8
    unsigned long long v12;  // x19
    unsigned long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long v15;  // 4112
    st_1feb30_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1feb30_0 *v1;  // [bp-0x48]
    char v2;  // [bp-0x40]
    char v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return 1;
    sub_f0dd8(a1);
    if (v3 == 1)
    {
        v6 = sub_a0c8(&v2);
        while (1)
        {
            v11 = *v6;
            v6 += 1;
            v12 = a0 + 1;
            if (v11)
            {
                v13 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
                v7 = 3;
                v8 = (v13 & 1 ? v11 & 0xff : 0);
                v9 = (v13 & 1 ? *(char *)a0 : 0);
                v10 = 0;
                v14 = arm64g_calculate_condition(3, v8, v9, 0);
                a0 = v12;
                if (!(v14 & 1))
                    break;
            }
            else
            {
                v15 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
                v7 = 0;
                v8 = (v15 & 1 ? v11 & 0xff : 0);
                v9 = (v15 & 1 ? *(char *)a0 : 0);
                v10 = 0;
                v16 = arm64g_calculate_condition(0, v8, v9, 0);
                a0 = v12;
                if (!(v16 & 1))
                    break;
            }
        }
        sub_68ac(&v2);
        goto *((void *)(g_e794b8));
    }
    else
    {
        sub_68ac(&v2);
        goto *((void *)(g_e794d0));
    }
}
