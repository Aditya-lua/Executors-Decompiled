/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb763f0..0xb76570 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b763f0_0 {
    struct st_b763f0_0 *field_0;
    char field_8;
    char padding_9[15];
    unsigned long long field_18;
} st_b763f0_0;

typedef struct st_b763f0_1 {
    struct st_b763f0_0 *field_0;
    struct st_b763f0_0 *field_8;
    struct st_b763f0_0 *field_10;
    struct st_b763f0_0 *field_18;
    struct st_b763f0_0 *field_20;
    struct st_b763f0_2 *field_28;
    struct st_b763f0_0 *field_30;
    struct st_b763f0_2 *field_38;
    struct st_b763f0_0 *field_40;
    struct st_b763f0_0 *field_48;
} st_b763f0_1;

typedef struct st_b763f0_2 {
    struct st_b763f0_0 *field_0;
} st_b763f0_2;


st_b763f0_0 * sub_b763f0(st_b763f0_1 *a0)
{
    st_b763f0_0 *ptr;  // x20
    st_b763f0_0 *v3;  // x24
    unsigned long v12;  // x9
    st_b763f0_0 *ptr1;  // x0
    st_b763f0_0 *v14;  // x0
    st_b763f0_0 **v15;  // x8
    st_b763f0_0 *v16;  // x0
    st_b763f0_0 *v4;  // x21
    st_b763f0_0 *v5;  // x8
    st_b763f0_0 *v6;  // x9
    st_b763f0_0 *ptr2;  // x0
    st_b763f0_0 *v8;  // x23
    st_b763f0_0 *v9;  // x25
    st_b763f0_0 *v10;  // x24
    st_b763f0_0 *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        if (a0->field_8 == a0->field_18)
        {
            if (a0->field_10)
                _free();
            a0->field_0 = 0;
        }
        else
        {
            v14 = a0->field_8->field_0;
            a0->field_8 = &a0->field_8->field_8;
            return v14;
        }
    }
    v3 = a0->field_40;
    if (v3)
    {
        v4 = a0->field_48;
        if (v3 != v4)
        {
            v5 = v3;
            v6 = v5->field_0;
            a0->field_40 = &v5->field_18;
            if (v6 == 0x8000000000000000)
            {
                ptr2 = _malloc(8);
                if (!ptr2)
                    sub_c6ba70(8, 8);
                ptr = ptr2;
                ptr2->field_0 = &v3->field_8;
                v8 = 1;
            }
            else
            {
                v8 = 0;
                ptr = 8;
            }
            v9 = (char *)ptr + 0x8 * v8;
            v10 = v3 + 1;
            while (1)
            {
                if (ptr != v9)
                {
                    a0->field_0 = ptr;
                    a0->field_10 = v8;
                    a0->field_18 = v9;
                    v14 = ptr->field_0;
                    a0->field_8 = &ptr->field_8;
                    return v14;
                }
                if (v8)
                    _free(ptr);
                v11 = (char *)v10 - 8;
                if (v11 == v4)
                    break;
                v12 = v11->field_0;
                a0->field_40 = &v11->field_18;
                if (v12 != 0x8000000000000000)
                {
                    v8 = 0;
                    ptr = 8;
                }
                else
                {
                    ptr1 = _malloc(8);
                    if (!ptr1)
                    {
                        a0->field_0 = 0;
                        a0->field_8 = ptr;
                        a0->field_10 = v8;
                        a0->field_18 = v9;
                        sub_c6ba70(8, 8);
                    }
                    ptr1->field_0 = v10;
                    v8 = 1;
                    ptr = ptr1;
                }
                v9 = (char *)ptr + 0x8 * v8;
                v10 = &v10->field_18;
            }
            a0->field_0 = 0;
            a0->field_8 = ptr;
            a0->field_10 = v8;
            a0->field_18 = v9;
        }
    }
    if (!a0->field_20)
        return a0->field_20;
    v15 = a0->field_28;
    if (v15 != a0->field_38)
    {
        v16 = *v15;
        a0->field_28 = v15 + 1;
        return v16;
    }
    if (a0->field_30)
        _free();
    a0->field_20 = 0;
    return 0;
}
