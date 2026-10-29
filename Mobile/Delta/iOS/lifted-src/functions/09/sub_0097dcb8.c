/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97dcb8..0x97dd30 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97dcb8_0 {
    char padding_0[336];
    unsigned short field_150;
} st_97dcb8_0;


unsigned long long sub_97dcb8(long long a0)
{
    unsigned long v3;  // x9
    st_97dcb8_0 *v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_97f48c())
        return 0xffffffff;
    v3 = v0->field_150;
    if (v3 >> 2 & 1)
        return sub_97d7bc(a0);
    if (!(v3 & 1))
    {
        v0->field_150 = (unsigned short)v3 | 4;
    }
    else
    {
        sub_97c738(0);
        return 0xffffffff;
    }
    return sub_97d7bc(a0);
}
