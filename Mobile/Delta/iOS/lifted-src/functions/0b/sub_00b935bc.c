/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb935bc..0xb93604 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b935bc_0 {
    unsigned long long field_0;
    struct st_b935bc_1 *field_8;
    unsigned long long field_10;
} st_b935bc_0;

typedef struct st_b935bc_1 {
    unsigned long long field_0;
} st_b935bc_1;


int sub_b935bc(st_b935bc_0 *a0, unsigned long a1)
{
    unsigned long long *ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(8);
    if (ptr)
    {
        *ptr = a1;
        a0->field_0 = 1;
        a0->field_8 = ptr;
        a0->field_10 = 1;
        return (unsigned int)ptr;
    }
    sub_c6ba70(8, 8);
}
