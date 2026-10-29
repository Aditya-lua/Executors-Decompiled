/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc1870..0xc189c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c1870_0 {
    char field_0[8];
    char field_7;
} st_c1870_0;


long long sub_c1870(st_c1870_0 *a0)
{
    unsigned int v0;  // w8
    char v1;  // x9
    unsigned long long v2;  // x9

    v0 = a0->field_0[7];
    if (!((v0 & 0xff) * 0x100000000))
        v1 = 32;
    else
        v1 = Clz((v0 & 0xff) * 0x100000000);
    v2 = (char)(8 - (v1 ^ 31));
    if (!v0)
        v2 = 0;
    return (a0->field_0 | 1) << (v2 & 63);
}
