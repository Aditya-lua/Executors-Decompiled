/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ac4e4..0x2ac530 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ac4e4_0 {
    long long field_0;
    struct st_2ac4e4_1 *field_8;
    struct st_2ac4e4_1 *field_10;
    char field_18;
} st_2ac4e4_0;

typedef struct st_2ac4e4_1 {
    long long field_0;
} st_2ac4e4_1;


st_2ac4e4_0 * sub_2ac4e4(st_2ac4e4_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18 & 1)
        return a0;
    sub_2a7194(a0->field_0, *(long long *)a0->field_10, *(long long *)a0->field_10, *(long long *)a0->field_8, *(long long *)a0->field_8);
    return a0;
}
