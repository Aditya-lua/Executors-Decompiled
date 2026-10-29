/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71468..0xa714ec (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71468_0 {
    char padding_0[32];
    struct st_a71468_0 *field_20;
} st_a71468_0;


st_a71468_0 * sub_a71468(st_a71468_0 *a0, st_a71468_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a1)
    {
        a0->field_20 = 0;
        _strlen(a1);
    }
    sub_a368c8();
    sub_a369bc("crypto/params.c", 1442, "OSSL_PARAM_set_utf8_string");
    sub_a36abc(15, 0xc0102, 0);
    return 0;
}
