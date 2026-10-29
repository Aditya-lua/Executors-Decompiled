/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad66e0..0xad6894 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad66e0_0 {
    struct st_ad66e0_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_ad66e0_1 *field_8;
    struct st_ad66e0_0 *field_10;
    struct st_ad66e0_0 *field_18;
} st_ad66e0_0;

typedef struct st_ad66e0_1 {
    struct st_ad66e0_0 *field_0;
} st_ad66e0_1;


st_ad66e0_0 * sub_ad66e0(st_ad66e0_0 *a0, st_ad66e0_0 *a1, unsigned long a2, st_ad66e0_0 *a3)
{
    st_ad66e0_0 *v3;  // x2
    st_ad66e0_0 *v4;  // x21
    unsigned long long v5;  // 4112
    st_ad66e0_0 *v6;  // x21
    st_ad66e0_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    if (!a0 || !(v3 = (int)a0->field_0, (unsigned int)v3))
        return 0xffffffff;
    if (!a0->field_10)
    {
        if ((int)(unsigned int)v3 >= 1)
        {
            v6 = 0;
            do
            {
                if (*(long long *)(*(long long *)&a0->field_1 + v6 * 8) == a1)
                {
                    if (!a3)
                        return v6;
                    *(unsigned int *)&a3->field_0 = 1;
                    return v6;
                }
            } while ((v6 = (char *)&v6->field_0 + 1, v3 != v6));
        }
        if (a3)
            goto LABEL_ad686c;
    }
    else if (a1)
    {
        if ((int)a0->field_8)
        {
            v4 = sub_a67850();
            if (a3)
            {
                *(unsigned int *)&a3->field_0 = 0;
                if (v4)
                {
                    if ((unsigned long long)(*(long long *)&a0->field_1 + (int)a0->field_0 * 8) > v4)
                        a0->field_10();
                    return (char *)v4 - *(long long *)&a0->field_1 >> 3;
                }
            }
            else if (v4)
            {
                return (char *)v4 - *(long long *)&a0->field_1 >> 3;
            }
        }
        else
        {
            if ((int)(unsigned int)v3 >= 1)
            {
                a0->field_10();
            }
            else if (a3)
            {
                v5 = arm64g_calculate_condition(0x11, 0xffffffff, 1, 0);
                if (v5 & 1)
                    return 0xffffffff;
            }
            else
            {
                return 0xffffffff;
            }
LABEL_ad686c:
            *(unsigned int *)&a3->field_0 = 0;
        }
    }
    return 0xffffffff;
}
