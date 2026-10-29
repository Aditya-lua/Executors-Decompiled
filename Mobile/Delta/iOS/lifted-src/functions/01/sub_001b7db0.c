/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b7db0..0x1b7e48 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b7db0_0 {
    char field_0;
} st_1b7db0_0;


int sub_1b7db0(int a0, unsigned int *a1)
{
    unsigned int v4;  // w8
    st_1b7db0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b7db0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0 < 32)
        return 0;
    if (sub_58b10())
    {
        v4 = 0xffffffd0;
    }
    else if (6 > (unsigned int)(a0 - 65))
    {
        v4 = 0xffffffc9;
    }
    else if (5 >= (unsigned int)(a0 - 97))
    {
        v4 = 0xffffffa9;
    }
    else
    {
        return 0;
    }
    *a1 = v4 + a0;
    return 1;
}
