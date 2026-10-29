/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1af524..0x1af5c4 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1af524_2 {
    char padding_0[24];
    struct st_1af524_3 *field_18;
    char padding_20[8];
    char field_28;
    char padding_29[128];
    char field_a9;
    char field_aa;
} st_1af524_2;

typedef struct st_1af524_0 {
    char padding_0[40];
    struct st_1af524_1 *field_28;
} st_1af524_0;

typedef struct st_1af524_1 {
    unsigned long long field_0;
} st_1af524_1;

typedef struct st_1af524_3 {
    struct st_1af524_0 *field_0;
} st_1af524_3;


long long sub_1af524(st_1af524_2 *a0, char a1)
{
    char v0;  // [bp-0x23]
    char v1;  // [bp-0x21]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a1;
    if (a0->field_a9 == 1)
    {
        (*(long long *)(*(long long *)a0->field_18 + 40))();
    }
    else if (a0->field_aa == 1)
    {
        v0 = a1;
        return sub_30594(&a0->field_28, &v0);
    }
    else
    {
        return sub_30594(&a0->field_28, &v1);
    }
}
