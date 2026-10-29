/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cc568..0x9cc96c (1028 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cc568_0 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_9cc568_1 *field_20;
} st_9cc568_0;

typedef struct st_9cc568_1 {
    unsigned long long field_0;
} st_9cc568_1;

typedef struct st_9cc568_2 {
    struct st_9cc568_2 *field_0;
} st_9cc568_2;


long long sub_9cc568(st_9cc568_2 **a0, unsigned long long *a1, unsigned long a2, st_9cc568_0 *a3, char a4, unsigned long long a5, unsigned long a6, unsigned long a7)
{
    st_9cc568_2 **v10;  // x23
    unsigned long long v11;  // x19
    unsigned int v12;  // w27
    unsigned long v13;  // x0
    unsigned long long v14;  // 4112
    unsigned long v15;  // x25
    unsigned int v16;  // x0
    long long v17;  // x1
    unsigned int v0;  // [bp-0xb0]
    char v1;  // [bp-0xac]
    unsigned long long v2;  // [bp-0xa8]
    unsigned int v3;  // [bp-0x88], Other Possible Types: unsigned long long
    char v4;  // [bp-0x79], Other Possible Types: unsigned int
    unsigned long v5;  // [bp-0x78]
    st_9cc568_2 **v6;  // [bp-0x70]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a0;
    v7 = a2;
    v11 = a3->field_0;
    v12 = (unsigned int)v11 & 192;
    v5 = *a1;
    if (v11 >> 12 & 1)
    {
        v6 = v10;
        v10 = &v6;
    }
    if ((unsigned int)v11 & 6)
    {
        if (!(v11 >> 3 & 1))
            v12 = 0;
        v2 = a5;
        v1 = a4;
        v0 = v12;
        v13 = sub_9cc2f8(&v7, 0, 0, &v4, 0, &v5, a2);
        v14 = arm64g_calculate_condition(1, v13 & 0xffffffff, 1, 0);
        if (v14 & 1)
        {
            return v13;
        }
        else if (!(unsigned int)v13)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/tasn_dec.c", 639, "asn1_template_noexp_d2i");
            sub_a36abc(13, 0x8010a, 0);
            return v13;
        }
        else
        {
            v15 = *v10;
            if (v15)
            {
                if ((int)sub_ad69e4(v15) >= 1)
                {
                    v3 = sub_ad692c(v15);
                    a3->field_20();
                }
                if (!*v10)
                    goto LABEL_9cc848;
LABEL_9cc714:
                if ((long long)v7 >= 1)
                {
                    if (v7 == 1 || *(char *)v5 || *(char *)(v5 + 1))
                    {
                        v3 = 0;
                        a3->field_20();
                    }
                    v5 += 2;
                    if (v4)
                    {
                        *a1 = v5;
                        return 1;
                    }
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/tasn_dec.c", 669, "asn1_template_noexp_d2i");
                    v17 = 159;
                }
                else
                {
                    if (v4)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/tasn_dec.c", 694, "asn1_template_noexp_d2i");
                        v17 = 137;
                    }
                    else
                    {
                        *a1 = v5;
                        return 1;
                    }
                }
            }
            else
            {
                v16 = sub_ad61b4();
                *v10 = v16;
                if (v16)
                    goto LABEL_9cc714;
LABEL_9cc848:
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 658, "asn1_template_noexp_d2i");
                v17 = 524303;
            }
            sub_a36abc(13, v17, 0);
            return 0;
        }
    }
    a3->field_20();
}
