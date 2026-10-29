/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2c8f7c..0x2c906c (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2c8f7c_0 {
    char field_0;
} st_2c8f7c_0;

extern char g_1000310;

unsigned int sub_2c8f7c(unsigned int a0)
{
    unsigned int v9;  // w0
    st_2c8f7c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_2c8f7c_0 *v1;  // [bp-0x78]
    unsigned int v2;  // [bp-0x6c]
    unsigned int v3;  // [bp-0x68]
    char v4;  // [bp-0x64], Other Possible Types: unsigned int
    unsigned int v5;  // [bp-0x40]
    unsigned int v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return a0;
    v5 = 0;
    v6 = a0;
    v2 = 0;
    v3 = 9;
    v9 = _vm_region_64(*(int *)&g_1000310, &v6, &v5, 9, &v4, &v3, &v2);
    if (v2)
        _mach_port_deallocate(*(int *)&g_1000310);
    if (v9)
    {
        return 0;
    }
    else if (a0 < v6)
    {
        return 0;
    }
    else if (v5 + v6 <= a0)
    {
        return 0;
    }
    else if (~(v4 & 3))
    {
        return 0;
    }
    else
    {
        return !(v4 & 4);
    }
}
