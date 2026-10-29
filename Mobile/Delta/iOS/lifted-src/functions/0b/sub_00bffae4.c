/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbffae4..0xbffb80 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bffae4(unsigned long idx, unsigned long a1, unsigned long long a2)
{
    unsigned long long v3;  // x19
    unsigned long long ptr;  // x0
    unsigned long long dst;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v3 = a2 * 16;
    if (a2 > 0xfffffffffffffff)
        sub_c6b970(0, v3);
    if (0x7ffffffffffffff8 >= v3)
    {
        if (v3)
        {
            ptr = _malloc(v3);
            if (!ptr)
                sub_c6b970(8, v3);
            *(unsigned long long *)idx = a2;
            *(unsigned long long *)(idx + 8) = ptr;
            *(unsigned long long *)(idx + 16) = 0;
            if (!a2)
                return ptr;
        }
        else
        {
            ptr = 8;
            *(unsigned long long *)idx = 0;
            *(unsigned long long *)(idx + 8) = 8;
            *(unsigned long long *)(idx + 16) = 0;
            if (!a2)
                return 8;
        }
        dst = _memcpy(ptr);
        *(unsigned long long *)(idx + 16) = a2;
        return dst;
    }
    sub_c6b970(0, v3);
}
