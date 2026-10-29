/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa137b4..0xa139d0 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a137b4_2 {
    char padding_0[248];
    struct st_a137b4_3 *field_f8;
    char padding_100[24];
    struct st_a137b4_0 *field_118;
} st_a137b4_2;

typedef struct st_a137b4_5 {
    char padding_0[32];
    long long field_20;
} st_a137b4_5;

typedef struct st_a137b4_1 {
    char padding_0[40];
    struct st_a137b4_0 *field_28;
} st_a137b4_1;

typedef struct st_a137b4_4 {
    struct st_a137b4_2 *field_0;
    char padding_8[56];
    long long field_40;
} st_a137b4_4;

typedef struct st_a137b4_3 {
    unsigned long long field_0;
} st_a137b4_3;

typedef struct st_a137b4_0 {
    struct st_a137b4_0 *field_0;
} st_a137b4_0;


st_a137b4_0 ** sub_a137b4(st_a137b4_4 *a0, unsigned long a1, st_a137b4_5 *a2, st_a137b4_1 *a3, long long a4)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned int v16;  // w0
    st_a137b4_2 *v17;  // x8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!(int)a3->field_28)
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    do
    {
        v16 = sub_9e46a8(a0->field_40);
        if (!sub_9e9188(a2->field_20, v16 - 1, 0xffffffff, 0, 0, a4))
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec2_smpl.c", 731, "ec_GF2m_simple_ladder_pre");
            sub_a36abc(16, 0x80003, 0);
            return 0;
        }
    } while (sub_9e4828(a2->field_20));
    v17 = a0->field_0;
    if (!v17->field_118)
        v17->field_f8();
    v17->field_118();
}
