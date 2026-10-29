/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98955c..0x98959c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98955c_1 {
    unsigned long long field_0;
} st_98955c_1;

typedef struct st_98955c_0 {
    char padding_0[104];
    struct st_98955c_1 *field_68;
} st_98955c_0;


int sub_98955c(st_98955c_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_68)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_68();
}
