/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49fdc..0x4a078 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_49fdc_0 {
    char padding_0[8];
    unsigned int field_8;
} st_49fdc_0;

extern unsigned int g_f00b80;
extern unsigned int g_f00b90;

void sub_49fdc(unsigned long a0, st_49fdc_0 *a1, st_49fdc_0 *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 && a1->field_8 == g_f00b80)
    {
        sub_4a078();
        return;
    }
    if (!a1)
    {
        return;
    }
    else if (a1->field_8 == g_f00b90)
    {
        sub_4a078();
        if (!a2)
            return;
        sub_4a078();
        return;
    }
    else
    {
        return;
    }
}
