/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2af8..0x9f2b3c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2af8_0 {
    char padding_0[24];
    struct st_9f2af8_1 *field_18;
} st_9f2af8_0;

typedef struct st_9f2af8_1 {
    struct st_9f2af8_0 *field_0;
} st_9f2af8_1;


void sub_9f2af8(st_9f2af8_0 **a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return;
    }
    else if (*a0->field_18)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        *a0->field_18();
    }
}
