/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95649c..0x9565b8 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_95649c(void* a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x19
    unsigned long v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        if (*(int *)a0)
        {
            a0 = 0;
        }
        else
        {
            v0 = v5;
            v1 = v6;
            v2 = &v4;
            v3 = v7;
            if ((int)a0[128] || (v8 = a0, a0 = v8, sub_9a5714()))
            {
                *(unsigned int *)&a0[132] = 3;
            }
            else
            {
                v9 = (int)a0[132];
                if (!(v9 & 1))
                {
                    *(unsigned int *)&a0[132] = (unsigned int)v9 | 1;
                    sub_957628(v8, 1, 0);
                    if (0 < *(int *)(v8 + 452))
                        return 0xffffffff;
                }
                else if ((int)a0[452] >= 1)
                {
                    (*(long long *)((long long)a0[24] + 144))();
                }
                else
                {
                    v8 = a0;
                    if (!(v9 >> 1 & 1))
                        (*(long long *)((long long)a0[24] + 128))();
                }
                if (*(int *)(v8 + 132) != 3 || *(int *)(v8 + 452))
                    return 0;
            }
            return 1;
        }
    }
    return (unsigned int)a0;
}
