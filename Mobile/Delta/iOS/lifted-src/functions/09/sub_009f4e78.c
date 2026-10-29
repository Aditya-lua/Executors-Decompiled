/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4e78..0x9f4ef0 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4e78_0 {
    char padding_0[8];
    struct st_9f4e78_1 *field_8;
} st_9f4e78_0;

typedef struct st_9f4e78_1 {
    unsigned long long field_0;
} st_9f4e78_1;


void sub_9f4e78(unsigned long a0, st_9f4e78_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (!a1)
        a1 = sub_9f3178();
    a1->field_8();
}
