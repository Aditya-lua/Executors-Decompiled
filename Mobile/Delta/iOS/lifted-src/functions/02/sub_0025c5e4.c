/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25c5e4..0x25ceb0 (2252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25c5e4_0 {
    char field_0;
} st_25c5e4_0;

extern unsigned long long g_e7b260;

long long sub_25c5e4(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x8
    st_25c5e4_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_25c5e4_0 *v1;  // [bp-0x70]
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
    v14 = 48;
    if (a3 == 11732378671138388861)
        v14 = 0;
    if (a3 == 11972685169619915195)
        v14 = 8;
    if (a3 == 9628575249740779822)
        v14 = 16;
    if (a3 == 4234012087587651201)
        v14 = 32;
    if (a3 == 2972506536351000782)
        v14 = 24;
    if (a3 == 0x8f70a83fdf34dec2)
        v14 = 40;
    goto *((void *)(*(long long *)((char *)&g_e7b260 + v14)));
}
