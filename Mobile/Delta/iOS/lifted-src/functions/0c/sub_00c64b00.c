/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc64b00..0xc64b64 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c64b00_1 {
    unsigned long long field_0;
} st_c64b00_1;

typedef struct st_c64b00_0 {
    char padding_0[96];
    struct st_c64b00_1 *field_60;
} st_c64b00_0;


st_c64b00_0 * sub_c64b00(st_c64b00_0 **a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0[398])
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (!a0[399])
        return 0;
    a0[398]->field_60();
}
