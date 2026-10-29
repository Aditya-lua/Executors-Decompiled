/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962a9c..0x962b18 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962a9c_0 {
    char padding_0[40];
    long long field_28;
} st_962a9c_0;


unsigned long long sub_962a9c(st_962a9c_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1 && !a2)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a1 && !sub_af252c(a0->field_28))
        return 0;
    if (!a2)
        return 1;
    v8 = sub_af25a0(a0->field_28, a2);
    if (!(unsigned int)v8)
        return v8;
    return 1;
}
