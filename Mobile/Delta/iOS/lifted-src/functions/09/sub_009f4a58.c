/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4a58..0x9f4b4c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9f4a58(long long a0, unsigned long a1, long long *a2)
{
    long long v4;  // x2
    long long v5;  // x0
    long long v6;  // x1
    unsigned long long v7;  // x0
    long long v0;  // [bp-0xd0]
    unsigned short v1;  // [bp-0xbc]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (_stat() >> 31 & 1)
    {
        sub_a368c8();
        v6 = *(int *)___error(sub_a369bc("crypto/conf/conf_def.c", 812, "process_include"), 812, "process_include");
        v0 = a0;
        v4 = "calling stat(%s)";
        v5 = 2;
    }
    else if ((v1 >> 12 & 15) != 4)
    {
        return sub_9d8180(a0, "r");
    }
    else if (*(long long *)a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_def.c", 819, "process_include");
        v0 = a0;
        v4 = "%s";
        v5 = 14;
        v6 = 111;
    }
    else
    {
        v7 = sub_9f42a0(a0, a1);
        if (v7)
        {
            *a2 = a0;
            return v7;
        }
        return v7;
    }
    sub_a36abc(v5, v6, v4);
    return 0;
}
