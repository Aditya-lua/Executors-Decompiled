/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dabb4..0x1dac8c (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dabb4_0 {
    char field_0;
} st_1dabb4_0;

extern unsigned long long g_e73040;

void sub_1dabb4(unsigned long a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x8
    st_1dabb4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1dabb4_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = &v10;
    v9 = v15;
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    v3 = *a2;
    sub_106fdc();
    v16 = 32;
    if ((unsigned int)&v2 == 1)
        v16 = 16;
    if ((unsigned int)&v2 == 2)
        v16 = 8;
    if ((unsigned int)&v2 == 3)
        v16 = 0;
    if (!(unsigned int)&v2)
        v16 = 24;
    goto *((void *)(*(long long *)((char *)&g_e73040 + v16)));
}
