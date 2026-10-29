/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c994c..0x9c9acc (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c994c_0 {
    char padding_0[5];
    char field_5;
    char padding_6[2];
    struct st_9c994c_1 *field_8;
} st_9c994c_0;

typedef struct st_9c994c_1 {
    char field_0;
} st_9c994c_1;


unsigned long long sub_9c994c(long long a0, st_9c994c_0 *a1)
{
    char v3;  // x19
    unsigned int v4;  // w19
    char v5;  // x23
    char v0;  // [bp-0x52]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a1)
        return 0;
    if (!(a1->field_5 & 1))
    {
        v3 = 0;
    }
    else
    {
        v3 = 1;
        if (sub_9d3fec(a0, "-", 1) != 1)
            return 0xffffffff;
    }
    if (*(int *)&a1->padding_0[0])
    {
        if (*(int *)&a1->padding_0[0] >= 1)
        {
            sub_a6e2d0(&v0, *(char *)a1->field_8);
            if (sub_9d3fec(a0, &v0, 2) != 2)
                return 0xffffffff;
            v4 = v3 | 2;
            if (*(int *)&a1->padding_0[0] < 2)
                return v3 | 2;
            v5 = 1;
            while (1)
            {
                if ((unsigned int)(v5 / 35) * 35 == v5)
                {
                    if (sub_9d3fec(a0, "\\\n", 2) != 2)
                        break;
                    v4 += 2;
                }
                sub_a6e2d0(&v0, *(char *)&a1->field_8[v5]);
                if (sub_9d3fec(a0, &v0, 2) != 2)
                    break;
                v4 += 2;
                v5 += 1;
                if (v5 >= *(int *)&a1->padding_0[0])
                    return v4 + 2;
            }
            return 0xffffffff;
        }
        else
        {
            return v3;
        }
    }
    else
    {
        if (sub_9d3fec(a0, "00", 2) == 2)
            return v3 | 2;
        return 0xffffffff;
    }
}
