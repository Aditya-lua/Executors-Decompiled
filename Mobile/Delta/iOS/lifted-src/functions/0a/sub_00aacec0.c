/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaacec0..0xaacf80 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aacec0(long long a0, long long *a1, long long a2, long long a3)
{
    long long v2;  // x22
    long long v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(*a1) == 912)
    {
        v2 = sub_aaefc4(a1);
        v3 = (unsigned int)sub_aad8dc(a0, 0, v2, a3);
        sub_aadf28(v2);
        if (!v3)
            return 0;
    }
    else if (1 > (int)sub_9d4888(a0, "\n"))
    {
        return 0;
    }
    if (!a2)
        return 1;
}
