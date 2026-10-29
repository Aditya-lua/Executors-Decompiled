/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x993e5c..0x993e88 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_993e5c_3 {
    struct st_993e5c_2 *field_0;
    char padding_8[192];
    unsigned int field_c8;
} st_993e5c_3;

typedef struct st_993e5c_1 {
    char padding_0[216];
    struct st_993e5c_0 *field_d8;
} st_993e5c_1;

typedef struct st_993e5c_2 {
    char padding_0[24];
    struct st_993e5c_1 *field_18;
} st_993e5c_2;

typedef struct st_993e5c_0 {
    char padding_0[80];
    char field_50;
} st_993e5c_0;


char sub_993e5c(st_993e5c_3 *a0)
{
    if (a0->field_0->field_18->field_d8->field_50 >> 3 & 1)
        return 0;
    return a0->field_c8 == 2;
}
