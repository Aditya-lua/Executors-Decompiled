/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54ac0..0xa54b88 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54ac0_1 {
    char padding_0[120];
    struct st_a54ac0_0 *field_78;
} st_a54ac0_1;

typedef struct st_a54ac0_0 {
    unsigned long long field_0;
    struct st_a54ac0_0 *field_8;
    unsigned int field_10;
} st_a54ac0_0;


st_a54ac0_0 * sub_a54ac0(st_a54ac0_1 *a0, long long a1, st_a54ac0_0 *a2, unsigned int a3)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_a54ac0_0 *v16;  // x0
    st_a54ac0_0 *v17;  // x20
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a2)
        return 1;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    if (a0->field_78 || (v16 = sub_ad61b4(), a0->field_78 = v16, v16))
    {
        v16 = sub_a6bf4c(24, "crypto/evp/keymgmt_lib.c", 268);
        if (v16)
        {
            v17 = v16;
            v16->field_0 = a1;
            v16->field_8 = a2;
            v16->field_10 = a3;
            if (!sub_a2d050(a1))
            {
                goto LABEL_a54b60;
            }
            else if (sub_ad68a0(a0->field_78, v17))
            {
                v16 = 1;
            }
            else
            {
                sub_a55830(a1);
LABEL_a54b60:
                sub_a6c2e4(v17, "crypto/evp/keymgmt_lib.c");
                v16 = 0;
            }
        }
    }
    return (unsigned int)v16;
}
