/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aec78..0x1aecf4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aec78_0 {
    char field_0;
} st_1aec78_0;


long long sub_1aec78(long long a0, long long a1, unsigned long a2, unsigned int a3)
{
    st_1aec78_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1aec78_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a3 && !sub_9607a0(a1))
        sub_9607a0(a1);
    std::__1::mutex::lock(a0);
    sub_95eea4(a1);
    return std::__1::mutex::unlock(a0);
}
