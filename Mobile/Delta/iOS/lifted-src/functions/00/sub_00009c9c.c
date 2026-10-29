/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c9c..0x9d1c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c9c_0 {
    char field_0;
} st_9c9c_0;

extern unsigned long long g_e61808;
extern unsigned long long g_e61810;

void sub_9c9c(unsigned long a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v8;  // x30
    st_9c9c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_9c9c_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned int v3;  // [bp-0x18]
    unsigned int v4;  // [bp-0x14]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v5 = &v7;
    v6 = v8;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v3 = a2;
    v4 = 0;
    if (sub_afc0())
        goto *((void *)(g_e61808));
    else
        goto *((void *)(g_e61810));
}
