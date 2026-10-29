/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ec18..0x7ec48 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7ec18_0 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_7ec18_0;


unsigned long long sub_7ec18(st_7ec18_0 *a0, unsigned long long a1, char a2, unsigned int a3, unsigned int a4)
{
    unsigned int v0;  // w8

    if (4 <= a1)
    {
        v0 = a4 + a3 * 8 + 2;
        a0->field_0 = v0;
        a0->field_2 = v0 >> 16;
        a0->field_3 = a2;
        return 4;
    }
    return 0xffffffffffffffba;
}
