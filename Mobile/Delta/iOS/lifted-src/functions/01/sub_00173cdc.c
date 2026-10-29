/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x173cdc..0x173d2c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_173cdc_0 {
    struct st_173cdc_0 *field_0;
    struct st_173cdc_0 *field_8;
    char padding_10[12];
    unsigned int field_1c;
} st_173cdc_0;

typedef struct st_173cdc_1 {
    char padding_0[8];
    struct st_173cdc_0 *field_8;
    struct st_173cdc_0 *field_10;
    char padding_18[12];
    int field_24;
} st_173cdc_1;


st_173cdc_0 * sub_173cdc(st_173cdc_1 *a0, st_173cdc_0 **a1, int *a2)
{
    st_173cdc_0 *v0;  // x10
    st_173cdc_0 *v1;  // x0
    st_173cdc_0 *v2;  // x8
    st_173cdc_0 *v3;  // x0

    v0 = a0->field_8;
    v1 = &a0->field_8;
    if (!a0->field_8)
    {
        *a1 = v1;
        return v1;
    }
    while (1)
    {
        v2 = v0;
        if (*a2 < (int)v0->field_1c)
        {
            v0 = v2->field_0;
            v1 = v2;
            if (!v2->field_0)
                break;
        }
        else if (*a2 <= (int)v0->field_1c || !(v3 = v2, v0 = v3->field_8, v1 = &v3->field_8, v3->field_8))
        {
            break;
        }
    }
    *a1 = v2;
    return v1;
}
