/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9ea80..0xb9eb00 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b9ea80(long long *dst, unsigned long a1, long long a2)
{
    long long *v2;  // x20
    long long ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 < 0)
        dst = sub_c6b970(0, a2);
    v2 = dst;
    if (a2)
    {
        ptr = _malloc(a2);
        if (!ptr)
            sub_c6b970(1, a2);
        *v2 = a2;
        v2[1] = ptr;
        v2[2] = 0;
        dst = _memcpy();
        v2[2] = a2;
    }
    else
    {
        *v2 = 0;
        v2[1] = 1;
        v2[2] = 0;
    }
    return (unsigned int)dst;
}
