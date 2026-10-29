/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a6654..0x9a66a4 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a6654_0 {
    char padding_0[88];
    long long field_58;
    char padding_60[8];
    int field_68;
} st_9a6654_0;


long long sub_9a6654(st_9a6654_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_68 = 2;
    if ((int)sub_9d46fc(a0->field_58, 11, 0, 0) < 1)
        return 0;
    a0->field_68 = 1;
    return 1;
}
