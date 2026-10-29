/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66a6c..0x66adc (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66a6c_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_66a6c_0;

extern char g_e6a2b8;

st_66a6c_0 * sub_66a6c(st_66a6c_0 *a0, unsigned int a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = &g_e6a2b8;
    a0->field_10 = 850045863;
    a0->field_8 = a1;
    memset(a0 + 1, 0, 56);
    sub_6563c();
    return a0;
}
