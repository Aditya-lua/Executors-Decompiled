/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b760..0xa1b804 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b760_2 {
    struct st_a1b760_0 *field_0;
    long long field_8;
} st_a1b760_2;

typedef struct st_a1b760_0 {
    char padding_0[176];
    long long field_b0;
} st_a1b760_0;

typedef struct st_a1b760_1 {
    struct st_a1b760_0 *field_0;
    char padding_8[24];
    long long field_20;
} st_a1b760_1;


long long sub_a1b760(st_a1b760_1 *a0, st_a1b760_2 *a1)
{
    st_a1b760_0 *v2;  // x8
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (v2->field_b0)
    {
        if (v2 == a1->field_0 && (!(int)a0->field_20 || !(int)a1->field_8 || (int)a0->field_20 == (int)a1->field_8))
            goto *((void *)(v2->field_b0));
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 976, "EC_POINT_invert");
        v3 = 101;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 972, "EC_POINT_invert");
        v3 = 786689;
    }
    sub_a36abc(16, v3, 0);
    return 0;
}
