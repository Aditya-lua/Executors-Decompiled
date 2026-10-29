/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b6908..0x1b6940 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b6908_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_1b6908_0;


unsigned long long sub_1b6908(st_1b6908_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8)
        _bzero(a0->field_0, a0->field_8 * 8);
    v2 = a0->field_10;
    a0->field_10 = 0;
    a0->field_18 = 0;
    return v2;
}
