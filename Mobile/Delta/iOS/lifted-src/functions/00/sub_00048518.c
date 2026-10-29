/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x48518..0x48570 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_48518_1 {
    struct st_48518_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_48518_1;

typedef struct st_48518_2 {
    unsigned long long field_0;
} st_48518_2;

typedef struct st_48518_0 {
    char field_0;
} st_48518_0;


st_48518_1 * sub_48518(st_48518_1 *a0)
{
    unsigned long long v2;  // x1
    st_48518_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_48518_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_8)
        return a0;
    v2 = 0;
    while (*(long long *)&a0->field_0[v2] == a0->field_18)
    {
        v2 += 1;
        if (a0->field_8 == v2)
            return a0;
    }
    return a0;
}
