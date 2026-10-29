/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb42b48..0xb42bcc (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b42b48(long long *a0, long long a1)
{
    unsigned long v2;  // x0
    unsigned long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_ac3874(a0[1], a0[2], a1);
        if (!v2)
            return v2;
        v3 = sub_ac363c();
        if (v3 && sub_ac3e78())
        {
            sub_ac3738(v3);
            return v2;
        }
        sub_ac3738();
        sub_ac39b4(v2);
    }
    return 0;
}
