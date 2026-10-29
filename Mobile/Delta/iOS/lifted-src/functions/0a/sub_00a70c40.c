/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa70c40..0xa70d08 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a70c40_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
} st_a70c40_0;


long long sub_a70c40(st_a70c40_0 *a0, unsigned long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_10)
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 201, "general_get_int");
        sub_a36abc(15, 0xc0102, 0);
        return 0;
    }
    else if (a0->field_8 != 2 && a0->field_8 != 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 208, "general_get_int");
        sub_a36abc(15, 124, 0);
        return 0;
    }
}
