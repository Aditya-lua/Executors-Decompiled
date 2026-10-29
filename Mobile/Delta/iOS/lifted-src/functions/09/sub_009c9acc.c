/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c9acc..0x9c9c18 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c9acc_0 {
    struct st_9c9acc_0 *field_0;
    char field_1;
    char field_2;
    char padding_3[5];
    struct st_9c9acc_1 *field_8;
} st_9c9acc_0;

typedef struct st_9c9acc_1 {
    char field_0;
} st_9c9acc_1;


st_9c9acc_0 * sub_9c9acc(long long a0, st_9c9acc_0 *a1)
{
    st_9c9acc_0 *v3;  // w21
    st_9c9acc_0 *v4;  // x23
    char v0;  // [bp-0x52]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a1)
        return 0;
    if ((int)a1->field_0)
    {
        if ((int)a1->field_0 >= 1)
        {
            sub_a6e2d0(&v0, *(char *)*(long long *)&a1->field_1);
            if (sub_9d3fec(a0, &v0, 2) == 2)
            {
                v3 = (st_9c9acc_0 *)2;
                if ((int)a1->field_0 < 2)
                    return 2;
                v4 = 1;
                while (1)
                {
                    if ((unsigned int)(v4 / 35) * 35 == (unsigned int)v4)
                    {
                        if (sub_9d3fec(a0, "\\\n", 2) != 2)
                            break;
                        v3 = (char *)&v3->field_0 + 2;
                    }
                    sub_a6e2d0(&v0, *(*(long long *)&a1->field_1 + (char *)v4));
                    if (sub_9d3fec(a0, &v0, 2) != 2)
                        break;
                    v3 = (char *)&v3->field_0 + 2;
                    v4 = (char *)&v4->field_0 + 1;
                    if (v4 >= (int)a1->field_0)
                        return (char *)&v3->field_0 + 2;
                }
            }
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if (sub_9d3fec(a0, "0", 1) == 1)
            return 1;
    }
    return 0xffffffff;
}
