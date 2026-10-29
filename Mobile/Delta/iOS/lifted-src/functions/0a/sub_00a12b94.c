/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12b94..0xa12c84 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a12b94(unsigned long a0, long long *a1, unsigned long a2, unsigned long a3)
{
    long long v2;  // x1
    long long v3;  // x0
    unsigned long v4;  // x0
    unsigned long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a1b4f4())
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec2_smpl.c", 326, "ossl_ec_GF2m_simple_point_get_affine_coordinates");
        v2 = 106;
    }
    else
    {
        v3 = sub_9e4624();
        if (sub_9e5528(a1[4], v3))
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec2_smpl.c", 331, "ossl_ec_GF2m_simple_point_get_affine_coordinates");
            v2 = 786689;
        }
        else
        {
            if (a2)
            {
                v4 = sub_9e4c34(a2, a1[2]);
                if (!v4)
                    return v4;
                sub_9e5858(a2, 0);
            }
            if (!a3)
                return 1;
            v5 = sub_9e4c34(a3, a1[3]);
            if (!v5)
                return v5;
            sub_9e5858(a3, 0);
            return 1;
        }
    }
    sub_a36abc(16, v2, 0);
    return 0;
}
