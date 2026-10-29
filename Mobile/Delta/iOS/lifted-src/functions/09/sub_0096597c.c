/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96597c..0x965ac0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_96597c(unsigned long long a0, unsigned int a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long a5, unsigned long long a6, unsigned int *a7)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x22
    unsigned long v14;  // x15
    unsigned long long v6;  // x21
    unsigned long long v7;  // w0
    unsigned long long v8;  // x11
    unsigned long long v9;  // x10
    unsigned long v10;  // x14
    unsigned long v11;  // x14
    unsigned long v12;  // x11
    unsigned long v13;  // x15
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (a0 && !(v4 = *(int *)a0, (unsigned int)v4 && (!(v4 >> 7 & 1) || (a7 = a7, !sub_980dc8()))))
    {
        if (a2 >> 12 & 1 && a6)
            return 0;
        v5 = a3;
        v6 = a4;
        v7 = (unsigned int)sub_9623d8();
        if (!v7)
            return v7;
        v8 = v0;
        v9 = v1;
        *(unsigned long long *)v5 = 0;
        *(unsigned long long *)v6 = 0;
        if (v9 && (long long)v8 >= 1)
        {
            while (v8 - 1 >= 5)
            {
                if (!v8)
                    return 0;
                if ((v8 & 0xfffffffffffffffe) == 6 || !(v10 = *(short *)(v9 + 6), v11 = (unsigned int)((v10 & 0xff00) >> 8) | (unsigned int)v10 * 0x100 & 0xff00ff00, v12 = v8 - 8, v8 = v12 - v11, v12 >= v11))
                    break;
                v13 = *(short *)(v9 + 4);
                v14 = v9 + 8;
                v9 = v14 + v11;
                if (((unsigned int)((v13 & 0xff00) >> 8) | (unsigned int)v13 * 0x100 & 0xff00ff00) == a1)
                {
                    *(unsigned long *)v5 = v14;
                    *(unsigned long *)v6 = v11;
                    return 1;
                }
            }
        }
        *a7 = 80;
    }
    else
    {
        *a7 = 80;
    }
    return 0xffffffff;
}
