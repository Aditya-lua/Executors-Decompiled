/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f56f4..0x9f57b4 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9f56f4(void)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!sub_a6ac44("OPENSSL_CONF"))
    {
        v5 = sub_a69abc();
        if (v5)
        {
            v6 = sub_a6bf4c(_strlen() + 13, "crypto/conf/conf_mod.c", 707);
            if (!v6)
                return v6;
            v1 = "/";
            v2 = "openssl.cnf";
            v0 = v5;
            sub_9d5b44();
            return v6;
        }
    }
}
