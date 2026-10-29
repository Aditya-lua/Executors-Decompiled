/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfa334..0xbfa39c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfa334_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_bfa334_0;


unsigned long long sub_bfa334(st_bfa334_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_bfcc24(a0->field_8, a0->field_10);
    if (!a0->field_0)
        return v2;
    return _free();
}
