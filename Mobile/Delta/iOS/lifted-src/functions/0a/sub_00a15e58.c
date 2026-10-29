/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa15e58..0xa15f74 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a15e58_0 {
    struct st_a15e58_0 *field_0;
    long long field_8;
} st_a15e58_0;


st_a15e58_0 * sub_a15e58(st_a15e58_0 *a0)
{
    st_a15e58_0 *v2;  // w8
    st_a15e58_0 *v3;  // x0
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = (st_a15e58_0 *)(int)a0->field_0;
        if (v2 == 2)
        {
            return 0;
        }
        else if (v2 == 1)
        {
            v3 = sub_a15668(a0->field_8);
            if (v3)
            {
                sub_319f0();
                return v3;
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_asn1.c", 856, "EC_GROUP_new_from_ecpkparameters");
            v4 = 524304;
        }
        else if (!v2)
        {
            v3 = sub_a186a4(sub_a99eac(a0->field_8));
            if (v3)
            {
                sub_319f0();
                return v3;
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_asn1.c", 848, "EC_GROUP_new_from_ecpkparameters");
            v4 = 0x77;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_asn1.c", 864, "EC_GROUP_new_from_ecpkparameters");
            v4 = 115;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 840, "EC_GROUP_new_from_ecpkparameters");
        v4 = 124;
    }
    sub_a36abc(16, v4, 0);
    return 0;
}
