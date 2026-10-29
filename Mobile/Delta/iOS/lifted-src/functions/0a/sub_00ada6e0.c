/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada6e0..0xada7c4 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada6e0_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ada6e0_0 *field_8;
    unsigned int field_10;
    char padding_14[4];
    struct st_ada6e0_0 *field_18;
    char padding_20[32];
    unsigned int field_40;
} st_ada6e0_0;


int sub_ada6e0(st_ada6e0_0 *a0, st_ada6e0_0 *a1, unsigned int a2, unsigned int a3, st_ada6e0_0 *a4)
{
    long long v2;  // x1
    st_ada6e0_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/ui/ui_lib.c", 103, "general_allocate_prompt");
        v2 = 786690;
        goto LABEL_ada758;
    }
    else if (2 >= a2 - 1 && !a4)
    {
        sub_a368c8();
        sub_a369bc("crypto/ui/ui_lib.c", 107, "general_allocate_prompt");
        v2 = 105;
LABEL_ada758:
        sub_a36abc(40, v2, 0);
        v3 = 0;
    }
    else
    {
        v3 = sub_a6bffc(72, "crypto/ui/ui_lib.c", 108);
        if (v3)
        {
            v3->field_8 = a0;
            v3->field_40 = a1 != 0;
            v3->field_10 = a3;
            v3->field_0 = a2;
            v3->field_18 = a4;
        }
    }
    return (unsigned int)v3;
}
