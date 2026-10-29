/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f41ac..0x9f41c8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f41ac_0 {
    char padding_0[8];
    struct st_9f41ac_1 *field_8;
} st_9f41ac_0;

typedef struct st_9f41ac_1 {
    unsigned short field_0;
} st_9f41ac_1;


unsigned long long sub_9f41ac(st_9f41ac_0 *a0, unsigned long long a1)
{
    if (a1 >> 31 & 1)
        return 0;
    return *(short *)&a0->field_8[(unsigned int)a1] & 1;
}
