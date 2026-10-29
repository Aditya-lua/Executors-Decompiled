/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb850cc..0xb85118 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b850cc_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b850cc_1;

typedef struct st_b850cc_0 {
    unsigned long long field_0;
    struct st_b850cc_1 *field_8;
    unsigned long long field_10;
} st_b850cc_0;


int sub_b850cc(st_b850cc_0 *a0, unsigned long a1)
{
    unsigned long long *ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(16);
    if (ptr)
    {
        *ptr = a1;
        ptr[1] = a1 + 64;
        a0->field_0 = 2;
        a0->field_8 = ptr;
        a0->field_10 = 2;
        return (unsigned int)ptr;
    }
    sub_c6ba70(8, 16);
}
