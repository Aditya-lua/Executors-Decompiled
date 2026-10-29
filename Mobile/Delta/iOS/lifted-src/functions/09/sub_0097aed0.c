/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97aed0..0x97afdc (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97aed0_0 {
    char padding_0[40];
    long long field_28;
    char padding_30[1521];
    char field_621;
} st_97aed0_0;


int sub_97aed0(st_97aed0_0 *a0, unsigned int a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a1)
    {
    case 47:
        if (!(a0->field_621 >> 1 & 1) || !sub_98a750(a0->field_28))
            goto LABEL_97af9c;
        break;
    case 10:
        if (!(a0->field_621 >> 1 & 1) || !sub_98a710(a0->field_28))
            goto LABEL_97af9c;
        break;
    default:
LABEL_97af9c:
        break;
    }
    sub_979174();
    return 1;
}
