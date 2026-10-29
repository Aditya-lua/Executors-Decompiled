/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a3a50..0x4a3ab0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_4a3a50(void* ptr)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x0
    unsigned long long v9;  // x8
    void* v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!*(long long *)ptr)
        return ptr;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_41eb50();
    v8 = *(long long *)ptr;
    v9 = (long long)ptr[16];
    v10 = sub_4e14(v8, v9 + v8 + (v9 + (-v8 | ~v9) + (-v8 & ~v9)) * 2 + 2, 1);
    memset(ptr, 0, 24);
    return v10;
}
