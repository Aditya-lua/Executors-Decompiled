/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a930..0x4aaac (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a930_0 {
    char field_0;
} st_4a930_0;

extern unsigned long long g_e67ae8;

long long sub_4a930(unsigned long a0, unsigned long long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x8
    st_4a930_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_4a930_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = 48;
    if (!a1)
        v10 = 0;
    if (a1 == 1)
        v10 = 8;
    if (a1 == 2)
        v10 = 16;
    goto *((void *)(*(long long *)((char *)&g_e67ae8 + v10)));
}
