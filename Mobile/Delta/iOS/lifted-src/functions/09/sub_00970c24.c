/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x970c24..0x970d44 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_970c24_0 {
    char padding_0[8];
    struct st_970c24_1 *field_8;
    char padding_10[3016];
    struct st_970c24_2 *field_bd8;
    char padding_be0[24];
    struct st_970c24_2 *field_bf8;
    struct st_970c24_2 *field_c00;
    struct st_970c24_2 *field_c08;
    struct st_970c24_2 *field_c10;
    char padding_c18[16];
    long long field_c28;
    struct st_970c24_2 *field_c30;
} st_970c24_0;

typedef struct st_970c24_2 {
    unsigned long long field_0;
} st_970c24_2;

typedef struct st_970c24_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_970c24_1;

extern char g_10002b0;

unsigned long long sub_970c24(st_970c24_0 *a0, unsigned int *a1)
{
    long long *v4;  // x21
    unsigned long long *v5;  // x0
    unsigned long long v6;  // x0
    char v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = &a0->field_8->field_0;
    *a1 = 115;
    if (a0->field_bd8)
        a0->field_bd8();
    *a1 = 80;
    if (a0->field_bf8 && a0->field_c00 && a0->field_c08 && a0->field_c30 && (int)sub_aa845c(a0->field_8->field_0, &v0, 48, 0) >= 1)
    {
        a0->field_c28 = sub_9e4db0(&v0, 48, 0);
        sub_a66ec0(&v0, 48);
        v5 = sub_ad56ec(a0->field_c28, a0->field_bf8, a0->field_c00, a0->field_c30, *v4, v4[142]);
        a0->field_c10 = v5;
        v6 = (!v5) * 2;
    }
    else
    {
        v6 = 2;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v6;
    ___stack_chk_fail();
}
