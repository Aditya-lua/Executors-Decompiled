/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c33a0..0x1c33ec (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c33a0_0 {
    char padding_0[8];
    long long field_8;
} st_1c33a0_0;


long long sub_1c33a0(st_1c33a0_0 *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3, unsigned long long *a4)
{
    unsigned long v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    unsigned long v2;  // [bp-0x20]
    unsigned long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *a1;
    v1 = *a3;
    v2 = *a2;
    v0 = *a4;
    return sub_74cd0(a0->field_8, &v3, &v2, &v1, &v0);
}
