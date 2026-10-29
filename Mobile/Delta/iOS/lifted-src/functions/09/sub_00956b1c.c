/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x956b1c..0x956ba0 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_956b1c_0 {
    char padding_0[8];
    struct st_956b1c_1 *field_8;
} st_956b1c_0;

typedef struct st_956b1c_1 {
    long long field_0;
} st_956b1c_1;


long long sub_956b1c(st_956b1c_0 *a0, long long a1)
{
    long long v3;  // x19
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a1)
        return 0;
    v3 = sub_a5d5a8(*(long long *)a0->field_8);
    if (v3 && (int)sub_a5ca90(v3) >= 1 && 0 >= (int)sub_a5cde8(v3, &v0))
    {
        sub_a5a4c8(v0);
        v0 = 0;
    }
    sub_a5d6b0(v3);
    return v0;
}
