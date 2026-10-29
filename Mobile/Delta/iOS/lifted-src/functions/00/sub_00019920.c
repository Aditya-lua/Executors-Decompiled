/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19920..0x19994 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19920_1 {
    char padding_0[32];
    unsigned int field_20;
} st_19920_1;

typedef struct st_19920_0 {
    char field_0;
} st_19920_0;


int sub_19920(st_19920_1 *a0)
{
    st_19920_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_19920_0 *v1;  // [bp-0x38]
    unsigned int v2;  // [bp-0x30]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_20 == 262)
    {
        return 1;
    }
    else if (a0->field_20 == 281)
    {
        sub_b1a4();
        if (v2 != 262)
            return 0;
        return 1;
    }
    else
    {
        return 0;
    }
}
