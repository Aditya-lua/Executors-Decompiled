/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99805c..0x9980f0 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_99805c(long long idx, unsigned long a1, unsigned long a2)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x8
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(int *)(idx + 4176);
    if ((unsigned int)v2)
    {
        v3 = *(long long *)(idx + 4184) + a1;
        if (v3 <= v2 + a2)
        {
            *(unsigned long long *)(idx + 4184) = v3;
            return 1;
        }
        sub_a368c8();
        v4 = 513;
    }
    else
    {
        sub_a368c8();
        v4 = 504;
    }
    sub_a369bc("ssl/record/methods/tls_common.c", v4, "rlayer_early_data_count_ok");
    sub_996e84(idx, 10, 164, 0);
    return 0;
}
