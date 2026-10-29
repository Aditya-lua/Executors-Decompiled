/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7e1f8..0xb7e42c (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7e1f8_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b7e1f8_0;

extern char g_e0618f;

long long sub_b7e1f8(st_b7e1f8_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v3;  // x10
    unsigned long v4;  // x9
    unsigned long long v5;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = a0->field_18 - 12;
    v4 = 9;
    if (11 >= a0->field_18)
        v3 = v4;
    v0 = &v2;
    v1 = v5;
    goto *((void *)(sub_b7e234 + (&g_e0618f)[v3] * 4));
}
