/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99206c..0x992148 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99206c_1 {
    char padding_0[216];
    struct st_99206c_0 *field_d8;
} st_99206c_1;

typedef struct st_99206c_2 {
    char padding_0[24];
    struct st_99206c_1 *field_18;
} st_99206c_2;

typedef struct st_99206c_0 {
    char padding_0[80];
    unsigned int field_50;
} st_99206c_0;


unsigned int sub_99206c(st_99206c_2 **a0)
{
    unsigned int v8;  // w0
    unsigned int v9;  // w0
    unsigned int v0;  // [bp-0x80]
    unsigned int v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x60]
    unsigned int v3;  // [bp-0x50]
    unsigned int v4;  // [bp-0x48]
    unsigned int v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = sub_991e8c();
    v5 = 0;
    v4 = 0;
    v3 = 0;
    v1 = 0;
    v2 = 0;
    v0 = 0;
    v9 = sub_992148();
    v5 = 0;
    v4 = 0;
    v3 = 0;
    v1 = 0;
    v2 = 0;
    v0 = 0;
    return v9 & v8 & sub_992148();
}
