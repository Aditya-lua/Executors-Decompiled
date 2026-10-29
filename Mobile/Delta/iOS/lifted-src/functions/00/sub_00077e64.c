/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77e64..0x77eac (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_77e64_0 {
    char padding_0[8];
    uint128_t field_8;
    unsigned long long field_18;
    unsigned long long field_20;
} st_77e64_0;


int sub_77e64(st_77e64_0 *ptr, unsigned long a1)
{
    memset(ptr, 0, 88);
    *(__m128i *)(ptr->padding_0)[1] = _mm_add_epi64(CONCAT(a1, a1), _mm_set_epi64x(14029467366897019727, 6983438078262162902));
    *(unsigned long *)((char *)&ptr->field_8 + 8) = a1;
    ptr->field_18 = a1 + 7046029288634856825;
    return 0;
}
