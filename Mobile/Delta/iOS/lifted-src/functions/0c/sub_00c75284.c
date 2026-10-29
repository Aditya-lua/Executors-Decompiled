/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75284..0xc7530c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c75284(unsigned long long *a0, unsigned long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v2;  // x10
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9
    unsigned long long v5;  // x20
    unsigned long long ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = 1;
    v4 = 8;
    if (a3 <= 0x1fffffffffffffff)
    {
        v5 = a3 * 8;
        if (0x7ffffffffffffff8 >= v5)
        {
            if (a1)
            {
                ptr = _realloc(a2, v5);
                if (!ptr)
                    goto LABEL_c752e4;
LABEL_c752cc:
                v3 = 0;
                a0[1] = ptr;
            }
            else
            {
                ptr = _malloc(v5);
                if (ptr)
                    goto LABEL_c752cc;
LABEL_c752e4:
                a0[1] = 8;
                v3 = 1;
            }
            v4 = 16;
            v2 = v5;
        }
    }
    *(unsigned long long *)((char *)a0 + v4) = v2;
    *a0 = v3;
    return;
}
