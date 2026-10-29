/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4b284..0x4c308 (4228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4b284_0 {
    char field_0;
} st_4b284_0;

extern unsigned long long g_e67b40;

long long sub_4b284(unsigned long a0, unsigned int a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x8
    st_4b284_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_4b284_0 *v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    v14 = 648;
    if (!a1)
        v14 = 456;
    if (a1 == 1)
        v14 = 1104;
    if (a1 == 2)
        v14 = 200;
    if (a1 == 3)
        v14 = 1472;
    if (a1 == 4)
        v14 = 48;
    if (a1 == 5)
        v14 = 496;
    if (a1 == 6)
        v14 = 1248;
    if (a1 == 7)
        v14 = 1408;
    if (a1 == 8)
        v14 = 992;
    if (a1 == 9)
        v14 = 1272;
    if (a1 == 10)
        v14 = 536;
    if (a1 == 11)
        v14 = 1360;
    if (a1 == 12)
        v14 = 1440;
    if (a1 == 13)
        v14 = 616;
    if (a1 == 14)
        v14 = 368;
    if (a1 == 15)
        v14 = 1152;
    goto *((void *)(*(long long *)((char *)&g_e67b40 + v14)));
}
