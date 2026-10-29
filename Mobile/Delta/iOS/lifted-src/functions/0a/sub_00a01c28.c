/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01c28..0xa01d98 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a01c28(void* a0)
{
    unsigned long v2;  // x20
    unsigned long v3;  // x21
    unsigned long v4;  // x22
    unsigned long v5;  // x0
    unsigned long v6;  // x23
    unsigned int v7;  // w0
    unsigned long v8;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)((long long)a0[160] + 88))
    {
        goto *((void *)(*(long long *)((long long)a0[160] + 88)));
    }
    else
    {
        v2 = sub_9dddcc((long long)a0[184]);
        if (v2)
        {
            v3 = (long long)a0[112];
            if ((long long)a0[112] || (v3 = sub_9e4988(), v3))
            {
                if (!sub_a62f90((long long)a0[184], a0 + 8, 0, 0) || !sub_a608b8(v2, a0 + 8, sub_9e46a8((long long)a0[16]), 80, v3))
                    goto LABEL_a01d30;
                v4 = (long long)a0[104];
                if ((long long)a0[104] || (v4 = sub_9e4958(), v4))
                {
                    v5 = sub_9e4958();
                    if (v5)
                    {
                        v6 = v5;
                        sub_9e5cb4();
                        v7 = sub_9dea6c(v4, (long long)a0[24], v6, (long long)a0[8], v2);
                        sub_9e4838(v6);
                        if (v7)
                        {
                            *(unsigned long *)&a0[104] = v4;
                            *(unsigned long *)&a0[112] = v3;
                            *(long long *)&a0[192] = (long long)a0[192] + 1;
                            v8 = 1;
                            goto LABEL_a01d50;
                        }
                    }
                }
                v8 = 0;
            }
            else
            {
LABEL_a01d30:
                v8 = 0;
                v4 = 0;
            }
        }
        else
        {
            v8 = 0;
            v4 = 0;
            v3 = 0;
        }
LABEL_a01d50:
        if (v4 != (long long)a0[104])
            sub_9e48d4(v4);
        if (v3 != (long long)a0[112])
            sub_9e48d4(v3);
        sub_9dded4(v2);
        return v8;
    }
}
