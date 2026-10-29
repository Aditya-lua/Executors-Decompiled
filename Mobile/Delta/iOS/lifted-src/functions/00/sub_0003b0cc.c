/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b0cc..0x3b1fc (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b0cc_0 {
    char field_0;
} st_3b0cc_0;

typedef struct st_3b0cc_1 {
    char padding_0[8];
    unsigned int field_8;
} st_3b0cc_1;

extern unsigned int g_f00b60;
extern unsigned int g_f00b70;

unsigned long long sub_3b0cc(long long *a0, st_3b0cc_1 *a1, unsigned long long a2, long long a3)
{
    unsigned long long v6;  // x0
    unsigned long i;  // x22
    unsigned long long v8;  // x0
    st_3b0cc_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3b0cc_0 *v1;  // [bp-0x48]
    st_3b0cc_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_3b0cc_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a3 != 0xff)
    {
        if (a1 && a1->field_8 == g_f00b70)
            return sub_3d4b0(a0);
        if (a1 && a1->field_8 == g_f00b60)
        {
            v3 = &v2;
            v2 = &v3;
            sub_395b0(a0);
            return sub_2ad10(*a0, 63, a2, a3 + 1 & 0xff, 0);
        }
        v6 = sub_47e48(a0);
        if (a3 < 2)
            return v6;
        i = 1;
        do
        {
            v8 = sub_2ad10(*a0, 2, (unsigned int)i + (unsigned int)a2 & 0xff, 0, 0);
            i += 1;
        } while (a3 != i);
        return v8;
    }
    sub_45808(a1 + 1, "Exceeded result count limit; simplify the code to compile");
}
