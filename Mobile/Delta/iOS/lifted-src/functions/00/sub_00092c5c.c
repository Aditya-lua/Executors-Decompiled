/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x92c5c..0x92cac (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_92c5c_0 {
    char field_0;
} st_92c5c_0;

extern unsigned int g_cc0344;

long long sub_92c5c(unsigned int *a0, unsigned int *a1, unsigned int a2, unsigned int a3)
{
    st_92c5c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_92c5c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a2 < a3)
        a1 = &g_cc0344;
    if (*a0 != *a1)
        return 0;
    return a2 >= a3;
}
