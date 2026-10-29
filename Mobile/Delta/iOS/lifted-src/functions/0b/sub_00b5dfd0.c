/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5dfd0..0xb5e350 (896 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5dfd0_2 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[8];
    unsigned long long field_28;
    unsigned long long field_30;
    char padding_38[24];
    unsigned int field_50;
    char field_54;
    char field_55;
    char padding_56[146];
    long long field_e8;
    struct st_b5dfd0_0 *field_f0;
} st_b5dfd0_2;

typedef struct st_b5dfd0_0 {
    char padding_0[8];
    struct st_b5dfd0_1 *field_8;
    struct st_b5dfd0_1 *field_10;
    struct st_b5dfd0_1 *field_18;
    struct st_b5dfd0_1 *field_20;
} st_b5dfd0_0;

typedef struct st_b5dfd0_1 {
    unsigned long long field_0;
} st_b5dfd0_1;


unsigned int sub_b5dfd0(st_b5dfd0_2 *a0, unsigned int a1, unsigned long a2, unsigned int a3, unsigned long a4)
{
    unsigned long long v2;  // 4173
    unsigned int v3;  // w0
    unsigned long v4;  // x9
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4114
    unsigned long v7;  // x8
    unsigned int v8;  // w9
    st_b5dfd0_0 *v9;  // x24
    unsigned long long v10;  // x9
    unsigned long long v11;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(2, a0->field_28, 1, 0);
    if (!(v2 & 1))
    {
        v3 = sub_a2f9e0();
        if (v3)
        {
            v4 = a0->field_54;
            if (v4 >> 2 & 1)
            {
                v3 = 0;
                if (a1 != a3 || a4 < 24)
                    goto LABEL_b5e020;
                if (v4 & 1)
                {
                    v5 = a0->field_30;
                    a0->field_30 = v5 + 1;
                    v6 = arm64g_calculate_condition(50, v5, 1, 0);
                    if (!(v6 & 1))
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/ciphers/ciphercommon_gcm.c", 554, "gcm_tls_cipher");
                        sub_a36abc(57, 126, 0);
                    }
                    else
                    {
                        if (!(~(unsigned int)v4 & 20))
                            a0->field_f0->field_8();
                    }
                }
                else if (!(~(unsigned int)v4 & 20))
                {
                    *(long long *)&a0->padding_38[21 + a0->field_10] = *(long long *)a1;
                    a0->field_f0->field_8();
                }
            }
            v3 = 0;
        }
LABEL_b5e020:
        a0->field_50 = 3;
        a0->field_28 = 0xffffffffffffffff;
    }
    else
    {
        v7 = a0->field_54;
        if (!(v7 >> 2 & 1))
            goto LABEL_b5e03c;
        switch (v8)
        {
        case 1:
            v9 = a0->field_f0;
            v9->field_8();
        case 0:
            if (v7 & 1)
            {
                v3 = 0;
                v10 = a0->field_10;
                if (v10 < 12 || (int)v10 < 1)
                    break;
                if ((int)sub_aa8658(a0->field_e8, &a0->field_55, v10 & 0x7fffffff, 0) >= 1)
                {
                    a0->field_50 = 1;
                    a0->field_54 = a0->field_54 | 8;
                    v9->field_8();
                }
            }
        case 3:
LABEL_b5e03c:
            v3 = 0;
            break;
        default:
            if (a3)
            {
                if (a1)
                    v9->field_18();
                v9->field_10();
            }
            else
            {
                if (a0->field_54 & 1 || !(v11 = arm64g_calculate_condition(2, a0->field_18, 1, 0), v11 & 1))
                    v9->field_20();
            }
        }
    }
    *(unsigned long long *)a2 = 0;
    return v3;
}
