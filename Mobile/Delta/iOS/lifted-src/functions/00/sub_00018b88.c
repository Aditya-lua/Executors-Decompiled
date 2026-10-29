/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18b88..0x18c60 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18b88_1 {
    char padding_0[128];
    unsigned int field_80;
    unsigned long long field_84;
    char padding_8c[136];
    unsigned int field_114;
} st_18b88_1;

typedef struct st_18b88_0 {
    char field_0;
} st_18b88_0;


unsigned long long * sub_18b88(st_18b88_1 *a0, unsigned long long *a1)
{
    unsigned long long *v4;  // x0
    st_18b88_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_18b88_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_80 != 58)
    {
        if (a0->field_80 == 263)
            sub_1db64(a0, &(&a0->field_80)[1], "Function return type annotations are written after ':' instead of '->'");
        else
            return 0;
    }
    if (a1)
        *a1 = *(long long *)&(&a0->field_80)[1];
    sub_f8d0(a0);
    v4 = sub_2295c(a0);
    if (a0->field_80 == 44)
    {
        sub_1db64(a0, &(&a0->field_80)[1], "Expected a statement, got ','; did you forget to wrap the list of return types in parentheses?");
        sub_f8d0(a0);
    }
    *(int *)&a0->padding_8c[132] = *(int *)&a0->padding_8c[132];
    return v4;
}
