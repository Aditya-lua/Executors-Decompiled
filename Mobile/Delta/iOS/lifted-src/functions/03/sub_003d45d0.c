/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d45d0..0x3d4654 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d45d0_0 {
    char field_0;
} st_3d45d0_0;


unsigned long long sub_3d45d0(long long *a0)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    st_3d45d0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d45d0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (char)a0[2309];
    if ((unsigned int)v4 != 0xff)
    {
        *(char *)&a0[2309] = 0xff;
        return v4;
    }
    else if (sub_3d706c(*a0) != 0xff)
    {
        return 0xff;
    }
    else
    {
        do
        {
            v5 = sub_3d706c(*a0);
        } while ((unsigned int)v5 == 0xff);
        return v5;
    }
}
