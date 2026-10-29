/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b720..0x3b76c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b720_1 {
    struct st_3b720_2 *field_0;
    unsigned long long field_8;
} st_3b720_1;

typedef struct st_3b720_2 {
    unsigned long long field_0;
} st_3b720_2;

typedef struct st_3b720_0 {
    char field_0;
} st_3b720_0;


st_3b720_1 * sub_3b720(st_3b720_1 *a0, unsigned int a1)
{
    st_3b720_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3b720_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a1)
    {
        *(unsigned long long *)a0->field_0 = *(long long *)a0->field_0 & ~a0->field_8;
        return a0;
    }
    *(unsigned long long *)a0->field_0 = *(long long *)a0->field_0 | a0->field_8;
    return a0;
}
