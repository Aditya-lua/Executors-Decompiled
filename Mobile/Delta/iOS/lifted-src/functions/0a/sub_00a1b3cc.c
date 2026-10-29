/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b3cc..0xa1b4f4 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b3cc_0 {
    char padding_0[128];
    long long field_80;
} st_a1b3cc_0;

typedef struct st_a1b3cc_2 {
    struct st_a1b3cc_0 *field_0;
    long long field_8;
} st_a1b3cc_2;

typedef struct st_a1b3cc_1 {
    struct st_a1b3cc_0 *field_0;
    char padding_8[24];
    long long field_20;
} st_a1b3cc_1;


long long sub_a1b3cc(st_a1b3cc_1 *a0, st_a1b3cc_2 *a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_0->field_80)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 908, "EC_POINT_get_affine_coordinates");
        v2 = 786689;
    }
    else if (a0->field_0 != a1->field_0 || (int)a0->field_20 && (int)a1->field_8 && (int)a0->field_20 != (int)a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 912, "EC_POINT_get_affine_coordinates");
        v2 = 101;
    }
    else if (sub_a1b4f4())
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 916, "EC_POINT_get_affine_coordinates");
        v2 = 106;
    }
    else
    {
        goto *((void *)(a0->field_0->field_80));
    }
    sub_a36abc(16, v2, 0);
    return 0;
}
