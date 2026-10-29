/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95cab8..0x95cb34 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95cab8_0 {
    char field_0;
    char padding_1[23];
    long long field_18;
} st_95cab8_0;


unsigned long long sub_95cab8(st_95cab8_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char v8;  // w0
    char v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!(a0->field_0 >> 5 & 1))
        return 0xfffffffe;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_18)
    {
        v8 = sub_964ccc(a0->field_18);
        v9 = *(long long *)&a0[1].field_0;
        if (*(long long *)&a0[1].field_0)
            goto LABEL_95cafc;
    }
    else
    {
        v8 = 1;
        v9 = *(long long *)&a0[1].field_0;
        if (*(long long *)&a0[1].field_0)
        {
LABEL_95cafc:
            v8 = sub_9647c8(v9, a1, 1);
        }
    }
    return v8 > 0;
}
