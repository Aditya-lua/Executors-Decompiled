/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f9940..0x3f9954 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f9940_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_3f9940_1 *field_10;
} st_3f9940_0;

typedef struct st_3f9940_1 {
    unsigned long long field_0;
} st_3f9940_1;


st_3f9940_0 * sub_3f9940(st_3f9940_0 *a0, unsigned long long *a1, unsigned long a2)
{
    unsigned long long v0;  // x8

    v0 = *a1;
    a0->field_0 = *a1;
    a0->field_8 = v0 + a2 * 8;
    a0->field_10 = a1;
    return a0;
}
