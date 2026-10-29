/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb02874..0xb028bc (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b02874_0 {
    char padding_0[56];
    unsigned long long field_38;
    unsigned int field_40;
} st_b02874_0;

extern char g_9ba8c0;
extern char g_f0d56a;

void sub_b02874(st_b02874_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_b028e8();
    if (!(g_f0d56a & 1))
    {
        return;
    }
    else if (a0->field_40 == 5)
    {
        a0->field_38 = &g_9ba8c0;
        return;
    }
    else
    {
        return;
    }
}
