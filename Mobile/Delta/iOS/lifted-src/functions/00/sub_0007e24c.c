/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7e24c..0x7e414 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7e24c_4 {
    unsigned long long field_0;
    unsigned long long field_4;
    unsigned long long field_8;
    unsigned long long field_c;
} st_7e24c_4;

typedef struct st_7e24c_2 {
    struct st_7e24c_1 *field_0;
    struct st_7e24c_1 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[40];
    unsigned long long field_48;
    unsigned int field_4c;
} st_7e24c_2;

typedef struct st_7e24c_0 {
    char field_0;
} st_7e24c_0;

typedef struct st_7e24c_3 {
    unsigned long long field_0;
    unsigned int field_8;
} st_7e24c_3;

typedef struct st_7e24c_1 {
    unsigned long long field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_7e24c_1;


unsigned long long sub_7e24c(unsigned long long *a0, st_7e24c_2 *a1, st_7e24c_3 *a2)
{
    st_7e24c_1 *node;  // x24
    unsigned long long v11;  // x23
    unsigned long long v20;  // w1
    unsigned long long v21;  // w9
    unsigned long long v22;  // w9
    st_7e24c_4 *v23;  // x9
    unsigned long long v12;  // x10
    unsigned long long v13;  // x22
    unsigned long long v14;  // x28
    unsigned long long v15;  // x25
    unsigned long long i;  // x26
    unsigned int *iter;  // x27
    unsigned long long v18;  // w8
    unsigned int v19;  // w9
    st_7e24c_4 *v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x98]
    unsigned long v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x88]
    st_7e24c_0 **v4;  // [bp-0x80], Other Possible Types: char
    st_7e24c_0 *v5;  // [bp-0x78]
    unsigned long v6;  // [bp-0x70]
    unsigned int v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v5 = &v4;
    v4 = &v5;
    node = a1->field_0;
    v11 = (long long)(a1->field_8 - node) >> 3;
    v12 = v11 + 1;
    v13 = a0[2];
    if (v12 > a0[3] - v13)
        return 0xffffffffffffffba;
    v2 = a1->field_18;
    v3 = v12;
    v1 = a1->field_10;
    v6 = a2->field_0;
    v7 = a2->field_8;
    v0 = a0[1] + v13 * 16;
    v14 = 0;
    if (a1->field_8 != node)
    {
        v15 = *(int *)((char *)&a1->field_48 + 4);
        if (1 < v11)
            i = v11;
        else
            i = 1;
        iter = (char *)&v0->field_4 + 4;
        do
        {
            v18 = *(short *)((char *)&node->field_0 + 4);
            v19 = *(short *)((char *)&node->field_0 + 6);
            *(unsigned int *)((char *)iter - 8) = v18;
            *(unsigned int *)((char *)iter - 4) = v19 + 3;
            *iter = 0;
            if (v15)
            {
LABEL_7e344:
                v20 = (int)node->field_0;
                v21 = v20 - 1;
                if (3 > v21)
                {
                    *iter = v20;
                    if (!v18)
                    {
                        if (v20 == 3)
                        {
                            v22 = (unsigned int)v6 - 1;
                            goto LABEL_7e2fc;
                        }
                        else
                        {
                            v22 = *(int *)((char *)&v6 + 4 * v20);
                            goto LABEL_7e2fc;
                        }
                    }
                    goto LABEL_7e35c;
                }
                goto LABEL_7e2f8;
            }
            else if ((int)a1->field_48 == 1)
            {
                *(unsigned int *)((char *)iter - 8) = v18 | 0x10000;
                v20 = (int)node->field_0;
                v21 = v20 - 1;
                if (2 < v21)
                {
LABEL_7e2f8:
                    v22 = v20 - 3;
                    continue;
                }
                else
                {
                    *iter = v20;
LABEL_7e35c:
                    v22 = *(int *)((char *)&v6 + 4 * v21);
                }
            }
            else if ((int)a1->field_48 == 2)
            {
                *(unsigned int *)((char *)iter - 4) = v19 + 65539;
                goto LABEL_7e344;
            }
LABEL_7e2fc:
            *(unsigned int *)((char *)iter - 12) = v22;
            sub_7f880(&v6);
            v14 += *(int *)((char *)iter - 8);
            node = &node->field_4;
            v15 -= 1;
            iter += 4;
            i -= 1;
        } while (i);
    }
    v23 = &(&v0->field_0)[2 * v11];
    *(unsigned int *)((char *)&v23->field_0 + 4) = v2 - v1 - v14;
    *(unsigned int *)&v23->field_4 = 0;
    *(unsigned int *)&v23->field_0 = 0;
    a0[2] = v3 + v13;
    return 0;
}
