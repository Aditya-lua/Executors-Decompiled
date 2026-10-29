/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa77ae0..0xa77b74 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a77ae0_0 {
    unsigned long long field_0;
} st_a77ae0_0;


unsigned long long * sub_a77ae0(unsigned long a0, st_a77ae0_0 **a1, unsigned long a2, unsigned long a3)
{
    unsigned long long *v2;  // x8
    st_a77ae0_0 **iter;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    iter = a1 + 1;
    while (1)
    {
        if (*(int *)((char *)iter - 8) == 4)
        {
            v2 = *iter;
        }
        else if (!*(int *)((char *)iter - 8))
        {
            break;
        }
        iter += 2;
    }
    if (!v2)
        return 0;
    v2();
}
