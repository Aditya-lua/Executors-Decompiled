/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4a854..0xc4a968 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c4a854(unsigned long a0, unsigned long long a1)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // x9
    unsigned long long v9;  // x9
    unsigned long long v10;  // x20
    char *ptr;  // x0
    long long v12;  // x0
    unsigned long long v13;  // x0
    char v0;  // [bp-0x1068]
    char *v1;  // [bp-0x1050]
    unsigned long long v2;  // [bp-0x68]
    char *v3;  // [bp-0x60]
    char *v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = 0;
    v7 = a1 - (a1 >> 1);
    v8 = 250000;
    if (a1 >= 250000)
        a1 = v8;
    if (v7 >= a1)
        a1 = v7;
    v9 = 48;
    if (48 < a1)
        v9 = a1;
    if (a1 < 129)
    {
        ptr = &v0;
    }
    else if (v7 <= 0x7ffffffffffffff && !(v10 = v9 * 32, 0x7ffffffffffffff9 <= v10))
    {
        ptr = _malloc(v10);
        if (!ptr)
            goto LABEL_c4a940;
        v2 = v9;
        v3 = ptr;
        v4 = 0;
    }
    else
    {
        sub_c6ba88();
LABEL_c4a940:
        v12 = sub_c6b970(8, v10);
        if (a1 > 128)
            sub_c4a788(&v2);
        __Unwind_Resume(v12);
    }
    v13 = sub_c4b278();
    if (a1 <= 128)
        return v13;
    return _free(ptr);
}
