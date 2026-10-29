/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc093f0..0xc0af08 (6936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c093f0_1 {
    char padding_0[8];
    struct st_c093f0_0 *field_8;
    unsigned long long field_10;
} st_c093f0_1;

typedef struct st_c093f0_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c093f0_0;

extern char g_e06a3c;

st_c093f0_1 * sub_c093f0(st_c093f0_1 *a0, st_c093f0_0 *a1)
{
    st_c093f0_0 *v6;  // x21
    unsigned long long v7;  // x8
    unsigned long v0;  // [bp-0x128]
    unsigned long long v1;  // [bp-0x120]
    unsigned long v2;  // [bp-0x110]
    st_c093f0_0 *v3;  // [bp-0x108]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (!a0->field_10)
        return a0;
    v6 = a0->field_8;
    v0 = a1->field_18;
    v1 = (char *)v6 + 264 * a0->field_10;
    v3 = v6;
    v2 = &v6[8].padding_0[8];
    v7 = 9;
    if (11 < v6->field_18)
        v7 = v6->field_18 - 12;
    goto *((void *)(sub_c094a4 + (&g_e06a3c)[v7] * 4));
}
