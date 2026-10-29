/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa9158..0xaa91bc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa9158_0 {
    char padding_0[24];
    struct st_aa9158_0 *field_18;
    struct st_aa9158_0 *field_20;
} st_aa9158_0;


int sub_aa9158(unsigned long a0, st_aa9158_0 *a1)
{
    st_aa9158_0 *v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (v2)
    {
        if (v2->field_20 && !v2->field_18)
        {
            v3 = sub_a77644(a1);
            if (!_strcmp(v2->field_20, v3))
                v2->field_18 = a1;
        }
        v2 = 1;
    }
    return (unsigned int)v2;
}
