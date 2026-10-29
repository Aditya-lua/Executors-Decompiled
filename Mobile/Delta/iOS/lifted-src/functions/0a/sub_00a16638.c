/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16638..0xa16778 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a16638_0 {
    struct st_a16638_0 *field_0;
    char padding_8[16];
    long long field_18;
    char padding_20[64];
    unsigned long long field_60;
} st_a16638_0;


st_a16638_0 * sub_a16638(st_a16638_0 *a0, st_a16638_0 *a1, long long a2)
{
    st_a16638_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 && a1->field_0)
    {
        if (a0 && (v2 = a0->field_0, v2))
        {
            if (!sub_a15f74(&v2->field_18))
                goto LABEL_a16750;
LABEL_a166e4:
            if (sub_a1abcc(v2->field_18) == 1172)
                sub_a197a8(v2, 4);
            v2->field_60 = v2->field_60 + 1;
            if (!a0)
                return v2;
            a0->field_0 = v2;
            return v2;
        }
        v2 = sub_a18b6c();
        if (!v2)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_asn1.c", 1096, "d2i_ECParameters");
            sub_a36abc(16, 0x80010, 0);
            return v2;
        }
        if (sub_a15f74(&v2->field_18, a1, a2))
            goto LABEL_a166e4;
        if (a0)
        {
LABEL_a16750:
            if (a0->field_0 != v2)
                goto LABEL_a1675c;
            v2->field_60 = v2->field_60 + 1;
        }
        else
        {
LABEL_a1675c:
            sub_a18c08(v2);
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 1090, "d2i_ECParameters");
        sub_a36abc(16, 0xc0102, 0);
    }
    return 0;
}
