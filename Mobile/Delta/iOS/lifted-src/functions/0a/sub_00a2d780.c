/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d780..0xa2d804 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d780_0 {
    unsigned long long field_0;
    struct st_a2d780_0 *field_8;
} st_a2d780_0;


st_a2d780_0 * sub_a2d780(st_a2d780_0 *a0, long long a1, st_a2d780_0 **a2)
{
    st_a2d780_0 *v2;  // w0
    st_a2d780_0 *v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_a2d780_0 *)*(int *)a2;
    if (v2 > 0)
    {
        if (a0)
            goto LABEL_a2d7e0;
        sub_c66c00();
        v3 = (st_a2d780_0 *)0;
    }
    else
    {
        v2 = (st_a2d780_0 *)(unsigned int)sub_a68e7c(sub_a68f38(sub_a7a42c(a0->field_0)), a1);
        *(unsigned int *)a2 = (unsigned int)v2;
        if (v2 <= 0)
            return 0;
LABEL_a2d7e0:
        v3 = (st_a2d780_0 *)(int)a0->field_8;
    }
    return v3 == v2;
}
