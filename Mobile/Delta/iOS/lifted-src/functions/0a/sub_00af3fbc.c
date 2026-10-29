/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3fbc..0xaf400c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af3fbc_0 {
    char padding_0[233];
    char field_e9;
} st_af3fbc_0;


int sub_af3fbc(unsigned long a0, st_af3fbc_0 *a1, unsigned long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_aea738(a1, 0xffffffff, 0) == 1 && !(a2 >> 2 & 1) && a1->field_e9 >> 5 & 1)
        return 1;
    return 3;
}
