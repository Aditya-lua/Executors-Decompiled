/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3da27c..0x3da2d8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3da27c_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[407];
    unsigned long long field_1a0;
} st_3da27c_0;

extern char g_e7f380;
extern char g_e7f3a8;

void sub_3da27c(st_3da27c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_0 = &g_e7f380;
    a0->field_1a0 = &g_e7f3a8;
    sub_6549c(&a0->field_8);
}
