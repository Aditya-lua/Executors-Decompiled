/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f1c8..0xb4f378 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f1c8_1 {
    char padding_0[8];
    struct st_b4f1c8_0 *field_8;
    char field_10;
    char padding_11[255];
    struct st_b4f1c8_0 *field_110;
    char padding_118[4];
    char field_11c;
    char padding_11d[259];
    struct st_b4f1c8_0 *field_220;
} st_b4f1c8_1;

typedef struct st_b4f1c8_0 {
    char padding_0[96];
    unsigned int field_60;
} st_b4f1c8_0;


st_b4f1c8_0 * sub_b4f1c8(st_b4f1c8_1 *a0, st_b4f1c8_0 *a1)
{
    st_b4f1c8_0 *v3;  // w0
    st_b4f1c8_0 *v4;  // w0
    st_b4f1c8_0 *v5;  // x20
    long long v6;  // x1
    char v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (st_b4f1c8_0 *)(unsigned int)sub_a2f9e0();
    if (!v3)
        return v3;
    if (a1)
    {
        if (sub_a2a930(a1))
        {
            a0->field_11c = a0->field_11c & 226;
            a0->field_220 = 0;
            a0->field_8 = a1;
            a0->field_110 = 0;
            v4 = (st_b4f1c8_0 *)(unsigned int)sub_c688bc(&v0, &a0->field_10, 0x100);
            if (a1->field_60 != 3)
            {
                if (a1->field_60 != 2)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/eddsa_sig.c", 279, "eddsa_signverify_init");
                    sub_a36abc(57, 0xc0103, 0);
                    sub_a2a8a4(a1);
                    a0->field_8 = 0;
                    sub_a6ed4c(&v0);
                    return 0;
                }
LABEL_b4f314:
                sub_a6ed4c(&v0);
            }
            else
            {
                if (!v4 || !sub_b5ae74(&v0, 0xffffffff, a1) || !sub_a6eaf8(&v0))
                    goto LABEL_b4f314;
                sub_c68eb8(&v0, &a0->field_110);
                v5 = sub_a6e990(&v0);
                sub_a6ed4c(&v0);
                if (v5 && a0->field_110)
                    _memmove(&a0->field_10, v5);
            }
            return 1;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/eddsa_sig.c", 249, "eddsa_signverify_init");
        v6 = 786691;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/eddsa_sig.c", 244, "eddsa_signverify_init");
        v6 = 114;
    }
    sub_a36abc(57, v6, 0);
    return 0;
}
