/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53cd8..0xb53d38 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53cd8_0 {
    char padding_0[352];
    struct st_b53cd8_0 *field_160;
} st_b53cd8_0;


st_b53cd8_0 * sub_b53cd8(st_b53cd8_0 *a0, long long a1, long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b53cd8_0 *v12;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if (a0->field_160)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = sub_b54464();
        if (!(unsigned int)v12)
            return v12;
        return sub_a3fe10(a0->field_160, a1, a2) != 0;
    }
    else
    {
        return 0;
    }
}
