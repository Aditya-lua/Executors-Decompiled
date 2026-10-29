/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dde48..0x9dde94 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dde48_0 {
    char padding_0[60];
    unsigned int field_3c;
    unsigned long long field_40;
} st_9dde48_0;


int sub_9dde48(unsigned long a0)
{
    st_9dde48_0 *ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = sub_a6bffc(72, "crypto/bn/bn_ctx.c", 126);
    if (ptr)
    {
        memset(ptr, 0, 48);
        ptr->field_40 = a0;
        ptr->field_3c = 8;
    }
    return (unsigned int)ptr;
}
