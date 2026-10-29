/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa13750..0xa137b4 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a13750_0 {
    char padding_0[64];
    long long field_40;
} st_a13750_0;


unsigned long long sub_a13750(st_a13750_0 *a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e2de0(a1, a2, a0->field_40);
    if ((unsigned int)v2)
        return v2;
    sub_a368c8();
    sub_a369bc("crypto/ec/ec2_smpl.c", 929, "ec_GF2m_simple_field_inv");
    sub_a36abc(16, 165, 0);
    return v2;
}
