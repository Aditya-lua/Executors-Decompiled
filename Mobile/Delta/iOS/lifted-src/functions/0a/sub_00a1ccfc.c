/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ccfc..0xa1cd68 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ccfc_0 {
    char padding_0[416];
    unsigned long long field_1a0;
} st_a1ccfc_0;


unsigned long long sub_a1ccfc(st_a1ccfc_0 **a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (*a0->field_1a0)
    {
        goto *((void *)(*a0->field_1a0));
    }
    else
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = sub_a1a654(a2, a3);
        if (!(unsigned int)v12)
            return v12;
        return sub_a1b690(a0, a1, a2, a4) != 0;
    }
}
