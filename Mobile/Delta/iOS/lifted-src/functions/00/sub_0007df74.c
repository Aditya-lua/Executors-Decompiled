/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7df74..0x7dfec (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7df74_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    char padding_38[8];
    unsigned int field_40;
} st_7df74_0;

extern unsigned long long g_e6b748;
extern unsigned long long g_e6b760;

int sub_7df74(st_7df74_0 *a0, unsigned int a1)
{
    unsigned long long v0;  // x10
    unsigned long v1;  // x8
    unsigned long v2;  // x9
    unsigned long long v3;  // x8

    if (a1 <= a0->field_40)
        return 0;
    if (a0->field_40)
    {
        a0->field_40 = a1;
        return 0;
    }
    v0 = a0->field_8;
    v1 = a0->field_10;
    a0->field_20 = v1;
    a0->field_30 = v0 & 0xffffffffffffffc0;
    v2 = -(unsigned int)v1 & 63;
    v3 = v1 + v2;
    if (v3 > v0)
    {
        goto *((void *)(g_e6b760));
    }
    else
    {
        a0->field_10 = v3;
        a0->field_18 = v3;
        if (v2)
            a0->field_20 = v3;
        goto *((void *)(g_e6b748));
    }
}
