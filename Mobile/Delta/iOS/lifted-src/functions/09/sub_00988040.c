/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988040..0x9880e0 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988040_0 {
    char padding_0[8];
    struct st_988040_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[8];
    struct st_988040_0 *field_28;
} st_988040_0;

typedef struct st_988040_1 {
    struct st_988040_0 *field_0;
    char padding_8[8];
    struct st_988040_0 *field_10;
    char padding_18[8];
    unsigned long long field_20;
    struct st_988040_0 *field_28;
} st_988040_1;


st_988040_0 * sub_988040(st_988040_1 *a0, unsigned long long *a1, st_988040_0 **a2, st_988040_0 **a3)
{
    unsigned long long v0;  // x9
    st_988040_0 *v1;  // x8
    unsigned long long v2;  // x10
    st_988040_0 *v3;  // w8
    st_988040_0 *v4;  // x9
    st_988040_0 *v5;  // w8

    if ((int)a0->field_28)
        return 0;
    v0 = a0->field_20;
    v1 = a0->field_0;
    *a1 = v0;
    if (v1)
    {
        v2 = v0 - v1->field_10;
        if (v1->field_10 <= v0 && v1->field_18 > v0)
        {
            a1[1] = v1->field_18;
            if (!v1->field_28)
                v4 = 0;
            else
                v4 = &v1->field_28->padding_0[v2];
            *a2 = v4;
            if (v1->field_8)
                v5 = (st_988040_0 *)0;
            else
                v5 = (st_988040_0 *)(int)a0->field_10;
            *(unsigned int *)a3 = (unsigned int)v5;
            *(unsigned int *)&a0->field_28 = 1;
            return 1;
        }
        v3 = (st_988040_0 *)0;
        a1[1] = v0;
        *a2 = 0;
    }
    else
    {
        a1[1] = v0;
        *a2 = 0;
        v3 = (st_988040_0 *)(int)a0->field_10;
    }
    *(unsigned int *)a3 = (unsigned int)v3;
    return 0;
}
