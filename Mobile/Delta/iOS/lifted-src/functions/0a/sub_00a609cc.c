/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa609cc..0xa60ad0 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a609cc(unsigned long long a0, unsigned long long a1, unsigned int *a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x0
    unsigned long long v17;  // x19
    unsigned long long v18;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    *a2 = 0;
    if (a0 && a1 && *(long long *)a0)
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        v16 = sub_9dddcc(0);
        if (!v16)
            return v16;
        v17 = v16;
        sub_9de064();
        v18 = sub_9de208(v17);
        if (v18 && !(v19 = v18, !sub_9e4d58()))
        {
            if (0 >= (int)sub_9e5528(a1, v19))
                *a2 = *a2 | 1;
            if (!sub_9e4c34(v19, *(long long *)a0) || !sub_9ebaf8(v19, 1))
                goto LABEL_a60aa4;
            if (!(sub_9e5528(a1, v19) >> 31 & 1))
                *a2 = *a2 | 2;
            v20 = 1;
        }
        else
        {
LABEL_a60aa4:
            v20 = 0;
        }
        sub_9de17c(v17);
        sub_9dded4(v17);
        return v20;
    }
    *a2 = 64;
    return 1;
}
