/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f9f2c..0x1f9f64 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f9f2c_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_1f9f2c_0;

extern st_1f9f2c_0 g_cc368c;
extern st_1f9f2c_0 g_cca28c;

unsigned int sub_1f9f2c(unsigned long long a0)
{
    if (125217 >= (unsigned int)a0)
        a0 += (&g_cc368c.field_0)[(&g_cca28c.field_0)[(unsigned int)a0 >> 8] + (a0 & 0xff) & 0xffffffff];
    return a0;
}
