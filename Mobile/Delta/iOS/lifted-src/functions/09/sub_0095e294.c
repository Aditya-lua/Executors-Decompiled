/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95e294..0x95e314 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95e294_0 {
    char padding_0[8];
    struct st_95e294_0 *field_8;
    unsigned long long field_10;
} st_95e294_0;


st_95e294_0 * sub_95e294(st_95e294_0 *a0)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 693, "SSL_new");
        v2 = 195;
    }
    else if (a0->field_8)
    {
        goto *((void *)(a0->field_8->field_10));
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 697, "SSL_new");
        v2 = 228;
    }
    sub_a36abc(20, v2, 0);
    return 0;
}
