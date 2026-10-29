/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb346ec..0xb3477c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b346ec(long long a0, long long a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "size");
    if (v2)
    {
        if (sub_954340(a0 + 8))
        {
            sub_a50ac8();
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/x942kdf.c", 430, "x942kdf_size");
            sub_a36abc(57, 129, 0);
        }
        v3 = sub_a70efc(v2);
        if (!(unsigned int)v3)
            return v3;
    }
    return 1;
}
