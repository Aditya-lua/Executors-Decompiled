/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ce36c..0x9ce4d4 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ce36c_0 {
    struct st_9ce36c_0 *field_0;
    struct st_9ce36c_0 *field_4;
    struct st_9ce36c_0 *field_8;
    struct st_9ce36c_0 *field_10;
    char padding_18[8];
    struct st_9ce36c_0 *field_20;
    unsigned long long field_28;
} st_9ce36c_0;


st_9ce36c_0 * sub_9ce36c(st_9ce36c_0 **a0, st_9ce36c_0 *a1, st_9ce36c_0 *a2)
{
    st_9ce36c_0 *v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v4;  // 4112
    st_9ce36c_0 *v5;  // x0
    st_9ce36c_0 *v7;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = (st_9ce36c_0 *)a1->padding_18;
    if (v2)
    {
        if (a2)
        {
            if (v2->padding_18)
                v2->padding_18();
        }
        else
        {
            if (v2->field_8)
                goto *((void *)(v2->field_8));
        }
    }
    if ((char)a1->field_0 == 5)
    {
        v3 = 0xffffffff;
    }
    else
    {
        v3 = (int)a1->field_4;
        if (4 >= (int)v3)
        {
            v4 = arm64g_calculate_condition(1, v3 & 0xffffffff, 4, 0);
            if (!(v4 & 1))
            {
                if ((unsigned int)v3 == 1)
                {
                    *(unsigned int *)a0 = (unsigned int)a1->field_20;
                    return 1;
                }
            }
            else
            {
                v5 = sub_a6bf4c(16, "crypto/asn1/tasn_new.c", 299);
                if (!v5)
                    return 0;
                v5->field_4 = 0;
                *(unsigned int *)&v5->field_0 = 0xffffffff;
                *a0 = v5;
                return *a0 != 0;
            }
        }
        else if ((unsigned int)v3 == 5)
        {
            *a0 = 1;
            return 1;
        }
        else if ((unsigned int)v3 == 6)
        {
            *a0 = sub_a99624(0);
            return 1;
        }
    }
    if (a2)
    {
        v7 = *a0;
        v7->field_0 = 0;
        v7->field_4 = 0;
        *(unsigned int *)((char *)&v7->field_0 + 4) = v3;
        v7->field_8 = 128;
    }
    else
    {
        v7 = sub_9c79e8(v3);
        *a0 = v7;
    }
    if ((char)a1->field_0 != 5 || !v7)
        return *a0 != 0;
    v7->field_8 = v7->field_8 | 64;
    return *a0 != 0;
}
