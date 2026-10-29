/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958ea4..0x958ed8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958ea4_0 {
    char padding_0[296];
    long long field_128;
} st_958ea4_0;

extern long long g_afa390;

unsigned long long sub_958ea4(st_958ea4_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad6958(a0->field_128, &g_afa390);
    a0->field_128 = a1;
    return v2;
}
