/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04048..0xa04090 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a04048(unsigned long a0)
{
    long long ptr;  // x0
    long long ptr1;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _dlopen(0, 1);
    if (!ptr)
        return ptr;
    ptr1 = _dlsym();
    _dlclose(ptr);
    return ptr1;
}
