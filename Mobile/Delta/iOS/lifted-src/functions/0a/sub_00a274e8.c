/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa274e8..0xa27700 (536 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a274e8_2 {
    struct st_a274e8_0 *field_0;
    char padding_8[56];
    long long field_40;
    char padding_48[24];
    long long field_60;
    long long field_68;
    char padding_70[56];
    long long field_a8;
} st_a274e8_2;

typedef struct st_a274e8_0 {
    char padding_0[288];
    struct st_a274e8_1 *field_120;
} st_a274e8_0;

typedef struct st_a274e8_1 {
    unsigned long long field_0;
} st_a274e8_1;


unsigned long long * sub_a274e8(st_a274e8_2 *a0, unsigned long long *a1)
{
    long long v2;  // x21
    unsigned long long *v3;  // x20
    long long v4;  // x22
    long long v5;  // x25
    long long v6;  // x23
    long long v7;  // x24
    unsigned long long *v8;  // w0
    unsigned long long *v9;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_40;
    if (a1)
    {
        v3 = 0;
LABEL_a2752c:
        sub_9de064(a1);
        v4 = sub_9de208(a1);
        v5 = sub_9de208(a1);
        v6 = sub_9de208(a1);
        v7 = sub_9de208(a1);
        if (sub_9de208(a1))
        {
            if (a0->field_0->field_120)
            {
                a0->field_0->field_120();
            }
            else if (sub_9e4c34(v4, a0->field_60) && sub_9e4c34(v5, a0->field_68))
            {
                v8 = (unsigned long long *)(unsigned int)sub_9e4828(v4);
                v9 = (unsigned long long *)(unsigned int)sub_9e4828(v5);
                if (v8)
                {
                    if (!v9)
                    {
                        sub_9de17c(a1);
                        sub_9dded4(v3);
                        return 1;
                    }
                }
                else
                {
                    if (v9)
                    {
                        sub_9de17c(a1);
                        sub_9dded4(v3);
                        return 1;
                    }
                    else if (sub_9e6528(v6, v4, v2, a1) && sub_9e6404(v7, v6, v4, v2, a1) && sub_9ea668(v6, v7, 2) && sub_9e6528(v7, v5, v2, a1) && sub_9ebbfc(v7, 27) && sub_9e5e68(v4, v6, v7, v2, a1) && !sub_9e4828(v4))
                    {
                        sub_9de17c(a1);
                        sub_9dded4(v3);
                        return 1;
                    }
                }
            }
        }
    }
    else
    {
        a1 = sub_9dddcc(a0->field_a8);
        v3 = a1;
        if (a1)
            goto LABEL_a2752c;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_smpl.c", 261, "ossl_ec_GFp_simple_group_check_discriminant");
        sub_a36abc(16, 0x80003, 0);
    }
    sub_9de17c(a1);
    sub_9dded4(v3);
    return 0;
}
