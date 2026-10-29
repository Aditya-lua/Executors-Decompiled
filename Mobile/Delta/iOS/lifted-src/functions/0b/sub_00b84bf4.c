/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb84bf4..0xb84c48 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b84bf4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_b84bf4_1;

typedef struct st_b84bf4_0 {
    unsigned long long field_0;
    struct st_b84bf4_1 *field_8;
    unsigned long long field_10;
} st_b84bf4_0;


int sub_b84bf4(st_b84bf4_0 *a0, unsigned long a1)
{
    unsigned long long *ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(24);
    if (ptr)
    {
        *ptr = a1 + 152;
        ptr[1] = a1 + 64;
        ptr[2] = a1;
        a0->field_0 = 3;
        a0->field_8 = ptr;
        a0->field_10 = 3;
        return (unsigned int)ptr;
    }
    sub_c6ba70(8, 24);
}
