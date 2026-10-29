/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fac4c..0x1fadcc (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fac4c_3 {
    char padding_0[120];
    unsigned long long field_78;
} st_1fac4c_3;

typedef struct st_1fac4c_2 {
    char padding_0[8];
    int field_8;
    char padding_c[136];
    unsigned int field_94;
} st_1fac4c_2;

typedef struct st_1fac4c_0 {
    char field_0;
} st_1fac4c_0;

typedef struct st_1fac4c_1 {
    char padding_0[8];
    int field_8;
} st_1fac4c_1;

extern unsigned long long g_e78380;
extern unsigned long long g_e783b0;

unsigned long long sub_1fac4c(st_1fac4c_2 *a0, unsigned int **a1, unsigned int *a2, st_1fac4c_3 *a3)
{
    st_1fac4c_1 *ptr;  // x8
    unsigned long long v6;  // x0
    unsigned int *v7;  // x9
    unsigned long v8;  // x24
    unsigned int *v9;  // x9
    unsigned int *v10;  // x8
    unsigned int v11;  // w8
    unsigned long long v12;  // 4112
    st_1fac4c_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_1fac4c_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x51]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    memset(ptr, 0, 24);
    v6 = sub_1f8288(&a3->padding_0[96]);
    if (*a1 != a2)
    {
        v7 = *a1;
        v8 = *v7;
        v9 = v7 + 1;
        *a1 = v9;
        if ((unsigned int)v8 != 62)
        {
            if ((unsigned int)v8 == 92)
            {
                if (v9 != a2 && *v9 == 117)
                {
                    *a1 = v7 + 2;
                    v8 = sub_1f4bf4(a0, a1, a2);
                }
                else
                {
                    v8 = 92;
                }
            }
            v10 = a3->field_78 + (*(long long *)&ptr->field_8 != 0) * 8;
            if (sub_1f4328(&a3->padding_0[96], *v10, v10[1], v8))
                v11 = v8;
            else
                v11 = 0xffffffff;
            v12 = arm64g_calculate_condition(1, v11, 1, 0);
            if (!(v12 & 1))
            {
                v2 = v11;
                sub_1f0698(ptr, &v2, 1);
                goto *((void *)(g_e783b0));
            }
            else
            {
                *(unsigned long long *)&ptr->field_8 = 0;
                goto *((void *)(g_e78380));
            }
        }
        else
        {
            goto *((void *)(g_e78380));
        }
    }
    else
    {
        *(unsigned long long *)&ptr->field_8 = 0;
        if (*(long long *)&ptr->field_8)
            return v6;
        *(unsigned long long *)&a0->field_8 = 0;
        a0->field_94 = a0->field_94 | 0x66000000;
        return v6;
    }
}
