/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb28980..0xb289f4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b28980_0 {
    char padding_0[8];
    struct st_b28980_0 *field_8;
    char padding_10[12];
    struct st_b28980_0 *field_1c;
} st_b28980_0;


st_b28980_0 * sub_b28980(st_b28980_0 *a0, st_b28980_0 *a1, unsigned long a2)
{
    st_b28980_0 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b28980_0 *)(unsigned int)sub_a2f9e0();
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
    else if (sub_9ffbf8(a1))
    {
        sub_9ffb3c(a0->field_8);
        a0->field_8 = a1;
        *(unsigned int *)&(a0->padding_10)[1] = 0;
    }
    else
    {
        return 0;
    }
}
