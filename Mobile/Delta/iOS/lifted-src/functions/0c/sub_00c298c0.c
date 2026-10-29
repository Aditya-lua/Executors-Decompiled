/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc298c0..0xc299ac (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c298c0_0 {
    unsigned long long field_0;
    struct st_c298c0_1 *field_8;
    unsigned long long field_10;
} st_c298c0_0;

typedef struct st_c298c0_1 {
    unsigned long long field_0;
} st_c298c0_1;


void sub_c298c0(st_c298c0_0 *a0)
{
    unsigned long long v2;  // x22
    unsigned long long *i;  // x19
    unsigned long long *v4;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    for (i = a0->field_8; a0->field_10 != v2; i = v4)
    {
        v2 += 1;
        if (*i != 12)
            sub_c2636c(i);
        v4 = i + 16;
        sub_c2636c(i + 8);
    }
    if (!a0->field_0)
        return;
    _free();
    return;
}
