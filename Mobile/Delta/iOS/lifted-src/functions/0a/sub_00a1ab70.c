/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ab70..0xa1abbc (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ab70_0 {
    char padding_0[24];
    long long field_18;
} st_a1ab70_0;


long long sub_a1ab70(st_a1ab70_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_18)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_9e4c34(a1, a0->field_18);
    if (!v8)
        return v8;
    return !sub_9e4828(a0->field_18);
}
