/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2d890..0xb2da4c (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b2d890(unsigned long a0, unsigned long a1, unsigned long a2, long long a3, long long a4, unsigned long a5, unsigned long long a6)
{
    unsigned int v5;  // w0
    unsigned long v6;  // x0
    unsigned long v7;  // x24
    unsigned long v8;  // x8
    long long v9;  // x23
    unsigned long v10;  // x26
    unsigned long i;  // x27
    unsigned long v12;  // x8
    char v0;  // [bp-0xa9]
    char v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = sub_a50ac8();
    if ((int)v5 >= 1)
    {
        v6 = 0;
        v7 = v5;
        v8 = a6 / v7;
        if (a6 - v7 * v8)
            v8 += 1;
        if (a5 && 0xff >= v8)
        {
            v6 = sub_a64420();
            if (v6)
            {
                v9 = v6;
                if (sub_a64000())
                {
                    if (v8)
                    {
                        v10 = 0;
                        i = 1;
                        do
                        {
                            v0 = i;
                            if ((unsigned int)i >= 2 && (!sub_a64000(v9, 0, 0, 0, 0) || !sub_a6432c(v9, &v1, v7)) || !sub_a6432c(v9, a3, a4) || !sub_a6432c(v9, &v0, 1) || !sub_a64344(v9, &v1, 0))
                                goto LABEL_b2d9f4;
                            v12 = a6 - v10;
                            if (v12 >= v7)
                                v12 = v7;
                            _memcpy();
                            v10 += v12;
                            i = (unsigned int)i + 1;
                        } while (i <= v8);
                        goto LABEL_b2d9f4;
                    }
                    v6 = 1;
                }
                else
                {
LABEL_b2d9f4:
                    v6 = 0;
                }
                sub_a66ec0(&v1, 64);
                sub_a644c4(v9);
            }
        }
    }
    else
    {
        v6 = 0;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v6;
    ___stack_chk_fail();
}
