/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4b8ec..0xa4bab0 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a4b8ec(unsigned long a0, long long a1)
{
    unsigned long v5;  // x0
    unsigned long v6;  // x20
    unsigned long v7;  // x21
    unsigned long long *v8;  // x24
    long long v9;  // x0
    long long v10;  // x1
    unsigned long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    char v2;  // [bp-0x54], Other Possible Types: unsigned int
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_9f4bd0(a1, sub_c4ba8());
    if (v5)
    {
        v6 = v5;
        if ((int)sub_ad69e4() < 1)
            return 1;
        v7 = 0;
        while (1)
        {
            v8 = sub_ad69f8(v6, v7);
            if (_strcmp(v8[1], "fips_mode"))
            {
                if (_strcmp(v8[1], "default_properties"))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_cnf.c", 61, "alg_module_init");
                    v0 = v8[1];
                    v1 = v8[2];
                    sub_a36abc();
                    return 0;
                }
                v9 = sub_962b90(a1);
                if (!sub_a4eb84(v9, v8[2], 0, 0))
                {
                    sub_a368c8();
                    v10 = 57;
                    break;
                }
            }
            else
            {
                if (!sub_aef6fc(v8, &v2))
                    return 0;
                if (!sub_a4edac(sub_962b90(a1), (int)v2 > 0, 0))
                {
                    sub_a368c8();
                    v10 = 0x33;
                    break;
                }
            }
            v7 = (unsigned int)v7 + 1;
            if ((int)sub_ad69e4(v6) <= (int)v7)
                return 1;
        }
        sub_a369bc("crypto/evp/evp_cnf.c", v10, "alg_module_init");
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_cnf.c", 33, "alg_module_init");
    }
    sub_a36abc();
    return 0;
}
