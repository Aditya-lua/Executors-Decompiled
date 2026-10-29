/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b1a8..0xa1b250 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b1a8_2 {
    struct st_a1b1a8_0 *field_0;
    long long field_8;
} st_a1b1a8_2;

typedef struct st_a1b1a8_1 {
    struct st_a1b1a8_0 *field_0;
    char padding_8[24];
    long long field_20;
} st_a1b1a8_1;

typedef struct st_a1b1a8_0 {
    char padding_0[4];
    unsigned int field_4;
} st_a1b1a8_0;


long long sub_a1b1a8(st_a1b1a8_1 *a0, st_a1b1a8_2 *a1)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0->field_4 == 406)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 838, "EC_POINT_set_Jprojective_coordinates_GFp");
        v2 = 101;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 834, "EC_POINT_set_Jprojective_coordinates_GFp");
        v2 = 786689;
    }
    sub_a36abc(16, v2, 0);
    return 0;
}
