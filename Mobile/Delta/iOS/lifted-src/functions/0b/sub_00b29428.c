/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb29428..0xb294ac (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b29428_0 {
    char padding_0[8];
    struct st_b29428_0 *field_8;
} st_b29428_0;


st_b29428_0 * sub_b29428(st_b29428_0 *a0, st_b29428_0 *a1, unsigned long a2)
{
    st_b29428_0 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b29428_0 *)(unsigned int)sub_a2f9e0();
    if (!a1)
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (!v2)
    {
        return 0;
    }
    else if (!sub_9ffdd0(a1))
    {
        return 0;
    }
    else if (sub_a18cf0(a1))
    {
        sub_a18c08(a0->field_8);
        a0->field_8 = a1;
        a0[1].field_8 = 0xffffffff;
    }
    else
    {
        return 0;
    }
}
