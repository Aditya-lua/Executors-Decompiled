/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bcd6c..0x1bce1c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bcd6c_0 {
    char field_0;
} st_1bcd6c_0;


unsigned long long sub_1bcd6c(long long a0, long long a1, long long a2, unsigned int *a3)
{
    unsigned long long v4;  // x0
    st_1bcd6c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1bcd6c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::recursive_mutex::lock(a0 + 144);
    v4 = sub_1c0bfc(a0, a1, a2, a3);
    if (*a3 == 16)
        v4 = sub_1c0bfc(a0, a1, a2, a3);
    std::__1::recursive_mutex::unlock(a0 + 144);
    return v4;
}
