/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976d18..0x976d74 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976d18_0 {
    char padding_0[1064];
    long long field_428;
    char padding_430[501];
    char field_625;
} st_976d18_0;

extern long long g_976d74;

void sub_976d18(st_976d18_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_428)
        return;
    if (!(a0->field_625 >> 2 & 1))
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_428 = a1;
    sub_984318(a1, &g_976d74, a0);
}
