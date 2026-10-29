/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x219bc..0x219fc (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_219bc_0 {
    char padding_0[32];
    char field_20;
} st_219bc_0;

typedef struct st_219bc_1 {
    char field_0;
} st_219bc_1;


void sub_219bc(unsigned long a0, st_219bc_0 *a1)
{
    unsigned long long v5;  // x30
    st_219bc_1 **v0;  // [bp-0x20], Other Possible Types: char
    st_219bc_1 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1->field_20 != 1)
        return;
    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    *(char *)(sub_1e524() + 32) = 1;
    return;
}
