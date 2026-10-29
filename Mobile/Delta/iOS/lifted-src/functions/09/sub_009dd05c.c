/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dd05c..0x9dd260 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dd05c_0 {
    struct st_9dd05c_0 *field_0;
    struct st_9dd05c_0 *field_8;
    struct st_9dd05c_0 *field_10;
    long long field_18;
    char padding_20[24];
    struct st_9dd05c_0 *field_38;
    struct st_9dd05c_0 *field_40;
    long long field_48;
} st_9dd05c_0;


st_9dd05c_0 * sub_9dd05c(st_9dd05c_0 *a0, st_9dd05c_0 *a1, unsigned long a2, long long a3, st_9dd05c_0 *a4, st_9dd05c_0 *a5)
{
    st_9dd05c_0 *v3;  // x19
    st_9dd05c_0 *v4;  // x0
    st_9dd05c_0 *v5;  // x0
    st_9dd05c_0 *v6;  // x0
    unsigned int v7;  // w22
    unsigned int v8;  // w22
    unsigned long long v9;  // 4113
    st_9dd05c_0 *v10;  // w0
    st_9dd05c_0 *v0;  // [bp-0x44], Other Possible Types: char
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    if (!v3)
    {
        v3 = sub_9dcd4c();
        if (!v3)
            return v3;
    }
    if ((v3->field_0 || (v4 = sub_9e4958(), v3->field_0 = v4, v4)) && (v3->field_8 || (v5 = sub_9e4958(), v3->field_8 = v5, v5)))
    {
        v6 = v3->field_10;
        if (a1)
        {
            sub_9e48d4(v6);
            v6 = sub_9e4b00(a1);
            v3->field_10 = v6;
        }
        if (v6)
        {
            if (a4)
                v3->field_40 = a4;
            if (a5)
                v3->field_38 = a5;
            if (sub_9e93c8(v3->field_0, v3->field_18, 0, a3))
            {
                v7 = 0xffffffdf;
                while (1)
                {
                    if (!sub_9e0e6c(v3->field_8, v3->field_0, v3->field_18, a3, &v0))
                    {
                        if (!v0)
                            break;
                        v8 = v7 + 1;
                        v9 = arm64g_calculate_condition(33, v7, 1, 0);
                        if (!(v9 & 1))
                        {
                            v7 = v8;
                            if (!sub_9e93c8(v3->field_0, v3->field_18, 0, a3))
                                break;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/bn/bn_blind.c", 283, "BN_BLINDING_create_param");
                            sub_a36abc(3, 113, 0);
                            break;
                        }
                    }
                    else
                    {
                        if (v3->field_40 && v3->field_38)
                            v3->field_40();
                        if (sub_9dea6c(v3->field_0, v3->field_0, v3->field_10, v3->field_18, a3))
                        {
                            if (!v3->field_38)
                                return v3;
                            if (sub_9e6bf4(v3->field_8, v3->field_8))
                            {
                                v10 = (st_9dd05c_0 *)(unsigned int)sub_9e6bf4(v3->field_0, v3->field_0, v3->field_38, a3);
                                if (a0)
                                {
                                    return v3;
                                }
                                else if (v10)
                                {
                                    return v3;
                                }
LABEL_9dd1b0:
                                sub_9e48d4(v3->field_0);
                                sub_9e48d4(v3->field_8);
                                sub_9e48d4(v3->field_10);
                                sub_9e48d4(v3->field_18);
                                sub_a7c1d0(v3->field_48);
                                sub_a6c2e4(v3, "crypto/bn/bn_blind.c", 88);
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
    if (a0)
        return v3;
    goto LABEL_9dd1b0;
}
