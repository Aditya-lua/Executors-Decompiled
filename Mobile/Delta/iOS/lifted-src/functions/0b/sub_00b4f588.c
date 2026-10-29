/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f588..0xb4f5ec (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f588_0 {
    char padding_0[24];
    struct st_b4f588_0 *field_18;
} st_b4f588_0;


st_b4f588_0 * sub_b4f588(st_b4f588_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    st_b4f588_0 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b4f588_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (!v2)
    {
        return 0;
    }
    else if (!a0->field_18)
    {
        return 0;
    }
}
