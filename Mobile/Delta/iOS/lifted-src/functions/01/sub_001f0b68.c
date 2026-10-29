/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f0b68..0x1f0bd4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f0b68_1 {
    long long field_0;
    unsigned long long field_8;
} st_1f0b68_1;

typedef struct st_1f0b68_0 {
    char field_0;
} st_1f0b68_0;


unsigned long long * sub_1f0b68(unsigned long long *a0, unsigned long a1, st_1f0b68_1 *a2)
{
    st_1f0b68_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f0b68_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2->field_8)
        return a0;
    sub_1f2e20();
    return _memmove(*a0 + 40 * a1, a2->field_0, a2->field_8 * 40);
}
