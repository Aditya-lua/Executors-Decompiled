/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b9d0..0x6baa8 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6b9d0_0 {
    char field_0;
} st_6b9d0_0;


int sub_6b9d0(unsigned long a0, long long a1, unsigned long a2)
{
    double v4;  // d0
    unsigned long long v5;  // 4182
    long long t;  // x0
    long long v7;  // x23
    unsigned long long v8;  // x0
    long long v9;  // x2
    unsigned long long t1;  // x0
    double v11;  // d0
    double v12;  // d1
    unsigned long long v13;  // 4183
    st_6b9d0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_6b9d0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *(double *)a2;
    v5 = arm64g_calculate_condition(144, (((((char)(CmpF(__double_as_longlong(v4), 0.0)) >> 5 & 3 | v4 < 0.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - (((char)(CmpF(__double_as_longlong(v4), 0.0)) >> 5 & 3 | v4 < 0.0) & ((char)(CmpF(__double_as_longlong(v4), 0.0)) >> 5 & 3 | v4 < 0.0) >> 1 & 1)) * 0x10000000, 0, 0);
    if (v5 & 1)
        return 1;
    t = std::__1::chrono::steady_clock::now();
    v7 = sub_6c81c(std::__1::chrono::system_clock::now(t));
    v8 = sub_6b024(v7);
    if ((long long)(v8 ^ 0x7fffffffffffffff) < v7)
        v9 = 0x7fffffffffffffff;
    else
        v9 = v8 + v7;
    t1 = std::__1::chrono::steady_clock::now(std::__1::condition_variable::__do_timed_wait(), a1, v9);
    v11 = (double)(long long)(t1 - t);
    v12 = *(double *)a2 * 1000000.0;
    v13 = arm64g_calculate_condition(192, (((((char)(CmpF(__double_as_longlong(v12), __double_as_longlong(v11))) >> 5 & 3 | v12 < (double)(long long)(t1 - t)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v12, (double)(long long)(t1 - t))) * 0x10000000, 0, 0);
    return !(v13 & 1);
}
