/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad763c..0xad76e4 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad763c_2 {
    struct st_ad763c_0 *field_0;
    struct st_ad763c_2 *field_8;
} st_ad763c_2;

typedef struct st_ad763c_0 {
    char padding_0[80];
    struct st_ad763c_1 *field_50;
    char padding_58[96];
    struct st_ad763c_1 *field_b8;
} st_ad763c_0;

typedef struct st_ad763c_1 {
    unsigned long long field_0;
} st_ad763c_1;


long long sub_ad763c(st_ad763c_2 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a6c2e4(a0, "crypto/store/store_lib.c", 603);
        return 1;
    }
    else if (a0->field_8)
    {
        a0->field_0->field_b8();
    }
    else
    {
        a0->field_0->field_50();
    }
}
