/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab2948..0xab2a14 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ab2948(void* a0)
{
    unsigned int v2;  // w0
    unsigned long v3;  // x19
    unsigned long v4;  // x22
    unsigned long long *v5;  // x23
    unsigned long long *v6;  // x26
    unsigned long v7;  // x24
    unsigned long v8;  // x25
    unsigned long long *v9;  // x26
    unsigned long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4((long long)a0[0x88]);
    if ((int)v2 >= 1)
    {
        v3 = sub_9dde10();
        if (v3)
        {
            v4 = 0;
            v5 = a0 + 72;
            v6 = a0 + 64;
            while (1)
            {
                v7 = *v6;
                v8 = *v5;
                v5 = sub_ad69f8((long long)a0[0x88], v4);
                v9 = v5;
                v10 = v9[3];
                v6 = v9 + 3;
                if (!v10 && !(v10 = sub_9e4988(0), *v6 = v10, v10))
                    break;
                if (!sub_9e7dc8(v10, v7, v8, v3))
                    break;
                v4 = (unsigned int)v4 + 1;
                if (v2 == (unsigned int)v4)
                {
                    sub_9dded4(v3);
                    return 1;
                }
            }
        }
    }
    else
    {
        v3 = 0;
    }
    sub_9dded4(v3);
    return 0;
}
