/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12204..0x1238c (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12204_2 {
    char field_0;
    char field_1;
    struct st_12204_1 *field_2;
} st_12204_2;

typedef struct st_12204_1 {
    struct st_12204_1 *field_0;
} st_12204_1;

typedef struct st_12204_0 {
    char field_0;
} st_12204_0;

extern char g_10002b0;

st_12204_1 ** sub_12204(double *a0, st_12204_2 *a1)
{
    unsigned int v8;  // w8
    st_12204_1 **v9;  // x0
    double v10;  // d0
    unsigned long long v11;  // 4130
    unsigned long long v12;  // x0
    double v0;  // [bp-0x270]
    st_12204_0 **v1;  // [bp-0x260], Other Possible Types: char
    st_12204_0 *v2;  // [bp-0x258]
    st_12204_1 **v3;  // [bp-0x250]
    char v4;  // [bp-0x248]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    if (a1->field_0 != 48)
        goto LABEL_122c4;
    v8 = a1->field_1;
    if (97 >= (int)v8)
    {
        switch (v8)
        {
        case 66:
            goto LABEL_12280;
        case 88:
            goto LABEL_122a8;
        default:
LABEL_122c4:
            v3 = 0;
            _strtod(a1, &v3);
LABEL_122d4:
            if (*(char *)v3)
            {
                v9 = 2;
                break;
            }
            else
            {
                *a0 = v10;
                v11 = arm64g_calculate_condition(176, (((((char)(CmpF(__double_as_longlong(v10), 9007199254740992.0)) >> 5 & 3 | v10 < 9007199254740992.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v10)) * 0x10000000, 0, 0);
                if (!(v11 & 1) && !(v12 = _strspn(a1, "0123456789"), _strspn(a1, "0123456789") != _strlen(a1) || (v0 = v10, _snprintf(&v4, 0x200, "%.0f"), !_strcmp(&v4, a1))))
                {
                    v9 = 1;
                    break;
                }
                else
                {
                    v9 = 0;
                    break;
                }
            }
        }
    }
    else
    {
        switch (v8)
        {
        case 120:
LABEL_122a8:
            if (!(&a1->field_1)[1])
                goto LABEL_122c4;
            v9 = sub_1c7c0(a0, a1, 16);
            break;
        case 98:
LABEL_12280:
            if ((&a1->field_1)[1])
            {
                v9 = sub_1c7c0(a0);
                break;
            }
            else
            {
                if ((v8 | 32) != 120)
                    goto LABEL_122c4;
                else
                    goto LABEL_122a8;
            }
        default:
LABEL_122c4:
            v3 = 0;
            _strtod(a1, &v3);
            goto LABEL_122d4;
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return v9;
    ___stack_chk_fail();
}
