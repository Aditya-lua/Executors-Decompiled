/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4bd0..0x9f4c48 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9f4bd0(long long a0, long long a1)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_lib.c", 289, "NCONF_get_section");
        v2 = 105;
    }
    else if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_lib.c", 294, "NCONF_get_section");
        v2 = 107;
    }
    sub_a36abc(14, v2, 0);
    return 0;
}
