/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x961b28..0x961b68 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_961b28_0 {
    char padding_0[592];
    unsigned long long field_250;
    unsigned int field_258;
} st_961b28_0;


int sub_961b28(st_961b28_0 *a0)
{
    char *v3;  // x1
    unsigned int v0;  // [bp-0x14]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = &a0->field_258;
    if (3 >= a0->field_250)
    {
        v0 = 0;
        ___memcpy_chk(&v0);
        v3 = &v0;
    }
    return *(int *)v3;
}
