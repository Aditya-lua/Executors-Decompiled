/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d3f44..0x3d3f88 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d3f44_0 {
    int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_3d3f44_0;

extern st_3d3f44_0 g_d0d984;
extern st_3d3f44_0 g_d0d9a8;

long long sub_3d3f44(unsigned int a0, unsigned int a1, unsigned int a2)
{
    unsigned int v0;  // w8

    if ((int)a1 < 0)
        v0 = a0 << ((char)-a1 & 31);
    else
        v0 = a0 >> ((char)a1 & 31);
    return (int)((&g_d0d984.field_0)[a2] * (v0 >> ((char)(8 - a2) & 31))) >> ((char)(&g_d0d9a8.field_0)[a2] & 31);
}
