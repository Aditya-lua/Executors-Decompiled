/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3d214..0xc3d430 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3d214_2 {
    char padding_0[8];
    struct st_c3d214_0 *field_8;
} st_c3d214_2;

typedef struct st_c3d214_0 {
    char padding_0[32];
    struct st_c3d214_1 *field_20;
} st_c3d214_0;

typedef struct st_c3d214_1 {
    unsigned long long field_0;
} st_c3d214_1;


void sub_c3d214(st_c3d214_2 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    a0->field_8->field_20();
}
