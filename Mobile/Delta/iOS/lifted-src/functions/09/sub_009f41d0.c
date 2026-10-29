/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f41d0..0x9f42a0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7fffff;

long long sub_9f41d0(long long a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x21
    long long v4;  // x19
    long long v5;  // w0
    unsigned int v6;  // w8
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9d8180(a1, "rb");
    if (v2)
    {
        v3 = v2;
        v4 = sub_9f326c(a0, v3, a2);
        sub_9d3c28(v3);
        return v4;
    }
    v5 = (unsigned int)sub_a36000();
    if (0 <= v5)
        v6 = (unsigned int)&g_7fffff;
    else
        v6 = 0x7fffffff;
    sub_a368c8();
    if ((v6 & v5) == 128)
    {
        sub_a369bc("crypto/conf/conf_def.c", 179, "def_load");
        v7 = 114;
    }
    else
    {
        sub_a369bc("crypto/conf/conf_def.c", 181, "def_load");
        v7 = 524290;
    }
    sub_a36abc(14, v7, 0);
    return 0;
}
