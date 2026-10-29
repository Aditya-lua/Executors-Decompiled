/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3ff0..0xac4014 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3ff0_0 {
    char padding_0[160];
    struct st_ac3ff0_1 *field_a0;
} st_ac3ff0_0;

typedef struct st_ac3ff0_1 {
    long long field_0;
} st_ac3ff0_1;


long long sub_ac3ff0(st_ac3ff0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    return !sub_a6e200(*(long long *)a0->field_a0);
}
