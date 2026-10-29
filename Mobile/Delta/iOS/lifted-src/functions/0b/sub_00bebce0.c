/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbebce0..0xbebec0 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bebce0_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[155];
    unsigned long long field_a0;
} st_bebce0_0;

typedef struct st_bebce0_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_bebce0_1;

extern st_bebce0_1 g_e08ea0;

void sub_bebce0(st_bebce0_0 *a0, unsigned long long idx)
{
    unsigned long idx1;  // x1
    unsigned long long v3;  // x8
    st_bebce0_0 *iter;  // x11
    unsigned long long v13;  // x10
    unsigned long long v14;  // x8
    unsigned long idx2;  // x1
    unsigned long long v17;  // x8
    unsigned long long k;  // x9
    st_bebce0_0 *node;  // x11
    unsigned long long v20;  // x9
    unsigned long long v21;  // x8
    unsigned long long i;  // x10
    st_bebce0_0 *iter1;  // x11
    unsigned long long v6;  // x10
    unsigned long long v7;  // x8
    unsigned long index;  // x1
    unsigned long long v10;  // x8
    unsigned long long j;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (8 > idx)
    {
        idx1 = a0->field_a0;
        if (41 > idx1)
        {
            if (idx1)
            {
                v3 = 0;
                i = idx1 * 4;
                iter1 = a0;
                do
                {
                    v6 = i;
                    v7 = v3 + iter1->field_0 * (&g_e08ea0.field_0)[idx];
                    iter1->field_0 = v7;
                    iter1 = &iter1->field_4;
                    v3 = v7 >> 32;
                    i = v6 - 4;
                } while (i);
                if (v3)
                {
                    if (idx1 != 40)
                    {
                        (&a0->field_0)[idx1] = v3;
                        idx1 += 1;
                    }
                    else
                    {
                        sub_c73c94(40);
                    }
                }
            }
            a0->field_a0 = idx1;
            return;
        }
    }
    else if (idx & 7)
    {
        index = a0->field_a0;
        if (41 > index)
        {
            if (index)
            {
                v10 = 0;
                j = index * 4;
                iter = a0;
                do
                {
                    v13 = j;
                    v14 = v10 + iter->field_0 * ((&g_e08ea0.field_0)[idx & 7] >> ((char)idx & 7 & 31));
                    iter->field_0 = v14;
                    iter = &iter->field_4;
                    v10 = v14 >> 32;
                    j = v13 - 4;
                } while (j);
                if (v10)
                {
                    if (index != 40)
                    {
                        (&a0->field_0)[index] = v10;
                        index += 1;
                    }
                    else
                    {
                        sub_c73c94(40);
                    }
                }
            }
            a0->field_a0 = index;
            goto LABEL_bebdb8;
        }
    }
    else
    {
LABEL_bebdb8:
        if (idx >> 3 & 1)
        {
            idx2 = a0->field_a0;
            if (41 > idx2)
            {
                if (idx2)
                {
                    v17 = 0;
                    k = idx2 * 4;
                    node = a0;
                    do
                    {
                        v20 = k;
                        v21 = v17 + node->field_0 * 390625;
                        node->field_0 = v21;
                        node = &node->field_4;
                        v17 = v21 >> 32;
                        k = v20 - 4;
                    } while (k);
                    if (v17)
                    {
                        if (idx2 != 40)
                        {
                            (&a0->field_0)[idx2] = v17;
                            idx2 += 1;
                        }
                        else
                        {
                            sub_c73c94(40);
                        }
                    }
                }
                a0->field_a0 = idx2;
                goto LABEL_bebe10;
            }
        }
        else
        {
LABEL_bebe10:
            if (!(idx >> 4 & 1))
            {
                if (idx >> 5 & 1)
                    goto LABEL_bebe5c;
LABEL_bebe18:
                if (idx >> 6 & 1)
                    goto LABEL_bebe70;
LABEL_bebe1c:
                if (idx >> 7 & 1)
                    goto LABEL_bebe84;
LABEL_bebe20:
                if (idx >> 8 & 1)
                    goto LABEL_bebe24;
            }
            else
            {
                sub_be9320();
                if (!(idx >> 5 & 1))
                    goto LABEL_bebe18;
LABEL_bebe5c:
                sub_be9320();
                if (!(idx >> 6 & 1))
                    goto LABEL_bebe1c;
LABEL_bebe70:
                sub_be9320();
                if (!(idx >> 7 & 1))
                    goto LABEL_bebe20;
LABEL_bebe84:
                sub_be9320();
                if (idx >> 8 & 1)
                {
LABEL_bebe24:
                    sub_be9320();
                }
            }
            sub_be94fc();
            return;
        }
    }
    sub_c73bb0(0);
    sub_c73c94(40);
}
