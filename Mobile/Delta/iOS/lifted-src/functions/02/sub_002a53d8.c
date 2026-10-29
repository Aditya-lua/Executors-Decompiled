/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a53d8..0x2a53fc (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a53d8_0 {
    char padding_0[16];
    struct st_2a53d8_1 *field_10;
} st_2a53d8_0;

typedef struct st_2a53d8_1 {
    unsigned int field_0;
} st_2a53d8_1;

typedef struct st_2a53d8_2 {
    struct st_2a53d8_0 *field_0;
    unsigned int field_8;
} st_2a53d8_2;


st_2a53d8_2 * sub_2a53d8(st_2a53d8_2 *a0, unsigned long a1)
{
    *(unsigned int *)((char *)a0->field_0->field_10 + a0->field_8) = (((((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    a0->field_8 = a0->field_8 + 4;
    return a0;
}
