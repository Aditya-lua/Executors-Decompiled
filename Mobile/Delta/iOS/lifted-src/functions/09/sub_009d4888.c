/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d4888..0x9d4abc (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d4888_0 {
    unsigned long long field_0;
    struct st_9d4888_0 *field_8;
    struct st_9d4888_0 *field_10;
    struct st_9d4888_0 *field_18;
    char padding_20[8];
    struct st_9d4888_0 *field_28;
    struct st_9d4888_0 *field_30;
} st_9d4888_0;


unsigned long long sub_9d4888(st_9d4888_0 *a0, unsigned long a1)
{
    st_9d4888_0 *v3;  // x8
    long long v4;  // x1
    st_9d4888_0 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bio_lib.c", 500, "BIO_puts");
        v4 = 786690;
    }
    else if (a0->field_8 && a0->field_8->field_30)
    {
        v3 = a0->field_18;
        if (a0->field_10)
        {
            if (!v3)
                a0->field_10();
            v3();
        }
        else
        {
            if (v3)
            {
                v3();
            }
            else if ((int)a0->field_28)
            {
                a0->field_8->field_30();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/bio/bio_lib.c", 515, "BIO_puts");
                v4 = 120;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bio_lib.c", 504, "BIO_puts");
        sub_a36abc(32, 121, 0);
        return 0xfffffffe;
    }
    sub_a36abc(32, v4, 0);
    return 0xffffffff;
}
