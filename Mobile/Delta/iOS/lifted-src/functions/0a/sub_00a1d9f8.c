/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1d9f8..0xa1dafc (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1d9f8_0 {
    char field_0;
    char padding_1[3];
    unsigned int field_4;
} st_a1d9f8_0;


char sub_a1d9f8(st_a1d9f8_0 **a0, st_a1d9f8_0 **a1)
{
    st_a1d9f8_0 *v2;  // x8
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = *a0;
        if (!*(long long *)&v2[18] && !(v2->field_0 & 1))
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_oct.c", 83, "EC_POINT_point2oct");
            v3 = 786689;
        }
        else
        {
            if (v2 == *a1 && (!(int)a0[4] || !(int)a1[1] || (int)a0[4] == (int)a1[1]) && !(v2->field_0 & 1))
                goto *((void *)(*(long long *)&v2[18]));
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_oct.c", 87, "EC_POINT_point2oct");
            v3 = 101;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_oct.c", 78, "EC_POINT_point2oct");
        v3 = 786690;
    }
    sub_a36abc(16, v3, 0);
    return 0;
}
