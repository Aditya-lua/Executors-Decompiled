/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b41f8..0x1b4278 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b41f8_0 {
    char padding_0[24];
    struct st_1b41f8_1 *field_18;
} st_1b41f8_0;

typedef struct st_1b41f8_2 {
    struct st_1b41f8_0 *field_0;
    char padding_8[16];
    struct st_1b41f8_2 *field_18;
} st_1b41f8_2;

typedef struct st_1b41f8_1 {
    unsigned long long field_0;
} st_1b41f8_1;


st_1b41f8_2 * sub_1b41f8(st_1b41f8_2 *a0, st_1b41f8_2 *a1)
{
    st_1b41f8_2 *v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_1a5efc();
    v2 = a1->field_18;
    if (!v2)
    {
        a0->field_18 = 0;
        return a0;
    }
    if (v2 != a1)
    {
        a0->field_18 = v2;
        a1->field_18 = 0;
        return a0;
    }
    a0->field_18 = a0;
    a1->field_18->field_0->field_18();
}
