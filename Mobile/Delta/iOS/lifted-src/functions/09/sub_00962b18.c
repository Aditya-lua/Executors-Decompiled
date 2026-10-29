/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962b18..0x962b50 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962b18_0 {
    unsigned int field_0;
    char padding_4[2452];
    struct st_962b18_0 *field_998;
} st_962b18_0;


st_962b18_0 * sub_962b18(st_962b18_0 *a0)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = a0->field_0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
            return 0;
        a0 = sub_980dc8();
        if (!a0)
            return a0;
    }
    return a0->field_998;
}
