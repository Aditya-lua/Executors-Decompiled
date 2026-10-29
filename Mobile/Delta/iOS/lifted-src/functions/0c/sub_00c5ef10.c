/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5ef10..0xc5ef5c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5ef10_0 {
    struct st_c5ef10_0 *field_0;
    unsigned long long field_8;
} st_c5ef10_0;


int sub_c5ef10(st_c5ef10_0 *a0)
{
    st_c5ef10_0 *v2;  // x19
    unsigned long v3;  // x20
    st_c5ef10_0 *ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    v3 = a0->field_8;
    a0->field_0 = 0;
    if (v2)
    {
        ptr = _malloc(16);
        if (ptr)
        {
            ptr->field_0 = v2;
            ptr->field_8 = v3;
            return (unsigned int)ptr;
        }
        sub_c6ba70(8, 16);
    }
    sub_c769bc();
}
