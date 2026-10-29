/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffc68..0x9ffcc8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffc68_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[80];
    unsigned int field_68;
} st_9ffc68_0;


unsigned int sub_9ffc68(st_9ffc68_0 *a0)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_10)
    {
        sub_9e46a8(a0->field_10);
        v2 = a0->field_8;
        if (!a0->field_8)
            return 0xffffffff;
    }
    else
    {
        v2 = a0->field_8;
        if (!a0->field_8)
            return 0xffffffff;
    }
    sub_9e46a8(v2);
}
