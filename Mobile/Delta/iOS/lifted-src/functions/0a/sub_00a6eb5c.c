/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6eb5c..0xa6ebd4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6eb5c_0 {
    char padding_0[16];
    uint128_t field_10;
} st_a6eb5c_0;


long long sub_a6eb5c(st_a6eb5c_0 *a0, long long a1, long long n)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    long long v13;  // w0
    long long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (!n)
        return 1;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    v13 = (unsigned int)sub_c68684();
    if (!v13)
        return v13;
    *(__m128i *)&a0->field_10 = _mm_add_epi64(a0->field_10, CONCAT(n, n));
    if (!v0)
        return 1;
    _memset(v0, a1, n);
    return 1;
}
