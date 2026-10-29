/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eee70..0x1eef2c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eee70_0 {
    char field_0;
} st_1eee70_0;

typedef struct st_1eee70_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_1eee70_1;

extern st_1eee70_1 g_d0a170;

unsigned long long sub_1eee70(unsigned long a0, unsigned long a1, long long a2, long long a3)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    st_1eee70_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1eee70_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1)
        v4 = sub_1eeb2c();
    else
        v4 = 2;
    v5 = sub_1eeb2c(a2, a3, (&g_d0a170.field_0)[2 * v4], (&g_d0a170.field_0)[1 + 2 * v4]);
    if ((unsigned int)v5)
    {
        return v5;
    }
    else if (1 >= a1)
    {
        v6 = sub_1eeb2c(a2, a3, 87, 105);
        if (!(unsigned int)v6)
            return 0xffffffff;
        return v6;
    }
    else
    {
        return 0xffffffff;
    }
}
