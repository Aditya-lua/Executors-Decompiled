/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21544..0x2160c (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_21544_0 {
    char field_0;
} st_21544_0;

typedef struct st_21544_1 {
    char padding_0[8];
    unsigned int field_8;
} st_21544_1;

extern unsigned long long g_e625f0;
extern unsigned long long g_e62608;
extern unsigned long long g_e62620;
extern unsigned int g_f00b50;

void sub_21544(long long a0, st_21544_1 *a1)
{
    unsigned long long v5;  // x30
    st_21544_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_21544_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    if (a1 && a1->field_8 == g_f00b50)
    {
        if (sub_10160(a0 + 424, &a1[2].field_8))
            goto *((void *)(g_e62608));
        else
            goto *((void *)(g_e625f0));
    }
    goto *((void *)(g_e62620));
}
