/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c3fc..0x95c450 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95c3fc_0 {
    char padding_0[1708];
    unsigned int field_6ac;
} st_95c3fc_0;


unsigned int sub_95c3fc(st_95c3fc_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if ((unsigned long long)a1 > 8)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_95a098(a1, a0);
    if (!v8)
        return 1;
    return (a0->field_6ac & *(int *)(v8 + 4)) != 0;
}
