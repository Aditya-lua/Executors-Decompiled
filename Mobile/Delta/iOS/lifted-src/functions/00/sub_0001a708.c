/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a708..0x1a74c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a708_0 {
    unsigned long long field_0;
} st_1a708_0;

typedef struct st_1a708_1 {
    struct st_1a708_0 *field_0;
} st_1a708_1;

void sub_1a708(unsigned long a0, st_1a708_1 **a1, st_1a708_1 **a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1 == a2)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    (*(long long *)*a1)();
}
