/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f940..0xc5faa0 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5f940_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c5f940_0;

extern unsigned long long g_efd400;
extern long long g_efd560;

unsigned long long sub_c5f940(st_c5f940_0 *a0)
{
    unsigned long long i;  // x21
    unsigned long long v7;  // x20
    long long v8;  // x22
    unsigned long long n;  // x23
    unsigned long long count;  // x0
    unsigned long long v11;  // 4106
    unsigned long v12;  // x8
    unsigned long long v13;  // x0
    long long v14;  // x0
    long long v15;  // x0
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    i = a0->field_10;
    if (!i)
        return 0;
    v7 = 0;
    v8 = a0->field_8;
    do
    {
        *(char *)&a0->field_18 = 1;
        n = i - v7;
        count = _write();
        v11 = arm64g_calculate_condition(18, count, 1, 0);
        if (!(v11 & 1))
        {
            v12 = *(int *)___error();
            v13 = 2 | v12 * 0x100000000;
            v2 = 1;
            v3 = v13;
            if ((unsigned int)v12 == 9)
            {
                sub_c40ff0(&v3);
                count = i - v7;
            }
            else
            {
                v0 = 1;
                v1 = v13;
                *(char *)&a0->field_18 = 0;
                if ((unsigned int)v12 == 4)
                {
                    sub_c40ff0(&v1);
                    continue;
                }
                goto LABEL_c5fa2c;
            }
        }
        *(char *)&a0->field_18 = 0;
        if (count)
        {
            v7 += count;
        }
        else
        {
            v13 = &g_efd400;
LABEL_c5fa2c:
            if (!v7)
                return v13;
            _memmove(v8, v8 + v7, n);
            goto LABEL_c5fa48;
        }
    } while (i > v7);
    if (i < v7)
    {
        v14 = sub_c73bb0(0, v7, i, &g_efd560);
        sub_c5faa0(a0, v7);
        v15 = __Unwind_Resume(v14);
        sub_c73e0c(v15);
    }
    n = 0;
    v13 = 0;
LABEL_c5fa48:
    a0->field_10 = n;
    return v13;
}
