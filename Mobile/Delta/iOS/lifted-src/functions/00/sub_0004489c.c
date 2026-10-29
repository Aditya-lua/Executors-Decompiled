/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4489c..0x449c4 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4489c_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    long long field_20;
} st_4489c_1;

typedef struct st_4489c_0 {
    char field_0;
} st_4489c_0;

typedef struct st_4489c_2 {
    char padding_0[8];
    int field_8;
} st_4489c_2;

extern unsigned int g_f00b60;
extern unsigned int g_f00b70;

unsigned long long sub_4489c(st_4489c_2 *a0, st_4489c_1 *a1)
{
    st_4489c_1 *v6;  // x1
    unsigned long long v7;  // x0
    unsigned long v8;  // x0
    unsigned long long v9;  // x0
    st_4489c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4489c_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    st_4489c_1 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_8 == g_f00b70)
        v6 = a1;
    else
        v6 = 0;
    v3 = v6;
    if (!v6)
    {
        return a1->field_8 == g_f00b60;
    }
    else if (2 > a0->field_8)
    {
        return 1;
    }
    else if (sub_4663c(a0) & 1)
    {
        return 0;
    }
    else
    {
        if (a0->field_8 >= 2)
        {
            v7 = sub_158b8(&a0[35].padding_0[4], &v3);
            if (v7)
            {
                v8 = *(int *)(v7 + 8);
                if ((unsigned int)v8)
                    return (sub_36550(v8) & 0xffffffff00000000) != 0x100000000;
            }
        }
        v2 = sub_3e034(a0, v3->field_20);
        if (!v2)
            return 1;
        v9 = sub_3b040(&a0[8].field_8, &v2);
        if (!v9)
        {
            return 1;
        }
        else if (!(*(char *)(v9 + 53) & 1))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
