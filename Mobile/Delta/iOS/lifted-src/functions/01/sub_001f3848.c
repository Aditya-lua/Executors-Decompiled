/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f3848..0x1f39a8 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f3848_1 {
    char padding_0[24];
    struct st_1f3848_2 *field_18;
} st_1f3848_1;

typedef struct st_1f3848_3 {
    unsigned int field_0;
} st_1f3848_3;

typedef struct st_1f3848_2 {
    unsigned long long field_0;
} st_1f3848_2;

typedef struct st_1f3848_0 {
    char field_0;
} st_1f3848_0;


unsigned long long sub_1f3848(st_1f3848_1 *a0, unsigned long long *a1, unsigned int a2, st_1f3848_3 **a3)
{
    unsigned int *v6;  // x0
    unsigned long long *v7;  // x8
    unsigned long long v16;  // x22
    unsigned long long *v17;  // x9
    unsigned long long v18;  // w10
    unsigned int *v19;  // x9
    unsigned long v8;  // x9
    unsigned long long v9;  // x12
    unsigned long i;  // x12
    unsigned long long v11;  // x13
    unsigned long long v12;  // x9
    unsigned long v13;  // x11
    long long v14;  // x21
    unsigned int *v15;  // x8
    st_1f3848_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f3848_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    v3 = a1[1];
    v6 = sub_1fab7c();
    if (v6)
    {
        v7 = a0->field_18;
        v8 = *v6;
        if ((unsigned int)v8)
        {
            if (a3[1])
            {
                v9 = 1;
                do
                {
                    i = v9;
                    v11 = 0;
                    while (v6[i] >= (unsigned int)*(int *)&(*a3)[v11])
                    {
                        v11 += 1;
                        if (a3[1] == v11)
                            return 0;
                    }
                    if (!(v11 & 1))
                        return 0;
                    v9 = i + 1;
                } while (i != v8);
            }
            else
            {
                return 0;
            }
        }
        v12 = v6 - v7;
        v13 = *(int *)((char *)v7 + v12) + 1;
        *(unsigned int *)((char *)v7 + v12) = v13;
        v14 = ((long long)(v12) >> 2) + v13;
        sub_1f8928(&a0->field_18, v14, 1);
        v15 = (char *)a0->field_18 + 4 * v14;
    }
    else
    {
        v16 = *(long long *)&a0[1].padding_0[0];
        sub_1f08c4(a0, a1);
        sub_1fb614();
        v17 = a0->field_18;
        if (v16)
        {
            v18 = *(int *)v17 + 1;
        }
        else
        {
            v18 = 1;
            v16 = 1;
        }
        *(unsigned int *)v17 = v18;
        v19 = (char *)v17 + 4 * v16;
        *v19 = a1[1];
        v19[1] = 1;
        v15 = v19 + 2;
    }
    *v15 = a2;
    return 1;
}
