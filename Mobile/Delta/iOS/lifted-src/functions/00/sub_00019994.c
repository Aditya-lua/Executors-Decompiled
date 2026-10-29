/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19994..0x199b8 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19994_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_19994_1;

typedef struct st_19994_0 {
    uint128_t field_0;
    unsigned long long field_10;
    char field_18;
} st_19994_0;


double sub_19994(st_19994_0 *a0, st_19994_1 *a1)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x9
    uint128_t v2;  // q0

    v0 = a0->field_18;
    v1 = a1->field_10;
    v2 = a1->field_0;
    a0->field_0 = v2;
    a0->field_10 = v1;
    if (!(v0 & 1))
        a0->field_18 = 1;
    return (unsigned long long)v2;
}
