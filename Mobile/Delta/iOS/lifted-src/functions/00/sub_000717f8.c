/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x717f8..0x7185c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_717f8_0 {
    char field_0;
} st_717f8_0;


char * sub_717f8(char *a0, char *a1)
{
    st_717f8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_717f8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return a0;
    while (!sub_58440(*a0, 0x4000))
    {
        a0 += 1;
        if (a0 == a1)
            return a1;
    }
    return a0;
}
