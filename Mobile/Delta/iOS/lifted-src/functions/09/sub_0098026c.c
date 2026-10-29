/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98026c..0x980300 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98026c_1 {
    char padding_0[24];
    struct st_98026c_0 *field_18;
} st_98026c_1;

typedef struct st_98026c_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_98026c_0;

typedef struct st_98026c_2 {
    struct st_98026c_1 *field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    struct st_98026c_3 *field_20;
    unsigned int field_28;
} st_98026c_2;

typedef struct st_98026c_3 {
    unsigned long long field_0;
} st_98026c_3;


unsigned long long sub_98026c(st_98026c_2 *a0)
{
    st_98026c_1 *v2;  // x0
    st_98026c_0 *v3;  // x20
    unsigned short v4;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    v3 = a0->field_0->field_18;
    if (!(v3->field_150 >> 5 & 1))
    {
        if (sub_977368(v3->field_a0))
        {
            v2 = a0->field_0;
        }
        else
        {
            v4 = sub_97733c(v3->field_a0);
            v2 = a0->field_0;
            if (v4)
            {
                if (!sub_980028(a0->field_0, a0->field_8, a0->field_10, a0->field_18, a0->field_20, a0->field_28))
                    return 0xffffffff;
                return *(long long *)a0->field_20 != 0;
            }
        }
    }
    sub_97c738(v2);
    return 0xffffffff;
}
