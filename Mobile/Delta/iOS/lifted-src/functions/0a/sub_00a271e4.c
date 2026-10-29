/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa271e4..0xa273a0 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a271e4_2 {
    struct st_a271e4_1 *field_0;
    char padding_8[56];
    long long field_40;
    char padding_48[24];
    long long field_60;
    long long field_68;
    unsigned int field_70;
    char padding_74[52];
    long long field_a8;
} st_a271e4_2;

typedef struct st_a271e4_1 {
    char padding_0[280];
    struct st_a271e4_0 *field_118;
} st_a271e4_1;

typedef struct st_a271e4_0 {
    struct st_a271e4_0 *field_0;
} st_a271e4_0;


st_a271e4_0 ** sub_a271e4(st_a271e4_2 *a0, long long a1, long long a2, long long a3, st_a271e4_0 **a4)
{
    st_a271e4_0 **v2;  // x19
    st_a271e4_0 **v3;  // x20
    st_a271e4_0 **v4;  // x0
    st_a271e4_0 **v5;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a4;
    if ((int)sub_9e46a8(a1) >= 3 && sub_9e5c70(a1))
    {
        if (v2)
        {
            v3 = 0;
        }
        else
        {
            v2 = sub_9dddcc(a0->field_a8);
            v3 = v2;
            if (!v3)
                return v2;
        }
        sub_9de064(v2);
        v4 = sub_9de208(v2);
        if (v4)
        {
            v5 = v4;
            if (sub_9e4c34(a0->field_40, a1))
            {
                sub_9e5858(a0->field_40, 0);
                if (sub_9e5dac(v5, a2, a1, v2))
                {
                    if (a0->field_0->field_118)
                    {
                        a0->field_0->field_118();
                    }
                    else if (sub_9e4c34(a0->field_60, v5) && sub_9e5dac(a0->field_68, a3, a1, v2))
                    {
                        if (a0->field_0->field_118)
                        {
                            a0->field_0->field_118();
                        }
                        else if (sub_9eb9e0(v5, 3))
                        {
                            a0->field_70 = !sub_9e5528(v5, a0->field_40);
                            sub_9de17c(v2);
                            sub_9dded4(v3);
                            return 1;
                        }
                    }
                }
            }
        }
        sub_9de17c(v2);
        sub_9dded4(v3);
        return 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ecp_smpl.c", 151, "ossl_ec_GFp_simple_group_set_curve");
    sub_a36abc(16, 103, 0);
    return 0;
}
