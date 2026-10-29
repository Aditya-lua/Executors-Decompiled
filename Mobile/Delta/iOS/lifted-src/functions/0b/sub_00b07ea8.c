/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb07ea8..0xb07ef8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b07ea8_0 {
    char padding_0[192];
    unsigned int field_c0;
    unsigned int field_c4;
    unsigned int field_c8;
    unsigned int field_cc;
    unsigned int field_d0;
    unsigned int field_d4;
    unsigned int field_d8;
    unsigned int field_dc;
    char padding_e0[80];
    struct st_b07ea8_1 *field_130;
} st_b07ea8_0;

typedef struct st_b07ea8_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
} st_b07ea8_1;


int sub_b07ea8(st_b07ea8_0 *a0, unsigned int *a1)
{
    if (a1)
    {
        a0->field_c0 = *a1;
        a0->field_c4 = a1[1];
        a0->field_c8 = a1[2];
        a0->field_cc = a1[3];
        a0->field_d0 = a1[4];
        a0->field_d4 = a1[5];
        a0->field_d8 = a1[6];
        a0->field_dc = a1[7];
    }
    *(unsigned int *)&a0->field_130 = 0;
    return 1;
}
