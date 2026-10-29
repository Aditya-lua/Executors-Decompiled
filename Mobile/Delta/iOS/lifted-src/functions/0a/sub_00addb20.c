/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaddb20..0xaddb60 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_addb20_0 {
    char padding_0[8];
    long long field_8;
} st_addb20_0;


long long sub_addb20(st_addb20_0 *a0, unsigned long long a1)
{
    long long v4;  // x0
    char v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a1;
    v4 = sub_ad66d4(a0->field_8, &v0);
    return sub_ad69f8(a0->field_8, v4);
}
