/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf5bf0..0xaf5df4 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af5bf0_3 {
    char padding_0[232];
    unsigned int field_e8;
} st_af5bf0_3;

typedef struct st_af5bf0_1 {
    char padding_0[32];
    struct st_af5bf0_0 *field_20;
    char padding_28[16];
    struct st_af5bf0_2 *field_38;
    char padding_40[88];
    long long field_98;
    char field_a0;
    char padding_a1[7];
    char field_a8;
    char padding_a9[3];
    unsigned int field_ac;
    unsigned int field_b0;
    char padding_b4[68];
    unsigned int field_f8;
} st_af5bf0_1;

typedef struct st_af5bf0_0 {
    char padding_0[24];
    unsigned int field_18;
    char field_19;
    char padding_1a[22];
    long long field_30;
} st_af5bf0_0;

typedef struct st_af5bf0_2 {
    unsigned long long field_0;
} st_af5bf0_2;


unsigned long long sub_af5bf0(st_af5bf0_1 *a0)
{
    long long v2;  // x20
    long long v3;  // x21
    unsigned long long v4;  // x21
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4112
    unsigned long long v7;  // w21
    unsigned long long v8;  // x20
    st_af5bf0_3 *v9;  // x0
    unsigned long v10;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)&a0->padding_b4[36])
        return 1;
    v2 = 524299;
    if (!a0->field_f8 || sub_ad68a0(a0->field_98, 0))
    {
        v4 = sub_ade300(&a0->field_a0, &a0->field_a8, a0->field_98, *(long long *)&a0->field_20->padding_1a[19], a0->field_20->field_18);
        if (a0->field_f8)
            sub_ad692c(a0->field_98);
        if (v4 >> 31 & 1)
        {
            v5 = arm64g_calculate_condition(1, v4 & 0xffffffff, 2, 0);
            if (v5 & 1)
            {
                *(unsigned long long *)&a0->padding_b4[4] = 0;
                a0->field_b0 = 43;
                goto *((void *)(a0->field_38));
            }
            v6 = arm64g_calculate_condition(0x11, v4 & 0xffffffff, 1, 0);
            if (v6 & 1)
                goto LABEL_af5d34;
            if ((int)sub_ad69e4(a0->field_98) < 1)
            {
LABEL_af5dbc:
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_vfy.c", 1822, "check_policy");
                sub_a36abc(11, 0xc0103, 0);
                return 0;
            }
            v7 = 0;
            v8 = 0;
            do
            {
                v9 = sub_ad69f8(a0->field_98, v8);
                v10 = v9->field_e8;
                if ((unsigned int)v10 & 0x800)
                    v7 = 1;
                if (v10 >> 11 & 1)
                {
                    *(st_af5bf0_3 **)&a0->padding_b4[4] = v9;
                    a0->field_ac = v8;
                    a0->field_b0 = 42;
                    a0->field_38();
                }
                v8 = (unsigned int)v8 + 1;
            } while ((int)sub_ad69e4(a0->field_98) > (int)v8);
            if (!v7)
                goto LABEL_af5dbc;
        }
        else if (!(unsigned int)v4)
        {
            v3 = 1804;
LABEL_af5d7c:
            sub_a368c8();
            sub_a369bc("crypto/x509/x509_vfy.c", v3, "check_policy");
            sub_a36abc(11, v2, 0);
            a0->field_b0 = 0x11;
            return 0xffffffff;
        }
        else if ((unsigned int)v4 != 1)
        {
LABEL_af5d34:
            sub_a368c8();
            sub_a369bc("crypto/x509/x509_vfy.c", 1834, "check_policy");
            sub_a36abc(11, 0xc0103, 0);
            return 0;
        }
        else if ((char)(*((char *)&a0->field_20->field_18 + 1)) >> 3 & 1)
        {
            *(unsigned long long *)&a0->padding_b4[4] = 0;
            a0->field_38();
        }
    }
    else
    {
        v2 = 524303;
        v3 = 1795;
        goto LABEL_af5d7c;
    }
    return 1;
}
