/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3b814..0xc3b8ac (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3b814_0 {
    struct st_c3b814_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c3b814_0;

typedef struct st_c3b814_1 {
    char field_0;
} st_c3b814_1;


void sub_c3b814(char *a0, st_c3b814_0 *a1, char a2)
{
    unsigned long v5;  // x8
    unsigned long long v6;  // 4110
    char v7;  // x8
    char v0;  // [bp-0x30]
    char v1;  // [bp-0x2f]
    char v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1->field_10;
    if (a1->field_8 > v5 && *(char *)&a1->field_0[v5] == a2)
    {
        a1->field_10 = v5 + 1;
        sub_c3c5c8(&v0);
        if (v0 & 1)
        {
            a0[1] = v1;
            goto LABEL_c3b864;
        }
        else
        {
            v6 = arm64g_calculate_condition(2, v2, 1, 0);
            if (!(v6 & 1))
            {
                v7 = 0;
                *(long long *)&a0[8] = v2 + 1;
            }
            else
            {
                a0[1] = 0;
LABEL_c3b864:
                v7 = 1;
            }
        }
    }
    else
    {
        v7 = 0;
        *(unsigned long long *)&a0[8] = 0;
    }
    *a0 = v7;
    return;
}
