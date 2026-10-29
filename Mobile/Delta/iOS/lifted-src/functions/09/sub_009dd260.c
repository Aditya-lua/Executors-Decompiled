/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dd260..0x9dd360 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9dd260(unsigned long a0, long long a1, long long *a2, long long a3)
{
    unsigned long long v2;  // 4122
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a2 && a2[1])
    {
        v2 = arm64g_calculate_condition(1, (unsigned int)a2[5], 1, 0);
        if (!(v2 & 1))
        {
            a1 = a1;
            if (!sub_9dcf14(a2, a3))
                return 0;
            if (a1)
                goto LABEL_9dd304;
        }
        else
        {
            *(unsigned int *)&a2[5] = 0;
            if (a1)
            {
LABEL_9dd304:
                if (!sub_9e4c34(a1, a2[1]))
                    return 0;
            }
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/bn/bn_blind.c", 138, "BN_BLINDING_convert_ex");
    sub_a36abc(3, 107, 0);
    return 0;
}
