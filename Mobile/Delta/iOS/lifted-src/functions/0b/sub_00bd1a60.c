/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd1a60..0xbd1b58 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd1a60_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
} st_bd1a60_1;

typedef struct st_bd1a60_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_bd1a60_1 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_bd1a60_0;


unsigned long long sub_bd1a60(st_bd1a60_0 *a0)
{
    unsigned long long dst;  // x0
    unsigned long long v3;  // x8
    unsigned long long *v4;  // x22
    unsigned long long v5;  // x23
    unsigned long long v6;  // x23
    unsigned long long v7;  // x20
    unsigned long long v8;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    dst = a0->field_0;
    v3 = a0->field_8;
    v4 = a0->field_10;
    a0->field_0 = 8;
    a0->field_8 = 8;
    if (v3 != dst)
    {
        v5 = (v3 - dst >> 6) + 1;
        while (1)
        {
            v6 = v5 - 1;
            if (v5 == 1)
                break;
            sub_bcdab4();
            dst += 64;
            v5 = v6;
        }
    }
    v7 = a0->field_20;
    if (!v7)
        return dst;
    v8 = v4[2];
    if (a0->field_18 != v8)
        dst = _memmove(v4[1] + v8 * 64, v4[1] + a0->field_18 * 64, v7 * 64);
    v4[2] = v8 + v7;
    return dst;
}
