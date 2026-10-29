/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3737c..0xb373f0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3737c_1 {
    char padding_0[8];
    struct st_b3737c_0 *field_8;
    unsigned int field_10;
} st_b3737c_1;

typedef struct st_b3737c_0 {
    char padding_0[48];
    unsigned int field_30;
} st_b3737c_0;


int sub_b3737c(st_b3737c_1 *a0, void* a1)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(int)a1[48])
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/mlx_kem.c", 74, "mlx_kem_encapsulate_init");
        sub_a36abc(57, 128, 0);
        return 0;
    }
    v2 = sub_a2f9e0();
    if (!v2)
        return v2;
    a0->field_8 = a1;
    a0->field_10 = 0x1000;
    return 1;
}
