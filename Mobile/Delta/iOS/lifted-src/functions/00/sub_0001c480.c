/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c480..0x1c4a0 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c480_0 {
    char padding_0[32];
    char field_20;
} st_1c480_0;


void sub_1c480(st_1c480_0 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0->field_20 != 1)
        return;
    v0 = &v2;
    v1 = v3;
    sub_181a8();
    return;
}
