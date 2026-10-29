/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d4d7c..0x9d4ec8 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d4d7c_0 {
    unsigned long long field_0;
    struct st_9d4d7c_0 *field_8;
    struct st_9d4d7c_0 *field_10;
    struct st_9d4d7c_0 *field_18;
    char padding_20[56];
    struct st_9d4d7c_0 *field_58;
} st_9d4d7c_0;


unsigned long long sub_9d4d7c(st_9d4d7c_0 *a0, unsigned int a1, unsigned long long a2)
{
    st_9d4d7c_0 *v3;  // x9
    unsigned long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    if (!a0)
        return 0xfffffffffffffffe;
    if (a0->field_8 && a1 == 14 && a0->field_8->field_58)
    {
        v3 = a0->field_18;
        if (a0->field_10)
        {
            if (!v3)
                a0->field_10();
        }
        else
        {
            if (!v3)
                a0->field_8->field_58();
        }
        v3();
    }
    sub_a368c8();
    sub_a369bc("crypto/bio/bio_lib.c", 690, "BIO_callback_ctrl");
    sub_a36abc(32, 121, 0);
    return 0xfffffffffffffffe;
}
