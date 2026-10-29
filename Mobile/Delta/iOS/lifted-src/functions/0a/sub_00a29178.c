/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa29178..0xa29320 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a29178_1 {
    char padding_0[248];
    struct st_a29178_2 *field_f8;
    char padding_100[24];
    struct st_a29178_0 *field_118;
} st_a29178_1;

typedef struct st_a29178_3 {
    struct st_a29178_1 *field_0;
    char padding_8[56];
    long long field_40;
} st_a29178_3;

typedef struct st_a29178_2 {
    unsigned long long field_0;
} st_a29178_2;

typedef struct st_a29178_0 {
    struct st_a29178_0 *field_0;
} st_a29178_0;


st_a29178_0 ** sub_a29178(st_a29178_3 *a0, unsigned long a1, long long a2)
{
    long long v2;  // x24
    unsigned long long v3;  // x0
    st_a29178_1 *v4;  // x8
    st_a29178_0 **v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9de064(a2);
    v2 = sub_9de208(a2);
    if (sub_9de208(a2))
    {
        while (1)
        {
            sub_a36c8c();
            v3 = sub_9e93c8(v2, a0->field_40, 0, a2);
            sub_a36cd4(v3, a0->field_40, 0, a2);
            if (!(unsigned int)v3)
                break;
            if (!sub_9e4828(v2))
            {
                v4 = a0->field_0;
                if (!v4->field_118)
                    v4->field_f8();
                v4->field_118();
            }
        }
        v5 = 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_smpl.c", 1438, "ossl_ec_GFp_simple_blind_coordinates");
        sub_a36abc(16, 0x80003, 0);
        v5 = 0;
    }
    sub_9de17c(a2);
    return v5;
}
