/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b06c..0x6b0c4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6b06c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_6b06c_0;

extern char g_e6a6d0;

unsigned long long * sub_6b06c(st_6b06c_0 *a0)
{
    unsigned long long *v6;  // x0
    unsigned long long v7;  // x9
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    char v3;  // [bp-0x21]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_6c18c();
    v1 = &v3;
    v2 = 1;
    v7 = a0->field_8;
    *v6 = &g_e6a6d0;
    v6[1] = v7;
    v0 = 0;
    sub_607ac(&v0);
    return v6;
}
