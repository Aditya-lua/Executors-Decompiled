/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3da8c0..0x3da91c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3da8c0_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[407];
    unsigned long long field_1a0;
} st_3da8c0_0;

extern char g_e7f380;
extern char g_e7f3a8;

st_3da8c0_0 * sub_3da8c0(st_3da8c0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = &g_e7f380;
    a0->field_1a0 = &g_e7f3a8;
    sub_6549c(&a0->field_8);
    return a0;
}
