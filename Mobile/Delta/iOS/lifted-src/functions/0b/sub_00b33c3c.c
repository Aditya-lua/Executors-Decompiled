/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb33c3c..0xb33e38 (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b33c3c(long long a0, unsigned long a1, unsigned long a2, unsigned long a3, long long a4, long long iter, long long n)
{
    unsigned long v5;  // x0
    long long v6;  // x26
    unsigned long v7;  // x19
    unsigned long v8;  // x21
    long long v9;  // x28
    unsigned long v10;  // x27
    char v0;  // [bp-0xb0]
    char v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (sub_a58104() && !(v5 = sub_a58044(a0), !v5))
    {
        v6 = v5;
        v7 = sub_a57f5c(a0);
        if (v7 && (!a3 || sub_a58164(v7, a3, a4)) && sub_a58170(v7, &v1, &v0, 64))
        {
            while (1)
            {
                sub_a57f0c(v7);
                v8 = sub_a57f5c(a0);
                if (!v8 || !sub_a58164(v8, &v1, v0))
                    goto LABEL_b33d9c;
                if ((unsigned long long)n <= (unsigned long long)v6)
                {
                    v7 = 0;
                    if (!a3)
                        goto LABEL_b33d44;
LABEL_b33d30:
                    if (sub_a58164(v8, a3, a4))
                        goto LABEL_b33d44;
                    goto LABEL_b33da8;
                }
                v7 = sub_a57f5c(v8);
                if (!v7)
                    goto LABEL_b33da8;
                if (a3)
                    goto LABEL_b33d30;
LABEL_b33d44:
                v9 = n - v6;
                if ((unsigned long long)n <= (unsigned long long)v6)
                    break;
                if (!sub_a58170(v8, iter, 0, n))
                    goto LABEL_b33da8;
                sub_a57f0c(v8);
                iter += v6;
                v8 = 0;
                v10 = 0;
                n = v9;
                if (!sub_a58170(v7, &v1, &v0, 64))
                    goto LABEL_b33dac;
            }
            if (!sub_a58170(v8, &v1, &v0, 64))
                goto LABEL_b33da8;
            _memcpy(iter, &v1, n);
            v10 = 1;
        }
        else
        {
            v8 = 0;
LABEL_b33da8:
            v10 = 0;
        }
    }
    else
    {
        v8 = 0;
LABEL_b33d9c:
        v7 = 0;
        goto LABEL_b33da8;
    }
LABEL_b33dac:
    sub_a57f0c(v8);
    sub_a57f0c(v7);
    sub_a66ec0(&v1, 64);
    if (*(long long *)&g_10002b0 == v2)
        return v10;
    ___stack_chk_fail();
}
