/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0196c..0xc019fc (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_c0196c(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long *ptr;  // x0
    long long v13;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    ptr = _malloc(8);
    if (ptr)
    {
        *ptr = *a0;
        sub_c0199c(); /* do not return */
    }
    v13 = sub_c6ba70(8, 8);
    _free(v9);
    __Unwind_Resume(v13);
}
