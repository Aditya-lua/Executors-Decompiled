/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c167c..0x9c1860 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c167c_0 {
    char padding_0[4];
    unsigned int field_4;
    struct st_9c167c_1 *field_8;
} st_9c167c_0;

typedef struct st_9c167c_1 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
} st_9c167c_1;


unsigned long long sub_9c167c(unsigned long long *a0, st_9c167c_0 *a1, unsigned int a2)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // w11
    char *v6;  // x10
    unsigned long long v7;  // x9
    unsigned long long v8;  // x11
    unsigned long long v9;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 335, "asn1_string_get_int64");
        sub_a36abc(13, 0xc0102, 0);
        return 0;
    }
    v2 = a1->field_4;
    if (((unsigned int)v2 & 0xfffffeff) != a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 339, "asn1_string_get_int64");
        sub_a36abc(13, 225, 0);
        return 0;
    }
    v3 = (unsigned long long)a1->padding_0;
    if (v3 >= 9)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 219, "asn1_get_uint64");
        sub_a36abc(13, 223, 0);
        return 0;
    }
    v6 = &a1->field_8->field_0;
    if (!v6)
    {
        return 0;
    }
    else if (v3)
    {
        v7 = *v6;
        if (v3 == 1)
        {
            v8 = 0;
            if (v2 >> 8 & 1)
                goto LABEL_9c1814;
        }
        else
        {
            v9 = (v6[1] | (v7 * 0x100 | v7 >> 56) & 0xff00) & 0xffff;
            if (v3 == 2)
            {
LABEL_9c1770:
                v8 = v7 * 0x100;
                v7 = v9;
                if (v2 >> 8 & 1)
                    goto LABEL_9c1814;
            }
            else
            {
                v7 = (v6[2] | (v9 * 0x100 | v9 >> 56) & 0xffff00) & 0xffffff;
                if (v3 == 3)
                {
LABEL_9c1790:
                    v8 = v9 * 0x100;
                    if (v2 >> 8 & 1)
                        goto LABEL_9c1814;
                }
                else
                {
                    v9 = (v6[3] | (v7 * 0x100 | v7 >> 56) & 0xffffff00) & 0xffffffff;
                    if (v3 == 4)
                        goto LABEL_9c1770;
                    v7 = (v6[4] | (v9 * 0x100 | v9 >> 56) & 0xffffffff00) & 0xffffffffff;
                    if (v3 == 5)
                        goto LABEL_9c1790;
                    v9 = (v6[5] | (v7 * 0x100 | v7 >> 56) & 0xffffffffff00) & 0xffffffffffff;
                    if (v3 == 6)
                        goto LABEL_9c1770;
                    v7 = (v6[6] | (v9 * 0x100 | v9 >> 56) & 0xffffffffffff00) & 0xffffffffffffff;
                    if (v3 == 7)
                        goto LABEL_9c1790;
                    v8 = v7 * 0x100;
                    v7 = v6[7] | (v7 * 0x100 | v7 >> 56) & 0xffffffffffffff00;
                    if (v2 >> 8 & 1)
                    {
LABEL_9c1814:
                        if ((long long)v8 >= 0)
                        {
                            *a0 = -v7;
                            return 1;
                        }
                        if (v7 == 0x8000000000000000)
                        {
                            *a0 = 0x8000000000000000;
                            return 1;
                        }
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/a_int.c", 275, "asn1_get_int64");
                        sub_a36abc(13, 224, 0);
                        return 0;
                    }
                }
            }
        }
        if ((long long)v8 < 0)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/a_int.c", 282, "asn1_get_int64");
            sub_a36abc(13, 223, 0);
            return 0;
        }
        *a0 = v7;
        return 1;
    }
    else if (!(v2 >> 8 & 1))
    {
        *a0 = 0;
        return 1;
    }
    else
    {
        *a0 = 0xffffffffffffffff;
        return 1;
    }
}
