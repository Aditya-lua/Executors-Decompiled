/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x17fe0..0x18018 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_17fe0_1 {
    struct st_17fe0_0 *field_0;
    unsigned long long field_8;
} st_17fe0_1;

typedef struct st_17fe0_0 {
    unsigned long long field_0;
    long long field_8;
} st_17fe0_0;


st_17fe0_1 * sub_17fe0(st_17fe0_1 *a0)
{
    st_17fe0_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    sub_212c4(v2, v2->field_0 + a0->field_8 * 16, v2->field_8);
    return a0;
}
