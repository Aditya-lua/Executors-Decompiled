/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa28abc..0xa28be4 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a28abc_1 {
    char padding_0[168];
    long long field_a8;
} st_a28abc_1;

typedef struct st_a28abc_0 {
    char padding_0[40];
    long long field_28;
} st_a28abc_0;


long long sub_a28abc(st_a28abc_1 *a0, st_a28abc_0 *a1, long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    long long v19;  // x0
    long long v20;  // x24
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x19
    long long v17;  // x20
    long long v18;  // x23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if ((int)a1->field_28)
        return 1;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a2;
    if (sub_a1b4f4())
        return 1;
    if (v16)
    {
        v17 = 0;
    }
    else
    {
        v16 = sub_9dddcc(a0->field_a8);
        v17 = v16;
        if (!v17)
            return v16;
    }
    sub_9de064(v16);
    v18 = sub_9de208(v16);
    v19 = sub_9de208(v16);
    if (v19)
    {
        v20 = v19;
        if (sub_a1b3cc(a0, a1, v18, v20, v16) && sub_a1b250(a0, a1, v18, v20, v16))
        {
            if ((int)a1->field_28)
            {
                sub_9de17c(v16);
                sub_9dded4(v17);
                return 1;
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ecp_smpl.c", 1193, "ossl_ec_GFp_simple_make_affine");
            sub_a36abc(16, 0xc0103, 0);
        }
    }
    sub_9de17c(v16);
    sub_9dded4(v17);
    return 0;
}
