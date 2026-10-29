/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95772c..0x957938 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_95772c(unsigned int *a0)
{
    unsigned long v6;  // x8
    unsigned long long idx;  // x19
    unsigned int v8;  // w8
    char v0;  // [bp-0x48]
    unsigned int v1;  // [bp-0x44]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (!a0)
        return 0xffffffff;
    v6 = *a0;
    if (!(unsigned int)v6)
    {
        idx = a0;
        if (!*(long long *)(idx + 3192))
        {
            *(unsigned int *)(idx + 452) = 0;
            return 1;
        }
        goto LABEL_95777c;
    }
    else if (v6 >> 7 & 1 && (idx = sub_980dc8(a0), idx))
    {
        if (!*(long long *)(idx + 3192))
        {
            *(unsigned int *)(idx + 452) = 0;
            return 1;
        }
LABEL_95777c:
        v0 = 21;
        v8 = *(int *)(idx + 72);
        if (*(int *)(idx + 72) == 772)
            v8 = 0x303;
        v1 = v8;
        if (sub_9a565c() == 13 && !*(int *)(idx + 2976) && (sub_962324(a0) & 0xffffff00) == 0x300 && (int)sub_962324(a0) >= 770 && !*(int *)(idx + 2256))
            v1 = 769;
        v2 = idx + 456;
        v3 = 2;
        if (!sub_992a48(idx + 3160))
        {
            (*(long long *)(*(long long *)(idx + 3192) + 48))();
        }
        else if (*(int *)(idx + 452) == 2)
        {
            (*(long long *)(*(long long *)(idx + 3192) + 56))();
        }
        else
        {
            *(unsigned int *)(idx + 452) = 0;
        }
    }
    return 0xffffffff;
}
