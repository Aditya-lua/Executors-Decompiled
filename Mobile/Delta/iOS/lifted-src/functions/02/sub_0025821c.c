/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25821c..0x258d64 (2888 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25821c_0 {
    char field_0;
} st_25821c_0;

extern unsigned long long g_e7b0a8;

long long sub_25821c(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x8
    st_25821c_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_25821c_0 *v1;  // [bp-0x70]
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
    v14 = ((a3 != 5717985588867516971) * 64 | (char)(a3 != 5717985588867516971) >> 58) & 0x3fffffffc0 & 0x3fffffffff;
    if (a3 == 3389327947240814405)
        v14 = 8;
    if (a3 == 12341561756245894923)
        v14 = 16;
    if (a3 == 4639014509820918943)
        v14 = 32;
    if (a3 == 8236602566008169186)
        v14 = 24;
    if (a3 == 17019580782585001517)
        v14 = 56;
    if (a3 == 16390796771557942104)
        v14 = 48;
    goto *((void *)(*(long long *)((char *)&g_e7b0a8 + v14)));
}
