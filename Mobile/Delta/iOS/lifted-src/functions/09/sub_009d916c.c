/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d916c..0x9d9324 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d916c_0 {
    struct st_9d916c_0 *field_0;
    struct st_9d916c_0 *field_8;
} st_9d916c_0;

typedef struct st_9d916c_1 {
    unsigned int field_0[2];
    struct st_9d916c_1 *field_8;
} st_9d916c_1;

typedef struct st_9d916c_3 {
    char padding_0[40];
    struct st_9d916c_0 *field_28;
    struct st_9d916c_0 *field_2c;
    struct st_9d916c_0 *field_30;
    struct st_9d916c_0 *field_38;
    struct st_9d916c_2 *field_40;
} st_9d916c_3;

typedef struct st_9d916c_2 {
    struct st_9d916c_1 *field_0;
    char padding_8[8];
    struct st_9d916c_1 *field_10;
    char padding_18[8];
    struct st_9d916c_1 *field_20;
    char padding_28[8];
    struct st_9d916c_1 *field_30;
    char padding_38[8];
    struct st_9d916c_1 *field_40;
    char padding_48[8];
    struct st_9d916c_1 *field_50;
    char padding_58[4];
    struct st_9d916c_1 *field_5c;
    char padding_64[8];
    struct st_9d916c_1 *field_6c;
} st_9d916c_2;


st_9d916c_0 * sub_9d916c(st_9d916c_3 *a0, unsigned long long a1, unsigned long long a2, st_9d916c_0 *a3)
{
    st_9d916c_2 *v2;  // x19
    st_9d916c_0 *v3;  // w0
    st_9d916c_3 *v4;  // x8
    st_9d916c_0 *v5;  // x0
    st_9d916c_0 *v6;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 > 90)
    {
        v2 = a0->field_38;
        if (103 >= a1)
        {
            if (2 > a1 - 91)
            {
                if (!(int)a0->field_28)
                    goto LABEL_9d92bc;
                *(unsigned int *)&a3->field_0 = 1;
                *(int *)&a3->field_8 = (int)a0->field_30;
                return 1;
            }
            if (a1 != 100)
                goto LABEL_9d92bc;
            if (a2 != 2)
                return 0;
            if (a3)
            {
                v3 = (st_9d916c_0 *)(unsigned int)sub_9d3558(v2, sub_c044(a3));
                if (!v3)
                    goto LABEL_9d92bc;
                *(unsigned int *)&v2->padding_64[4] = 1;
                return v3;
            }
            return 0;
        }
        switch (a1)
        {
        case 123:
            if (a2 != 2 || !a3)
                return 0;
            a3->field_0 = v2;
            break;
            return 0;
        case 105:
            if ((int)a0->field_28)
            {
                v5 = (int)a0->field_30;
                if (!a3)
                    return v5;
                *(int *)&a3->field_0 = (int)a0->field_30;
                break;
                return v5;
            }
            else
            {
                return 0xffffffffffffffff;
            }
        case 104:
            if (*(int *)((char *)&a0->field_28 + 4))
            {
                if ((int)a0->field_28)
                    sub_9d66cc((int)a0->field_30);
                *(unsigned int *)&a0->field_2c = 0;
            }
            *(int *)&a0->field_30 = (int)a3->field_0;
            v4 = a0;
            *(unsigned int *)&v4->field_28 = 1;
            *(unsigned int *)((char *)&v4->field_28 + 4) = a2;
            *(unsigned int *)&v2->padding_64[4] = 0;
            *(uint128_t *)&v2->field_0 = 0;
            *(uint128_t *)&v2->field_10 = 0;
            *(uint128_t *)&v2->field_20 = 0;
            *(uint128_t *)&v2->field_30 = 0;
            *(uint128_t *)&v2->field_40 = 0;
            *(uint128_t *)&v2->field_50 = 0;
            *(uint128_t *)(v2->padding_58)[1] = 0;
            return 1;
        default:
LABEL_9d92bc:
            break;
        }
    }
    else if (10 >= a1)
    {
        switch (a1)
        {
        case 2:
            v6 = (int)a0->field_2c;
            return (v6 * 0x20000000000000 | v6 >> 11) & 0xffe0000000000001 & 1;
        case 8:
            return *(int *)((char *)&a0->field_28 + 4);
        case 9:
            *(unsigned int *)((char *)&a0->field_28 + 4) = a2;
            return 1;
        default:
LABEL_9d92bc:
            break;
        }
    }
    else
    {
        if (2 <= a1 - 11)
            goto LABEL_9d92bc;
        return 1;
    }
    return 0;
}
