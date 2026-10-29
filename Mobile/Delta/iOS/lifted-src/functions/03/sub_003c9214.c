/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c9214..0x3c9300 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c9214_0 {
    char field_0;
} st_3c9214_0;

typedef struct st_3c9214_1 {
    unsigned long long field_0;
} st_3c9214_1;

extern st_3c9214_1 *g_f0b150;

long long sub_3c9214(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, long long a4)
{
    long long v5;  // x0
    st_3c9214_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_3c9214_0 *v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x4c]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_3d743c();
    if (!v5)
        return v5;
    if (v2 != 8)
        sub_3d3afc(v5);
    g_f0b150();
}
