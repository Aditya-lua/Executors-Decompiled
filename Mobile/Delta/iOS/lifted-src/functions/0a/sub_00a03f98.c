/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03f98..0xa04048 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a03f98(int a0, unsigned long a1, int a2)
{
    int v5;  // w0
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    long long v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!_dladdr())
    {
        v0 = "dlfcn_pathbyaddr(): ";
        v1 = _dlerror();
        sub_a364a0(2);
        return 0xffffffff;
    }
    v5 = _strlen(v2);
    if (a2 <= 0)
        return v5 + 1;
    if (v5 >= a2)
        v5 = a2 - 1;
    _memcpy();
    *(char *)(a1 + v5) = 0;
    return v5 + 1;
}
