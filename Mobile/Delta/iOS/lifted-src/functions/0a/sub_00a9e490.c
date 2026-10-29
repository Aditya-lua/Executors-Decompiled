/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9e490..0xa9e750 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9e490_0 {
    char field_0;
    char field_1;
    char padding_2[6];
    unsigned int field_8;
    unsigned int field_c;
} st_a9e490_0;


long long sub_a9e490(st_a9e490_0 **a0, unsigned int a1, int *a2, unsigned int *a3, long long *a4, long long *a5)
{
    unsigned long long v3;  // x30
    st_a9e490_0 *v4;  // x8
    unsigned int v5;  // w9
    long long v6;  // w9
    long long v7;  // x1
    long long v8;  // x1
    int v9;  // w9
    long long v10;  // x1
    int v12;  // w10
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (16 > a1)
        return 0;
    v0 = &v2;
    v1 = v3;
    v4 = *a0;
    v5 = v4->field_0;
    if (v5 == 7)
    {
        if (*(int *)a5 == 1)
        {
            sub_a368c8();
            v8 = 184;
            goto LABEL_a9e4f4;
        }
        else
        {
            v6 = 0;
            goto LABEL_a9e508;
        }
        goto LABEL_a9e508;
    }
    if (v5 != 6)
        return 0;
    if (*(int *)a5)
    {
        v6 = 1;
LABEL_a9e508:
        *(int *)a5 = v6;
        if (v4->field_1 == 2)
        {
            *a2 = v4->field_8;
            *a3 = v4->field_c;
            v9 = *a2;
            if (843141969 >= v9)
            {
                if (v9 != 826364754 && v9 != 827544388)
                    goto LABEL_a9e684;
                if (*(int *)a5)
                    goto LABEL_a9e628;
                sub_a368c8();
                v7 = 209;
LABEL_a9e5c0:
                sub_a369bc("crypto/pem/pvkfmt.c", v7, "ossl_do_blob_header");
                v10 = 0x77;
            }
            else
            {
                if (v9 != 843141970 && v9 != 844321604)
                {
LABEL_a9e684:
                    sub_a368c8();
                    sub_a369bc("crypto/pem/pvkfmt.c", 223, "ossl_do_blob_header");
                    sub_a36abc(9, 116, 0);
                    return -0x1;
                }
                if (*(int *)a5 == 1)
                {
                    sub_a368c8();
                    v8 = 217;
LABEL_a9e4f4:
                    sub_a369bc("crypto/pem/pvkfmt.c", v8, "ossl_do_blob_header");
                    v10 = 120;
                }
                else
                {
LABEL_a9e628:
                    if (843141969 >= v9)
                    {
                        if (v9 == 826364754)
                            goto LABEL_a9e6a0;
                        v12 = 827544388;
                        goto LABEL_a9e66c;
                    }
                    else if (v9 != 843141970)
                    {
                        v12 = 844321604;
LABEL_a9e66c:
                        if (v9 != v12)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/pem/pvkfmt.c", 247, "ossl_do_blob_header");
                            sub_a36abc(9, 116, 0);
                            return -0x1;
                        }
                        if (*(int *)a4)
                        {
                            *(unsigned int *)a4 = 1;
                            *a0 = v4 + 1;
                            return 1;
                        }
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pvkfmt.c", 232, "ossl_do_blob_header");
                        v10 = 131;
                    }
                    else
                    {
LABEL_a9e6a0:
                        if (*(int *)a4 != 1)
                        {
                            *(unsigned int *)a4 = 0;
                            *a0 = v4 + 1;
                            return 1;
                        }
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pvkfmt.c", 240, "ossl_do_blob_header");
                        v10 = 132;
                    }
                }
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/pem/pvkfmt.c", 196, "ossl_do_blob_header");
            v10 = 117;
        }
        sub_a36abc(9, v10, 0);
        return 0;
    }
    sub_a368c8();
    v7 = 176;
    goto LABEL_a9e5c0;
}
