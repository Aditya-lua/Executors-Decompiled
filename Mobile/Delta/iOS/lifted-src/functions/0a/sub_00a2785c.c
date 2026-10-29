/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2785c..0xa27904 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a2785c(unsigned long a0, unsigned long a1, long long a2, long long a3, unsigned long a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 && a3)
        sub_9e4624();
    sub_a368c8();
    sub_a369bc("crypto/ec/ecp_smpl.c", 492, "ossl_ec_GFp_simple_point_set_affine_coordinates");
    sub_a36abc(16, 0xc0102, 0);
    return 0;
}
