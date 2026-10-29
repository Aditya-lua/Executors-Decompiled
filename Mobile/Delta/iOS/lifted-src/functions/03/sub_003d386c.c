/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d386c..0x3d391c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d386c_0 {
    char field_0;
} st_3d386c_0;


unsigned long long sub_3d386c(long long a0, char *a1)
{
    unsigned long long v4;  // x0
    unsigned long long v14;  // 4102
    unsigned int i;  // w0
    unsigned long v6;  // cc_op
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned int v10;  // w8
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4112
    st_3d386c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d386c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    while (1)
    {
        if (!sub_3d2248(a0) && sub_3c94e8(*a1))
        {
            *a1 = sub_3d706c(a0);
        }
        else
        {
            v4 = sub_3d2248(a0);
            if ((unsigned int)v4)
            {
                return v4;
            }
            else if (*a1 != 35)
            {
                return v4;
            }
            else if (!sub_3d2248(a0))
            {
                do
                {
                    v10 = *a1;
                    if (v10 != 10)
                    {
                        v11 = arm64g_calculate_condition(v6 | 16, v7, v8, v9);
                        v12 = arm64g_calculate_condition(3, (v11 & 1 ? v10 & 0xff : 0x40000000), (v11 & 1 ? 13 : 0), 0);
                        if (v12 & 1)
                            break;
                    }
                    else
                    {
                        v13 = arm64g_calculate_condition(v6 | 16, v7, v8, v9);
                        v14 = arm64g_calculate_condition(0, (v13 & 1 ? v10 & 0xff : 0x40000000), (v13 & 1 ? 13 : 0), 0);
                        if (v14 & 1)
                            break;
                    }
                    *a1 = sub_3d706c(a0);
                    i = sub_3d2248(a0);
                } while (!i);
            }
        }
    }
}
