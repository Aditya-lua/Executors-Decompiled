/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd7360..0xbd749c (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bd7360(unsigned long a0, unsigned long long a1)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // x9
    unsigned long long v9;  // x20
    unsigned long long ptr;  // x0
    unsigned long long v11;  // x3
    long long v12;  // x0
    long long v13;  // x19
    long long v14;  // x0
    long long v15;  // x0
    unsigned long long v16;  // x0
    char v0;  // [bp-0x1058]
    unsigned long long v1;  // [bp-0x1040]
    char v2;  // [bp-0x58], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = 0;
    v7 = a1 - (a1 >> 1);
    v8 = 111111;
    if (a1 >= 111111)
        a1 = v8;
    if (v7 >= a1)
        a1 = v7;
    if (a1 >= 57)
    {
        v9 = a1 * 72;
        if (v7 > 128102389400760775)
        {
            sub_c6b970(0, v9);
        }
        else
        {
            if (v9)
            {
                ptr = _malloc(v9);
                if (ptr)
                {
                    v11 = a1;
                }
                else
                {
                    v12 = sub_c6b970(8, v9);
                    _free(v13);
                    v14 = __Unwind_Resume(v12);
                    if (a1 > 56)
                        sub_bd7a64(&v2);
                    v15 = __Unwind_Resume(v14);
                    sub_c73e0c(v15);
                }
            }
            else
            {
                v11 = 0;
                ptr = 8;
            }
            v2 = v11;
            v3 = ptr;
            v4 = 0;
LABEL_bd7414:
            v16 = sub_bd749c();
            if (a1 <= 56)
                return v16;
            sub_b9f1a4(ptr, 0);
            return _free(ptr);
        }
    }
    ptr = &v0;
    goto LABEL_bd7414;
}
