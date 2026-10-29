/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d87f0..0x9d8844 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d87f0_0 {
    char padding_0[40];
    struct st_9d87f0_0 *field_28;
    struct st_9d87f0_0 *field_2c;
    struct st_9d87f0_0 *field_30;
    char padding_38[8];
    struct st_9d87f0_0 *field_40;
} st_9d87f0_0;


int sub_9d87f0(st_9d87f0_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9d87f0_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        if (*(int *)((char *)&a0->field_28 + 4))
        {
            if ((int)a0->field_28 && a0->padding_38)
            {
                v0 = v5;
                v1 = v6;
                v2 = &v4;
                v3 = v7;
                _fclose(a0->padding_38);
                v8 = a0;
                *(unsigned long long *)a0->padding_38 = 0;
                *(unsigned int *)&a0->field_2c = 0;
                a0 = v8;
            }
            *(unsigned int *)&a0->field_28 = 0;
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}
