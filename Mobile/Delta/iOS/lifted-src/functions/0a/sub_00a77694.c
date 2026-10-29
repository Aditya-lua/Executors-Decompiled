/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa77694..0xa77818 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a77694_0 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_a77694_0 *field_10;
    struct st_a77694_0 *field_18;
    struct st_a77694_0 *field_20;
    char field_28;
    char padding_29[7];
    struct st_a77694_0 *field_30;
    struct st_a77694_0 *field_38;
    struct st_a77694_0 *field_40;
    struct st_a77694_0 *field_48;
    struct st_a77694_0 *field_50;
} st_a77694_0;


int sub_a77694(st_a77694_0 *a0, unsigned long a1, st_a77694_0 **a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_a77694_0 **v17;  // x11
    st_a77694_0 **v18;  // x13
    st_a77694_0 **v19;  // x14
    st_a77694_0 **iter;  // x16
    st_a77694_0 *v21;  // w17
    st_a77694_0 **v22;  // x1
    st_a77694_0 *v23;  // x20
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a77694_0 *v12;  // x12
    st_a77694_0 **v13;  // x12
    st_a77694_0 **v14;  // x8
    st_a77694_0 **v15;  // x9
    st_a77694_0 **v16;  // x10
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        a0 = sub_a6820c();
        if (a0)
        {
            v12 = a0;
            v12->field_0 = a1;
            v13 = &v12->field_18;
            v14 = &a0->field_50;
            v15 = &a0->field_48;
            v16 = &a0->field_40;
            v17 = &a0->field_38;
            v18 = &a0->field_30;
            v19 = &a0->field_20;
            iter = a2 + 1;
            while (1)
            {
                v21 = (st_a77694_0 *)*(int *)((char *)iter - 8);
                if (107 >= v21)
                {
                    if (105 >= v21)
                    {
                        v22 = v13;
                        if (v21 != 4 && !(v22 = v19, v21 == 105))
                        {
                            if (!v21)
                                break;
                            else
                                goto LABEL_a776f4;
                            goto LABEL_a776f4;
                        }
                    }
                    else
                    {
                        v22 = &a0->field_28;
                        if (v21 != 106 && !(v22 = v18, v21 == 107))
                            goto LABEL_a776f4;
                        goto LABEL_a776ec;
                    }
                    goto LABEL_a776ec;
                }
                if (109 >= v21)
                {
                    v22 = v17;
                    if (v21 != 108 && !(v22 = v16, v21 == 109))
                        goto LABEL_a776f4;
                    goto LABEL_a776ec;
                }
                v22 = v15;
                if (v21 == 110)
                {
LABEL_a776ec:
                    *v22 = *iter;
                    goto LABEL_a776f4;
                }
                else if (v21 != 111)
                {
LABEL_a776f4:
                    iter += 2;
                }
                else
                {
                    v22 = v14;
                    goto LABEL_a776ec;
                }
            }
            if (*v13 && *v19 && *v18 && *v17 && *v16 && *v15 && *v14)
            {
                v23 = a0;
                a0 = sub_a7c11c();
                v23->field_10 = a0;
                if (a0)
                    v23->field_20();
            }
            else
            {
                a0 = 0;
            }
        }
    }
    return (unsigned int)a0;
}
