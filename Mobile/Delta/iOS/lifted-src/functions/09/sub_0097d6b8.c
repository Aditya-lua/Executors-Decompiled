/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97d6b8..0x97d73c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97d6b8_0 {
    char padding_0[336];
    unsigned short field_150;
} st_97d6b8_0;


unsigned long long sub_97d6b8(unsigned long a0, unsigned int a1)
{
    unsigned long long v3;  // w0
    unsigned long v4;  // x9
    st_97d6b8_0 *v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (unsigned int)sub_97f48c();
    if (!v3)
        return v3;
    v4 = v0->field_150;
    if (!(v4 >> 2 & 1))
        return 1;
    if (!(v4 & 1))
    {
        v0->field_150 = (unsigned short)v4 & 0xfffa;
    }
    else
    {
        if (!a1)
            return 0;
        sub_97c738(0);
        return 0;
    }
    return 1;
}
