/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d4f8c..0x9d500c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d4f8c_1 {
    unsigned int field_0;
} st_9d4f8c_1;

typedef struct st_9d4f8c_0 {
    char padding_0[8];
    struct st_9d4f8c_1 *field_8;
    char padding_10[56];
    struct st_9d4f8c_0 *field_48;
} st_9d4f8c_0;


st_9d4f8c_0 * sub_9d4f8c(st_9d4f8c_0 *iter, unsigned int a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!iter)
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bio_lib.c", 813, "BIO_find_type");
        sub_a36abc(32, 0xc0102, 0);
        return 0;
    }
    while (1)
    {
        if (iter->field_8)
        {
            if (!(char)a1)
            {
                if (*(int *)iter->field_8 & a1)
                    return iter;
            }
            else
            {
                if (*(int *)iter->field_8 == a1)
                    return iter;
            }
        }
        iter = iter->field_48;
        if (!iter)
            return iter;
    }
}
