/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada37c..0xada3d8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada37c_0 {
    struct st_ada37c_0 *field_0;
} st_ada37c_0;


void sub_ada37c(st_ada37c_0 **a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a6a9e8(14, a0, a0 + 9);
    sub_a6c2e4(*a0, "crypto/ui/ui_lib.c", 637);
    *a0 = 0;
    sub_a6c2e4();
    return;
}
