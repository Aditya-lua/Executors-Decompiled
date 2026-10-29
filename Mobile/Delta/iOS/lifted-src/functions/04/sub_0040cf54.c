/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40cf54..0x40d124 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40cf54_0 {
    char field_0;
} st_40cf54_0;

extern unsigned long long g_e80f58;

void sub_40cf54(st_40cf54_0 **a0)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned int v14;  // w9
    unsigned long long v15;  // x10
    unsigned long long v16;  // x9
    st_40cf54_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_40cf54_0 *v1;  // [bp-0x50]
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
    v14 = *(char *)*a0;
    v15 = 80;
    if (v14 == 1)
        v15 = 72;
    if (v14 == 2)
        v15 = 48;
    v16 = 32;
    if (!v14)
        v15 = v16;
    goto *((void *)(*(long long *)((char *)&g_e80f58 + v15)));
}
