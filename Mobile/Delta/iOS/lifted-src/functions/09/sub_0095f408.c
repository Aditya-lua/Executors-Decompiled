/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95f408..0x95f460 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95f408_2 {
    char padding_0[88];
    long long field_58;
    unsigned long long field_60;
    char padding_68[3088];
    struct st_95f408_0 *field_c78;
} st_95f408_2;

typedef struct st_95f408_1 {
    unsigned long long field_0;
} st_95f408_1;

typedef struct st_95f408_0 {
    char padding_0[88];
    struct st_95f408_1 *field_58;
} st_95f408_0;


int sub_95f408(st_95f408_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_60)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_58 = sub_9d4f1c(a0->field_58);
    a0->field_c78->field_58();
}
