/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c2cd0..0x1c2d1c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c2cd0_0 {
    long long field_0;
    struct st_1c2cd0_1 *field_8;
    struct st_1c2cd0_1 *field_10;
    char field_18;
} st_1c2cd0_0;

typedef struct st_1c2cd0_1 {
    long long field_0;
} st_1c2cd0_1;


st_1c2cd0_0 * sub_1c2cd0(st_1c2cd0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18 & 1)
        return a0;
    sub_c044(a0->field_0, *(long long *)a0->field_10, *(long long *)a0->field_10, *(long long *)a0->field_8, *(long long *)a0->field_8);
    return a0;
}
