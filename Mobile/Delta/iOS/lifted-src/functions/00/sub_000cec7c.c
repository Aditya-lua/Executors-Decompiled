/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcec7c..0xcecf4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cec7c_1 {
    char padding_0[40];
    struct st_cec7c_2 *field_28;
    char padding_30[272];
    struct st_cec7c_1 *field_140;
} st_cec7c_1;

typedef struct st_cec7c_2 {
    unsigned long long field_0;
} st_cec7c_2;

typedef struct st_cec7c_0 {
    char field_0;
} st_cec7c_0;


unsigned int sub_cec7c(st_cec7c_1 *a0)
{
    st_cec7c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_cec7c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return 0xffffff9a;
    if (a0->field_140)
        sub_ce4e8(a0);
    a0->field_28();
}
