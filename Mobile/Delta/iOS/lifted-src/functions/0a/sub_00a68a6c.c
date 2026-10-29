/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68a6c..0xa68ad4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a68a6c_1 {
    char padding_0[20];
    struct st_a68a6c_0 *field_14;
} st_a68a6c_1;

typedef struct st_a68a6c_0 {
    struct st_a68a6c_0 *field_0;
} st_a68a6c_0;


st_a68a6c_0 ** sub_a68a6c(unsigned long a0, unsigned long a1, st_a68a6c_0 **a2, st_a68a6c_1 *a3, st_a68a6c_0 **a4)
{
    st_a68a6c_0 **v2;  // w8
    st_a68a6c_0 **v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a4)
    {
        sub_c680bc();
        return 0;
    }
    *(unsigned int *)a4 = 0;
    if (!a2 || *(int *)&(a3->padding_0)[1])
    {
        v3 = (st_a68a6c_0 **)(unsigned int)sub_a7a54c();
        if (!v3)
            return v3;
        v2 = (st_a68a6c_0 **)(!*(int *)a4);
    }
    else
    {
        v2 = (st_a68a6c_0 **)1;
    }
    *(unsigned int *)a4 = (unsigned int)v2;
    return 1;
}
