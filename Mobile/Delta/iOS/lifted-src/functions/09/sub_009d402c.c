/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d402c..0x9d4248 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d402c_0 {
    struct st_9d402c_0 *field_0;
    struct st_9d402c_0 *field_8;
    struct st_9d402c_0 *field_10;
    struct st_9d402c_0 *field_18;
    char padding_20[8];
    struct st_9d402c_0 *field_28;
} st_9d402c_0;


st_9d402c_0 * sub_9d402c(st_9d402c_0 *a0, unsigned long a1, unsigned long long a2, st_9d402c_0 *a3)
{
    st_9d402c_0 *v2;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
        a3->field_0 = 0;
    if (!a0)
        return 0;
    if (a0->field_8 && a0->field_8->field_10)
    {
        v2 = a0->field_18;
        if (a0->field_10)
        {
            if (!v2)
            {
                if (a2 > 0x7fffffff)
                    return 0xffffffff;
                a0->field_10();
            }
        }
        else
        {
            if (!v2)
            {
                if ((int)a0->field_28)
                    a0->field_8->field_10();
                sub_a368c8();
                sub_a369bc("crypto/bio/bio_lib.c", 348, "bio_write_intern");
                sub_a36abc(32, 120, 0);
                return 0xffffffff;
            }
        }
        v2();
    }
    sub_a368c8();
    sub_a369bc("crypto/bio/bio_lib.c", 340, "bio_write_intern");
    sub_a36abc(32, 121, 0);
    return 0xfffffffe;
}
