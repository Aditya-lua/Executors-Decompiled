/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada4f4..0xada6e0 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada4f4_0 {
    char padding_0[40];
    unsigned int field_28;
} st_ada4f4_0;

typedef struct st_ada4f4_2 {
    unsigned int field_0;
    char padding_4[20];
    struct st_ada4f4_1 *field_18;
    unsigned long long field_20;
    unsigned int field_28;
    unsigned int field_2c;
    struct st_ada4f4_3 *field_30;
    struct st_ada4f4_3 *field_38;
} st_ada4f4_2;

typedef struct st_ada4f4_1 {
    struct st_ada4f4_1 *field_0;
} st_ada4f4_1;

typedef struct st_ada4f4_3 {
    char field_0;
} st_ada4f4_3;


st_ada4f4_1 ** sub_ada4f4(st_ada4f4_0 *a0, st_ada4f4_2 *a1, char *a2, unsigned int a3)
{
    unsigned int v4;  // w8
    st_ada4f4_1 **v5;  // x2
    long long v6;  // x1
    unsigned long n;  // x21
    long long v8;  // x1
    st_ada4f4_1 **v9;  // w8
    char *v10;  // x23
    unsigned long v11;  // x21
    unsigned long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_28;
    a0->field_28 = v4 & 0xfffffffe;
    if (2 > a1->field_0 - 1)
    {
        if ((int)a1->field_28 > (int)a3)
        {
            a0->field_28 = v4 | 1;
            sub_a368c8();
            sub_a369bc("crypto/ui/ui_lib.c", 898, "UI_set_result_ex");
            v0 = a1->field_28;
            v1 = a1->field_2c;
            v5 = "You must type in %d to %d characters";
            v6 = 101;
        }
        else if ((int)a3 > (int)a1->field_2c)
        {
            a0->field_28 = v4 | 1;
            sub_a368c8();
            sub_a369bc("crypto/ui/ui_lib.c", 906, "UI_set_result_ex");
            v0 = a1->field_28;
            v1 = a1->field_2c;
            v5 = "You must type in %d to %d characters";
            v6 = 100;
        }
        else
        {
            if (a1->field_18)
            {
                n = a3;
                _memcpy(a1->field_18, a2, n);
                if ((int)a1->field_2c >= (int)a3)
                    *((char *)a1->field_18 + n) = 0;
                a1->field_20 = n;
                return 0;
            }
            sub_a368c8(0);
            v8 = 914;
LABEL_ada690:
            sub_a369bc("crypto/ui/ui_lib.c", v8, "UI_set_result_ex");
            v6 = 105;
            v5 = 0;
        }
        sub_a36abc(40, v6, v5);
        return 0xffffffff;
    }
    if (a1->field_0 != 3)
    {
        return 0;
    }
    else if (a1->field_18)
    {
        *(char *)&a1->field_18->field_0 = 0;
        v9 = (st_ada4f4_1 **)*a2;
        if (!v9)
            return 0;
        v10 = a2 + 1;
        while (1)
        {
            v11 = (char)v9;
            if (_strchr(a1->field_30, v11))
            {
                *(char *)&a1->field_18->field_0 = *(char *)a1->field_30;
                return 0;
            }
            else if (!_strchr(a1->field_38, v11))
            {
                v9 = (st_ada4f4_1 **)*v10;
                v10 += 1;
                if (!v9)
                    return 0;
            }
            else
            {
                *(char *)&a1->field_18->field_0 = *(char *)a1->field_38;
                return 0;
            }
        }
    }
    else
    {
        sub_a368c8();
        v8 = 927;
        goto LABEL_ada690;
    }
    goto LABEL_ada690;
}
