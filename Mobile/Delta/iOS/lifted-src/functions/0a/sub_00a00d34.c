/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00d34..0xa00d80 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a00d34_0 {
    char padding_0[192];
    unsigned long long field_c0;
} st_a00d34_0;


int sub_a00d34(long long a0, unsigned long a1, unsigned long a2)
{
    st_a00d34_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a01408(0);
    if (v2)
    {
        v2->field_c0 = v2->field_c0 + 1;
        sub_a5ab14(a0, 116, v2);
        v2 = 1;
    }
    return (unsigned int)v2;
}
