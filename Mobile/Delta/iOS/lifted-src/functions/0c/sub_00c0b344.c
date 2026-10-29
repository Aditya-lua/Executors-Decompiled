/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0b344..0xc0b3e4 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c0b344(uint128_t *a0, long long a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    void* ptr;  // x0
    void* i;  // x22
    void* v15;  // x22
    long long v16;  // x0
    uint128_t v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    v0 = *a0;
    ptr = _malloc(16);
    if (ptr)
    {
        i = 0;
        for (*(uint128_t *)ptr = v0; i != 16; i = v15)
        {
            sub_c0b0c8(a1, *(long long *)(ptr + i));
            v15 = i + 8;
            sub_c0190c(*(long long *)(ptr + i), a1);
        }
        _free();
        return;
    }
    v16 = sub_c6ba70(8, 16);
    _free(v10);
    __Unwind_Resume(v16);
}
