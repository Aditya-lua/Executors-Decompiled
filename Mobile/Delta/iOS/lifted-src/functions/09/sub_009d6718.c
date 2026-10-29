/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d6718..0x9d6834 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d6718_0 {
    char padding_0[24];
    struct st_9d6718_0 *field_18;
} st_9d6718_0;


int sub_9d6718(unsigned long a0, st_9d6718_0 **a1)
{
    st_9d6718_0 *v2;  // x0
    st_9d6718_0 *v3;  // x8
    unsigned long long v12;  // 4102
    st_9d6718_0 *v4;  // x9
    st_9d6718_0 *v5;  // x10
    st_9d6718_0 *v6;  // x11
    st_9d6718_0 *v7;  // x12
    st_9d6718_0 *v8;  // x13
    st_9d6718_0 **iter;  // x14
    st_9d6718_0 *v10;  // w15
    st_9d6718_0 *v11;  // x15
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (v2)
    {
        v3 = &v2[1].padding_0[16];
        v4 = &v2[1].padding_0[8];
        v5 = v2 + 1;
        v6 = &v2->field_18;
        v7 = &v2->padding_0[16];
        v8 = &v2->padding_0[8];
        iter = a1 + 1;
        while (1)
        {
            v10 = (st_9d6718_0 *)*(int *)((char *)iter - 8);
            if (v10 > 44)
            {
                if (48 >= v10)
                {
                    if (v10 == 45)
                    {
                        v11 = v3;
                        if (!*(long long *)&v11->padding_0[0])
                            goto LABEL_9d6754;
                    }
                    else if (!(v10 != 48 || (v11 = v6, *(long long *)&v11->padding_0[0])))
                    {
                        goto LABEL_9d6754;
                    }
                }
                else
                {
                    if (v10 == 49)
                    {
                        v11 = v7;
                        if (!*(long long *)&v11->padding_0[0])
                        {
LABEL_9d6754:
                            *(st_9d6718_0 **)&v11->padding_0[0] = *iter;
                        }
                    }
                    else if (!(v10 != 50 || (v11 = v5, *(long long *)&v11->padding_0[0])))
                    {
                        goto LABEL_9d6754;
                    }
                }
            }
            else
            {
                if (v10 <= 42)
                {
                    v12 = arm64g_calculate_condition(19, (unsigned long long)v10, 42, 0);
                    if (!(v12 & 1))
                    {
                        v11 = v2;
                        if (!*(long long *)&v11->padding_0[0])
                            goto LABEL_9d6754;
                    }
                    else
                    {
                        if (!v10)
                            break;
                    }
                }
                else if (v10 == 43)
                {
                    v11 = v8;
                    if (!*(long long *)&v11->padding_0[0])
                        goto LABEL_9d6754;
                }
                else if (!(v10 != 44 || (v11 = v4, *(long long *)&v11->padding_0[0])))
                {
                    goto LABEL_9d6754;
                }
            }
            iter += 2;
        }
        v2 = 1;
    }
    return (unsigned int)v2;
}
