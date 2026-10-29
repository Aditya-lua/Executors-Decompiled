/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa01b8..0xaa02fc (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa01b8_1 {
    char padding_0[16];
    struct st_aa01b8_0 *field_10;
} st_aa01b8_1;

typedef struct st_aa01b8_0 {
    char padding_0[24];
    long long field_18;
    unsigned long long field_20;
} st_aa01b8_0;

extern long long g_aa26a4;

unsigned long long sub_aa01b8(st_aa01b8_1 *a0)
{
    st_aa01b8_0 *v2;  // x23
    unsigned long long v3;  // x20
    long long v4;  // x0
    long long v5;  // x0
    unsigned long long v6;  // x20
    unsigned long long v7;  // x21
    long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(a0->field_10->field_18) == 21)
    {
        v2 = a0->field_10;
        v3 = v2->field_20;
        if (!v3)
        {
            sub_a368c8();
            sub_a369bc("crypto/pkcs12/p12_add.c", 207, "PKCS12_unpack_authsafes");
            sub_a36abc(35, 101, 0);
            return v3;
        }
        v4 = sub_aa0398();
        v5 = sub_a2d030(v2 + 1);
        v6 = sub_9c8eb8(v3, v4, v5, sub_9f2aec(v2 + 1));
        if (!v6)
        {
            return v6;
        }
        else if ((int)sub_ad69e4(v6) >= 1)
        {
            v7 = 0;
            while (1)
            {
                v8 = sub_ad69f8(v6, v7);
                if (!sub_aa4190(a0->field_10, v8))
                    break;
                v7 = (unsigned int)v7 + 1;
                if ((int)v7 >= (int)sub_ad69e4(v6))
                    return v6;
            }
            sub_ad6958(v6, &g_aa26a4);
        }
        else
        {
            return v6;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_add.c", 202, "PKCS12_unpack_authsafes");
        sub_a36abc(35, 121, 0);
    }
    return 0;
}
