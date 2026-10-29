/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f253c..0x9f271c (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f253c_0 {
    long long field_0;
    char padding_8[64];
    char field_48;
    char padding_49[31];
    char field_68;
    char padding_69[31];
    unsigned long long field_88;
} st_9f253c_0;

extern char g_10002b0;

unsigned long long sub_9f253c(st_9f253c_0 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v4;  // 4177
    unsigned long long node;  // x19
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long long v16;  // x23
    long long iter;  // x21
    unsigned long long v7;  // x0
    unsigned long long v8;  // x23
    unsigned long long v9;  // x9
    unsigned long long v10;  // x19
    unsigned long long n;  // x22
    unsigned long long v12;  // w8
    unsigned long long v13;  // x25
    char v0;  // [bp-0x858]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = arm64g_calculate_condition(1, (unsigned int)a0->field_88, 1, 0);
    if (!(v4 & 1))
    {
        node = a2;
        if (a2)
        {
            iter = a1;
            v7 = sub_a50638(a0->field_0);
            if (!(unsigned int)v7)
                goto LABEL_9f26e4;
            v8 = v7;
            if ((int)a0->field_88 >= 1)
            {
                v9 = (int)(v8 - (unsigned int)a0->field_88);
                if (v9 >= node)
                    v9 = node;
                _memcpy();
                *(unsigned int *)&a0->field_88 = (int)a0->field_88 + (unsigned int)v9;
                v10 = node - v9;
                if (node != v9)
                {
                    if ((int)sub_a50654(a0->field_0, &a0->field_48, &a0->field_68, v8) >= 1)
                    {
                        iter += v9;
                        node = v10;
                        goto LABEL_9f25f8;
                    }
                    goto LABEL_9f26e0;
                }
            }
            else
            {
LABEL_9f25f8:
                n = (int)v8;
                if (v12)
                {
                    v13 = v12;
                    v14 = (node - 1) / n;
                    if (v14 > v13)
                    {
                        v15 = (unsigned int)v13 * (unsigned int)n;
                        do
                        {
                            if ((int)sub_a50654(a0->field_0, &v0, iter, v15) < 1)
                                goto LABEL_9f26e0;
                        } while ((node -= v15, iter += v15, v14 -= v13, v13 < v14));
                    }
                    if (v14)
                    {
                        v16 = n * v14;
                        if ((int)sub_a50654(a0->field_0, &v0, iter, v16) < 1)
                            goto LABEL_9f26e0;
                        node -= v16;
                        iter += v16;
                        _memcpy(&a0->field_48, &(&v0)[n * (v14 - 1)], n);
                    }
                }
                else
                {
                    for (v12 = (unsigned int)(0x800 / v8); n < node; iter += n)
                    {
                        if ((int)sub_a50654(a0->field_0, &a0->field_48, iter, v8) < 1)
                            goto LABEL_9f26e0;
                        node -= n;
                    }
                }
                _memcpy(&a0->field_68, iter, node);
                *(unsigned int *)&a0->field_88 = node;
            }
        }
        v7 = 1;
    }
    else
    {
LABEL_9f26e0:
        v7 = 0;
    }
LABEL_9f26e4:
    if (*(long long *)&g_10002b0 == v1)
        return v7;
    ___stack_chk_fail();
}
