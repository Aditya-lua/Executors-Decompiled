/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14a84..0x14ac0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_14a84_1 {
    struct st_14a84_0 *field_0;
    unsigned long long field_8;
} st_14a84_1;

typedef struct st_14a84_0 {
    unsigned long long field_0;
    long long field_8;
} st_14a84_0;


st_14a84_1 * sub_14a84(st_14a84_1 *a0)
{
    st_14a84_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    sub_13918(v2, v2->field_0 + 56 * a0->field_8, v2->field_8);
    return a0;
}
