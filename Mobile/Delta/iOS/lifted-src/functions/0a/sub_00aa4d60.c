/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4d60..0xaa4dc0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa4d60_0 {
    char padding_0[192];
    unsigned int field_c0;
    unsigned int field_c4;
    unsigned int field_c8;
    unsigned int field_cc;
    char padding_d0[16];
    unsigned long long field_e0;
    unsigned long long field_e8;
    unsigned long long field_f0;
} st_aa4d60_0;

extern char g_aa4460;
extern char g_aa4520;

void sub_aa4d60(st_aa4d60_0 *a0, unsigned int *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_c0 = a1[4];
    a0->field_c4 = a1[5];
    a0->field_c8 = a1[6];
    a0->field_cc = a1[7];
    if (!sub_aa43e0())
    {
        a0->field_e8 = &g_aa4460;
        a0->field_f0 = &g_aa4520;
    }
    a0->field_e0 = 0;
    return;
}
