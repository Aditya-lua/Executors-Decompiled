/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16844..0x1689c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16844_1 {
    char padding_0[276];
    unsigned int field_114;
} st_16844_1;

typedef struct st_16844_0 {
    char field_0;
} st_16844_0;

extern unsigned int g_f0c950;

void sub_16844(st_16844_1 *a0, unsigned long long a1)
{
    unsigned int v5;  // w8
    unsigned long long v0;  // [bp-0x30]
    st_16844_0 **v1;  // [bp-0x20], Other Possible Types: char
    st_16844_0 *v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    v5 = a0->field_114 + 1;
    a0->field_114 = v5;
    if (g_f0c950 >= v5)
        return;
    v0 = a1;
    sub_24dec(&a0->padding_0[132], "Exceeded allowed recursion depth; simplify your %s to make the code compile");
}
