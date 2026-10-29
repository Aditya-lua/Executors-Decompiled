/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9ee4..0x2a9f58 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a9ee4_1 {
    char padding_0[56];
    char field_38;
} st_2a9ee4_1;

typedef struct st_2a9ee4_0 {
    char padding_0[8];
    char field_8;
} st_2a9ee4_0;


void sub_2a9ee4(st_2a9ee4_0 *a0, st_2a9ee4_1 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 == 1)
    {
        sub_2a6e94(&a1[1].padding_0[7], a1->field_38);
    }
    else if (!a1)
    {
        return;
    }
}
