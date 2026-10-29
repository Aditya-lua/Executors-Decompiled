/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97066c..0x970698 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97066c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_97066c_0;


long long sub_97066c(st_97066c_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a64420();
    a0->field_8 = v2;
    return v2 != 0;
}
