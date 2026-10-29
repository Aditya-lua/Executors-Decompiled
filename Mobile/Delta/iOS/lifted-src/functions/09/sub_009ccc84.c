/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ccc84..0x9cd090 (1036 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ccc84_1 {
    char field_0;
    char padding_1[15];
    long long field_10;
    char padding_18[8];
    struct st_9ccc84_0 *field_20;
} st_9ccc84_1;

typedef struct st_9ccc84_0 {
    char padding_0[8];
    char field_8;
    char padding_9[31];
    unsigned long long field_28;
} st_9ccc84_0;


unsigned long long sub_9ccc84(unsigned long a0, char a1, st_9ccc84_1 *a2, unsigned int a3, unsigned int a4)
{
    st_9ccc84_0 *v4;  // x8
    char v5;  // x21
    unsigned long v14;  // cc_dep1
    unsigned long long v15;  // 4131
    unsigned long v16;  // x23
    unsigned long long v17;  // 4109
    unsigned long long v18;  // 4109
    unsigned long long v19;  // x24
    char i;  // x24
    long long v21;  // x25
    char v22;  // x0
    unsigned long long v23;  // x0
    unsigned long long v6;  // x9
    unsigned long long v24;  // 4112
    unsigned long long v25;  // x0
    unsigned long long v26;  // 4112
    char j;  // x26
    long long v28;  // x21
    char v29;  // x0
    long long v30;  // x24
    unsigned long long v32;  // 4112
    char v7;  // x27
    unsigned long long v8;  // 4112
    unsigned long long v10;  // x0
    char v11;  // x8
    char v12;  // x28
    unsigned long long v13;  // x0
    unsigned int v0;  // [bp-0x68]
    unsigned int v1;  // [bp-0x64], Other Possible Types: char
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a2->field_20;
    v5 = a2->field_0;
    if (v5 && !*(long long *)a0)
        return 0;
    if (v4)
    {
        v6 = 40;
        if (!(v4->field_8 & 8))
            v6 = 24;
        v7 = *(long long *)&v4->padding_0[v6];
        if (3 < v5)
            goto LABEL_9ccd2c;
LABEL_9ccce4:
        if (!v5 && a2->field_10)
            return sub_9cd090();
        if (v5 == 1)
        {
            v12 = 0;
LABEL_9ccdc8:
            v13 = sub_9cf4d4(&v1);
            if (!(v13 >> 31 & 1))
            {
                if ((unsigned int)v13)
                    return v1;
                v1 = 0;
                v14 = a3;
                v15 = arm64g_calculate_condition(1, a3, 1, 0);
                if (v15 & 1)
                {
                    v16 = a4 & 0xffffff3f;
                    v17 = arm64g_calculate_condition(1, v14, 1, 0);
                    if (!(v17 & 1))
                        goto LABEL_9cce6a;
LABEL_9cce69:
                    v19 = 16;
                }
                else
                {
                    v16 = a4;
                    v18 = arm64g_calculate_condition(1, v14, 1, 0);
                    if (v18 & 1)
                        goto LABEL_9cce69;
LABEL_9cce6a:
                    v19 = a3;
                }
                if (v7)
                    v7();
                if (a2->padding_18 > 0)
                {
                    v0 = v19;
                    i = 0;
                    v21 = a2->field_10;
                    do
                    {
                        v22 = sub_9cf584(*(long long *)a0, v21, 1);
                        if (!v22)
                            return v22;
                        v23 = sub_9cd090(sub_9cf574(a0, v22), 0, v22, 0xffffffff, v16);
                        v24 = arm64g_calculate_condition(1, v23 & 0xffffffff, 1, 0);
                        if (v24 & 1)
                            return v23;
                        if ((int)(v1 ^ 0x7fffffff) < (int)v23)
                            return 0xffffffff;
                        v1 += (unsigned int)v23;
                        v21 += 40;
                        i += 1;
                    } while (i < a2->padding_18);
                    v19 = v0;
                }
                v25 = sub_9c7680(v5);
                if (!a1)
                    return v25;
                v26 = arm64g_calculate_condition(1, v25 & 0xffffffff, 1, 0);
                if (v26 & 1)
                    return v25;
                sub_9c755c(a1, v5, v1, v19, v16);
                if (a2->padding_18 >= 1)
                {
                    j = 0;
                    v28 = a2->field_10;
                    do
                    {
                        v29 = sub_9cf584(*(long long *)a0, v28, 1);
                        if (!v29)
                            return v29;
                        v30 = v29;
                        sub_9cd090(sub_9cf574(a0, v30), a1, v30, 0xffffffff, v16);
                        v28 += 40;
                        j += 1;
                    } while (j < a2->padding_18);
                }
                if (!(v12 & 1))
                    return v25;
                sub_9c766c(a1);
                return v25;
            }
        }
        else if (v5 == 2)
        {
            v8 = arm64g_calculate_condition(1, a3, 1, 0);
            if (!(v8 & 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_enc.c", 123, "ASN1_item_ex_i2d");
                sub_a36abc(13, 230, 0);
                return 0xffffffff;
            }
            else if (v7)
            {
                v7();
            }
            else
            {
                v10 = sub_9cf274(a0, a2);
                if (!(v10 >> 31 & 1))
                {
                    v11 = v10 & 0xffffffff;
                    if (a2->padding_18 > v11)
                    {
                        sub_9cf574(a0, a2->field_10 + v11 * 40);
                        return sub_9cd090();
                    }
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
        v7 = 0;
        if (v5 <= 3)
            goto LABEL_9ccce4;
LABEL_9ccd2c:
        if (v5 == 4)
        {
            goto *((void *)(v4->field_28));
        }
        else if (v5 == 5)
        {
            v32 = arm64g_calculate_condition(1, a3, 1, 0);
            if (!(v32 & 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_enc.c", 112, "ASN1_item_ex_i2d");
                sub_a36abc(13, 230, 0);
                return 0xffffffff;
            }
        }
        else if (v5 == 6)
        {
            v12 = (a4 & 0x800) >> 11;
            if (!(a4 & 0x800))
                v5 = 1;
            else
                v5 = 2;
            goto LABEL_9ccdc8;
        }
        else
        {
            return 0;
        }
    }
    return 0;
}
