/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14894..0xa14964 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a14894(long long a0, long long *a1)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a5ed4c(a1);
    v3 = sub_a18b7c(a1[1], a1[2]);
    if (v3)
    {
        v4 = v3;
        if (sub_a1750c() && sub_a17584(v4, a0) && sub_a17360(v4, a0, 1) && sub_a5ab14(v2, 408, v4))
            return 1;
        sub_a18c08(v4);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_ameth.c", 615, "ec_pkey_import_from");
        sub_a36abc(16, 0x80010, 0);
    }
    return 0;
}
