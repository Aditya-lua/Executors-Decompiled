/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43fc5c..0x43fde0 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43fc5c_0 {
    char field_0;
} st_43fc5c_0;

extern unsigned long long g_e81030;

long long sub_43fc5c(char *a0, unsigned long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned int v14;  // w8
    unsigned long long v15;  // x9
    unsigned long long v16;  // x8
    st_43fc5c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_43fc5c_0 *v1;  // [bp-0x58]
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
    v14 = *a0;
    v15 = 48;
    if (v14 == 6)
        v15 = 8;
    if (v14 == 5)
        v15 = 24;
    v16 = 56;
    if (v14 == 7)
        v15 = v16;
    goto *((void *)(*(long long *)((char *)&g_e81030 + v15)));
}
