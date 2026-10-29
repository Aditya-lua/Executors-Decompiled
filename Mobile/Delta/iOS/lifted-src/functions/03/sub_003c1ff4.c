/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c1ff4..0x3c2068 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c1ff4_1 {
    char padding_0[40];
    long long field_28;
} st_3c1ff4_1;

typedef struct st_3c1ff4_0 {
    char padding_0[8];
    char field_8;
} st_3c1ff4_0;


void sub_3c1ff4(st_3c1ff4_0 *a0, st_3c1ff4_1 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 == 1)
    {
        sub_43360(&a1->padding_0[24], a1->field_28);
        sub_2219c(&a1->padding_0[24], 0);
    }
    else if (!a1)
    {
        return;
    }
}
