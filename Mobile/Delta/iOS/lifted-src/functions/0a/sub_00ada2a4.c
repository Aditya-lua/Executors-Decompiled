/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada2a4..0xada37c (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada2a4_0 {
    struct st_ada2a4_0 *field_0;
} st_ada2a4_0;


st_ada2a4_0 ** sub_ada2a4(long long a0)
{
    st_ada2a4_0 **v2;  // x19
    st_ada2a4_0 **v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(88, "crypto/ui/ui_lib.c", 606);
    if (v2)
    {
        v3 = sub_a6d9b4(a0, "crypto/ui/ui_lib.c", 607);
        *v2 = v3;
        if (v3)
        {
            if (sub_a6a660(14, v2, v2 + 9))
            {
                return v2;
            }
            else if (*v2)
            {
                sub_a368c8();
                sub_a369bc("crypto/ui/ui_lib.c", 617, "UI_create_method");
                sub_a36abc(40, 0x8000f, 0);
            }
        }
        sub_a6c2e4();
    }
    sub_a6c2e4(v2, "crypto/ui/ui_lib.c", 620);
    return 0;
}
