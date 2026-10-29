/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68f58..0xc68fc8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68f58_0 {
    char padding_0[16];
    uint128_t field_10;
} st_c68f58_0;


unsigned long long sub_c68f58(st_c68f58_0 *a0, unsigned long a1, long long *a2, long long a3, unsigned int *a4)
{
    unsigned long long v2;  // x0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c68684();
    if ((unsigned int)v2)
    {
        *(__m128i *)&a0->field_10 = _mm_add_epi64(a0->field_10, CONCAT(a1, a1));
        v2 = sub_a7b03c(*a2, a3);
        v3 = 1;
    }
    else
    {
        v3 = 0;
    }
    *a4 = v3;
    return v2;
}
