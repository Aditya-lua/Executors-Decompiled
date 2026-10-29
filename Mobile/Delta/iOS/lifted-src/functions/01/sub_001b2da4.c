/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2da4..0x1b2e04 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b2da4_1 {
    char padding_0[24];
    unsigned short field_18;
    char padding_1a[2];
    unsigned int field_1c;
} st_1b2da4_1;

typedef struct st_1b2da4_0 {
    char field_0;
} st_1b2da4_0;


void sub_1b2da4(st_1b2da4_1 *a0)
{
    st_1b2da4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1b2da4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(a0->field_18 & 496))
    {
        sub_1bb564();
        return;
    }
    else if (a0->field_1c)
    {
        sub_1c2050();
        return;
    }
    else
    {
        sub_1a94bc();
        return;
    }
}
