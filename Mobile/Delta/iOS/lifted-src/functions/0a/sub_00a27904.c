/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa27904..0xa27bf8 (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a27904_3 {
    struct st_a27904_1 *field_0;
    char padding_8[160];
    long long field_a8;
} st_a27904_3;

typedef struct st_a27904_1 {
    char padding_0[272];
    struct st_a27904_2 *field_110;
    char padding_118[8];
    struct st_a27904_0 *field_120;
} st_a27904_1;

typedef struct st_a27904_2 {
    unsigned long long field_0;
} st_a27904_2;

typedef struct st_a27904_0 {
    struct st_a27904_0 *field_0;
} st_a27904_0;


st_a27904_0 ** sub_a27904(st_a27904_3 *a0, long long *a1, st_a27904_0 **a2, st_a27904_0 **a3, st_a27904_0 **a4)
{
    st_a27904_0 **v3;  // x19
    st_a27904_0 **v4;  // x20
    st_a27904_0 **v5;  // x0
    st_a27904_0 **v6;  // x21
    st_a27904_0 **v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a4;
    if (sub_a1b4f4())
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_smpl.c", 0x1ff, "ossl_ec_GFp_simple_point_get_affine_coordinates");
        sub_a36abc(16, 106, 0);
        return 0;
    }
    if (v3)
    {
        v4 = 0;
    }
    else
    {
        v3 = sub_9dddcc(a0->field_a8);
        v4 = v3;
        if (!v4)
            return v3;
    }
    sub_9de064(v3);
    sub_9de208(v3);
    sub_9de208(v3);
    sub_9de208(v3);
    v5 = sub_9de208(v3);
    if (v5)
    {
        v0 = v5;
        if (a0->field_0->field_120)
            a0->field_0->field_120();
        if (!sub_9e5b90(a1[4]))
            a0->field_0->field_110();
        if (a0->field_0->field_120)
        {
            if (a2)
            {
                a0->field_0->field_120();
            }
            else if (a3)
            {
                a0->field_0->field_120();
            }
        }
        else
        {
            if (a2 && !sub_9e4c34(a2, a1[2]) || a3 && !sub_9e4c34(a3, a1[3]))
                goto LABEL_a27bc0;
        }
        v6 = 1;
    }
    else
    {
LABEL_a27bc0:
        v6 = 0;
    }
    sub_9de17c(v3);
    sub_9dded4(v4);
    return v6;
}
