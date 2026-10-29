/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68f38..0xa69060 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a694f4;
extern long long g_a69544;

long long sub_a68f38(void)
{
    unsigned long v5;  // x19
    long long v6;  // w0
    char v7;  // x21
    char v9;  // w1
    char v10;  // x0
    char v0;  // [bp-0x48]
    char v1;  // [bp-0x3c]
    char v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_a6820c();
    if (!v5)
    {
        return v5;
    }
    else if (*(int *)(v5 + 32))
    {
        return v5;
    }
    else
    {
        sub_a6afb8(12, 0);
        sub_a992cc(2, &g_a694f4, v5);
        v6 = (unsigned int)sub_9c5d94(sub_a992cc(1, &g_a69544, v5), &g_a69544, v5);
        if (v6 < 1)
            return v5;
        v7 = 0;
        do
        {
            v2 = 0;
            v1 = 0;
            v0 = 0;
            sub_9c60a4(&v2 + 4, &v2, &v1, 0, &v0, sub_9c5dc0(v7));
            v9 = *(unsigned int *)((void*)&v2 + 4);
            if (!v9)
                continue;
            if (!(*&v1 & 1))
            {
                if (v9 == 920)
                {
                    sub_a695b0(0);
                    goto LABEL_a68fd0;
                }
            }
            else
            {
                if (v9 == 1172)
                {
LABEL_a68fd0:
                    v10 = 0;
                    goto LABEL_a68fd8;
                }
                else
                {
                    v10 = *(unsigned int *)&v2;
LABEL_a68fd8:
                    sub_a695b0(v10);
                }
            }
        } while ((v7 += 1, v6 != v7));
        return v5;
    }
}
