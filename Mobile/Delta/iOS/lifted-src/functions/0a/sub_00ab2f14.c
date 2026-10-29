/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab2f14..0xab3084 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_ab2f14(unsigned long a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v5;  // x19
    long long v6;  // w0
    long long v7;  // x26
    long long v8;  // x25
    long long v9;  // x28
    long long v10;  // x20
    unsigned int v0;  // [bp-0xac]
    char v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = sub_a3f728();
    if (v5 && !(v6 = (unsigned int)sub_a50ac8(a4), v6 < 1))
    {
        if (a1 >= 1)
        {
            v7 = 0;
            v8 = 0;
        }
        else
        {
LABEL_ab3024:
            v10 = 0;
            goto LABEL_ab3030;
        }
        while (1)
        {
            v0 = (((((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            if (!sub_a3fe04(v5, a4, 0) || !sub_a3fe10(v5, a2, a3) || !sub_a3fe10(v5, &v0, 4))
                break;
            v9 = v8 + v6;
            if (a1 >= v9)
            {
                if (!sub_a3ff7c(v5, a0 + v8, 0))
                    break;
                v7 += 1;
                v8 = v9;
                if (v8 >= a1)
                    goto LABEL_ab3024;
            }
            else if (sub_a3ff7c(v5, &v1, 0))
            {
                _memcpy(a0 + v8, &v1, a1 - v8);
                goto LABEL_ab3024;
            }
        }
    }
    v10 = 0xffffffff;
LABEL_ab3030:
    sub_a66ec0(&v1, 64);
    sub_a3f73c(v5);
    if (*(long long *)&g_10002b0 == v2)
        return v10;
    ___stack_chk_fail();
}
