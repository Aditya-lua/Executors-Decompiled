/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74dcc..0x74e5c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74dcc_0 {
    char field_0;
} st_74dcc_0;


long long sub_74dcc(void* a0)
{
    unsigned long long t;  // x0
    st_74dcc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_74dcc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((int)a0[780] < 1)
        return 0;
    t = std::__1::chrono::steady_clock::now(std::__1::mutex::lock(a0 + 832));
    std::__1::mutex::unlock(a0 + 832);
    return (long long)(t - (long long)a0[896]) > (int)a0[780] * 1000000000;
}
