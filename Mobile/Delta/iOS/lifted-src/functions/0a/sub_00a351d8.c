/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa351d8..0xa35244 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a351d8_0 {
    char padding_0[64];
    struct st_a351d8_1 *field_40;
} st_a351d8_0;

typedef struct st_a351d8_1 {
    unsigned long long field_0;
} st_a351d8_1;


unsigned long long * sub_a351d8(st_a351d8_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_40)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/tb_digest.c", 78, "ENGINE_get_digest");
        sub_a36abc(38, 147, 0);
        return 0;
    }
    a0->field_40();
}
