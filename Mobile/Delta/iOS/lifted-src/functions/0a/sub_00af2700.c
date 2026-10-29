/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2700..0xaf2750 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2700_0 {
    char padding_0[104];
    long long field_68;
} st_af2700_0;

extern long long g_afa308;

unsigned long long sub_af2700(st_af2700_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af40c8(a0->field_68);
    if (!a0->field_68)
    {
        return v2;
    }
    else if (!sub_ad69e4(a0->field_68))
    {
        sub_ad6958(a0->field_68, &g_afa308);
        a0->field_68 = 0;
        return v2;
    }
    else
    {
        return v2;
    }
}
