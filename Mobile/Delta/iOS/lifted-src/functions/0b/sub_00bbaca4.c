/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbbaca4..0xbbadb8 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bbaca4_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_bbaca4_0;

extern char g_e06510;

long long sub_bbaca4(unsigned long a0, st_bbaca4_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = 9;
    if (11 < a1->field_18)
        v8 = a1->field_18 - 12;
    goto *((void *)(sub_bbacdc + (&g_e06510)[v8] * 4));
}
