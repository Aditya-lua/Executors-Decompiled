/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91e6c0..0x91e744 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91e6c0_0 {
    char field_0;
} st_91e6c0_0;


long long sub_91e6c0(void* ptr)
{
    char v0;  // [bp-0x60]
    unsigned long v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    st_91e6c0_0 **v3;  // [bp-0x30], Other Possible Types: char
    st_91e6c0_0 *v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    std::__1::mutex::lock(ptr + 48);
    sub_91e21c(ptr);
    sub_8b50b8(ptr);
    v4 = &v3;
    v3 = &v4;
    sub_10780(ptr, (long long)ptr[8]);
    sub_8afa38(ptr);
    memset(ptr, 0, 32);
    *(unsigned long long *)&ptr[32] = 0;
    *(unsigned long long *)&ptr[40] = 0;
    v1 = 0;
    v2 = 0;
    sub_8ed95c(&v0);
    return std::__1::mutex::unlock(ptr + 48);
}
