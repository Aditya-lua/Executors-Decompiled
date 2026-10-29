/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb32e78..0xb32f8c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b32e78_1 {
    char padding_0[8];
    struct st_b32e78_0 *field_8;
    char field_10;
    char padding_11[23];
    struct st_b32e78_0 *field_28;
} st_b32e78_1;

typedef struct st_b32e78_0 {
    struct st_b32e78_0 *field_0;
} st_b32e78_0;


st_b32e78_0 ** sub_b32e78(st_b32e78_1 *a0, unsigned long a1, unsigned long a2, st_b32e78_0 **a3)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    if (a3 && *a3 && !sub_b331fc(a0, a3))
        return 0;
    if (!a0->field_28)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/sskdf.c", 532, "x963kdf_derive");
        v2 = 132;
    }
    else if (a0->field_8)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/sskdf.c", 537, "x963kdf_derive");
        v2 = 0x88;
    }
    else if (!sub_954340(&a0->field_10))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/sskdf.c", 544, "x963kdf_derive");
        v2 = 129;
    }
    sub_a36abc(57, v2, 0);
    return 0;
}
