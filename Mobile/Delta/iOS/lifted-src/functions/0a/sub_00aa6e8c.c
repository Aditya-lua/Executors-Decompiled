/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa6e8c..0xaa6fd0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa6e8c_0 {
    unsigned int field_0;
    char padding_4[12];
    unsigned long long field_10;
} st_aa6e8c_0;


unsigned int sub_aa6e8c(unsigned int *a0, int *a1)
{
    unsigned long v0;  // x9
    char v1;  // x10
    char v2;  // x13
    char node;  // w0
    st_aa6e8c_0 *v4;  // x14
    unsigned long v5;  // x13
    void* iter;  // x15
    char v7;  // w16
    unsigned long long v8;  // 4102
    char v9;  // w14

    v0 = *a0;
    if ((int)v0 < 1)
        return 0;
    v1 = 0;
    v2 = 0;
    node = 0;
    do
    {
        v4 = (char *)&a1[6 * v1] + 2;
        while (1)
        {
            v5 = v2;
            iter = (char *)a0 + v2 * 24 + 6;
            while (1)
            {
                v7 = *(int *)((char *)iter - 8);
                if (v7 != 2)
                    break;
                v5 += 1;
                iter += 24;
                if ((long long)v5 >= (long long)v0)
                    return node;
            }
            if (*a1 > v1)
            {
                if ((int)v4->field_0 < *(int *)((char *)iter - 16))
                    break;
                v8 = arm64g_calculate_condition(3, *(int *)((char *)iter - 16), v4->field_0, 0);
                if (v8 & 1)
                {
                    if (*(int *)((char *)iter - 12) == *(int *)&v4->padding_4[0])
                        v9 = *(long long *)iter != v4->field_10;
                    else
                        v9 = 1;
                    if (v7 == v9)
                    {
                        node += 1;
                    }
                    else if (!(*((char *)iter - 4) & 1))
                    {
                        return 0xffffffff;
                    }
                    v5 = (unsigned int)v5 + 1;
                    break;
                }
            }
            if (*(int *)((char *)iter - 12))
            {
                if (*(int *)((char *)iter - 12) != 2)
                    goto LABEL_aa6f54;
                if (v7 != 1)
                {
                    if (!(*((char *)iter - 4) & 1))
                        return 0xffffffff;
                    goto LABEL_aa6f5c;
                }
                goto LABEL_aa6f40;
            }
            if (v7 != 1)
            {
                if (!v7 && *(int *)iter != 2)
                    goto LABEL_aa6f54;
                goto LABEL_aa6f40;
            }
            else if (*(int *)iter != 2)
            {
LABEL_aa6f40:
                node += 1;
                goto LABEL_aa6f5c;
            }
            else
            {
LABEL_aa6f54:
                if (!(*((char *)iter - 4) & 1))
                    return 0xffffffff;
LABEL_aa6f5c:
                v2 = (unsigned int)v5 + 1;
                if (v2 >= (int)v0)
                    return node;
            }
        }
        v2 = v5;
        v1 += 1;
    } while (v2 < (int)v0);
    return node;
}
