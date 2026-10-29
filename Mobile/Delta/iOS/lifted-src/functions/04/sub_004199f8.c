/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4199f8..0x419a54 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4199f8_0 {
    char field_0;
} st_4199f8_0;

extern unsigned long long g_43ee20;
extern char g_43ee41;
extern char g_87dc82;

void sub_4199f8(void)
{
    unsigned long long v7;  // x30
    st_4199f8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_4199f8_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_43ee20;
    v3 = ~&g_43ee41 + &g_87dc82;
    v3();
}
