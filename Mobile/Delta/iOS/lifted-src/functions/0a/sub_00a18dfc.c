/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18dfc..0xa18eec (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a18dfc(void* a0, unsigned long a1, unsigned long a2)
{
    unsigned long v2;  // x0
    unsigned long v3;  // x0
    unsigned long v4;  // x0
    unsigned long v5;  // x20
    unsigned int v6;  // w21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (((long long)a0[40] || (v2 = sub_9e4988(), *(unsigned long *)&a0[40] = v2, v2)) && (int)sub_b34dc8(a0) >= 1 && ((long long)a0[32] || (v3 = sub_a1a56c((long long)a0[24]), *(unsigned long *)&a0[32] = v3, v3)))
    {
        v4 = sub_9dddcc((long long)a0[80]);
        if (v4)
        {
            v5 = v4;
            v6 = sub_a1b804((long long)a0[24], (long long)a0[32], (long long)a0[40], 0, 0, v5);
            sub_9dded4(v5);
            if (v6)
            {
                if (v6 == 1)
                {
                    *(long long *)&a0[96] = (long long)a0[96] + 1;
                    return 1;
                }
                return 1;
            }
        }
    }
    sub_9e4838((long long)a0[40]);
    *(unsigned long long *)&a0[40] = 0;
    if ((long long)a0[32])
        sub_a1b11c((long long)a0[24]);
    return 0;
}
