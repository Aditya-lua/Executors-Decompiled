/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3cd40..0xa3ce04 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3cd40_0 {
    char field_0;
    char padding_1[23];
    long long field_18;
} st_a3cd40_0;

typedef struct st_a3cd40_1 {
    struct st_a3cd40_0 *field_0;
    char padding_8[40];
    long long field_30;
} st_a3cd40_1;


char sub_a3cd40(unsigned int a0, unsigned long a1, st_a3cd40_1 *a2)
{
    char v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a0 != 8)
    {
        if (a0 != 7 || !(a2->field_0->field_0 & 6))
            return 0;
        *(unsigned int *)&a2->padding_8[0] = 0;
        return 1;
        return 0;
    }
    else
    {
        if (sub_a71bcc(a2->field_30, &v0) && !sub_a6e200(a2->field_0->field_18, v0))
        {
            *(unsigned int *)&a2->padding_8[20] = 1;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/ctrl_params_translate.c", 0x7f8, "fix_group_ecx");
        sub_a36abc(6, 0x80106, 0);
        *(unsigned int *)&a2->padding_8[20] = 0;
        return 0;
    }
}
