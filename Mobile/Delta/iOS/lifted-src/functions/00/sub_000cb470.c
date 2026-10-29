/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcb470..0xcb4c4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cb470_1 {
    unsigned short field_0;
    char field_2;
} st_cb470_1;

typedef struct st_cb470_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
} st_cb470_0;


unsigned long long sub_cb470(st_cb470_1 *a0, unsigned long a1, st_cb470_0 *a2)
{
    unsigned long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long long v2;  // x0

    if (3 > a1)
        return 0xffffffffffffffb8;
    v0 = a0->field_0;
    v1 = ((unsigned int)v0 & 0xfff8 | a0->field_2 * 0x10000) >> 3;
    v2 = (v0 * 0x8000000000000000 | v0 >> 1) & 9223372036854775811 & 3;
    a2->field_0 = v2;
    a2->field_4 = (unsigned int)v0 & 1;
    a2->field_8 = v1;
    if ((unsigned int)v2 == 1)
    {
        return v2;
    }
    else if ((unsigned int)v2 == 3)
    {
        return 0xffffffffffffffec;
    }
    else
    {
        return v1;
    }
}
