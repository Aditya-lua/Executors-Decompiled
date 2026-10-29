/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada98c..0xadab0c (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f12fd8;

unsigned long long sub_ada98c(long long a0, long long a1)
{
    unsigned long long v3;  // w0
    long long v4;  // x0
    long long v5;  // x0
    unsigned long long v6;  // x0
    long long v7;  // x0
    long long v8;  // x0
    unsigned long long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (unsigned int)sub_9c7b68(a1);
    if (v3 == 1)
    {
        v8 = sub_c4c40(a1);
        _fputs(v8, g_f12fd8);
        _fflush(g_f12fd8);
        sub_a50720(a1);
    }
    else if (v3 == 2)
    {
        v0 = sub_c4c40(a1);
        _fprintf(g_f12fd8, "Verifying - %s");
        _fflush(g_f12fd8);
        v6 = sub_adab74(a0, a1, sub_a50720(a1) & 1, 1);
        if ((int)v6 < 1)
            return v6;
        v7 = sub_ad9f40(a1);
        if (!_strcmp(v7, sub_ada474(a1)))
            return 1;
        _fwrite("Verify failure\n", 15, 1, g_f12fd8);
        _fflush(g_f12fd8);
        return 0;
    }
    else if (v3 == 3)
    {
        v4 = sub_c4c40(a1);
        _fputs(v4, g_f12fd8);
        v5 = sub_ada458(a1);
        _fputs(v5, g_f12fd8);
        _fflush(g_f12fd8);
        sub_a50720(a1);
    }
    else
    {
        return 1;
    }
    return sub_adab74();
}
