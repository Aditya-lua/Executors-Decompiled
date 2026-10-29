/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x992a0c..0x992a48 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_992a0c_2 {
    char padding_0[24];
    struct st_992a0c_0 *field_18;
    char padding_20[144];
    unsigned long long field_b0;
    unsigned long long field_b8;
} st_992a0c_2;

typedef struct st_992a0c_0 {
    char padding_0[24];
    struct st_992a0c_1 *field_18;
} st_992a0c_0;

typedef struct st_992a0c_1 {
    unsigned long long field_0;
} st_992a0c_1;


int sub_992a0c(st_992a0c_2 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0->field_b0 > a0->field_b8)
        return 1;
    v0 = &v2;
    v1 = v3;
    a0->field_18->field_18();
}
