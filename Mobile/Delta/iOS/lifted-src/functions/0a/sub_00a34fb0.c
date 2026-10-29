/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34fb0..0xa3501c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a34fb0_0 {
    char padding_0[56];
    struct st_a34fb0_1 *field_38;
} st_a34fb0_0;

typedef struct st_a34fb0_1 {
    unsigned long long field_0;
} st_a34fb0_1;


unsigned long long * sub_a34fb0(st_a34fb0_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_38)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/tb_cipher.c", 78, "ENGINE_get_cipher");
        sub_a36abc(38, 146, 0);
        return 0;
    }
    a0->field_38();
}
