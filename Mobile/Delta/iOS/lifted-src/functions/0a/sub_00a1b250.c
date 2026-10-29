/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b250..0xa1b328 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b250_0 {
    char padding_0[120];
    struct st_a1b250_1 *field_78;
} st_a1b250_0;

typedef struct st_a1b250_3 {
    struct st_a1b250_0 *field_0;
    struct st_a1b250_1 *field_8;
} st_a1b250_3;

typedef struct st_a1b250_2 {
    struct st_a1b250_0 *field_0;
    char padding_8[24];
    struct st_a1b250_1 *field_20;
} st_a1b250_2;

typedef struct st_a1b250_1 {
    unsigned long long field_0;
} st_a1b250_1;


unsigned long long * sub_a1b250(st_a1b250_2 *a0, st_a1b250_3 *a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_a1b250_0 *v2;  // x9
    long long v3;  // x19
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (v2->field_78)
    {
        if (v2 == a1->field_0 && (!(int)a0->field_20 || !(int)a1->field_8 || (int)a0->field_20 == (int)a1->field_8))
            v2->field_78();
        v3 = 101;
        v4 = 872;
    }
    else
    {
        v3 = 786689;
        v4 = 868;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_lib.c", v4, "EC_POINT_set_affine_coordinates");
    sub_a36abc(16, v3, 0);
    return 0;
}
