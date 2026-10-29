/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaefdf4..0xaf0098 (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aefdf4_0 {
    long long field_0;
    struct st_aefdf4_1 *field_8;
} st_aefdf4_0;

typedef struct st_aefdf4_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_aefdf4_0 *field_8;
} st_aefdf4_1;

extern long long g_af0b5c;
extern long long g_af0c20;
extern long long g_af1040;

unsigned long long sub_aefdf4(long long a0, char *a1, long long a2, unsigned int a3, unsigned long long a4, long long a5)
{
    long long len;  // x22
    long long v6;  // x25
    unsigned int v15;  // w8
    unsigned long v16;  // cc_dep1
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned int v21;  // w0
    st_aefdf4_1 *v22;  // x27
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // 4112
    unsigned long long v7;  // x21
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    unsigned long long v28;  // x0
    long long v29;  // x25
    unsigned long long v30;  // x26
    unsigned long long v31;  // x0
    unsigned long long v32;  // x0
    long long v8;  // x24
    unsigned long long v9;  // x27
    unsigned long long v10;  // x0
    unsigned long long v11;  // x28
    unsigned long long v12;  // w23
    unsigned long long v13;  // x25
    st_aefdf4_1 *v14;  // x27
    unsigned int v0;  // [bp-0x6c]
    unsigned long long v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x64]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    len = a2;
    v6 = a0;
    v7 = a3 & 0xffff7fff;
    if (a4 == 1)
    {
        v9 = 48;
        v1 = 1;
        v2 = 22;
        v8 = "?";
        if (!len)
            goto LABEL_aefe80;
    }
    else if (a4 == 2)
    {
        if ((unsigned long long)len >= 2)
            v7 = (unsigned int)v7 | (*a1 == 46) * 0x8000;
        if (!((unsigned int)v7 & 2))
            v8 = &g_af0c20;
        else
            v8 = &g_af0b5c;
        v9 = 13;
        v1 = 1;
        v2 = 22;
        if (!len)
            goto LABEL_aefe80;
    }
    else
    {
        v9 = 0;
        v1 = 0;
        v2 = 4;
        v8 = &g_af1040;
        if (!len)
        {
LABEL_aefe80:
            len = _strlen(a1);
        }
    }
    v10 = sub_af2750(v6, 0x55, 0, 0);
    if (v10)
    {
        v11 = v10;
        if ((int)sub_ad69e4() > 0)
        {
            v0 = v9;
            v12 = 0;
            v13 = 0;
            do
            {
                v14 = sub_ad69f8(v11, v13);
                v15 = v14->field_0;
                v16 = v15;
                if (1 < (int)v15)
                {
                    v23 = v15;
                    if (v15 != 2)
                    {
                        if (v15 == 7)
                        {
                            v24 = arm64g_calculate_condition(3, v23, 2, 0);
                            v25 = arm64g_calculate_condition(19, (v24 & 1 ? a4 : 0), (v24 & 1 ? 7 : 0), 0);
                            if (v25 & 1)
                                continue;
                        }
                        else
                        {
                            v26 = arm64g_calculate_condition(3, v23, 2, 0);
                            v27 = arm64g_calculate_condition(16, (v26 & 1 ? a4 : 0), (v26 & 1 ? 7 : 0), 0);
                            if (v27 & 1)
                                continue;
                        }
                    }
                    else
                    {
                        if (a4 != 2)
                            continue;
                    }
                }
                else if (!v15)
                {
                    v21 = sub_a99eac(v14->field_8->field_0);
                    if (a4 != 1 || v21 != 1208 || !(v22 = v14->field_8->field_8, v14->field_8->field_8->field_0 == 12))
                        continue;
                    v2 = 0;
                    v14 = v14->field_8->field_8;
                }
                else if (v15 == 1)
                {
                    v17 = arm64g_calculate_condition(3, v16, 1, 0);
                    v18 = arm64g_calculate_condition(19, (v17 & 1 ? a4 : 0), v17 & 1, 0);
                    if (v18 & 1)
                        continue;
                }
                else
                {
                    v19 = arm64g_calculate_condition(3, v16, 1, 0);
                    v20 = arm64g_calculate_condition(16, (v19 & 1 ? a4 : 0), v19 & 1, 0);
                    if (v20 & 1)
                        continue;
                }
                v28 = sub_af10e4(v14->field_8, v2, v8, v7, a1, len, a5);
                if ((unsigned int)v28)
                {
                    sub_ae75d4(v11);
                    return v28;
                }
                v12 = 1;
            } while ((v13 = (unsigned int)v13 + 1, (int)sub_ad69e4(v11) > (int)v13));
            sub_ae75d4(v11);
            v9 = v0;
            if (!(v7 & 1) && v12)
                goto LABEL_af0060;
        }
        else
        {
            sub_ae75d4(v11);
        }
    }
    if (v1 & 1 && !(((unsigned int)v7 & 32) >> 5 & 1))
    {
        v29 = sub_ab1c50(v6);
        v30 = 0xffffffff;
        while (1)
        {
            v31 = sub_af8d64(v29, v9, v30);
            if (v31 >> 31 & 1)
                break;
            v30 = v31;
            v32 = sub_af10e4(sub_9f2aec(sub_af8cf4(v29, v30), v30), 0xffffffff, v8, v7, a1, len, a5);
            if ((unsigned int)v32)
                return v32;
        }
    }
LABEL_af0060:
    return 0;
}
