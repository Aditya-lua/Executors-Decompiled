/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12ad0..0xa12b94 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12ad0_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
    unsigned int field_28;
} st_a12ad0_0;


long long sub_a12ad0(unsigned long a0, st_a12ad0_0 *a1, long long a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 && a3)
    {
        v2 = sub_9e4c34(a1->field_10, a2);
        if (!v2)
            return v2;
        sub_9e5858(a1->field_10, 0);
        v3 = sub_9e4c34(a1->field_18, a3);
        if (!v3)
            return v3;
        v4 = sub_9e4624(sub_9e5858(a1->field_18, 0), 0);
        v5 = sub_9e4c34(a1->field_20, v4);
        if (!v5)
            return v5;
        sub_9e5858(a1->field_20, 0);
        a1->field_28 = 1;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec2_smpl.c", 294, "ossl_ec_GF2m_simple_point_set_affine_coordinates");
    sub_a36abc(16, 0xc0102, 0);
    return 0;
}
