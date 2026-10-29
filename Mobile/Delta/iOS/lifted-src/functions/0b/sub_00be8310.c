/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe8310..0xbe85ac (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be8310_0 {
    char padding_0[24];
    struct st_be8310_1 *field_18;
    struct st_be8310_1 *field_20;
} st_be8310_0;

typedef struct st_be8310_1 {
    unsigned long long field_0;
} st_be8310_1;


unsigned int sub_be8310(void* a0, unsigned int a1, unsigned int a2, unsigned int a3, unsigned long long a4, unsigned long a5)
{
    unsigned long v3;  // x26
    unsigned int v4;  // w8
    unsigned long long v13;  // 4136
    unsigned long v14;  // x8
    unsigned long long v15;  // 4121
    unsigned int v16;  // w27
    unsigned int v17;  // w8
    unsigned int v18;  // w9
    unsigned int v19;  // x28
    st_be8310_0 *v20;  // x25
    st_be8310_0 *v21;  // x25
    unsigned int v5;  // x9
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // x23
    unsigned long long v8;  // 4105
    unsigned long long v9;  // 4105
    unsigned long v10;  // x27
    unsigned int v11;  // x22
    unsigned long v12;  // x28
    void* v0;  // [bp-0x68], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (int)a0[16];
    if (!((unsigned int)v3 & 0x200000))
        v4 = 0x110000;
    else
        v4 = 43;
    v5 = (v3 * 0x80000000000 | v3 >> 21) & 0xfffff80000000001 & 1;
    v6 = a1;
    if (a1)
    {
        v7 = v4;
        v8 = arm64g_calculate_condition(19, v6, 0, 0);
        if (!(v8 & 1))
            goto LABEL_be8366;
LABEL_be8365:
    }
    else
    {
        v7 = 45;
        v9 = arm64g_calculate_condition(19, v6, 0, 0);
        if (v9 & 1)
            goto LABEL_be8365;
LABEL_be8366:
        v5 = 1;
    }
    v10 = v5 + a5;
    if (!(v3 >> 23 & 1))
    {
        v11 = 0;
        v12 = (short)a0[20];
        if (v10 < v12)
            goto LABEL_be8408;
    }
    else
    {
        v11 = a2;
        if (a3)
        {
            v13 = arm64g_calculate_condition(209, *(char *)v11, 65, 0);
            v14 = !(v13 & 1);
            if (a3 != 1)
            {
                v15 = arm64g_calculate_condition(209, *(char *)(v11 + 1), 65, 0);
                if (!(v15 & 1))
                    v14 += 1;
            }
            v10 += v14;
            v12 = (short)a0[20];
            if (v12 > v10)
                goto LABEL_be8408;
        }
        else
        {
            v10 += 0;
            v12 = (short)a0[20];
            if (v12 > v10)
            {
LABEL_be8408:
                if (!(v3 >> 24 & 1))
                {
                    v0 = a4;
                    v16 = v12 - v10;
                    v17 = ((unsigned int)v3 * 8 | (unsigned int)v3 >> 29) & 0xfffffffb & 3;
                    if (v17 == 2)
                        v18 = (v16 * 0x80000000 | v16 >> 1) & 0x80007fff & 0x7fff;
                    else
                        v18 = v16;
                    if (!v17)
                        v16 = 0;
                    if (1 < (int)v17)
                        v19 = (unsigned short)v18;
                    else
                        v19 = (unsigned short)v16;
                    v20 = (long long)a0[8];
                    if (v19 > 0)
                    {
                        v20->field_20();
                    }
                    else if (!(sub_be85ac(*(long long *)a0, v20, v7, v11, a3) & 1))
                    {
                        v20->field_18();
                    }
                    else
                    {
                        return 1;
                    }
                }
                else
                {
                    v21 = (long long)a0[8];
                    *(unsigned int *)&a0[16] = (int)(long long)a0[16] & 0x9fe00000 | 48 | 0x20000000;
                    v0 = a0;
                    if (sub_be85ac(*(long long *)a0, v21, v7, v11, a3) & 1)
                    {
                        return 1;
                    }
                    else if ((unsigned short)(v12 - v10) > 0)
                    {
                        v21->field_20();
                    }
                    else
                    {
                        v21->field_18();
                    }
                }
            }
        }
    }
    if (sub_be85ac(*(long long *)a0, (long long)a0[8], v7, v11, a3) & 1)
        return 1;
    goto *((void *)(*(long long *)((long long)a0[8] + 24)));
}
