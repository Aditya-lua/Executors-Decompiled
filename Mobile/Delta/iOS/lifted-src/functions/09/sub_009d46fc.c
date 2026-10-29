/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d46fc..0x9d4868 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d46fc_0 {
    unsigned long long field_0;
    struct st_9d46fc_0 *field_8;
    struct st_9d46fc_0 *field_10;
    struct st_9d46fc_0 *field_18;
    char padding_20[32];
    struct st_9d46fc_0 *field_40;
} st_9d46fc_0;


unsigned long long sub_9d46fc(st_9d46fc_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    st_9d46fc_0 *v2;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0xffffffffffffffff;
    if (a0->field_8 && a0->field_8->field_40)
    {
        v2 = a0->field_18;
        if (a0->field_10)
        {
            if (!v2)
                a0->field_10();
        }
        else
        {
            if (!v2)
                a0->field_8->field_40();
        }
        v2();
    }
    sub_a368c8();
    sub_a369bc("crypto/bio/bio_lib.c", 663, "BIO_ctrl");
    sub_a36abc(32, 121, 0);
    return 0xfffffffffffffffe;
}
