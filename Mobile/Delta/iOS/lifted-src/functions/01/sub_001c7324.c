/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c7324..0x1c769c (888 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c7324_0 {
    char field_0;
} st_1c7324_0;

extern unsigned long long g_e70b50;

char * sub_1c7324(unsigned long a0, char *a1, char *a2)
{
    unsigned int v4;  // w8
    unsigned long long v5;  // x9
    st_1c7324_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1c7324_0 *v1;  // [bp-0x78]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = *a1;
    v5 = 104;
    if (v4 == 94)
        v5 = 200;
    if (v4 == 36)
        v5 = 56;
    if (v4 == 92)
        v5 = 120;
    if (v4 == 40)
        v5 = 192;
    goto *((void *)(*(long long *)((char *)&g_e70b50 + v5)));
}
