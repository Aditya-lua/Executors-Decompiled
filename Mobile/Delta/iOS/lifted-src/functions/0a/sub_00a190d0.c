/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa190d0..0xa1916c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a190d0_0 {
    char padding_0[336];
    struct st_a190d0_1 *field_150;
} st_a190d0_0;

typedef struct st_a190d0_1 {
    struct st_a190d0_0 *field_0;
    char padding_8[16];
    struct st_a190d0_1 *field_18;
    struct st_a190d0_1 *field_20;
} st_a190d0_1;


st_a190d0_1 * sub_a190d0(st_a190d0_1 *a0)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !a0->field_18 || !a0->field_20)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_key.c", 419, "EC_KEY_check_key");
        v2 = 786690;
    }
    else if (a0->field_18->field_0->field_150)
    {
        goto *((void *)(a0->field_18->field_0->field_150));
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_key.c", 424, "EC_KEY_check_key");
        v2 = 786689;
    }
    sub_a36abc(16, v2, 0);
    return 0;
}
