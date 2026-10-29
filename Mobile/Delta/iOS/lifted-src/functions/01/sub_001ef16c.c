/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ef16c..0x1ef1a4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ef16c_0 {
    char padding_0[24];
    struct st_1ef16c_1 *field_18;
    unsigned long long field_20;
} st_1ef16c_0;

typedef struct st_1ef16c_1 {
    unsigned int field_0;
} st_1ef16c_1;

typedef struct st_1ef16c_2 {
    char field_0;
} st_1ef16c_2;


int sub_1ef16c(st_1ef16c_0 *a0)
{
    st_1ef16c_2 **v0;  // [bp-0x10], Other Possible Types: char
    st_1ef16c_2 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_20)
        return 0;
    return *(int *)a0->field_18;
}
