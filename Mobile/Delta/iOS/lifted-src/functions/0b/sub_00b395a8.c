/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb395a8..0xb395f0 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b395a8_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_b395a8_0;


st_b395a8_0 * sub_b395a8(st_b395a8_0 *a0, st_b395a8_0 *a1)
{
    st_b395a8_0 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b395a8_0 *)(unsigned int)sub_a2f9e0();
    if (!a1)
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        a0->field_8 = sub_12738(a1);
        return 1;
    }
    else
    {
        return 0;
    }
}
