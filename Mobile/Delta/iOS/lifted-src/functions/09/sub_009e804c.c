/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e804c..0x9e80bc (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e804c_0 {
    struct st_9e804c_0 *field_0;
    char padding_8[8];
    struct st_9e804c_0 *field_10;
} st_9e804c_0;


st_9e804c_0 * sub_9e804c(st_9e804c_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        return 1;
    }
    else if ((int)a0->field_0 == 2)
    {
        goto *((void *)(a0->field_10));
    }
    else if ((int)a0->field_0 != 1)
    {
        return 0;
    }
    else if (a0->field_10)
    {
        v0 = &v2;
        v1 = v3;
        a0->field_10();
    }
    else
    {
        return 1;
    }
}
