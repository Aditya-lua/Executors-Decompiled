/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a5f30..0x3a5fa4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a5f30_0 {
    char field_0;
} st_3a5f30_0;

typedef struct st_3a5f30_1 {
    unsigned long long field_0;
} st_3a5f30_1;

extern st_3a5f30_1 *g_f03530;

void sub_3a5f30(void)
{
    st_3a5f30_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_3a5f30_0 *v1;  // [bp-0x30]
    unsigned int v2;  // [bp-0x24]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = 0;
    if (4 < v2)
        return;
    g_f03530();
}
