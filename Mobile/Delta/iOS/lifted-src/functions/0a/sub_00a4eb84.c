/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4eb84..0xa4ec24 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a4eb84(long long a0, long long a1, unsigned long a2, unsigned long a3)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = sub_aa6be0();
        if (v2)
            goto LABEL_a4ebf4;
        sub_a368c8(a0);
        sub_a369bc("crypto/evp/evp_fetch.c", 517, "evp_set_default_properties_int");
        sub_a36abc(6, 210, 0);
    }
    else
    {
        v2 = 0;
LABEL_a4ebf4:
        if (sub_a4ec24())
            return 1;
        sub_aa6fd0(v2);
    }
    return 0;
}
