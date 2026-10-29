/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5a114..0xc5a17c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5a114_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_c5a114_0;


unsigned long long sub_c5a114(st_c5a114_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c54038(a0->field_8, a0->field_10);
    if (!a0->field_0)
        return v2;
    return _free();
}
