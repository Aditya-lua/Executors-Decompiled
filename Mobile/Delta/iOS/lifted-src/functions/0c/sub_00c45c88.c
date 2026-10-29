/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc45c88..0xc45ec0 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c45c88_1 {
    char field_0;
    char field_1;
} st_c45c88_1;

typedef struct st_c45c88_0 {
    struct st_c45c88_1 *field_0;
    char padding_8[8];
    char field_10;
    uint128_t field_11;
    char field_21[23];
    char field_30;
    char padding_31[9];
    char field_3a;
} st_c45c88_0;

extern long long g_efd3b8;

char * sub_c45c88(st_c45c88_0 *a0)
{
    char *v13;  // x19
    char v14;  // x20
    char v23;  // x8
    unsigned long long v24;  // x1
    unsigned long v25;  // x8
    unsigned long long v26;  // x1
    unsigned int v15;  // w11
    char v16;  // x11
    char v17;  // x12
    char v18;  // x0
    char v19;  // x11
    unsigned long long v20;  // 4110
    unsigned long v21;  // x8
    unsigned long long v22;  // x1
    char *v0;  // [bp-0xa0]
    char v1;  // [bp-0x98], Other Possible Types: unsigned long long
    char v2;  // [bp-0x90]
    uint128_t v3;  // [bp-0x8f]
    uint128_t v4;  // [bp-0x7f]
    unsigned long v5;  // [bp-0x70]
    char v6;  // [bp-0x68]
    char v7;  // [bp-0x67]
    char v8;  // [bp-0x66]
    uint128_t v9;  // [bp-0x60]
    uint184_t v10;  // [bp-0x50]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = &a0->field_0->field_0;
    v14 = (char)a0->padding_8;
    v15 = a0->field_10;
    if (v15 != 6)
    {
        v9 = *(int128_t *)&(&a0->field_10)[1];
        *(int128_t *)&v10 = *(int128_t *)((char *)&a0->field_11 + 1);
        *(long long *)((char *)&v10 + 15) = *(long long *)&a0->field_21[0];
    }
    v3 = v9;
    v0 = v13;
    v1 = v14;
    v2 = v15;
    v4 = *(uint128_t *)&v10;
    v5 = *(unsigned long long *)((void*)&v10 + 15);
    v8 = a0->field_21[10];
    v6 = a0->field_21[8];
    v7 = a0->field_21[9];
    if (v6 != 2)
    {
LABEL_c45d64:
        if (v7 != 2)
            return v13;
        if (1 >= v6)
        {
            if (v8 & 1)
            {
                if (v14 >= 2)
                {
                    while (1)
                    {
                        sub_c5cbcc(&v9, &v0);
                        if (*(char *)((void*)&v9 + 8) != 10)
                            return v13;
                        v21 = *(unsigned long long *)&v9;
                        v22 = v14 - v21;
                        if (v14 < v21)
                            break;
                        v1 = v22;
                        v14 = v22;
                        if (1 >= v14)
                            return v13;
                    }
                }
                else
                {
                    return v13;
                }
            }
            else
            {
                while (1)
                {
                    v23 = v14;
                    if (v23)
                    {
                        if (v14 == 1)
                        {
                            if (*v13 != 46)
                                goto LABEL_c45e00;
                            goto LABEL_c45dd8;
                        }
                        else
                        {
                            if (*v13 != 46)
                            {
                                v23 = 0;
                                goto LABEL_c45e14;
                            }
                            if (v13[1] == 47)
                            {
LABEL_c45dd8:
                                if (1 >= v14)
                                    return v13;
                            }
                            else
                            {
LABEL_c45e00:
                                if (0 >= v14)
                                    return v13;
                            }
                        }
                    }
                    else
                    {
LABEL_c45e14:
                        if (v14 <= v23)
                            return v13;
                    }
                    sub_c5cbcc(&v9, &v0);
                    if (*(char *)((void*)&v9 + 8) != 10)
                        return v13;
                    v24 = v14 - *(unsigned long long *)&v9;
                    if (v14 < *(unsigned long long *)&v9)
                        break;
                    v1 = v24;
                    v14 = v24;
                }
            }
        }
        else
        {
            if (v14)
            {
                while (1)
                {
                    sub_c5cbcc(&v9, &v0);
                    if (*(char *)((void*)&v9 + 8) != 10)
                        return v13;
                    v25 = *(unsigned long long *)&v9;
                    v26 = v14 - v25;
                    if (v14 < v25)
                        break;
                    v1 = v26;
                    v14 = v26;
                    if (!v14)
                        return v13;
                }
            }
            else
            {
                return v13;
            }
        }
        v18 = sub_c73bb0(0);
    }
    else if (v14)
    {
        while (1)
        {
            v16 = 0;
            do
            {
                if (v13[v16] == 47)
                {
                    v17 = 1;
                    if (!v16)
                        goto LABEL_c45d44;
                    goto LABEL_c45d30;
                }
            } while ((v16 += 1, v14 != v16));
            v17 = 0;
            v16 = v14;
            if (!v14)
                goto LABEL_c45d44;
LABEL_c45d30:
            if (v16 != 1 || *v13 != 46)
                goto LABEL_c45d60;
LABEL_c45d44:
            v18 = v17 + v16;
            v19 = v14 - v18;
            if (v14 < v18)
                break;
            v13 = &v13[v18];
            v20 = arm64g_calculate_condition(20, v14, v18, 0);
            v14 = v19;
            if (!(v20 & 1))
            {
                v14 = 0;
LABEL_c45d60:
                v0 = v13;
                v1 = v14;
                goto LABEL_c45d64;
            }
        }
    }
    else
    {
        return v13;
    }
    sub_c73bb0(v18, v14, v14, &g_efd3b8);
}
