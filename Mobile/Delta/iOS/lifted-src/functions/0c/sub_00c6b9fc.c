/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6b9fc..0xc6ba70 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c6b9fc(long long *a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x19
    long long ptr;  // x0
    long long v4;  // x8
    unsigned long long v5;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 >= 0)
    {
        v2 = a3;
        if (a1)
        {
            ptr = _realloc(a2, v2);
            if (!ptr)
                goto LABEL_c6ba50;
LABEL_c6ba28:
            v4 = 0;
            a0[1] = ptr;
        }
        else
        {
            ptr = _malloc(v2);
            if (ptr)
                goto LABEL_c6ba28;
LABEL_c6ba50:
            v4 = 1;
            a0[1] = 1;
        }
        v5 = 16;
    }
    else
    {
        v2 = 0;
        v4 = 1;
        v5 = 8;
    }
    *(long long *)((char *)a0 + v5) = v2;
    *a0 = v4;
    return;
}
