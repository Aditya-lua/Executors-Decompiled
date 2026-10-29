/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ebec8..0x1ebf34 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ebec8_1 {
    char padding_0[56];
    unsigned long long field_38;
} st_1ebec8_1;

typedef struct st_1ebec8_0 {
    char field_0;
} st_1ebec8_0;


long long sub_1ebec8(st_1ebec8_1 *a0, unsigned long a1, unsigned int a2)
{
    st_1ebec8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1ebec8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_1fb474();
    sub_1f8994(&a0->padding_0[24], 0x101);
    a0->field_38 = 0;
    if (!a2)
        return sub_1ed4e4(a0);
    return sub_1eab0c(a0);
}
