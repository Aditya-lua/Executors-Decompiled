/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a4e8..0xb4a58c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4a4e8_0 {
    char padding_0[240];
    long long field_f0;
} st_b4a4e8_0;


unsigned long long sub_b4a4e8(st_b4a4e8_0 *a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v8;  // x0
    long long v0;  // [bp-0x40]
    long long v1;  // [bp-0x38]
    long long v2;  // [bp-0x30]
    long long v3;  // [bp-0x28]
    long long v4;  // [bp-0x20]
    long long v5;  // [bp-0x18]
    long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v8 = sub_b4a2fc(a0->field_f0, 0, a1, a2, a3, a4, 0, 0, v0, v1, v2, v3, v4, v5, &v7, v6);
    if (!(unsigned int)v8)
    {
        return v8;
    }
    else if (a4 || a2)
    {
        return sub_b4a2fc();
    }
    else
    {
        return 1;
    }
}
