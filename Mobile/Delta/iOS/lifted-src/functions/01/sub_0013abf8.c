/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13abf8..0x13ad4c (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13abf8_0 {
    char field_0;
} st_13abf8_0;

extern unsigned long long g_e6eb10;

void sub_13abf8(long long a0, unsigned long long *a1, long long a2)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned long long v19;  // x8
    st_13abf8_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_13abf8_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = &v11;
    v10 = v18;
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    sub_61070(&v2 | 8, a2);
    sub_1381bc(a0, &v2);
    v19 = 16;
    if ((unsigned int)&v2 == 1)
        v19 = 32;
    if ((unsigned int)&v2 == 2)
        v19 = 8;
    if ((unsigned int)&v2 == 3)
        v19 = 24;
    if (!(unsigned int)&v2)
        v19 = 0;
    goto *((void *)(*(long long *)((char *)&g_e6eb10 + v19)));
}
