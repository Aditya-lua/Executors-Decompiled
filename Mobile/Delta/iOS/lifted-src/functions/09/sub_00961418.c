/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x961418..0x9614f0 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_961418_2 {
    char padding_0[8];
    struct st_961418_0 *field_8;
} st_961418_2;

typedef struct st_961418_0 {
    char padding_0[192];
    struct st_961418_1 *field_c0;
} st_961418_0;

typedef struct st_961418_1 {
    unsigned long long field_0;
} st_961418_1;


void sub_961418(st_961418_2 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_95aa30())
        return;
    a0->field_8->field_c0();
}
