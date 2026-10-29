/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50028..0x50080 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50028_0 {
    char padding_0[64];
    unsigned long long field_40;
    unsigned long long field_48;
} st_50028_0;

typedef struct st_50028_1 {
    char field_0;
} st_50028_1;


int sub_50028(st_50028_0 *a0)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    st_50028_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_50028_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_4f204();
    v5 = v4 + a0->field_40;
    a0->field_40 = (v5 & 0x8080808080808080) - ((v5 & 0x8080808080808080) >> 7) | v5 & 0x7f7f7f7f7f7f7f7f;
    a0->field_48 = 0;
    return 0;
}
