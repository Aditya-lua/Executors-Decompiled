/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe2e7c..0xbe2fe0 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_be2e7c(long long a0, long long a1)
{
    long long *ptr;  // x0
    long long *ptr1;  // x19
    unsigned long long v4;  // x22
    long long v5;  // x21
    long long v6;  // x21
    long long v7;  // x0
    long long v8;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(24);
    if (ptr)
    {
        ptr1 = ptr;
        *ptr = a0;
        ptr[1] = a0 + 64;
        ptr[2] = a0 + 128;
        v4 = sub_be2154(a1, 0, a0) & 0xff;
        if ((unsigned int)v4 == 2)
        {
            v4 = sub_bd3c48(a0, a1) & 0xff;
            if ((unsigned int)v4 == 2)
            {
                v4 = sub_be2154(a1, 1, a0) & 0xff;
                if ((unsigned int)v4 == 2)
                {
                    v5 = ptr1[1];
                    v4 = sub_be2154(a1, 0, v5) & 0xff;
                    if ((unsigned int)v4 == 2)
                    {
                        v4 = sub_bd3c48(v5, a1) & 0xff;
                        if ((unsigned int)v4 == 2)
                        {
                            v4 = sub_be2154(a1, 1, v5) & 0xff;
                            if ((unsigned int)v4 == 2)
                            {
                                v6 = ptr1[2];
                                v4 = sub_be2154(a1, 0, v6) & 0xff;
                                if ((unsigned int)v4 == 2)
                                {
                                    v4 = sub_bd3c48(v6, a1) & 0xff;
                                    if ((unsigned int)v4 == 2)
                                        v4 = sub_be2154(a1, 1, v6) & 0xff;
                                }
                            }
                        }
                    }
                }
            }
        }
        _free(ptr1);
        return v4;
    }
    v7 = sub_c6ba70(8, 24);
    _free(v8);
    __Unwind_Resume(v7);
}
