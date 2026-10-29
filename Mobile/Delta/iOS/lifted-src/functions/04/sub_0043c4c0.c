/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43c4c0..0x43c51c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43c4c0_0 {
    char field_0;
} st_43c4c0_0;

extern unsigned long long g_421d44;
extern char g_421d65;
extern char g_843aca;

void sub_43c4c0(void)
{
    unsigned long long v7;  // x30
    st_43c4c0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_43c4c0_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_421d44;
    v3 = ~&g_421d65 + &g_843aca;
    v3();
}
