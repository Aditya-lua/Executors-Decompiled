/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ac74..0x6ad14 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ac74_0 {
    char field_0;
} st_6ac74_0;

extern unsigned long long g_e6a708;

void sub_6ac74(void)
{
    unsigned long long v5;  // x30
    unsigned int v6;  // w0
    unsigned long v7;  // x8
    st_6ac74_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_6ac74_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_7512c();
    v7 = 40;
    if (v6 == 3)
        v7 = 0;
    if (v6 == 2)
        v7 = 8;
    if (!v6)
        v7 = 16;
    if (v6 == 1)
        v7 = 32;
    goto *((void *)(*(long long *)((char *)&g_e6a708 + v7)));
}
