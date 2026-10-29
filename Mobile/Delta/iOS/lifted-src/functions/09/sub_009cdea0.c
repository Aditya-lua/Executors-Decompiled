/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cdea0..0x9ce1e4 (836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cdea0_2 {
    char field_0;
    char padding_1[15];
    long long field_10;
    char padding_18[8];
    struct st_9cdea0_0 *field_20;
    long long field_28;
} st_9cdea0_2;

typedef struct st_9cdea0_0 {
    char padding_0[8];
    struct st_9cdea0_1 *field_8;
    char padding_10[8];
    struct st_9cdea0_1 *field_18;
    char padding_20[24];
    struct st_9cdea0_1 *field_38;
} st_9cdea0_0;

typedef struct st_9cdea0_1 {
    unsigned long long field_0;
} st_9cdea0_1;


unsigned long long sub_9cdea0(long long *a0, st_9cdea0_2 *a1, unsigned long long a2, long long a3, long long a4)
{
    st_9cdea0_0 *v2;  // x8
    unsigned long long *v3;  // x25
    unsigned long long v4;  // w9
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x26
    long long v8;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_20;
    if (!v2 || (v3 = v2->field_18, !v2->field_18))
        v3 = 0;
    v4 = a1->field_0;
    if (3 >= v4)
    {
        if (v4)
        {
            if (v4 == 1)
                goto LABEL_9cdf84;
            if (v4 != 2)
                return 1;
            if (v3)
                v3();
            if ((unsigned int)a2)
            {
                _bzero(*a0, a1->field_28);
            }
            else
            {
                v5 = sub_a6bffc(a1->field_28, "crypto/asn1/tasn_new.c", 113);
                *a0 = v5;
                if (!v5)
                    return v5;
            }
            sub_9cf284(a0, 0xffffffff, a1);
        }
        else if (a1->field_10)
        {
            if (!sub_9ce1f4(a0))
                goto LABEL_9ce0c0;
        }
        else
        {
            if (!sub_9ce36c(a0, a1))
            {
LABEL_9ce0c0:
                goto LABEL_9ce14c;
            }
        }
    }
    else
    {
        if (v4 != 6)
        {
            if (v4 != 5)
            {
                if (v4 != 4)
                {
                    return 1;
                }
                else if (!v2)
                {
                    return 1;
                }
                else if (v2->field_38)
                {
                    v2->field_38();
                }
                else if (v2->field_8)
                {
                    v2->field_8();
                }
                else
                {
                    return 1;
                }
            }
            if (!sub_9ce36c(a0, a1))
                goto LABEL_9ce014;
        }
        else
        {
LABEL_9cdf84:
            if (v3)
                v3();
            if ((unsigned int)a2)
            {
                _bzero(*a0, a1->field_28);
                if (!(sub_9cf298(a0, 0, a1) >> 31 & 1))
                    goto LABEL_9ce054;
LABEL_9ce014:
                goto LABEL_9ce14c;
            }
            v6 = sub_a6bffc(a1->field_28, "crypto/asn1/tasn_new.c", 135);
            *a0 = v6;
            if (!v6)
                return v6;
            if (sub_9cf298(a0, 0, a1) >> 31 & 1)
            {
                sub_a6c2e4(*a0, "crypto/asn1/tasn_new.c", 142);
                *a0 = 0;
LABEL_9ce14c:
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_new.c", 162, "asn1_item_embed_new");
                sub_a36abc(13, 0x8000d, 0);
                return 0;
            }
LABEL_9ce054:
            sub_9cf394(a0, a1);
            if (a1->padding_18 >= 1)
            {
                v7 = 0;
                v8 = a1->field_10;
                do
                {
                    if (!sub_9ce1f4(sub_9cf574(a0, v8), v8, a3, a4))
                    {
                        sub_9cd988(a0, a1, a2);
                        goto LABEL_9ce14c;
                    }
                } while ((v8 += 40, v7 += 1, (long long)v7 < a1->padding_18));
            }
        }
    }
    return 1;
}
