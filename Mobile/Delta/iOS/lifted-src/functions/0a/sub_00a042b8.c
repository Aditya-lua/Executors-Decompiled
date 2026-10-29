/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa042b8..0xa0444c (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a042b8_0 {
    struct st_a042b8_0 *field_0;
    struct st_a042b8_0 *field_8;
    char padding_10[4];
    unsigned int field_14;
    char padding_18[32];
    struct st_a042b8_0 *field_38;
    struct st_a042b8_0 *field_40;
} st_a042b8_0;


st_a042b8_0 * sub_a042b8(st_a042b8_0 *a0, st_a042b8_0 *a1, unsigned long a2, unsigned int a3)
{
    st_a042b8_0 *v2;  // x20
    st_a042b8_0 *v3;  // x0
    long long v4;  // x21
    long long v5;  // x22
    st_a042b8_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a0)
    {
        if (!v2->field_38)
            goto LABEL_a0430c;
LABEL_a042dc:
        v4 = 110;
        v5 = 125;
    }
    else
    {
        v3 = sub_a040c4();
        if (!v3)
        {
            sub_a368c8();
            sub_a369bc("crypto/dso/dso_lib.c", 112, "DSO_load");
            sub_a36abc(37, 0x80025, 0);
            return 0;
        }
        v2 = v3;
        v3->field_14 = a3;
        if (v2->field_38)
            goto LABEL_a042dc;
LABEL_a0430c:
        if (!a1)
        {
            v4 = 111;
            v5 = 139;
        }
        else if (v2->field_40)
        {
            sub_a368c8();
            sub_a369bc("crypto/dso/dso_lib.c", 234, "DSO_set_filename");
            sub_a36abc(37, 110, 0);
LABEL_a04344:
            v4 = 112;
            v5 = 134;
        }
        else
        {
            v6 = sub_a6d9b4(a1, "crypto/dso/dso_lib.c", 0xee);
            if (!v6)
                goto LABEL_a04344;
            sub_a6c2e4(v2->field_38, "crypto/dso/dso_lib.c", 241);
            v2->field_38 = v6;
            if (v2->field_0->field_8)
                v2->field_0->field_8();
            v4 = 108;
            v5 = 143;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/dso/dso_lib.c", v5, "DSO_load");
    sub_a36abc(37, v4, 0);
    if (a0)
        return 0;
    sub_a04184(v2);
    return 0;
}
