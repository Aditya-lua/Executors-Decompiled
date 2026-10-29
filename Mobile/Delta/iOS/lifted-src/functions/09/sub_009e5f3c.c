/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5f3c..0x9e6104 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5f3c_4 {
    char padding_0[1];
    unsigned long long field_1;
} st_9e5f3c_4;

typedef struct st_9e5f3c_1 {
    struct st_9e5f3c_2 *field_0;
    int field_8;
    int field_c;
} st_9e5f3c_1;

typedef struct st_9e5f3c_3 {
    struct st_9e5f3c_2 *field_0;
    struct st_9e5f3c_2 *field_8;
    struct st_9e5f3c_2 *field_10;
} st_9e5f3c_3;

typedef struct st_9e5f3c_2 {
    unsigned long long field_0;
} st_9e5f3c_2;

typedef struct st_9e5f3c_0 {
    long long field_0;
    unsigned int field_8;
} st_9e5f3c_0;

extern char g_10002b0;

int sub_9e5f3c(st_9e5f3c_3 *a0, st_9e5f3c_1 *a1, st_9e5f3c_1 *a2, st_9e5f3c_0 *a3)
{
    unsigned long v4;  // x20
    unsigned long long *v5;  // x0
    unsigned long v14;  // x14
    unsigned long v15;  // x15
    unsigned long long *iter;  // x16
    unsigned long long *i;  // x17
    unsigned long long *v18;  // x17
    unsigned long long v19;  // x0
    unsigned long long v20;  // x1
    unsigned long long v21;  // x2
    unsigned long long v22;  // 4152
    st_9e5f3c_4 *v23;  // x2
    unsigned long long *j;  // x25
    unsigned long long v24;  // 4164
    unsigned long long *node;  // x23
    unsigned long long v26;  // x0
    st_9e5f3c_2 **iter1;  // x10
    unsigned long long *v28;  // x25
    unsigned long long *v7;  // x8
    unsigned long long *v8;  // x9
    unsigned long long *v9;  // x10
    unsigned long long *v10;  // x11
    unsigned long long *v11;  // x26
    unsigned long long v12;  // x12
    unsigned long long v13;  // x13
    char v0;  // [bp-0xd8]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = a3->field_8;
    v5 = sub_9e4cdc();
    if (v5)
    {
        j = (int)v4;
        if ((unsigned int)v4 >= 0x11)
        {
            v5 = sub_a6bf4c(j * 8, "crypto/bn/bn_mod.c", 66);
            if (!v5)
            {
                if (*(long long *)&g_10002b0 == v1)
                    return (unsigned int)v5;
                ___stack_chk_fail();
            }
        }
        else
        {
            v5 = &v0;
        }
        v7 = a1->field_0;
        if (!a1->field_0)
            v7 = v5;
        v8 = a2->field_0;
        if (!a2->field_0)
            v8 = v5;
        if ((unsigned int)v4)
        {
            v9 = 0;
            v10 = 0;
            v11 = 0;
            v12 = 1 - a2->field_c;
            v13 = 1 - a1->field_c;
            v14 = -a2->field_8;
            v15 = -a1->field_8;
            iter = v5;
            i = j;
            do
            {
                v18 = i;
                v19 = *(long long *)((char *)v7 + 0x8 * v9) & (long long)(v15) >> 63;
                v20 = v19 + (char *)v11;
                v21 = *(long long *)((char *)v8 + 0x8 * v10) & (long long)(v14) >> 63;
                v22 = arm64g_calculate_condition(50, v21, v20, 0);
                v23 = !(v22 & 1);
                v9 = (char *)v9 + (v13 >> 63);
                *iter = v21 + v20;
                iter += 1;
                v10 = (char *)v10 + (v12 >> 63);
                v24 = arm64g_calculate_condition(50, v19, v11, 0);
                if (v24 & 1)
                    v11 = v23;
                else
                    v11 = (v23->padding_0)[1];
                v12 += 1;
                v13 += 1;
                v14 += 1;
                v15 += 1;
                i = (char *)v18 - 1;
            } while (i);
        }
        else
        {
            v11 = 0;
        }
        node = a0->field_0;
        v26 = sub_9dbbc8(a0->field_0, v5, a3->field_0, v4);
        if ((unsigned int)v4)
        {
            iter1 = v5;
            do
            {
                v28 = j;
                *node = *node & ~(unsigned long long *)((char *)v11 - v26) | *iter1 & (char *)v11 - v26;
                node += 1;
                *iter1 = 0;
                iter1 += 1;
                j = (char *)v28 - 1;
            } while (j);
        }
        *(unsigned int *)&a0->field_8 = v4;
        *(unsigned int *)&a0->field_10 = 0;
        if (v5 != &v0)
            sub_a6c2e4(v5, "crypto/bn/bn_mod.c", 98);
        if (*(long long *)&g_10002b0 == v1)
            return 1;
        ___stack_chk_fail();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v1)
            return (unsigned int)v5;
        ___stack_chk_fail();
    }
}
