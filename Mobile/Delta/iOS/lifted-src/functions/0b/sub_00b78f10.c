/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb78f10..0xb79024 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b78f10_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b78f10_1;

typedef struct st_b78f10_4 {
    char padding_0[8];
    struct st_b78f10_0 *field_8;
} st_b78f10_4;

typedef struct st_b78f10_0 {
    char padding_0[24];
    struct st_b78f10_1 *field_18;
} st_b78f10_0;


int sub_b78f10(st_b78f10_4 **a0, st_b78f10_0 *a1)
{
    unsigned long long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_18->field_0 < 2)
        goto LABEL_b78f48;
    switch (v2)
    {
    case 11:
        if (a1->field_18->field_8 == 0x8000000000000000)
            *a0->field_8->field_18();
    case 7:
LABEL_b78f48:
        if (sub_b79024(a0) & 1)
            return 1;
        *a0->field_8->field_18();
    default:
        *a0->field_8->field_18();
    }
}
