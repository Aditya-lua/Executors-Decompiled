/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68ef8..0xc68f58 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68ef8_0 {
    char padding_0[16];
    uint128_t field_10;
} st_c68ef8_0;


void sub_c68ef8(st_c68ef8_0 *a0, long long n, unsigned long long *a2, long long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
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
    if (sub_c68684())
    {
        *(__m128i *)&a0->field_10 = _mm_add_epi64(a0->field_10, CONCAT(n, n));
        if (*a2)
            _memcpy(*a2, a3, n);
    }
}
