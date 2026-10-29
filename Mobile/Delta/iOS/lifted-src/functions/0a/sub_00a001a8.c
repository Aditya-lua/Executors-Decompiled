/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa001a8..0xa00264 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a001a8_1 {
    char padding_0[120];
    struct st_a001a8_2 *field_78;
    char padding_80[8];
    long long field_88;
    char padding_90[8];
    struct st_a001a8_0 *field_98;
} st_a001a8_1;

typedef struct st_a001a8_0 {
    char padding_0[32];
    long long field_20;
} st_a001a8_0;

typedef struct st_a001a8_2 {
    unsigned int field_0;
} st_a001a8_2;


long long sub_a001a8(st_a001a8_1 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_88)
    {
        if ((int)a0->field_98->field_20)
            goto LABEL_a001e4;
        if (!sub_9ff998())
            return 0;
    }
    else
    {
        if (!(int)a0->field_98->field_20)
        {
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_pmeth.c", 378, "pkey_dh_keygen");
            sub_a36abc(5, 107, 0);
            return 0;
        }
LABEL_a001e4:
        if (!sub_9feb74())
            return 0;
    }
    sub_a5ab14(a1, *(int *)a0->field_78);
    if (a0->field_88 && !sub_a59d8c(a1))
        return 0;
    sub_a5af48(a1);
}
