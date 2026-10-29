/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaadf74..0xaadff4 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aadf74_0 {
    char padding_0[16];
    struct st_aadf74_0 *field_10;
} st_aadf74_0;


st_aadf74_0 * sub_aadf74(st_aadf74_0 *a0, st_aadf74_0 **a1)
{
    st_aadf74_0 *v2;  // x0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a0)
    {
    case 5:
        if ((int)*a1->field_10 == 1)
        {
            v3 = sub_ab2948(*a1) == 1;
            break;
        }
        else
        {
            return 1;
        }
    case 2:
        sub_ab1360(*a1);
        *a1 = 0;
        return 2;
    case 0:
        v2 = sub_ab11bc();
        v3 = v2 != 0;
        *a1 = v2;
        break;
    default:
        return 1;
    }
    return v3 * 2;
}
