/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ca50..0x4cc90 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ca50_0 {
    char field_0;
} st_4ca50_0;

extern unsigned long long g_e68108;

long long sub_4ca50(void* a0)
{
    unsigned long long v5;  // x30
    unsigned int v6;  // w8
    unsigned long v7;  // x9
    unsigned long v8;  // x8
    st_4ca50_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_4ca50_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    v6 = *(int *)a0;
    v7 = 56;
    if (v6 == 1)
        v7 = 176;
    if (v6 == 2)
        v7 = 8;
    if (v6 == 3)
        v7 = 16;
    if (v6 == 5)
        v7 = 40;
    if (v6 == 6)
        v7 = 96;
    if (v6 == 7)
        v7 = 224;
    if (v6 == 8)
        v7 = 144;
    v8 = 160;
    if (v6 == 4)
        v7 = v8;
    goto *((void *)(*(long long *)((char *)&g_e68108 + v7)));
}
