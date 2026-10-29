/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab75d8..0xab7bdc (1540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab75d8_2 {
    char padding_0[120];
    struct st_ab75d8_3 *field_78;
    char padding_80[24];
    struct st_ab75d8_1 *field_98;
} st_ab75d8_2;

typedef struct st_ab75d8_3 {
    unsigned int field_0;
} st_ab75d8_3;

typedef struct st_ab75d8_1 {
    char padding_0[28];
    unsigned int field_1c;
    struct st_ab75d8_0 *field_20;
    char padding_28[12];
    unsigned int field_34;
} st_ab75d8_1;

typedef struct st_ab75d8_0 {
    struct st_ab75d8_0 *field_0;
} st_ab75d8_0;

extern char g_df6e58;

unsigned long long sub_ab75d8(st_ab75d8_2 *a0, unsigned long long a1, unsigned long a2, st_ab75d8_0 **a3)
{
    st_ab75d8_1 *v2;  // x20
    unsigned int v3;  // w8
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4118
    unsigned int v6;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_98;
    if (a1 > 0x1000)
    {
        if (13 >= a1 + 0xffffefff)
            goto *((void *)(sub_ab761c + (&g_df6e58)[0xffffefff + a1] * 4));
    }
    else
    {
        if (13 >= a1)
        {
            v3 = 1 << ((char)a1 & 31);
            if (!(v3 & 1560))
            {
                if (v3 & 2208)
                {
                    return 1;
                }
                else if (a1 == 13)
                {
                    *a3 = v2->field_20;
                    return 1;
                }
                goto LABEL_ab7670;
            }
            else
            {
                if (*(int *)a0->field_78 != 912)
                    return 1;
LABEL_ab7694:
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_pmeth.c", 641, "pkey_rsa_ctrl");
                sub_a36abc(4, 148, 0);
            }
        }
        else
        {
LABEL_ab7670:
            if (a1 == 1)
            {
                v4 = sub_ab8028(a3, v2->field_1c);
                if (!(unsigned int)v4)
                    return v4;
                v5 = arm64g_calculate_condition(1, v2->field_34, 1, 0);
                if (v5 & 1)
                {
                    v2->field_20 = a3;
                    return 1;
                }
                v6 = sub_9c7b68(v2->field_20);
                if (v6 == sub_9c7b68(a3))
                    return 1;
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_pmeth.c", 556, "pkey_rsa_ctrl");
                sub_a36abc(4, 145, 0);
                return 0;
            }
            if (a1 == 2)
                goto LABEL_ab7694;
        }
    }
    return 0xfffffffe;
}
