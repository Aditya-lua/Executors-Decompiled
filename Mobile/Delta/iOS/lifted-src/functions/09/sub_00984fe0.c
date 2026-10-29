/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x984fe0..0x985070 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_984fe0_1 {
    struct st_984fe0_1 *field_0;
} st_984fe0_1;

typedef struct st_984fe0_0 {
    char padding_0[80];
    unsigned int field_50;
    char padding_54[20];
    unsigned int field_68;
} st_984fe0_0;


st_984fe0_1 ** sub_984fe0(st_984fe0_1 **a0, unsigned int a1)
{
    st_984fe0_0 *v2;  // x19
    unsigned long idx;  // x20
    st_984fe0_1 **v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (3 >= a1 && a0 && a1 == 3)
    {
        v2 = (char *)a0 + a1 * 208;
        idx = ~v2->field_50 & 1;
        v4 = a0 + 84;
        if (v4[idx])
        {
            sub_a4bca0(v4[idx]);
            v4[idx] = 0;
        }
        sub_a66ec0((char *)&a0[2 * idx + 91] + 2, 16);
        *(char *)&v2->field_68 = 3;
        return 1;
    }
    sub_c625e8();
    return 0;
}
