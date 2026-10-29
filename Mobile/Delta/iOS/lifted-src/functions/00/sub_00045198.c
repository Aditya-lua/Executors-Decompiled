/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x45198..0x45444 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_45198_0 {
    char field_0;
} st_45198_0;

extern unsigned long long g_e66d88;

void sub_45198(unsigned long a0, unsigned int *a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v13;  // x26
    unsigned long long v14;  // x25
    unsigned long long v23;  // x9
    unsigned long long v24;  // x8
    unsigned long long v15;  // x24
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    unsigned int v22;  // w8
    st_45198_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_45198_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = &v12;
    v11 = v21;
    v1 = &v0;
    v0 = &v1;
    sub_38fe4();
    v22 = *a1;
    v23 = 48;
    if (!v22)
        v23 = 144;
    if (v22 == 1)
        v23 = 8;
    if (v22 == 2)
        v23 = 16;
    if (v22 == 3)
        v23 = 80;
    if (v22 == 4)
        v23 = 104;
    v24 = 72;
    if (v22 == 5)
        v23 = v24;
    goto *((void *)(*(long long *)((char *)&g_e66d88 + v23)));
}
