/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5085c..0xb5089c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5085c_0 {
    char padding_0[28];
    char field_1c;
} st_b5085c_0;


char sub_b5085c(st_b5085c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char v8;  // w0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return 0;
    }
    else if (!(a0->field_1c & 1))
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_b51870();
        a0->field_1c = a0->field_1c | 2;
        return v8;
    }
    else
    {
        return 0;
    }
}
