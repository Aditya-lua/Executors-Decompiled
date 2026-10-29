/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x960220..0x9602d0 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_960220_0 {
    struct st_960220_1 *field_0;
    char padding_8[16];
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
} st_960220_0;

typedef struct st_960220_1 {
    unsigned int field_0;
} st_960220_1;


unsigned int sub_960220(st_960220_0 *a0)
{
    unsigned int *v2;  // x19
    unsigned long v3;  // x9
    unsigned int v4;  // w9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!v2)
        return 0xffffffff;
    v3 = *v2;
    if ((unsigned int)v3)
    {
        if (!(v3 >> 7 & 1))
        {
            return 0xffffffff;
        }
        else if (!sub_980dc8(v2))
        {
            return 0xffffffff;
        }
    }
    v4 = a0->field_18;
    if (v4 != 2)
    {
        if (v4 != 1 && v4)
            return 0xffffffff;
        goto *((void *)(a0->field_20));
    }
    else
    {
        goto *((void *)(a0->field_20));
    }
}
