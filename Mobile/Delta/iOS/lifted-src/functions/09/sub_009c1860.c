/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c1860..0x9c19dc (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c1860_0 {
    char padding_0[4];
    unsigned int field_4;
    struct st_9c1860_1 *field_8;
} st_9c1860_0;

typedef struct st_9c1860_1 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
} st_9c1860_1;


unsigned int sub_9c1860(unsigned int *a0, st_9c1860_0 *a1)
{
    unsigned int v2;  // w10
    long long v3;  // x1
    char *v4;  // x9
    unsigned int v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 372, "asn1_string_get_uint64");
        v3 = 786690;
    }
    else if ((a1->field_4 & 0xfffffeff) != 2)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 376, "asn1_string_get_uint64");
        v3 = 225;
    }
    else if (0x100 > a1->field_4)
    {
        v2 = (unsigned int)a1->padding_0;
        if (v2 >= 9)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/a_int.c", 219, "asn1_get_uint64");
            v3 = 223;
        }
        else
        {
            v4 = &a1->field_8->field_0;
            if (!v4)
                return 0;
            if (v2)
            {
                v5 = *v4;
                if (v2 != 1)
                {
                    v5 = v4[1] | v5 * 0x100;
                    if (v2 != 2)
                    {
                        v5 = v4[2] | v5 * 0x100;
                        if (v2 != 3)
                        {
                            v5 = v4[3] | v5 * 0x100;
                            if (v2 != 4)
                            {
                                v5 = v4[4] | v5 * 0x100;
                                if (v2 != 5)
                                {
                                    v5 = v4[5] | v5 * 0x100;
                                    if (v2 != 6)
                                    {
                                        v5 = v4[6] | v5 * 0x100;
                                        if (v2 != 7)
                                            v5 = v4[7] | v5 * 0x100;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else
            {
                v5 = 0;
            }
            *(unsigned long long *)a0 = v5;
            return 1;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 380, "asn1_string_get_uint64");
        v3 = 226;
    }
    sub_a36abc(13, v3, 0);
    return 0;
}
