/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d4f1c..0x9d4f84 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d4f1c_0 {
    char padding_0[72];
    struct st_9d4f1c_0 *field_48;
    struct st_9d4f1c_0 *field_50;
} st_9d4f1c_0;


st_9d4f1c_0 * sub_9d4f1c(st_9d4f1c_0 *a0)
{
    st_9d4f1c_0 *v2;  // x19
    st_9d4f1c_0 **v3;  // x21
    st_9d4f1c_0 *v4;  // x8
    st_9d4f1c_0 *v5;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = a0->field_48;
    v3 = &a0->field_48;
    sub_9d46fc();
    v4 = a0->field_50;
    v5 = *v3;
    if (v4)
        v4->field_48 = v5;
    if (v5)
        v5->field_50 = v4;
    *v3 = 0;
    v3[1] = 0;
    return v2;
}
