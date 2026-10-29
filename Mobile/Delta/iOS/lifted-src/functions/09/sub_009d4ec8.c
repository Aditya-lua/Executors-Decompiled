/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d4ec8..0x9d4f1c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d4ec8_0 {
    char padding_0[72];
    struct st_9d4ec8_0 *field_48;
    struct st_9d4ec8_0 *field_50;
} st_9d4ec8_0;


st_9d4ec8_0 * sub_9d4ec8(st_9d4ec8_0 *a0, st_9d4ec8_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9d4ec8_0 *v8;  // x8
    st_9d4ec8_0 *v9;  // x8
    st_9d4ec8_0 *v10;  // x3
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0;
    do
    {
        v9 = v8;
        v10 = v9;
        v8 = v9->field_48;
    } while (v9->field_48);
    v10->field_48 = a1;
    if (a1)
        a1->field_50 = v10;
    sub_9d46fc();
    return a0;
}
