/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe0630..0xe0678 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e0630_1 {
    char padding_0[8];
    struct st_e0630_0 *field_8;
} st_e0630_1;

typedef struct st_e0630_0 {
    char padding_0[9];
    struct st_e0630_0 *field_9;
} st_e0630_0;

typedef struct st_e0630_2 {
    char field_0;
} st_e0630_2;


st_e0630_1 * sub_e0630(st_e0630_1 *a0)
{
    st_e0630_2 **v0;  // [bp-0x20], Other Possible Types: char
    st_e0630_2 *v1;  // [bp-0x18]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_8)
        return 0;
    return *(long long *)&a0->field_8->padding_0[8] + 1;
}
