/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75cdc..0xc75dc4 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c75cdc(unsigned long long *a0, unsigned long a1, long long ptr, unsigned long long a3)
{
    unsigned long v3;  // x20
    unsigned long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x10
    unsigned long v7;  // x21
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 0;
    v4 = 1;
    v5 = 8;
    if (a3 <= 0x3ffffffffffffff)
    {
        v6 = a3 * 64;
        if (0x7fffffffffffffc0 >= v6)
        {
            v3 = v6;
            if (a1)
            {
                v0 = 0;
                if (!_posix_memalign(&v0, 64, v3) && !(v7 = v0, !v7))
                {
                    _memcpy(v7, ptr, a1 * 64);
                    _free(ptr);
LABEL_c75d88:
                    v4 = 0;
                    a0[1] = v7;
                }
                else
                {
LABEL_c75d94:
                    a0[1] = 64;
                    v4 = 1;
                }
            }
            else
            {
                v0 = 0;
                if (_posix_memalign(&v0, 64, v3) || (v7 = v0, !v7))
                    goto LABEL_c75d94;
                goto LABEL_c75d88;
            }
            v5 = 16;
        }
    }
    *(unsigned long *)((char *)a0 + v5) = v3;
    *a0 = v4;
    return;
}
