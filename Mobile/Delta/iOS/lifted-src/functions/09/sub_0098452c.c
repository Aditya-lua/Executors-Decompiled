/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98452c..0x98458c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98452c_0 {
    char padding_0[112];
    unsigned int field_70;
} st_98452c_0;

extern unsigned long long g_d28518[4];

long long sub_98452c(unsigned long a0, st_98452c_0 *a1)
{
    unsigned long v3;  // x8
    char v4;  // x9
    unsigned long long v5;  // x9
    unsigned long long v6;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = a1->field_70;
    v4 = (unsigned int)v3 - 2;
    if (3 >= v4)
        v5 = g_d28518[v4];
    else
        v5 = 0;
    v0 = &v2;
    v1 = v6;
    return sub_991444(&a1[1].padding_0[46], (v3 * 0x40000000000000 | v3 >> 10) & 0xffc000000000000f & 15, *(long long *)(a0 + v5 * 8 + 144), &a1[1].padding_0[84]) != 0;
}
