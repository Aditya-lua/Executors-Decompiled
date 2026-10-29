/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50654..0xa50720 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50654_0 {
    struct st_a50654_0 *field_0;
    struct st_a50654_0 *field_4;
    char padding_c[28];
    unsigned long long field_28;
    char padding_30[72];
    struct st_a50654_0 *field_78;
    char padding_80[32];
    struct st_a50654_1 *field_a0;
    struct st_a50654_1 *field_a8;
    struct st_a50654_0 *field_b0;
} st_a50654_0;

typedef struct st_a50654_1 {
    unsigned long long field_0;
} st_a50654_1;


st_a50654_0 * sub_a50654(st_a50654_0 *a0, unsigned long a1, st_a50654_0 *a2, unsigned long a3)
{
    st_a50654_0 *v4;  // x9
    unsigned long long v5;  // x30
    st_a50654_0 *v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (a0)
    {
        v4 = a0->field_0;
        if (!v4)
        {
            return 0;
        }
        else if (*(long long *)&v4->padding_30[64])
        {
            v1 = &v3;
            v2 = v5;
            v0 = 0;
            if (!*(int *)((char *)&v4->field_0 + 4))
            {
                a0 = 0;
            }
            else if (v4->field_a8)
            {
                v4->field_a8();
            }
            else if (a2)
            {
                (*(long long *)&v4->padding_80[24])();
            }
            else
            {
                v4->field_a0();
            }
        }
        else
        {
            goto *((void *)(*(long long *)&v4->padding_c[24]));
        }
    }
    return (unsigned int)a0;
}
