/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5cbcc..0xc5cd20 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5cbcc_2 {
    char padding_0[1];
    char field_1;
} st_c5cbcc_2;

typedef struct st_c5cbcc_1 {
    char field_0;
    char field_1;
} st_c5cbcc_1;

typedef struct st_c5cbcc_3 {
    unsigned long long field_0;
    char field_8;
    char padding_9[7];
    struct st_c5cbcc_2 *field_10;
    unsigned long long field_18;
} st_c5cbcc_3;

typedef struct st_c5cbcc_0 {
    struct st_c5cbcc_1 *field_0;
    char padding_8[48];
    char field_38;
    char padding_39[1];
    char field_3a;
} st_c5cbcc_0;


void sub_c5cbcc(st_c5cbcc_3 *a0, st_c5cbcc_0 *a1)
{
    unsigned long long v2;  // x8
    char *v3;  // x9
    unsigned long long v4;  // x1
    st_c5cbcc_2 *v5;  // x10
    unsigned long long v6;  // x12
    char *v7;  // x11
    char *v8;  // x11
    unsigned long long v9;  // x12
    unsigned long long v10;  // x11
    unsigned long long v11;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (2 > a1->field_38)
    {
        v2 = a1->field_3a;
        v3 = &a1->field_0->field_0;
        v4 = *(long long *)&a1->padding_8[0];
        if (v2 & 1)
        {
            if (v4)
                goto LABEL_c5cbf0;
            sub_c73bb0(1);
        }
        else
        {
            if (!v4)
            {
                v2 = 0;
            }
            else if (v4 == 1)
            {
                if (*v3 != 46)
                    goto LABEL_c5ccf0;
LABEL_c5cbf0:
                v2 = 1;
            }
            else
            {
                if (*v3 == 46 && v3[1] == 47)
                    goto LABEL_c5cbf0;
LABEL_c5ccf0:
                v2 = 0;
            }
LABEL_c5cc00:
            v5 = &v3[v2];
            v6 = v4 - v2;
            v7 = &v3[v4] - 1;
            do
            {
                v8 = v7;
                v9 = v6;
                if (!v9)
                {
                    v10 = 0;
                    v11 = v4 - v2;
                    if (v4 == v2)
                    {
                        a0->field_0 = 0 + v11;
                        a0->field_8 = 10;
                        a0->field_10 = v5;
                        a0->field_18 = v11;
                        return;
                    }
                }
            } while ((v6 = v9 - 1, v7 = v8 - 1, *v8 != 47));
            v2 += v9;
            if (v4 >= v2)
            {
                v5 = &v3[v2];
                v10 = 1;
                v11 = v4 - v2;
                if (v4 == v2)
                {
                    a0->field_0 = 1 + v11;
                    a0->field_8 = 10;
                    a0->field_10 = v5;
                    a0->field_18 = v11;
                    return;
                }
                if (v11 != 1)
                {
                    if (v11 == 2 && v3[v2] == 46 && v5->field_1 == 46)
                    {
                        a0->field_0 = v10 + v11;
                        a0->field_8 = 8;
                        a0->field_10 = v5;
                        a0->field_18 = v11;
                        return;
                    }
                }
                else
                {
                    if (v3[v2] == 46)
                    {
                        a0->field_0 = v10 + v11;
                        a0->field_8 = 10;
                        a0->field_10 = v5;
                        a0->field_18 = v11;
                        return;
                    }
                }
                a0->field_0 = v10 + v11;
                a0->field_8 = 9;
                a0->field_10 = v5;
                a0->field_18 = v11;
                return;
            }
        }
    }
    else
    {
        v2 = 0;
        v3 = &a1->field_0->field_0;
        v4 = *(long long *)&a1->padding_8[0];
        goto LABEL_c5cc00;
    }
    sub_c73bb0(v2);
}
