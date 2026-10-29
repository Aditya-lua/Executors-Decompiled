/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa135a0..0xa13750 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a135a0(long long *a0, long long a1, long long a2, long long a3, long long *a4, long long *a5, long long a6)
{
    long long v2;  // x0
    long long v3;  // x22
    long long v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (1 >= (unsigned long long)a3 && !sub_9e4828(a0[2]) && !sub_9e4828(a0[3]))
    {
        if ((!a2 || a3) && (a2 || a3 != 1))
        {
            v2 = sub_a1a56c();
            if (!v2)
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec2_smpl.c", 902, "ec_GF2m_simple_points_mul");
                sub_a36abc(16, 0x80010, 0);
                return 0;
            }
            v3 = v2;
            if (sub_a1c704(a0, v3, a2, 0, a6) && sub_a1c704(a0, a1, *a5, *a4, a6))
                v4 = sub_a1b598(a0, a1, v3, a1, a6) != 0;
            else
                v4 = 0;
            sub_a1a254(v3);
            return v4;
        }
        return sub_a1c704();
    }
}
