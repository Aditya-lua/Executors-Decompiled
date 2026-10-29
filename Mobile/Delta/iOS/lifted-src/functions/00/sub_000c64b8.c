/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc64b8..0xc6a20 (1384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c64b8_0 {
    char field_0;
} st_c64b8_0;

extern unsigned long long g_e6d1b0;

unsigned long long sub_c64b8(unsigned long a0, char *a1, unsigned int a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned int v4;  // w25
    unsigned int v5;  // w8
    unsigned long long v6;  // x9
    unsigned long long v7;  // x8
    unsigned long long v8;  // x8
    st_c64b8_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_c64b8_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (2 > a2)
        return 0xffffffffffffffec;
    v4 = *a1;
    v5 = v4 & 3;
    v6 = 72;
    if (v5 == 3)
        v6 = 216;
    v7 = 288;
    if (v5 == 2)
        v6 = v7;
    if (!(v4 & 3))
        v6 = 552;
    sub_c628c();
    v8 = 80;
    if ((v4 & 3) == 1)
        v6 = v8;
    goto *((void *)(*(long long *)((char *)&g_e6d1b0 + v6)));
}
