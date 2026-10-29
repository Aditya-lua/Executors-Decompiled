/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c5cb0..0x1c5cec (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c5cb0_0 {
    char padding_0[64];
    long long field_40;
} st_1c5cb0_0;


long long sub_1c5cb0(st_1c5cb0_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a2;
    v1 = a1;
    sub_664e4(a0->field_40, &v1, &v0);
    return a2;
}
