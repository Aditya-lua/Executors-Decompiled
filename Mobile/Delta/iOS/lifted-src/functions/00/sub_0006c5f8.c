/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6c5f8..0x6c634 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6c5f8_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_6c5f8_0;

typedef struct st_6c5f8_1 {
    unsigned long long field_0;
    struct st_6c5f8_0 *field_8;
    struct st_6c5f8_0 *field_10;
} st_6c5f8_1;


st_6c5f8_1 * sub_6c5f8(st_6c5f8_1 *a0, st_6c5f8_1 *a1)
{
    st_6c5f8_0 *v0;  // x9
    unsigned long v1;  // x8
    unsigned long v2;  // x10
    st_6c5f8_0 *v3;  // x11

    v0 = a1->field_8;
    v1 = &a1->field_8;
    a0->field_0 = a1->field_0;
    a0->field_8 = v0;
    v2 = &a0->field_8;
    v3 = a1->field_10;
    a0->field_10 = v3;
    if (!v3)
    {
        a0->field_0 = v2;
        return a0;
    }
    v0->field_10 = v2;
    a1->field_0 = v1;
    *(unsigned long long *)v1 = 0;
    *(unsigned long long *)(v1 + 8) = 0;
    return a0;
}
