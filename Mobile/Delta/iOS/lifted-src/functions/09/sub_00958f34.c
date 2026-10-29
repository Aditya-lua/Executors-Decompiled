/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958f34..0x958f68 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958f34_0 {
    char padding_0[304];
    long long field_130;
} st_958f34_0;

extern long long g_afa390;

unsigned long long sub_958f34(st_958f34_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad6958(a0->field_130, &g_afa390);
    a0->field_130 = a1;
    return v2;
}
