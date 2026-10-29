/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf3c4..0xf590 (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f3c4_0 {
    char field_0;
} st_f3c4_0;

extern char g_f0caf0;

char sub_f3c4(long long *a0, char a1, unsigned long long a2)
{
    long long num;  // x0
    char v6;  // x8
    long long num1;  // x0
    long long v8;  // x0
    char v9;  // x8
    unsigned long long v10;  // 4106
    st_f3c4_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_f3c4_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    if ((unsigned int)a2 == 10)
    {
        num = _strtoll(a1, &v2);
        *a0 = num;
        v6 = v2;
        if (v6 == a1)
        {
            return 2;
        }
        else if (*(char *)v6 != 105)
        {
            return 2;
        }
        else if (*(char *)(v6 + 1))
        {
            return 2;
        }
        else if (1 < (unsigned long long)(num + 9223372036854775809))
        {
            return 0;
        }
        else if (*(int *)___error() == 0x22)
        {
            *(unsigned int *)___error() = 0;
            num1 = _strtoll(a1, &v2, 10);
            *a0 = num1;
            if (*(int *)___error(num1, &v2, 10) != 0x22)
                return 0;
            return 5;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if ((unsigned int)a2 == 2 && g_f0caf0 & 1 && *(char *)a1 == 48 && (*(char *)(a1 + 1) | 32) == 98)
            return 2;
        v8 = _strtoull(a1, &v2);
        v9 = v2;
        if (v9 == a1)
        {
            return 2;
        }
        else if (*(char *)v9 != 105)
        {
            return 2;
        }
        else if (*(char *)(v9 + 1))
        {
            return 2;
        }
        else
        {
            v10 = arm64g_calculate_condition(18, v8, 1, 0);
            if (!(v10 & 1))
            {
                if (*(int *)___error() == 0x22)
                {
                    *(unsigned int *)___error() = 0;
                    v8 = _strtoull(a1, &v2, a2);
                    if (*(int *)___error(v8, &v2, a2) == 0x22)
                    {
                        if ((unsigned int)a2 == 2)
                            return 3;
                        return 4;
                    }
                }
                else
                {
                    v8 = -0x1;
                }
            }
            *a0 = v8;
            return 0;
        }
    }
}
