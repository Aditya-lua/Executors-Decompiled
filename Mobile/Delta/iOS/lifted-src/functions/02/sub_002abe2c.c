/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2abe2c..0x2abea8 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2abe2c_0 {
    char field_0;
} st_2abe2c_0;

extern unsigned long long g_e7cb18;

long long sub_2abe2c(st_2abe2c_0 **a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x8

    v0 = *(char *)*a0;
    v1 = 24;
    if (v0 == 1)
        v1 = 0;
    v2 = 8;
    if (v0 == 2)
        v1 = v2;
    goto *((void *)(*(long long *)((char *)&g_e7cb18 + v1)));
}
