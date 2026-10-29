/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae2f58..0xae2ff0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae2f58_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ae2f58_1 *field_8;
} st_ae2f58_0;

typedef struct st_ae2f58_1 {
    long long field_0;
} st_ae2f58_1;


unsigned long long sub_ae2f58(st_ae2f58_0 **a0, st_ae2f58_0 **a1)
{
    st_ae2f58_0 *v2;  // x19
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a1;
    if (*a0->field_0 != 1)
    {
        if (*a0->field_0)
            goto LABEL_ae2fc4;
    }
    else
    {
        if (v2->field_0 == 1)
        {
            v3 = sub_9c0ffc(*(long long *)*a0->field_8, *(long long *)v2->field_8);
            if ((unsigned int)v3)
                return v3;
        }
        else
        {
LABEL_ae2fc4:
        }
    }
    return sub_9c0ffc();
}
