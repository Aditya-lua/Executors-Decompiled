/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa13bb4..0xa13f5c (936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a13bb4_1 {
    char padding_0[248];
    struct st_a13bb4_2 *field_f8;
} st_a13bb4_1;

typedef struct st_a13bb4_0 {
    char padding_0[32];
    long long field_20;
} st_a13bb4_0;

typedef struct st_a13bb4_2 {
    unsigned long long field_0;
} st_a13bb4_2;


long long sub_a13bb4(st_a13bb4_1 **a0, st_a13bb4_0 *a1, st_a13bb4_0 *a2, long long a3, long long a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_9e4828(a1->field_20))
    {
        if (sub_9e4828(a2->field_20))
        {
            if (sub_a1a654(a1, a3) && sub_a1b760(a0, a1, a4))
                return 1;
            sub_a368c8();
            sub_a369bc("crypto/ec/ec2_smpl.c", 813, "ec_GF2m_simple_ladder_post");
            sub_a36abc(16, 0x80010, 0);
            return 0;
        }
        sub_9de064(a4);
        sub_9de208(a4);
        sub_9de208(a4);
        if (!sub_9de208(a4))
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec2_smpl.c", 824, "ec_GF2m_simple_ladder_post");
            sub_a36abc(16, 0x80003, 0);
            sub_9de17c(a4);
            return 0;
        }
        *a0->field_f8();
    }
}
