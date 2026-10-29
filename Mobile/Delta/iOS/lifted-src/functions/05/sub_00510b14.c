/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x510b14..0x510b98 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_510b14_0 {
    unsigned int field_0;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
} st_510b14_0;


long long sub_510b14(unsigned long a0, st_510b14_0 *a1)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // x9
    unsigned long long v2;  // x8
    unsigned long v3;  // x9
    unsigned long long v4;  // x8
    unsigned long v5;  // x9
    unsigned long long v6;  // x10

    v0 = a1->field_0 | a1->field_4 * 0x100000000;
    v1 = a1->field_5;
    v2 = (v0 & 0xffff000000000000 | (v0 & 0xffff00ffffffffff | (v1 * 0x10000000000 | v1 >> 24) & 0xff0000000000) & 0xffffffffffff) + ((v1 * 0x20000000000 ^ 0xfffffffffffffffe) + v1 * 0x10000000000 | ~v0 | 1) + 1;
    v3 = a1->field_6;
    v4 = v2 + v3 * 0x1000000000000 + ((v3 * 0x2000000000000 ^ 0xfffffffffffffffe) + v3 * 0x1000000000000 | ~v2 | 1) + 1;
    v5 = a1->field_7;
    v6 = v5 * 0x100000000000000;
    return v4 + v6 + ((v5 * 0x200000000000000 ^ 0xfffffffffffffffe) + v6 | ~v4 | 1) + 1;
}
