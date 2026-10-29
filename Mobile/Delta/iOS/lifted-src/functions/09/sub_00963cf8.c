/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x963cf8..0x963d3c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_963cf8_1 {
    char padding_0[2304];
    struct st_963cf8_0 *field_900;
    char padding_908[208];
    unsigned long long field_9d8;
    unsigned long long field_9e0;
} st_963cf8_1;

typedef struct st_963cf8_0 {
    char padding_0[856];
    char field_358;
} st_963cf8_0;


unsigned long long sub_963cf8(st_963cf8_1 *a0)
{
    unsigned int v0;  // w8

    if (a0->field_900)
    {
        v0 = a0->field_900->field_358;
        if (3 >= v0 - 1 && 0x100 << ((char)v0 & 63) < a0->field_9d8)
            return 0x100 << ((char)v0 & 63);
    }
    if (a0->field_9d8 > a0->field_9e0)
        return a0->field_9e0 & 0xffffffff;
    return a0->field_9d8 & 0xffffffff;
}
