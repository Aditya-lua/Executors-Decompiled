/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962b98..0x962bc4 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962b98_0 {
    char padding_0[40];
    long long field_28;
} st_962b98_0;


unsigned long long sub_962b98(st_962b98_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af295c(a0->field_28);
    a0->field_28 = a1;
    return v2;
}
