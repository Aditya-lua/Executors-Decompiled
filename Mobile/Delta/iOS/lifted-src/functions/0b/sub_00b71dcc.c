/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb71dcc..0xb71ea8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b71dcc(long long *a0)
{
    long long v5;  // x21
    long long v6;  // x8
    long long v7;  // x0
    long long v8;  // x19
    long long ptr;  // x0
    char v0;  // [bp-0x48], Other Possible Types: long long
    long long v1;  // [bp-0x40]
    long long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0[2];
    v6 = *a0;
    if (v6 != v5)
    {
        v7 = a0[1];
        v8 = v5 + 1;
        *(char *)(v7 + v5) = 0;
        if ((unsigned long long)v6 <= (unsigned long long)v8)
        {
            return v7;
        }
        else if (v8)
        {
            ptr = _realloc();
            if (ptr)
                return ptr;
            sub_c6b970(1, v8);
        }
        else
        {
            _free();
            return 1;
        }
    }
    else
    {
        sub_c6b9fc(&v0, v5, a0[1], v5 + 1);
        if (v0 != 1)
        {
            *(char *)(v1 + v5) = 0;
            return v1;
        }
        sub_c6b970(v1, v2);
    }
    __debugbreak();
}
