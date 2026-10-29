/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a56c..0xa1a654 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1a56c_1 {
    struct st_a1a56c_0 *field_0;
    unsigned int field_8;
    char padding_c[20];
    unsigned int field_20;
} st_a1a56c_1;

typedef struct st_a1a56c_0 {
    char padding_0[80];
    struct st_a1a56c_1 *field_50;
} st_a1a56c_0;


int sub_a1a56c(st_a1a56c_1 *a0)
{
    st_a1a56c_1 *v2;  // x0
    st_a1a56c_0 *v3;  // x8
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a0->field_0->field_50)
        {
            v2 = sub_a6bffc(48, "crypto/ec/ec_lib.c", 729);
            if (v2)
            {
                v3 = a0->field_0;
                v2->field_0 = v3;
                v2->field_8 = a0->field_20;
                v3->field_50();
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 725, "EC_POINT_new");
            v4 = 786689;
LABEL_a1a624:
            sub_a36abc(16, v4, 0);
            v2 = 0;
        }
        return (unsigned int)v2;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_lib.c", 721, "EC_POINT_new");
    v4 = 786690;
    goto LABEL_a1a624;
}
