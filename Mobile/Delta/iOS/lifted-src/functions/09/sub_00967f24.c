/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967f24..0x967f50 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_967f24_0 {
    char padding_0[28];
    unsigned short field_1c;
} st_967f24_0;


st_967f24_0 * sub_967f24(st_967f24_0 **a0, unsigned int a1)
{
    st_967f24_0 *v0;  // x8
    st_967f24_0 *v1;  // x0
    st_967f24_0 *v2;  // x8

    v0 = a0[207];
    if (a0[207])
    {
        v1 = a0[206];
        do
        {
            v2 = v0;
            if (v1->field_1c == a1)
                return v1;
        } while ((v1 = &v1[1].padding_0[26], v0 = (char *)v2 - 1, v2 != 1));
    }
    return 0;
}
