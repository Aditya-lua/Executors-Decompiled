/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49498..0xb49524 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b49498_0 {
    char padding_0[224];
    long long field_e0;
    char padding_e8[8];
    unsigned long long field_f0;
} st_b49498_0;


unsigned long long sub_b49498(st_b49498_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long a4)
{
    unsigned long long v3;  // x20
    unsigned long long v4;  // x0
    unsigned long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_f0;
    v0 = a4;
    v4 = sub_b497e0();
    if (!(unsigned int)v4)
        return v4;
    _memcpy(v3 + 40, v3 + 151, a0->field_e0);
    return sub_b497e0(a0, v3 + 151, 0, v3 + 40, a0->field_e0, 0, 0, 0, 0);
}
