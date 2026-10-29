/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd972c..0xbd97c0 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bd972c(unsigned long long *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v2;  // x9
    unsigned long long *v3;  // x8
    unsigned long long v4;  // x9
    unsigned long long ptr;  // x0
    unsigned long long *v6;  // x8
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2 * 32;
    v3 = a1 + v2;
    v4 = -v2;
    do
    {
        v6 = v3;
        if (!v4)
        {
            *a0 = 0;
            a0[1] = 4;
            a0[2] = 0;
            a0[3] = 0;
            return 4;
        }
    } while ((v3 = (char *)v6 - 32, v4 += 32, *(long long *)((char *)v6 - 32) == 0x8000000000000000));
    v7 = (((char *)v3 - a1) * 0x800000000000000 | (char *)v3 - a1 >> 5) & 0xf8000000ffffffff & 0xffffffff;
    v8 = v7 + 32 >> 5;
    v9 = v8 * 4;
    ptr = _calloc(v9, 1);
    if (ptr)
    {
        *a0 = v8;
        a0[1] = ptr;
        a0[2] = v8;
        a0[3] = v7 + 1;
        return ptr;
    }
    sub_c6b970(4, v9);
}
