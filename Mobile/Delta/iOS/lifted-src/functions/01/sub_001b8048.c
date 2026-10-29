/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b8048..0x1b80ac (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b8048_0 {
    char padding_0[912];
    long long field_390;
} st_1b8048_0;


long long sub_1b8048(st_1b8048_0 *a0)
{
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0->field_390)
        sub_95e3b8(a0->field_390);
    sub_1c3db0(a0, &a0->padding_0[64], 1);
    v0 = &a0[1].padding_0[72];
    sub_271a8(&v0);
    return sub_1af8c8(a0);
}
