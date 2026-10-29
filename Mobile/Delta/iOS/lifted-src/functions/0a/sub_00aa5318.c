/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5318..0xaa53a8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aa53c8;
extern long long g_aa5e00;

unsigned long long sub_aa5318(unsigned long long a0, long long *a1, long long *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        sub_ad6958(a1[1], &g_aa53c8);
        sub_a66c58(a1[2], &g_aa5e00);
        sub_a66664(a1[2]);
        a0 = sub_a6c2e4(a1, "crypto/property/property.c", 233);
    }
    if (!a2)
        return a0;
}
