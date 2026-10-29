/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x433dc0..0x433e10 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_433dc0_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_433dc0_0;

extern char g_e7b9a0;

st_433dc0_0 * sub_433dc0(st_433dc0_0 *a0, unsigned int a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = &g_e7b9a0;
    a0->field_8 = a1;
    std::runtime_error::runtime_error((char *)&a0[1].field_0 + 4, a2);
    return a0;
}
