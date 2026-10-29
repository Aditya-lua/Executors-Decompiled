/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ae85c..0x2ae8e8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ae85c_0 {
    char field_0;
} st_2ae85c_0;

extern unsigned long long g_e7ca08;

long long sub_2ae85c(char *a0)
{
    unsigned int v2;  // w8
    unsigned long v3;  // x9
    unsigned long v4;  // x8
    st_2ae85c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_2ae85c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = *a0;
    v3 = 24;
    if (!v2)
        v3 = 0;
    if (v2 == 2)
        v3 = 8;
    v4 = 16;
    if (v2 == 1)
        v3 = v4;
    goto *((void *)(*(long long *)((char *)&g_e7ca08 + v3)));
}
