/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c7c0..0x1c948 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c7c0_1 {
    char field_0;
    char field_1;
} st_1c7c0_1;

typedef struct st_1c7c0_0 {
    char field_0;
} st_1c7c0_0;

extern char g_f0caf0;

char sub_1c7c0(double *a0, st_1c7c0_1 *a1, unsigned long long a2)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // 4121
    unsigned long long v7;  // x21
    st_1c7c0_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1c7c0_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if ((unsigned int)a2 == 2 && g_f0caf0 & 1 && a1->field_0 == 48 && (a1->field_1 | 32) == 98)
        return 2;
    v2 = 0;
    v5 = _strtoull(a1, &v2, a2);
    if (*(char *)v2)
        return 2;
    *a0 = (double)v5;
    v6 = arm64g_calculate_condition(2, v5, 1, 0);
    if (!(v6 & 1))
    {
        if (v5 <= 0x1fffffffffffff)
            return 0;
    }
    else
    {
        if (*(int *)___error() == 0x22)
        {
            *(unsigned int *)___error() = 0;
            v7 = _strtoull(a1, &v2, a2);
            if (*(int *)___error(v7, &v2, a2) == 0x22)
            {
                if ((unsigned int)a2 == 2)
                    return 3;
                return 4;
            }
            else
            {
                v5 = v7;
                if (v7 <= 0x1fffffffffffff)
                    return 0;
            }
        }
        else if ((unsigned long long)*a0 != 0xffffffffffffffff)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    if (v5 == (unsigned long long)*a0)
        return 0;
    return 1;
}
