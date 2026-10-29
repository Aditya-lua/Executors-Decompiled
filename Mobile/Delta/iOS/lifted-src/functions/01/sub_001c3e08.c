/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c3e08..0x1c412c (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c3e08_0 {
    char field_0;
} st_1c3e08_0;

extern unsigned long long g_e70cc8;

char * sub_1c3e08(unsigned long a0, char *a1, char *a2)
{
    unsigned int v4;  // w8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x8
    st_1c3e08_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_1c3e08_0 *v1;  // [bp-0x60]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = *a1;
    v5 = 128;
    if (v4 == 42)
        v5 = 392;
    if (v4 == 43)
        v5 = 72;
    if (v4 == 63)
        v5 = 192;
    v6 = 232;
    if (v4 == 123)
        v5 = v6;
    goto *((void *)(*(long long *)((char *)&g_e70cc8 + v5)));
}
