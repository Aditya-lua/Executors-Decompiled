/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa41fc..0xaa439c (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa41fc_1 {
    char padding_0[24];
    long long field_18;
    struct st_aa41fc_0 *field_20;
} st_aa41fc_1;

typedef struct st_aa41fc_0 {
    char padding_0[8];
    char field_8;
    char padding_9[7];
    struct st_aa41fc_0 *field_10;
    long long field_18;
    char padding_20[8];
    struct st_aa41fc_0 *field_28;
} st_aa41fc_0;


st_aa41fc_0 * sub_aa41fc(unsigned long long *a0, st_aa41fc_1 *a1)
{
    int v2;  // w8
    st_aa41fc_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99eac(a1->field_18);
    if (22 >= v2)
    {
        if (v2 == 21)
        {
            v3 = a1->field_20;
            if (!v3)
                return v3;
        }
        else if (v2 != 22)
        {
            return 0;
        }
        else if (!a1->field_20 || !a1->field_20->field_28)
        {
            sub_a368c8();
            sub_a369bc("crypto/pkcs7/pk7_lib.c", 755, "PKCS7_stream");
            sub_a36abc(33, 122, 0);
            return 0;
        }
        else if (sub_a99eac(a1->field_20->field_28->field_18) == 21)
        {
            v3 = sub_aa2978(a1->field_20->field_28);
            if (!v3)
                return v3;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/pkcs7/pk7_lib.c", 760, "PKCS7_stream");
            sub_a36abc(33, 112, 0);
            return 0;
        }
    }
    else
    {
        if (v2 != 23)
        {
            if (v2 != 24)
            {
                return 0;
            }
            else if (a1->field_20 && a1->field_20->field_28)
            {
                v3 = a1->field_20->field_28->field_10;
                if (!v3)
                {
                    v3 = sub_9cf0ec(NULL);
                    a1->field_20->field_28->field_10 = v3;
                    if (!v3)
                        return v3;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/pkcs7/pk7_lib.c", 731, "PKCS7_stream");
                sub_a36abc(33, 122, 0);
                return 0;
            }
        }
        else
        {
            if (a1->field_20 && a1->field_20->field_10)
            {
                v3 = a1->field_20->field_10->field_10;
                if (!v3)
                {
                    v3 = sub_9cf0ec(NULL);
                    a1->field_20->field_10->field_10 = v3;
                    if (!v3)
                        return v3;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/pkcs7/pk7_lib.c", 743, "PKCS7_stream");
                sub_a36abc(33, 122, 0);
                return 0;
            }
        }
    }
    v3->field_10 = v3->field_10 | 16;
    *a0 = &v3->field_8;
    return 1;
}
