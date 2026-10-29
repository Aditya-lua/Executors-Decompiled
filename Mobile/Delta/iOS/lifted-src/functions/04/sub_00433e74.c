/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x433e74..0x433eb0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_433e74_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_433e74_0;


double sub_433e74(st_433e74_0 *a0, st_433e74_0 *ptr)
{
    uint128_t v2;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_4141bc();
    v2 = ptr->field_0;
    a0->field_0 = v2;
    a0->field_10 = ptr->field_10;
    memset(ptr, 0, 24);
    return (unsigned long long)v2;
}
