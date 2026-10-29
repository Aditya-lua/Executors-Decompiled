/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5a4a8..0xc5a5b8 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c5a4a8(unsigned long a0, unsigned long long a1)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9
    unsigned long long v5;  // x22
    unsigned long long ptr;  // x19
    unsigned long long v7;  // x20
    long long v8;  // x0
    long long v9;  // x19
    unsigned long long v10;  // x0
    unsigned long long v0;  // [bp-0x1050]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = a1 - (a1 >> 1);
    v4 = 200000;
    if (a1 >= 200000)
        a1 = v4;
    if (v3 >= a1)
        a1 = v3;
    if (48 < a1)
        v5 = a1;
    else
        v5 = 48;
    if (103 > a1)
    {
        ptr = &v0;
    }
    else
    {
        if (v3 > 230584300921369395)
            sub_c6ba88();
        v7 = v5 * 40;
        if (v7)
        {
            ptr = _malloc(v7);
            if (!ptr)
            {
                v8 = sub_c6b970(8, v7);
                if (a1 >= 103)
                    _free(v9);
                __Unwind_Resume(v8);
            }
        }
        else
        {
            ptr = 8;
        }
    }
    v10 = sub_c5a6c0();
    if (a1 <= 0x66)
        return v10;
    return _free(ptr);
}
