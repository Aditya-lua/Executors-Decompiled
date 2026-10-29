/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x319f8..0x31a20 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_319f8_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_319f8_1;

typedef struct st_319f8_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned long long field_28;
} st_319f8_0;


double sub_319f8(st_319f8_0 *iter, unsigned long long i, st_319f8_1 *a2)
{
    unsigned long long v0;  // x1
    uint128_t v1;  // q0
    uint128_t v2;  // q1
    unsigned long v4;  // d0

    if (!i)
        return v4;
    do
    {
        v0 = i;
        v1 = a2->field_0;
        v2 = a2->field_10;
        iter->field_20 = a2->field_20;
        iter->field_0 = v1;
        iter->field_10 = v2;
        *(unsigned int *)&iter->field_28 = 0;
        iter += 1;
        i = v0 - 1;
    } while (i);
    return v4;
}
