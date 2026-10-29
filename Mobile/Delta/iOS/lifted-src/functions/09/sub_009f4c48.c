/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4c48..0x9f4cec (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_c7c2eb;

long long sub_9f4c48(long long a0, long long a1, unsigned long long a2)
{
    long long v4;  // x20
    long long v5;  // x0
    long long v6;  // x8
    long long v7;  // x2
    long long v8;  // x1
    long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1;
    v5 = sub_9f2d14();
    if (v5)
        return v5;
    sub_a368c8();
    if (a0)
    {
        sub_a369bc("crypto/conf/conf_lib.c", 316, "NCONF_get_string");
        v6 = &g_c7c2eb;
        if (!v4)
            v4 = v6;
        v0 = v4;
        v1 = a2;
        v7 = "group=%s name=%s";
        v8 = 108;
    }
    else
    {
        sub_a369bc("crypto/conf/conf_lib.c", 313, "NCONF_get_string");
        v8 = 106;
        v7 = 0;
    }
    sub_a36abc(14, v8, v7);
    return 0;
}
