/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2ef4..0x1b2f28 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b2ef4_0 {
    char padding_0[8];
    long long field_8;
} st_1b2ef4_0;


long long sub_1b2ef4(st_1b2ef4_0 *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long v0;  // [bp-0x20]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = *a2;
    v1 = *a1;
    return sub_1c7a78(a0->field_8, &v1, &v0);
}
