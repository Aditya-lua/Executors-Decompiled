/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b7ac4..0x9b7c90 (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b7ac4_3 {
    char padding_0[8];
    struct st_9b7ac4_1 *field_8;
    char padding_10[1208];
    struct st_9b7ac4_0 *field_4c8;
    char padding_4d0[1072];
    struct st_9b7ac4_2 *field_900;
    char padding_908[532];
    struct st_9b7ac4_0 *field_b1c;
} st_9b7ac4_3;

typedef struct st_9b7ac4_1 {
    char padding_0[704];
    struct st_9b7ac4_0 *field_2c0;
} st_9b7ac4_1;

typedef struct st_9b7ac4_0 {
    struct st_9b7ac4_0 *field_0;
} st_9b7ac4_0;

typedef struct st_9b7ac4_2 {
    char padding_0[840];
    struct st_9b7ac4_0 *field_348;
} st_9b7ac4_2;


int sub_9b7ac4(st_9b7ac4_3 *a0)
{
    st_9b7ac4_0 **v0;  // [bp-0x29]
    st_9b7ac4_0 **v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v0 = (st_9b7ac4_0 **)0;
    if (a0->field_8->field_2c0 && a0->field_4c8)
        a0->field_8->field_2c0();
    if (a0->field_900->field_348)
        *(unsigned int *)&(a0->padding_908)[1] = 0;
    return 1;
}
