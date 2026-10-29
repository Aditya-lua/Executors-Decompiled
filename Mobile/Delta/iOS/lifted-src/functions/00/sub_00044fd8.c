/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x44fd8..0x45198 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_44fd8_1 {
    struct st_44fd8_2 *field_0;
    unsigned long long field_8;
} st_44fd8_1;

typedef struct st_44fd8_2 {
    long long field_0;
} st_44fd8_2;

typedef struct st_44fd8_0 {
    char field_0;
} st_44fd8_0;


long long * sub_44fd8(long long *a0, st_44fd8_1 *a1, char a2, unsigned long long a3, unsigned long a4)
{
    unsigned long long v4;  // x8
    unsigned long long j;  // x22
    unsigned long long k;  // x24
    unsigned long long v15;  // x21
    long long *v16;  // x0
    unsigned long long i;  // x22
    long long *v7;  // x0
    unsigned long long v8;  // 4102
    long long *v9;  // x0
    unsigned long long v10;  // x23
    long long *v11;  // x0
    unsigned long long v12;  // x8
    unsigned long long v13;  // x9
    st_44fd8_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_44fd8_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_8;
    j = a3;
    if (v4 != j)
    {
        v8 = arm64g_calculate_condition(148, v4, j, 0);
        if (!(v8 & 1))
        {
            v9 = a0;
            if (a3)
            {
                v10 = 0;
                do
                {
                    v9 = sub_47e48(a0, *(long long *)&a1->field_0[v10], (unsigned int)v10 + a2 & 0xff, 1);
                    v10 += 1;
                } while (j != v10);
                v4 = a1->field_8;
            }
            if (v4 <= j)
                return v9;
            do
            {
                v11 = sub_4716c(a0, *(long long *)&a1->field_0[j]);
                j += 1;
            } while (j < a1->field_8);
            return v11;
        }
        else
        {
            if (v4)
            {
                if (v4 == 1)
                {
                    v12 = 0;
                    v13 = 1;
                }
                else
                {
                    k = 0;
                    do
                    {
                        sub_47e48(a0, *(long long *)&a1->field_0[k], (unsigned int)k + a2 & 0xff, 1);
                        k += 1;
                        v13 = (char)a1->field_8;
                        v12 = a1->field_8 - 1;
                    } while (k < v12);
                }
                return sub_3b0cc(a0, *(long long *)&a1->field_0[v12], a2 + (unsigned int)v13 - 1 & 0xff, (unsigned int)(a3 - v12) & 0xff);
            }
            else
            {
                if (!a3)
                    return a0;
                v15 = 0;
                do
                {
                    v16 = sub_2ad10(*a0, 2, (unsigned int)v15 + a2 & 0xff, 0, 0);
                    v15 += 1;
                } while (j != v15);
                return v16;
            }
        }
    }
    else if (v4)
    {
        i = 0;
        do
        {
            v7 = sub_47e48(a0, *(long long *)&a1->field_0[i], (unsigned int)i + a2 & 0xff, 1);
            i += 1;
        } while (i < a1->field_8);
        return v7;
    }
    else
    {
        return a0;
    }
}
