/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5d600..0x5d63c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5d600_1 {
    char padding_0[2072];
    unsigned int field_818;
    char padding_81c[36];
    unsigned long long field_840;
} st_5d600_1;

typedef struct st_5d600_0 {
    char field_0;
} st_5d600_0;

extern char g_f011d0;

void sub_5d600(st_5d600_1 *a0)
{
    st_5d600_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_5d600_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0->field_818 = 0;
    a0->field_840 = &g_f011d0;
    sub_5bb44();
    return;
}
